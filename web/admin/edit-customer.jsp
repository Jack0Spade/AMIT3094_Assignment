<%@page import="entity.Customer"%>
<!DOCTYPE html>
<html lang="zxx" class="js">

    <%@ include file = "header.jsp" %>

    <body class="nk-body bg-lighter npc-default has-sidebar ">
        <div class="nk-app-root">
            <!-- main @s -->
            <div class="nk-main "> 
                <%@ include file = "sidebar.jsp" %>
                <!-- wrap @s -->
                <div class="nk-wrap ">
                    <%@ include file = "navbar.jsp" %>
                    <%
                        Customer customer = (Customer) session.getAttribute("customer-detail");
                    %>
                    <!-- content @s -->
                    <div class="nk-content ">
                        <div class="container-fluid">
                            <div class="nk-content-inner">
                                <div class="nk-content-body">
                                    <div class="nk-block">
                                        <div class="card col-6">
                                            <div class="card-content">
                                                <form action="UpdateCustomer" method="POST">
                                                    <input type="hidden" name="customer-id" value="<%= customer.getCustomerId()%>">
                                                    <div class="card-inner">
                                                        <div class="nk-block">
                                                            <div class="nk-block-head">
                                                                <h5 class="title">Customer Information</h5>
                                                            </div><!-- .nk-block-head -->
                                                        </div><!-- .nk-block -->
                                                        <div class="row mt-3">
                                                            <div class="col-sm-6">
                                                                <div class="form-group">
                                                                    <label class="form-label" for="default-05">Customer Name</label>
                                                                    <div class="form-control-wrap">
                                                                        <input type="text" class="form-control" name="customer-name" value="<%= customer.getCustomerName()%>">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-6">
                                                                <div class="form-group">
                                                                    <label class="form-label" for="default-05">Email</label>
                                                                    <div class="form-control-wrap">
                                                                        <input type="email" class="form-control" name="customer-email" value="<%= customer.getEmail()%>">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-6 mt-3">
                                                                <div class="form-group">
                                                                    <label class="form-label" for="default-05">Contact Number</label>
                                                                    <div class="form-control-wrap">
                                                                        <input type="tel" pattern="[0][1][0-9][0-9]{10-13}" class="form-control" placeholder="01234567891" name="customer-contact" value="<%= customer.getCustomerContact()%>">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div><!-- .nk-block -->
                                                        <div class="row mt-3">
                                                            <div class="col-sm-6">
                                                                <input type="submit" class="btn btn-success" value="Save">
                                                                <a onclick="delCustomer()" class="btn btn-danger">Delete</a>
                                                            </div>
                                                        </div>
                                                    </div><!-- .card-inner -->
                                                </form>
                                            </div><!-- .card-content -->

                                        </div><!-- .card -->
                                    </div><!-- .nk-block -->
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
        <%
            try {
                int error = (Integer) session.getAttribute("error");
                if (error == 1) {
                    out.print("<script>Swal.fire({"
                            + "icon: 'error',"
                            + "title: 'Oops...',"
                            + "text: `" + session.getAttribute("error_msg") + "`"
                            + "})" + "</script>");
                    session.setAttribute("error", 0);
                }
            } catch (Exception e) {

            }
        %>
        <script>
            function delCustomer() {
                swal.fire({
                    title: 'Are you sure?',
                    text: 'You won\'t be able to revert this!',
                    icon: 'warning',
                    showCancelButton: true,
                    confirmButtonText: 'Yes, delete it!',
                    cancelButtonText: 'Cancel'
                }).then((result) => {
                    if (result.isConfirmed) {
                        window.location.href = "DeleteCustomer?id=<%= customer.getCustomerId()%>";
                    }
                });
            }
        </script>

    </body>

</html>

<!--SQL CODE FOR AUTO INCREMENT ID
CREATE TABLE Product (product_id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
product_name VARCHAR(140) NOT NULL,
product_price DOUBLE,
product_image BLOB);-->