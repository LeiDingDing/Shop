package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"description\" content=\"\"/>\n");
      out.write("\t<meta name=\"keywords\" content=\"\"/>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\t\n");
      out.write("\t<!-- Favorite Icons -->\n");
      out.write("\t<link rel=\"icon\" href=\"img/favicon/favicon.html\" type=\"image/x-icon\" />\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"img/favicon/apple-touch-icon-144x144-precomposed.html\">\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"img/favicon/apple-touch-icon-72x72-precomposed.html\">\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" href=\"img/favicon/apple-touch-icon-precomposed.html\">\n");
      out.write("\t<!-- // Favorite Icons -->\n");
      out.write("\t\n");
      out.write("\t<!--<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>-->\n");
      out.write("\t\n");
      out.write("\t<!-- GENERAL CSS FILES -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/minified.css\">\n");
      out.write("\t<!-- // GENERAL CSS FILES -->\n");
      out.write("\t\n");
      out.write("\t<!--[if IE 8]>\n");
      out.write("\t\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/selectivizr-min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t<!--\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t-->\n");
      out.write("\t<script>window.jQuery || document.write('<script src=\"js/jquery.min.js\"><\\/script>');</script>\n");
      out.write("\t<script src=\"js/modernizr.min.js\"></script>\t\n");
      out.write("\t<!-- PARTICULAR PAGES CSS FILES -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.theme.css\">\n");
      out.write("\t<link href=\"css/flexslider.css\" rel=\"stylesheet\" />\n");
      out.write("\t<!-- // PARTICULAR PAGES CSS FILES -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- Essential Javascripts -->\n");
      out.write("        <script src=\"js/minified.js\"></script>\n");
      out.write("<!-- // Essential Javascripts -->\n");
      out.write("\n");
      out.write("\t<!-- Particular Page Javascripts -->\n");
      out.write("\t<script src=\"js/owl.carousel.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("\t<!-- // Particular Page Javascripts -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("//                $.ajax({\n");
      out.write("//                    type : \"post\",\n");
      out.write("//                    async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）\n");
      out.write("//                    url : \"CategoryServlet\",    //请求发送到TestServlet处\n");
      out.write("//                   data : {},\n");
      out.write("//                    dataType : \"json\",        //返回数据形式为json\n");
      out.write("//                    success : function(result) {\n");
      out.write("//                           if(result){\n");
      out.write("//                               var html='';\n");
      out.write("//                               for(var i=0;i<result.length;i++){\n");
      out.write("//                                   html+='<li>';\n");
      out.write("//                                   html+='<a class=\"cateadd\" id='+result[i].cid+'>'+result[i].ctype+'</a>';\n");
      out.write("//                                   html+='</li>';\n");
      out.write("//                               }\n");
      out.write("//                               $(\"#uul\").append(html);\n");
      out.write("//                           }\n");
      out.write("//                     },\n");
      out.write("//                error : function(errorMsg) {\n");
      out.write("//            //请求失败时执行该函数\n");
      out.write("//                    alert(\"请求数据失败!\");\n");
      out.write("//                    \n");
      out.write("//                 }\n");
      out.write("//    \n");
      out.write("//                 });\n");
      out.write("                $(\".cateadd\").click(function(){\n");
      out.write("//                   $(this).parent().addClass(\"active\");\n");
      out.write("//                   $(this).parent().siblings().removeClass(\"active\");\n");
      out.write("                   var cid=$(this).attr(\"id\");\n");
      out.write("                   $(\"#catehide\").val(cid);\n");
      out.write("                   mainform.action=\"GoodsServlet\";\n");
      out.write("                   mainform.submit();\n");
      out.write("                });\n");
      out.write("                $(\"#homeadd\").click(function(){\n");
      out.write("//                    $(\"#catehide\").val(\"\");\n");
      out.write("//                    $(this).parent().addClass(\"active\");\n");
      out.write("//                    $(this).parent().siblings().removeClass(\"active\");\n");
      out.write("                    $(\"#catehide\").val(0);\n");
      out.write("                    mainform.action=\"CategoryServlet\";\n");
      out.write("                    mainform.submit();\n");
      out.write("                });\n");
      out.write("                $(\".add-to-cart\").click(function(){\n");
      out.write("                    var gid=$(this).attr(\"id\");\n");
      out.write("                    $(\"#goodsid\").val(gid);\n");
      out.write("                    mainform.action=\"AddToCart\";\n");
      out.write("                    mainform.submit();\n");
      out.write("                });\n");
      out.write("                $(\"#showcart\").click(function(){\n");
      out.write("                    mainform.action=\"QueryShopcartServlet\";\n");
      out.write("                    mainform.submit();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"home\">\n");
      out.write("      \t\t\t\n");
      out.write("\t<!-- PAGE WRAPPER -->\n");
      out.write("        <form id=\"mainform\">\n");
      out.write("            <input type=\"hidden\" id=\"catehide\" name=\"cate\">\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("        <!-- SITE HEADER -->\n");
      out.write("\t<header id=\"site-header\" role=\"banner\">\n");
      out.write("\t\t<!-- HEADER TOP -->\n");
      out.write("\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-7\">\n");
      out.write("\t\t\t\t\t\t<!-- CONTACT INFO -->\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-info\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"iconfont-headphones round-icon\"></i>\n");
      out.write("\t\t\t\t\t\t\t<strong>+444 (100) 1234</strong>\n");
      out.write("\t\t\t\t\t\t\t<span>(Mon- Fri: 09.00 - 21.00)</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- // CONTACT INFO -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-5\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"actions unstyled clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- SEARCH BOX -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"search-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-iconed prepend\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"input-icon\"><i class=\"iconfont-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"input-search\" class=\"placeholder\">Search here…</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"q\" id=\"input-search\" class=\"round-input full-width\" required />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- // SEARCH BOX -->\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li data-toggle=\"sub-header\" data-target=\"#sub-cart\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- SHOPPING CART -->\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" id=\"total-cart\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"iconfont-shopping-cart round-icon\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"sub-cart\" class=\"sub-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cart-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>您的购物车为空</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<small><a href=\"cart.html\">(See All)</a></small>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"cart-items product-medialist unstyled clearfix\"></ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cart-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cart-total clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-left uppercase\">Total</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-right total\">$ 0</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"text-right\">\n");
      out.write("                                                                                    <a class=\"btn btn-default btn-round view-cart\" id=\"showcart\">查看购物车</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- // SHOPPING CART -->\n");
      out.write("                                                               \n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- ADD TO CART MESSAGE -->\n");
      out.write("\t\t\t<div class=\"cart-notification\">\n");
      out.write("\t\t\t\t<ul class=\"unstyled\"></ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- // ADD TO CART MESSAGE -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- // HEADER TOP -->\n");
      out.write("\t\t<!-- MAIN HEADER -->\n");
      out.write("<!--                <form id=\"ff2\" action=\"CategoryServlet\">-->\n");
      out.write("\t\t<div class=\"main-header-wrapper\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"main-header\">\n");
      out.write("\t\t\t\t\t<!-- SITE LOGO -->\n");
      out.write("\t\t\t\t\t<div class=\"logo-wrapper\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index-2.html\" class=\"logo\" title=\"GFashion - Responsive e-commerce HTML Template\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/logo.png\" alt=\"GFashion - Responsive e-commerce HTML Template\" />\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- // SITE LOGO -->\n");
      out.write("\t\t\t\t\t<!-- SITE NAVIGATION MENU -->\n");
      out.write("                                        <nav id=\"site-menu\" role=\"navigation\">\n");
      out.write("                                            \n");
      out.write("                                            <ul class=\"main-menu hidden-sm hidden-xs\" id=\"uul\">\n");
      out.write("                                                    <li>\n");
      out.write("\t\t\t\t\t\t\t<a id=\"homeadd\">首页</a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </ul>\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<!-- // SITE NAVIGATION MENU -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("                    <!--</form>-->\n");
      out.write("\t\t<!-- // MAIN HEADER -->\n");
      out.write("\t</header>\n");
      out.write("\t<!-- // SITE HEADER -->\n");
      out.write("        <div id=\"maindiv\">\n");
      out.write("            ");

                String jsppage="home.jsp";
                String cate=request.getParameter("cate");
                if(cate!=null){
                    if(!cate.equals("")){
                        if(Integer.parseInt(cate)!=0){
                            jsppage="goods.jsp";
                        }else{
                            jsppage="home.jsp";
                        }
                    }else{
                        jsppage="home.jsp";
                    }
                 }
                
                
            
      out.write("\n");
      out.write("           ");
      out.write("\n");
      out.write("           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jsppage, out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <input type=\"hidden\" name=\"goodsid\" id=\"goodsid\">\n");
      out.write("        \n");
      out.write("\t\t<!-- SITE FOOTER -->\n");
      out.write("\t<footer class=\"page-footer\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- WIDGET AREA -->\n");
      out.write("\t\t<div class=\"widgets\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- // WIDGET AREA -->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"footer-sub\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-links center-xs clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"unstyled\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">合作伙伴</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">网站地图</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">关于</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">联系客服</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"space40 visible-xs\"></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 center-xs\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"vmid\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"uppercase\">Payment Accept&emsp;</span>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/visacard.png\" alt=\"\" width=\"40\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/mastercard.png\" alt=\"\" width=\"40\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/paypal.png\" alt=\"\" width=\"40\" /></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</footer>\n");
      out.write("\t<!-- // SITE FOOTER -->\n");
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write("<!-- // PAGE WRAPPER -->\n");
      out.write("</form>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorylist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("cates");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <li>\n");
          out.write("                                                            <a class=\"cateadd\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cates.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cates.ctype}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                        </li>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
