/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package assignment;

import entity.Category;
import entity.CategoryModel;
import entity.Product;
import entity.ProductSearchModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mayte
 */
public class FilterOnSearchPriceRange extends HttpServlet {

    @PersistenceContext
    EntityManager em;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();

            String searchProd = request.getParameter("searchProd");
            session.setAttribute("searchProd", searchProd);

            double minNum = Double.parseDouble(request.getParameter("minNum"));
            double maxNum = Double.parseDouble(request.getParameter("maxNum"));
            session.setAttribute("minPrice", minNum);
            session.setAttribute("maxPrice", maxNum);

            //for browse category
            CategoryModel cat = new CategoryModel(em);
            List<Category> catList = cat.findAll();
            session.setAttribute("catList", catList);

            int filterOption = Integer.parseInt(request.getParameter("filter"));

            ProductSearchModel searchModel = new ProductSearchModel(em);
            List<Product> prodList = searchModel.FilterOnSearch(searchProd, filterOption);

            List<Product> filteredProdList = new ArrayList();
            for (Product p : prodList) {
                if (p.getPrice() >= minNum && p.getPrice() <= maxNum) {
                    filteredProdList.add(p);
                }
            }

            if (prodList.isEmpty()) {
                response.sendRedirect("ProductNotFound.jsp");
            } else {
                session.setAttribute("prodList", filteredProdList);
                response.sendRedirect("PriceRangeOnSearch.jsp");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}