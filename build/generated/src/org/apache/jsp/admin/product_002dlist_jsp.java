package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.util.ArrayList;
import entity.Product;
import java.util.*;
import entity.Staff;

public final class product_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/admin/header.jsp");
    _jspx_dependants.add("/admin/sidebar.jsp");
    _jspx_dependants.add("/admin/navbar.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\" class=\"js\">\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<head>\n");
      out.write("    <base href=\"\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"author\" content=\"Softnio\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"A powerful and conceptual apps base dashboard template that especially build for developers and programmers.\">\n");
      out.write("    <!-- Fav Icon  -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./images/favicon.png\">\n");
      out.write("    <!-- Page Title  -->\n");
      out.write("    <title>Default Dashboard | DashLite Admin Template</title>\n");
      out.write("    <!-- StyleSheets  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/dashlite.css?ver=3.1.0\">\n");
      out.write("    <link id=\"skin-default\" rel=\"stylesheet\" href=\"./assets/css/theme.css?ver=3.1.0\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/admin/SessionCheck", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <body class=\"nk-body bg-lighter npc-default has-sidebar \">\r\n");
      out.write("        <div class=\"nk-app-root\">\r\n");
      out.write("            <!-- main @s -->\r\n");
      out.write("            <div class=\"nk-main \">\r\n");
      out.write("                ");
      out.write("<!-- sidebar @s -->\n");
      out.write("<div class=\"nk-sidebar nk-sidebar-fixed is-light \" data-content=\"sidebarMenu\">\n");
      out.write("    <div class=\"nk-sidebar-element nk-sidebar-head\">\n");
      out.write("        <div class=\"nk-sidebar-brand\">\n");
      out.write("            <a href=\"index.jsp\" class=\"logo-link nk-sidebar-logo\">\n");
      out.write("                <img class=\"logo-light logo-img\" src=\"./images/logo.png\" srcset=\"./images/logo2x.png 2x\" alt=\"logo\">\n");
      out.write("                <img class=\"logo-dark logo-img\" src=\"./images/logo-dark.png\" srcset=\"./images/logo-dark2x.png 2x\" alt=\"logo-dark\">\n");
      out.write("                <img class=\"logo-small logo-img logo-img-small\" src=\"./images/logo-small.png\" srcset=\"./images/logo-small2x.png 2x\" alt=\"logo-small\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"nk-menu-trigger me-n2\">\n");
      out.write("            <a href=\"#\" class=\"nk-nav-toggle nk-quick-nav-icon d-xl-none\" data-target=\"sidebarMenu\"><em class=\"icon ni ni-arrow-left\"></em></a>\n");
      out.write("            <a href=\"#\" class=\"nk-nav-compact nk-quick-nav-icon d-none d-xl-inline-flex\" data-target=\"sidebarMenu\"><em class=\"icon ni ni-menu\"></em></a>\n");
      out.write("        </div>\n");
      out.write("    </div><!-- .nk-sidebar-element -->\n");
      out.write("    <div class=\"nk-sidebar-element\">\n");
      out.write("        <div class=\"nk-sidebar-content\">\n");
      out.write("            <div class=\"nk-sidebar-menu\" data-simplebar>\n");
      out.write("                <ul class=\"nk-menu\">\n");
      out.write("                    <li class=\"nk-menu-heading\">\n");
      out.write("                        <h6 class=\"overline-title text-primary-alt\">Pages</h6>\n");
      out.write("                    </li><!-- .nk-menu-heading -->\n");
      out.write("                    <li class=\"nk-menu-item\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nk-menu-link\">\n");
      out.write("                            <span class=\"nk-menu-icon\"><em class=\"icon ni ni-home-fill\"></em></span>\n");
      out.write("                            <span class=\"nk-menu-text\">Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li><!-- .nk-menu-item -->\n");
      out.write("                    <li class=\"nk-menu-item has-sub\">\n");
      out.write("                        <a href=\"#\" class=\"nk-menu-link nk-menu-toggle\">\n");
      out.write("                            <span class=\"nk-menu-icon\"><em class=\"icon ni ni-tile-thumb-fill\"></em></span>\n");
      out.write("                            <span class=\"nk-menu-text\">Products</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"nk-menu-sub\">\n");
      out.write("                            <li class=\"nk-menu-item\">\n");
      out.write("                                <a href=\"product-list\" class=\"nk-menu-link\"><span class=\"nk-menu-text\">Product Lists</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nk-menu-item\">\n");
      out.write("                                <a href=\"add-product.jsp\" class=\"nk-menu-link\"><span class=\"nk-menu-text\">Add Product</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul><!-- .nk-menu-sub -->\n");
      out.write("                    </li><!-- .nk-menu-item -->\n");
      out.write("                    <li class=\"nk-menu-item has-sub\">\n");
      out.write("                        <a href=\"#\" class=\"nk-menu-link nk-menu-toggle\">\n");
      out.write("                            <span class=\"nk-menu-icon\"><em class=\"icon ni ni-tile-thumb-fill\"></em></span>\n");
      out.write("                            <span class=\"nk-menu-text\">Customer</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"nk-menu-sub\">\n");
      out.write("                            <li class=\"nk-menu-item\">\n");
      out.write("                                <a href=\"customer-list.jsp\" class=\"nk-menu-link\"><span class=\"nk-menu-text\">Customer Lists</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nk-menu-item\">\n");
      out.write("                                <a href=\"add-product.jsp\" class=\"nk-menu-link\"><span class=\"nk-menu-text\">Add Customer</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul><!-- .nk-menu-sub -->\n");
      out.write("                    </li><!-- .nk-menu-item -->\n");
      out.write("                </ul><!-- .nk-menu -->\n");
      out.write("            </div><!-- .nk-sidebar-menu -->\n");
      out.write("        </div><!-- .nk-sidebar-content -->\n");
      out.write("    </div><!-- .nk-sidebar-element -->\n");
      out.write("</div>\n");
      out.write("<!-- sidebar @e -->");
      out.write("\r\n");
      out.write("                <!-- wrap @s -->\r\n");
      out.write("                <div class=\"nk-wrap \">\r\n");
      out.write("                    ");
      out.write("\n");
      out.write("<!-- main header @s -->\n");
      out.write("\n");

    Staff staff = (Staff) session.getAttribute("staff");

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"nk-header nk-header-fixed is-light\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"nk-header-wrap\">\n");
      out.write("            <div class=\"nk-menu-trigger d-xl-none ms-n1\">\n");
      out.write("                <a href=\"#\" class=\"nk-nav-toggle nk-quick-nav-icon\" data-target=\"sidebarMenu\"><em class=\"icon ni ni-menu\"></em></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nk-header-brand d-xl-none\">\n");
      out.write("                <a href=\"html/index.html\" class=\"logo-link\">\n");
      out.write("                    <img class=\"logo-light logo-img\" src=\"./images/logo.png\" srcset=\"./images/logo2x.png 2x\" alt=\"logo\">\n");
      out.write("                    <img class=\"logo-dark logo-img\" src=\"./images/logo-dark.png\" srcset=\"./images/logo-dark2x.png 2x\" alt=\"logo-dark\">\n");
      out.write("                </a>\n");
      out.write("            </div><!-- .nk-header-brand -->\n");
      out.write("\n");
      out.write("            <div class=\"nk-header-tools\">\n");
      out.write("                <ul class=\"nk-quick-nav\">\n");
      out.write("                    <li class=\"dropdown user-dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle me-n1\" data-bs-toggle=\"dropdown\">\n");
      out.write("                            <div class=\"user-toggle\">\n");
      out.write("                                <div class=\"user-avatar sm\">\n");
      out.write("                                    <em class=\"icon ni ni-user-alt\"></em>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"user-info d-none d-xl-block\">\n");
      out.write("                                    <div class=\"user-name dropdown-indicator\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-md dropdown-menu-end\">\n");
      out.write("                            <div class=\"dropdown-inner user-card-wrap bg-lighter d-none d-md-block\">\n");
      out.write("                                <div class=\"user-card\">\n");
      out.write("                                    <div class=\"user-info\">\n");
      out.write("                                        <span class=\"lead-text\"></span>\n");
      out.write("                                        <span class=\"sub-text\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dropdown-inner\">\n");
      out.write("                                <ul class=\"link-list\">\n");
      out.write("                                    <li><a href=\"html/user-profile-regular.html\"><em class=\"icon ni ni-user-alt\"></em><span>View Profile</span></a></li>\n");
      out.write("                                    <li><a class=\"dark-switch\" href=\"#\"><em class=\"icon ni ni-moon\"></em><span>Dark Mode</span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dropdown-inner\">\n");
      out.write("                                <ul class=\"link-list\">\n");
      out.write("                                    <li><a href=\"LogoutOperation\"><em class=\"icon ni ni-signout\"></em><span>Sign out</span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div><!-- .nk-header-wrap -->\n");
      out.write("    </div><!-- .container-fliud -->\n");
      out.write("</div>\n");
      out.write("<!-- main header @e -->");
      out.write("\r\n");
      out.write("                    ");

                        List<Product> prodList = (List<Product>) session.getAttribute("products");
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- content @s -->\r\n");
      out.write("                    <div class=\"nk-content \">\r\n");
      out.write("                        <div class=\"container-fluid\">\r\n");
      out.write("                            <div class=\"nk-content-inner\">\r\n");
      out.write("                                <div class=\"nk-content-body\">\r\n");
      out.write("                                    <div class=\"nk-block-head nk-block-head-sm\">\r\n");
      out.write("                                        <div class=\"nk-block-between\">\r\n");
      out.write("                                            <div class=\"nk-block-head-content\">\r\n");
      out.write("                                                <h3 class=\"nk-block-title page-title\">Product Listing</h3>\r\n");
      out.write("                                            </div><!-- .nk-block-head-content -->\r\n");
      out.write("                                            <div class=\"nk-block-head-content\">\r\n");
      out.write("                                                <div class=\"toggle-wrap nk-block-tools-toggle\">\r\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-icon btn-trigger toggle-expand me-n1\" data-target=\"pageMenu\"><em class=\"icon ni ni-more-v\"></em></a>\r\n");
      out.write("                                                    <div class=\"toggle-expand-content\" data-content=\"pageMenu\">\r\n");
      out.write("                                                        <ul class=\"nk-block-tools g-3\">\r\n");
      out.write("                                                            <li class=\"nk-block-tools-opt\">\r\n");
      out.write("                                                                <a href=\"#\" class=\"btn btn-icon btn-primary d-md-none\"><em class=\"icon ni ni-plus\"></em></a>\r\n");
      out.write("                                                                <a href=\"add-product.jsp\" class=\"btn btn-primary d-none d-md-inline-flex\"><em class=\"icon ni ni-plus\"></em><span>Add Products</span></a>\r\n");
      out.write("                                                            </li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div><!-- .nk-block-head-content -->\r\n");
      out.write("                                        </div><!-- .nk-block-between -->\r\n");
      out.write("                                    </div><!-- .nk-block-head -->\r\n");
      out.write("                                    <table class=\"datatable-init nowrap nk-tb-list is-separate\" data-auto-responsive=\"false\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr class=\"nk-tb-item nk-tb-head\">\r\n");
      out.write("                                                <th class=\"nk-tb-col tb-col-sm\"><span>Name</span></th>\r\n");
      out.write("                                                <th class=\"nk-tb-col\"><span>Category</span></th>\r\n");
      out.write("                                                <th class=\"nk-tb-col\"><span>Price</span></th>\r\n");
      out.write("                                                <th class=\"nk-tb-col tb-col-md\"><span>Stock</span></th>\r\n");
      out.write("                                                <th class=\"nk-tb-col nk-tb-col-tools\">\r\n");
      out.write("                                                    <ul class=\"nk-tb-actions gx-1 my-n1\">\r\n");
      out.write("                                                        <li class=\"me-n1\">\r\n");
      out.write("                                                            \r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </th>\r\n");
      out.write("                                            </tr><!-- .nk-tb-item -->\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            ");

                                                //img
                                                //name
                                                //cate
                                                //price
                                                //stock
                                               
                                                for (Product prod : prodList) {

                                                    String base64img = Base64.getEncoder().encodeToString(prod.getProductimage());
                                            
      out.write("\r\n");
      out.write("                                            <tr class=\"nk-tb-item\">\r\n");
      out.write("\r\n");
      out.write("                                                <td class=\"nk-tb-col tb-col-sm\">\r\n");
      out.write("                                                    <span class=\"tb-product\">\r\n");
      out.write("                                                        <img src=\"data:image/png;base64, ");
      out.print( base64img);
      out.write("\" alt=\"\" class=\"thumb\">\r\n");
      out.write("                                                        <span class=\"title\">");
      out.print( prod.getProductname());
      out.write("</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                                <td class=\"nk-tb-col\">\r\n");
      out.write("                                                    <span class=\"tb-lead\">");
      out.print( prod.getCategorycode().getCategoryname() );
      out.write("</span>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                                <td class=\"nk-tb-col\">\r\n");
      out.write("                                                    <span class=\"tb-sub\">");
      out.print( prod.getPrice());
      out.write("</span>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                                <td class=\"nk-tb-col tb-col-md\">\r\n");
      out.write("                                                    <span class=\"tb-sub\">");
      out.print( prod.getQty());
      out.write("</span>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                                <td class=\"nk-tb-col nk-tb-col-tools\">\r\n");
      out.write("                                                    <ul class=\"nk-tb-actions gx-1 my-n1\">\r\n");
      out.write("                                                        <li class=\"me-n1\">\r\n");
      out.write("                                                            <div class=\"dropdown\">\r\n");
      out.write("                                                                <a href=\"#\" class=\"dropdown-toggle btn btn-icon btn-trigger\" data-bs-toggle=\"dropdown\"><em class=\"icon ni ni-more-h\"></em></a>\r\n");
      out.write("                                                                <div class=\"dropdown-menu dropdown-menu-end\">\r\n");
      out.write("                                                                    <ul class=\"link-list-opt no-bdr\">\r\n");
      out.write("                                                                        <li><a href=\"EditProduct?productId=");
      out.print( prod.getProductid());
      out.write("\"><em class=\"icon ni ni-edit\"></em><span>Edit Product</span></a></li>\r\n");
      out.write("                                                                        \r\n");
      out.write("                                                                    </ul>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr><!-- .nk-tb-item -->\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table><!-- .nk-tb-list -->\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- content @e -->\r\n");
      out.write("                    ");
      out.write("<!-- footer @s -->\n");
      out.write("<div class=\"nk-footer\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"nk-footer-wrap\">\n");
      out.write("            <div class=\"nk-footer-copyright\"> &copy; 2023 Dostyle. Template by <a href=\"https://softnio.com\" target=\"_blank\">Softnio</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("<!-- footer @e -->");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- wrap @e -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- main @e -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- app-root @e -->\r\n");
      out.write("        <!-- JavaScript -->\r\n");
      out.write("        <script src=\"./assets/js/bundle.js?ver=3.1.0\"></script>\r\n");
      out.write("        <script src=\"./assets/js/scripts.js?ver=3.1.0\"></script>\r\n");
      out.write("        <script src=\"./assets/js/charts/chart-ecommerce.js?ver=3.1.0\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
