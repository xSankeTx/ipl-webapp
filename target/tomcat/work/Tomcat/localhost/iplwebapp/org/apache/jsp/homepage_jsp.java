/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-12 09:09:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang= \"en\">\n");
      out.write("<head>\n");
      out.write("  <title>IPL Cricket</title>\n");
      out.write("    <meta character= \"UTF-8\">\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"style.css\"> -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"side.css\">\n");
      out.write("    <style>\n");
      out.write("        .carousel-item{\n");
      out.write("    height: 100vh;\n");
      out.write("    min-height: 300px;\n");
      out.write("    background: no-repeat center center scroll;\n");
      out.write("    -webkit-background-size: cover;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 80px;\n");
      out.write("    background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul li a{\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*.navbar-light .navbar-brand{\n");
      out.write("    color: black ;\n");
      out.write("    font-size: 25px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    font-weight: bold;\n");
      out.write("    letter-spacing: 2px;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write(".navbar-light .navbar-nav .active>.nav-link, .navbar-light .navbar-nav .nav-link.active, .navbar-light .navbar-nav .nav-link.show, .navbar-light .navbar-nav .show>\n");
      out.write(".nav-link{\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-light .navbar-nav .nav-link{\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-light .navbar-nav .nav-link:focus, .navbar-light .navbar-nav .nav-link:hover{\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2.section-title {\n");
      out.write("    font-family: Arial Narrow Bold;\n");
      out.write("    font-weight: 700;\n");
      out.write("    font-style: italic;\n");
      out.write("    font-size: 45px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color: #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p.text-center{\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-style: italic;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row{\n");
      out.write("    background-color: black;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!--<a class=\"navbar-brand\" href=\"#\">BEHIND THE VOWES</a>-->\n");
      out.write("   \n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/home\">\n");
      out.write("              <img src=\"logo.jfif\" class=\"img-responsive\" alt=\"\" width=\"170\" height=\"60\">\n");
      out.write("            </a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("      \n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("          <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("\t\t\t\t<li class = \"nav-item>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</li>\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/add\">Add Player Details<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/view\">View Player Details</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/update\">Update Player Details</a>\n");
      out.write("                </li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/delete\">Delete Player Details</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                 <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"aboutus.html\">ABOUT US</a>\n");
      out.write("                 </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("          <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"3\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"carousel-item active\">\n");
      out.write("            <img src=\"mumbai.jpg\" class=\"d-block w-100\" alt=\"first slide\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"csk.jpg\" class=\"d-block w-100\" alt=\"second slide\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"dc.jpg\" class=\"d-block w-100\" alt=\"third slide\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"kkr.jpg\" class=\"d-block w-100\" alt=\"forth slide\">\n");
      out.write("          </div>\n");
      out.write("\t\t   <div class=\"carousel-item\">\n");
      out.write("            <img src=\"rcb.jpg\" class=\"d-block w-100\" alt=\"fifth slide\">\n");
      out.write("          </div>\n");
      out.write("\t\t   <div class=\"carousel-item\">\n");
      out.write("            <img src=\"punjab.jpg\" class=\"d-block w-100\" alt=\"sixth slide\">\n");
      out.write("          </div>\n");
      out.write("\t\t   <div class=\"carousel-item\">\n");
      out.write("            <img src=\"rajastan.jpg\" class=\"d-block w-100\" alt=\"seventh slide\">\n");
      out.write("          </div>\n");
      out.write("\t\t   <div class=\"carousel-item\">\n");
      out.write("            <img src=\"sunrisers.jpg\" class=\"d-block w-100\" alt=\"eighth slide\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br><br>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
