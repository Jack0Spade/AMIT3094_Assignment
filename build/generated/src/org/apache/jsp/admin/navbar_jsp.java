package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Staff;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("                    <img class=\"logo-light logo-img\" src=\"");
      out.print( getServletContext().getInitParameter("webLogo"));
      out.write("\" srcset=\"./images/logo2x.png 2x\" alt=\"logo\">\n");
      out.write("                    <img class=\"logo-dark logo-img\" src=\"");
      out.print( getServletContext().getInitParameter("webLogo"));
      out.write("\" srcset=\"./images/logo-dark2x.png 2x\" alt=\"logo-dark\">\n");
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
