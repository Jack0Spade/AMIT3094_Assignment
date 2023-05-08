package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Customer;
import entity.Staff;

public final class edit_002dstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\" class=\"js\">\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"nk-body bg-lighter npc-default has-sidebar \">\n");
      out.write("        <div class=\"nk-app-root\">\n");
      out.write("            <!-- main @s -->\n");
      out.write("            <div class=\"nk-main \"> \n");
      out.write("                ");
      out.write("<!-- sidebar @s -->\n");
      out.write("<div class=\"nk-sidebar nk-sidebar-fixed is-light \" data-content=\"sidebarMenu\">\n");
      out.write("    <div class=\"nk-sidebar-element nk-sidebar-head\">\n");
      out.write("        <div class=\"nk-sidebar-brand\">\n");
      out.write("            <a href=\"index.jsp\" class=\"logo-link nk-sidebar-logo\">\n");
      out.write("                <img class=\"logo-dark logo-img\" src=\"");
      out.print( getServletContext().getInitParameter("myParam") );
      out.write("\" srcset=\"./images/logo-dark2x.png 2x\" alt=\"logo-dark\">\n");
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
      out.write("                        </ul><!-- .nk-menu-sub -->\n");
      out.write("                    </li><!-- .nk-menu-item -->\n");
      out.write("                    <li class=\"nk-menu-item has-sub\">\n");
      out.write("                        <a href=\"#\" class=\"nk-menu-link nk-menu-toggle\">\n");
      out.write("                            <span class=\"nk-menu-icon\"><em class=\"icon ni ni-tile-thumb-fill\"></em></span>\n");
      out.write("                            <span class=\"nk-menu-text\">Orders</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"nk-menu-sub\">\n");
      out.write("                            <li class=\"nk-menu-item\">\n");
      out.write("                                <a href=\"order-list.jsp\" class=\"nk-menu-link\"><span class=\"nk-menu-text\">Orders Lists</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul><!-- .nk-menu-sub -->\n");
      out.write("                    </li><!-- .nk-menu-item -->\n");
      out.write("                    <li class=\"nk-menu-item has-sub\">\n");
      out.write("                        <a href=\"#\" class=\"nk-menu-link nk-menu-toggle\">\n");
      out.write("                            <span class=\"nk-menu-icon\"><em class=\"icon ni ni-tile-thumb-fill\"></em></span>\n");
      out.write("                            <span class=\"nk-menu-text\">Staff</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"nk-menu-sub\">\n");
      out.write("                            <li class=\"nk-menu-item\">\n");
      out.write("                                <a href=\"staff-list.jsp\" class=\"nk-menu-link\"><span class=\"nk-menu-text\">Staff Lists</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul><!-- .nk-menu-sub -->\n");
      out.write("                    </li><!-- .nk-menu-item -->\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                </ul><!-- .nk-menu -->\n");
      out.write("            </div><!-- .nk-sidebar-menu -->\n");
      out.write("        </div><!-- .nk-sidebar-content -->\n");
      out.write("    </div><!-- .nk-sidebar-element -->\n");
      out.write("</div>\n");
      out.write("<!-- sidebar @e -->");
      out.write("\n");
      out.write("                <!-- wrap @s -->\n");
      out.write("                <div class=\"nk-wrap \">\n");
      out.write("                    ");
      out.write("\n");
      out.write("<!-- main header @s -->\n");

    Staff staff = null;
    if (session.getAttribute("staff") == null) {
        response.sendRedirect("/AMIT3094_Assignment/admin/login.jsp");
        return;
    } else {
        staff = (Staff) session.getAttribute("staff");
    }

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
      out.write("                                    <div class=\"user-name dropdown-indicator\">");
  out.print(staff != null ? staff.getStaffName() : "" ); 
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-md dropdown-menu-end\">\n");
      out.write("                            <div class=\"dropdown-inner user-card-wrap bg-lighter d-none d-md-block\">\n");
      out.write("                                <div class=\"user-card\">\n");
      out.write("                                    <div class=\"user-info\">\n");
      out.write("                                        <span class=\"lead-text\">");
  out.print(staff != null ? staff.getStaffName() : "" ); 
      out.write("</span>\n");
      out.write("                                        <span class=\"sub-text\">");
 out.print(staff != null ? staff.getEmail() : "" );
      out.write("</span>\n");
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
      out.write("\n");
      out.write("                    ");

                        Staff staffs = (Staff) session.getAttribute("staff-detail");
                    
      out.write("\n");
      out.write("                    <!-- content @s -->\n");
      out.write("                    <div class=\"nk-content \">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <div class=\"nk-content-inner\">\n");
      out.write("                                <div class=\"nk-content-body\">\n");
      out.write("                                    <div class=\"nk-block\">\n");
      out.write("                                        <div class=\"card col-12\">\n");
      out.write("                                            <div class=\"card-content\">\n");
      out.write("                                                <form action=\"UpdateStaff\" method=\"POST\">\n");
      out.write("                                                    <input type=\"hidden\" name=\"staff-id\" value=\"");
      out.print( staffs.getStaffId());
      out.write("\">\n");
      out.write("                                                    <div class=\"card-inner\">\n");
      out.write("                                                        <div class=\"nk-block\">\n");
      out.write("                                                            <div class=\"nk-block-head\">\n");
      out.write("                                                                <h5 class=\"title\">Staff Information</h5>\n");
      out.write("                                                            </div><!-- .nk-block-head -->\n");
      out.write("                                                        </div><!-- .nk-block -->\n");
      out.write("                                                        <div class=\"row mt-3\">\n");
      out.write("                                                            <div class=\"col-sm-4\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"form-label\" for=\"default-05\">Staff Name</label>\n");
      out.write("                                                                    <div class=\"form-control-wrap\">\n");
      out.write("                                                                        <input type=\"text\" class=\"form-control\" name=\"staff-name\" value=\"");
      out.print( staffs.getStaffName());
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-4\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"form-label\" for=\"default-05\">Email</label>\n");
      out.write("                                                                    <div class=\"form-control-wrap\">\n");
      out.write("                                                                        <input type=\"text\" class=\"form-control\" name=\"staff-email\" value=\"");
      out.print( staffs.getEmail());
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-4\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"form-label\" for=\"default-05\">Password</label>\n");
      out.write("                                                                    <div class=\"form-control-wrap\">\n");
      out.write("                                                                        <input type=\"password\" class=\"form-control\" name=\"staff-password\" value=\"");
      out.print( staffs.getPassword());
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-4 mt-3\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"form-label\" for=\"default-05\">Contact Number</label>\n");
      out.write("                                                                    <div class=\"form-control-wrap\">\n");
      out.write("                                                                        <input type=\"tel\" pattern=\"[0][1][0-9][0-9]{10-13}\" class=\"form-control\" placeholder=\"01234567891\" name=\"staff-contact\" value=\"");
      out.print( staffs.getStaffContact());
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-4 mt-3\">\n");
      out.write("                                                                <label class=\"form-label\" for=\"default-06\">Role</label>\n");
      out.write("                                                                <div class=\"form-control-wrap \">\n");
      out.write("                                                                    <div class=\"form-control-select\">\n");
      out.write("                                                                        <select class=\"form-control\" name=\"staff-role\">\n");
      out.write("                                                                            <option value='0' ");
 out.print(staffs.getRole() == 0 ? "selected" : ""); 
      out.write(">Manager</option>\n");
      out.write("                                                                            <option value='1' ");
 out.print(staffs.getRole() == 1 ? "selected" : ""); 
      out.write(">Staff</option>\n");
      out.write("                                                                        </select>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div><!-- .nk-block -->\n");
      out.write("                                                        <div class=\"row mt-3\">\n");
      out.write("                                                            <div class=\"col-sm-6\">\n");
      out.write("                                                                <input type=\"submit\" class=\"btn btn-success\" value=\"Save\">\n");
      out.write("                                                                ");

                                                                    if (staffs.getStatus() == 1) {
                                                                
      out.write("\n");
      out.write("                                                                <a onclick=\"disableStaff()\" class=\"btn btn-warning\">Disable</a>\n");
      out.write("                                                                ");

                                                                } else {
                                                                
      out.write("\n");
      out.write("                                                                <a onclick=\"enableStaff()\" class=\"btn btn-success\">Enable</a>\n");
      out.write("                                                                ");

                                                                    }
                                                                
      out.write("\n");
      out.write("                                                                <a onclick=\"delStaff()\" class=\"btn btn-danger\">Delete</a>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div><!-- .card-inner -->\n");
      out.write("                                                </form>\n");
      out.write("                                            </div><!-- .card-content -->\n");
      out.write("\n");
      out.write("                                        </div><!-- .card -->\n");
      out.write("                                    </div><!-- .nk-block -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- content @e -->\n");
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
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("<!-- footer @e -->");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- wrap @e -->\n");
      out.write("            </div>\n");
      out.write("            <!-- main @e -->\n");
      out.write("        </div>\n");
      out.write("        <!-- app-root @e -->\n");
      out.write("        <!-- JavaScript -->\n");
      out.write("        <script src=\"./assets/js/bundle.js?ver=3.1.0\"></script>\n");
      out.write("        <script src=\"./assets/js/scripts.js?ver=3.1.0\"></script>\n");
      out.write("        <script src=\"./assets/js/charts/chart-ecommerce.js?ver=3.1.0\"></script>\n");
      out.write("        <script>\n");
      out.write("            ");

                try {
                    int error = (Integer) session.getAttribute("error");
                    if (error == 1) {
                        out.print("Swal.fire({"
                                + "icon: 'error',"
                                + "title: 'Oops...',"
                                + "text: `" + session.getAttribute("error_msg") + "`"
                                + "})" + "");
                        session.removeAttribute("error");
                    } else {
            
      out.write("\n");
      out.write("                                                                    swal.fire({\n");
      out.write("                                                                        icon: 'success',\n");
      out.write("                                                                        title: 'Update Successful!',\n");
      out.write("                                                                        text: 'Your changes have been saved.',\n");
      out.write("                                                                        confirmButtonText: 'OK'\n");
      out.write("                                                                    });\n");
      out.write("            ");

                        session.removeAttribute("error");
                    }
                } catch (Exception e) {

                }
            
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function delStaff() {\n");
      out.write("                swal.fire({\n");
      out.write("                    title: 'Are you sure?',\n");
      out.write("                    text: 'You won\\'t be able to revert this!',\n");
      out.write("                    icon: 'warning',\n");
      out.write("                    showCancelButton: true,\n");
      out.write("                    confirmButtonText: 'Yes, delete it!',\n");
      out.write("                    cancelButtonText: 'Cancel'\n");
      out.write("                }).then((result) => {\n");
      out.write("                    if (result.isConfirmed) {\n");
      out.write("                        window.location.href = \"DeleteStaff?id=");
      out.print( staffs.getStaffId());
      out.write("\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function disableStaff() {\n");
      out.write("                swal.fire({\n");
      out.write("                    title: 'Are you sure?',\n");
      out.write("                    text: 'Do you want to disable this account?',\n");
      out.write("                    icon: 'warning',\n");
      out.write("                    showCancelButton: true,\n");
      out.write("                    confirmButtonText: 'Yes, disable it!',\n");
      out.write("                    cancelButtonText: 'Cancel'\n");
      out.write("                }).then((result) => {\n");
      out.write("                    if (result.isConfirmed) {\n");
      out.write("                        window.location.href = \"DisableStaff?id=");
      out.print( staffs.getStaffId());
      out.write("\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function enableStaff() {\n");
      out.write("                swal.fire({\n");
      out.write("                    title: 'Are you sure?',\n");
      out.write("                    text: 'Do you want to enable this account?',\n");
      out.write("                    icon: 'warning',\n");
      out.write("                    showCancelButton: true,\n");
      out.write("                    confirmButtonText: 'Yes, enable it!',\n");
      out.write("                    cancelButtonText: 'Cancel'\n");
      out.write("                }).then((result) => {\n");
      out.write("                    if (result.isConfirmed) {\n");
      out.write("                        window.location.href = \"EnableStaff?id=");
      out.print( staffs.getStaffId());
      out.write("\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--SQL CODE FOR AUTO INCREMENT ID\n");
      out.write("CREATE TABLE Product (product_id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,\n");
      out.write("product_name VARCHAR(140) NOT NULL,\n");
      out.write("product_price DOUBLE,\n");
      out.write("product_image BLOB);-->");
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
