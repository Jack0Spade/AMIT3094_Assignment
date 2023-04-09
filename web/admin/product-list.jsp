<%@page import="java.util.Base64"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="zxx" class="js">

    <%@ include file = "header.jsp" %>
    <%@page import="entity.Product, java.util.*" %>
    <%
        List<Product> prodList = (List<Product>) session.getAttribute("products");
    %>

    <body class="nk-body bg-lighter npc-default has-sidebar ">
        <div class="nk-app-root">
            <!-- main @s -->
            <div class="nk-main ">
                <%@ include file = "sidebar.jsp" %>
                <!-- wrap @s -->
                <div class="nk-wrap ">
                    <%@ include file = "navbar.jsp" %>
                    <!-- content @s -->
                    <div class="nk-content ">
                        <div class="container-fluid">
                            <div class="nk-content-inner">
                                <div class="nk-content-body">
                                    <table class="datatable-init nowrap nk-tb-list is-separate" data-auto-responsive="false">
                                        <thead>
                                            <tr class="nk-tb-item nk-tb-head">
                                                <th class="nk-tb-col nk-tb-col-check">
                                                    <div class="custom-control custom-control-sm custom-checkbox notext">
                                                        <input type="checkbox" class="custom-control-input" id="puid">
                                                        <label class="custom-control-label" for="puid"></label>
                                                    </div>
                                                </th>
                                                <th class="nk-tb-col tb-col-sm"><span>Name</span></th>
                                                <th class="nk-tb-col"><span>Price</span></th>
                                                <th class="nk-tb-col"><span>Stock</span></th>
                                                <th class="nk-tb-col tb-col-md"><span>Category</span></th>
                                                <th class="nk-tb-col nk-tb-col-tools">
                                                    <ul class="nk-tb-actions gx-1 my-n1">
                                                        <li class="me-n1">
                                                            <div class="dropdown">
                                                                <a href="#" class="dropdown-toggle btn btn-icon btn-trigger" data-bs-toggle="dropdown"><em class="icon ni ni-more-h"></em></a>
                                                                <div class="dropdown-menu dropdown-menu-end">
                                                                    <ul class="link-list-opt no-bdr">
                                                                        <li><a href="#"><em class="icon ni ni-edit"></em><span>Edit Selected</span></a></li>
                                                                        <li><a href="#"><em class="icon ni ni-trash"></em><span>Remove Selected</span></a></li>
                                                                        <li><a href="#"><em class="icon ni ni-bar-c"></em><span>Update Stock</span></a></li>
                                                                        <li><a href="#"><em class="icon ni ni-invest"></em><span>Update Price</span></a></li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </th>
                                            </tr><!-- .nk-tb-item -->
                                        </thead>
                                        <tbody>
                                            <%
                                                for (Product prod : prodList) {
                                            %>
                                            <tr class="nk-tb-item">
                                                <td class="nk-tb-col nk-tb-col-check">
                                                    <div class="custom-control custom-control-sm custom-checkbox notext">
                                                        <input type="checkbox" class="custom-control-input" id="puid1">
                                                        <label class="custom-control-label" for="puid1"></label>
                                                    </div>
                                                </td>
                                                <td class="nk-tb-col tb-col-sm">
                                                    <span class="tb-product">
                                                        <img src="" alt="" class="thumb">
                                                        <span class="title"><%= prod.getProductName() %></span>
                                                    </span>
                                                </td>
                                                <td class="nk-tb-col">
                                                    <span class="tb-lead"><%= prod.getProductPrice() %></span>
                                                </td>
                                                <td class="nk-tb-col">
                                                    <span class="tb-sub"></span>
                                                </td>
                                                <td class="nk-tb-col tb-col-md">
                                                    <span class="tb-sub">Fitbit, Tracker</span>
                                                </td>
                                                <td class="nk-tb-col nk-tb-col-tools">
                                                    <ul class="nk-tb-actions gx-1 my-n1">
                                                        <li class="me-n1">
                                                            <div class="dropdown">
                                                                <a href="#" class="dropdown-toggle btn btn-icon btn-trigger" data-bs-toggle="dropdown"><em class="icon ni ni-more-h"></em></a>
                                                                <div class="dropdown-menu dropdown-menu-end">
                                                                    <ul class="link-list-opt no-bdr">
                                                                        <li><a href="#"><em class="icon ni ni-edit"></em><span>Edit Product</span></a></li>
                                                                        <li><a href="#"><em class="icon ni ni-eye"></em><span>View Product</span></a></li>
                                                                        <li><a href="#"><em class="icon ni ni-activity-round"></em><span>Product Orders</span></a></li>
                                                                        <li><a href="#"><em class="icon ni ni-trash"></em><span>Remove Product</span></a></li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </td>
                                            </tr><!-- .nk-tb-item -->
                                            <%
                                                }
                                            %>
                                        </tbody>
                                    </table><!-- .nk-tb-list -->
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- content @e -->
                    <%@ include file = "footer.jsp" %>
                </div>
                <!-- wrap @e -->
            </div>
            <!-- main @e -->
        </div>
        <!-- app-root @e -->
        <!-- JavaScript -->
        <script src="./assets/js/bundle.js?ver=3.1.0"></script>
        <script src="./assets/js/scripts.js?ver=3.1.0"></script>
        <script src="./assets/js/charts/chart-ecommerce.js?ver=3.1.0"></script>
    </body>

</html>