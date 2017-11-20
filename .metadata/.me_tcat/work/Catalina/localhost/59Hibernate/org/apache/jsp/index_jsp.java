package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>影院信息查询</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<script type='text/javascript'\r\n");
      out.write("\t\t\tsrc=\"/Cinema/dwr/interface/TypeBiz.js\"></script>\r\n");
      out.write("\t<script type='text/javascript' src=\"/Cinema/dwr/engine.js\"></script>\r\n");
      out.write("\t<script type='text/javascript' src=\"/Cinema/dwr/util.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction getType(){\r\n");
      out.write("\t\t\tTypeBiz.getAllType(setType);\t\t\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t\tfunction setType(list){\r\n");
      out.write("\t\t\tDWRUtil.removeAllOptions(\"typeid\");\r\n");
      out.write("\t\t\t//for(var property in list){\r\n");
      out.write("\t\t\t//\talert(\"typeId:\"+list[property].typeId+\" typeNmae:\"+list[property].typeName);\r\n");
      out.write("\t\t\t//}\r\n");
      out.write("\t\t\tDWRUtil.addOptions(\"typeid\",list,\"typeId\",\"typeName\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <form action=\"filmsearch.action\" method=\"post\">\r\n");
      out.write("     <table>\r\n");
      out.write("    \t<tr><td>电影名称：</td><td><input name=\"filmname\" type=\"text\"/></td></tr>\r\n");
      out.write("    \t<tr><td>电影类型：</td><td><select id=\"typeid\" name=\"typeid\" onfocus=\"getType()\"><option value=\"%\">全部</option></select> </td></tr>\r\n");
      out.write("    \t<tr><td>主演：</td><td><input name=\"actor\" type=\"text\"/></td></tr>\r\n");
      out.write("     \t<tr><td>导演：</td><td><input name=\"director\" type=\"text\"/></td></tr>\r\n");
      out.write("        <tr><td>价格：</td><td><input name=\"smallprice\" type=\"text\"/>至<input name=\"bigprice\" type=\"text\"/></td></tr>\r\n");
      out.write("    \t<tr><td>查询 </td> <td><input name=\"submit\" type=\"submit\"/></td></tr>\r\n");
      out.write("     </table>\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
