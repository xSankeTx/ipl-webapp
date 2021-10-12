/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-12 06:24:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("   <meta charset=\"UTF-8\">\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <title>IPL 2021</title>\n");
      out.write("   <style>\n");
      out.write("       @import url('https://fonts.googleapis.com/css2?family=Noto+Sans:wght@700&family=Poppins:wght@400;500;600&display=swap');\n");
      out.write("*{\n");
      out.write("   margin: 0;\n");
      out.write("   padding: 0;\n");
      out.write("   box-sizing: border-box;\n");
      out.write("   font-family: \"Poppins\", sans-serif;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("   margin:0;\n");
      out.write("   padding: 0;\n");
      out.write("   background-image: url('bg.jpeg');\n");
      out.write("   background-repeat: no-repeat;\n");
      out.write("   background-attachment: fixed;\n");
      out.write("   background-size: cover;\n");
      out.write("   height: 100vh;\n");
      out.write("   overflow: hidden;\n");
      out.write("}\n");
      out.write(".center{\n");
      out.write("   position: absolute;\n");
      out.write("   top: 50%;\n");
      out.write("   left: 50%;\n");
      out.write("   transform: translate(-50%,-50%);\n");
      out.write("   width: 400px;\n");
      out.write("   background: white;\n");
      out.write("   border-radius: 10px;\n");
      out.write("   box-shadow: 10px 10px 15px rgba(0,0,0,0.05);\n");
      out.write("}\n");
      out.write(".center h1{\n");
      out.write("   text-align: center;\n");
      out.write("   padding: 20px 0;\n");
      out.write("   border-bottom: 1px solid silver;\n");
      out.write("}\n");
      out.write(".center form{\n");
      out.write("   padding: 0 40px;\n");
      out.write("   box-sizing: border-box;\n");
      out.write("}\n");
      out.write("form .txt_field{\n");
      out.write("   position: relative;\n");
      out.write("   border-bottom: 2px solid #adadad;\n");
      out.write("   margin: 30px 0;\n");
      out.write("}\n");
      out.write(".txt_field input{\n");
      out.write("   width: 100%;\n");
      out.write("   padding: 0 5px;\n");
      out.write("   height: 40px;\n");
      out.write("   font-size: 16px;\n");
      out.write("   border: none;\n");
      out.write("   background: none;\n");
      out.write("   outline: none;\n");
      out.write("}\n");
      out.write(".txt_field label{\n");
      out.write("   position: absolute;\n");
      out.write("   top: 50%;\n");
      out.write("   left: 5px;\n");
      out.write("   color: #adadad;\n");
      out.write("   transform: translateY(-50%);\n");
      out.write("   font-size: 16px;\n");
      out.write("   pointer-events: none;\n");
      out.write("   transition: .5s;\n");
      out.write("}\n");
      out.write(".txt_field span::before{\n");
      out.write("   content: '';\n");
      out.write("   position: absolute;\n");
      out.write("   top: 40px;\n");
      out.write("   left: 0;\n");
      out.write("   width: 0%;\n");
      out.write("   height: 2px;\n");
      out.write("   background: #8c9e3b;\n");
      out.write("   transition: .5s;\n");
      out.write("}\n");
      out.write(".txt_field input:focus ~ label,\n");
      out.write(".txt_field input:valid ~ label{\n");
      out.write("   top: -5px;\n");
      out.write("   color: #8c9e3b;\n");
      out.write("}\n");
      out.write(".txt_field input:focus ~ span::before,\n");
      out.write(".txt_field input:valid ~ span::before{\n");
      out.write("   width: 100%;\n");
      out.write("}\n");
      out.write(".pass{\n");
      out.write("   margin: -5px 0 20px 5px;\n");
      out.write("   color: #a6a6a6;\n");
      out.write("   cursor: pointer;\n");
      out.write("}\n");
      out.write(".pass:hover{\n");
      out.write("   text-decoration: underline;\n");
      out.write("}\n");
      out.write("input[type=\"submit\"]{\n");
      out.write("   width: 100%;\n");
      out.write("   height: 50px;\n");
      out.write("   border: 1px solid;\n");
      out.write("   background: #a3af56;\n");
      out.write("   border-radius: 25px;\n");
      out.write("   font-size: 18px;\n");
      out.write("   color: #e9f4fb;\n");
      out.write("   font-weight: 700;\n");
      out.write("   cursor: pointer;\n");
      out.write("   outline: none;\n");
      out.write("}\n");
      out.write("input[type=\"submit\"]:hover{\n");
      out.write("   border-color: #8c9e3b;\n");
      out.write("   transition: .5s;\n");
      out.write("}\n");
      out.write(".space{\n");
      out.write("   margin: 30px 0;\n");
      out.write("}\n");
      out.write("   </style>\n");
      out.write("   <!-- <link rel=\"stylesheet\" href=\"/home/coder/project/workspace/iplwebapp/src/main/webapp/css/style.css\"> -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"center\">\n");
      out.write("      <h1>Login</h1>\n");
      out.write("      <form action=\"view\" method=\"get\">\n");
      out.write("         <div class=\"txt_field\">\n");
      out.write("            <input type=\"text\" name=\"un\" required>\n");
      out.write("            <span></span>\n");
      out.write("            <label>Username</label>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"txt_field\">\n");
      out.write("            <input type=\"password\" name=\"pw\" required>\n");
      out.write("            <span></span>\n");
      out.write("            <label>Password</label>\n");
      out.write("         </div>\n");
      out.write("         <input type=\"submit\" value=\"Login\">\n");
      out.write("      </form>\n");
      out.write("      <div class=\"space\"></div>\n");
      out.write("   </div>\n");
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
