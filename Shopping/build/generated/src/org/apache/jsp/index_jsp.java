package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <style>\n");
      out.write("            .header{\n");
      out.write("                list-style-type:none;\n");
      out.write("                margin:10px;\n");
      out.write("                padding:10px;\n");
      out.write("                overflow:hidden;\n");
      out.write("                background-color:skyblue;\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 70px;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 100px;\n");
      out.write("    \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='header'>header</div>\n");
      out.write("        <div>content</div>\n");
      out.write("        <fieldset style=\"width:45%; float:left\">\n");
      out.write("            <legend>login</legend>\n");
      out.write("            <form action='home'>\n");
      out.write("                <input type=\"text\" name=\"firstname\" value=\"text\" />\n");
      out.write("                <input type=\"submit\" value=\"submit\" />\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </fieldset>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"content\" style=\"width:100%;\">\n");
      out.write("        \n");
      out.write("                <img src=\"http://www.splc2016.net/img/footer.png\">   \n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        </footer>     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
