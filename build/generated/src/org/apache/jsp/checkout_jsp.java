package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"icon\" href=\"img/favicon/favicon.html\" type=\"image/x-icon\" />\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"img/favicon/apple-touch-icon-144x144-precomposed.html\">\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"img/favicon/apple-touch-icon-72x72-precomposed.html\">\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" href=\"img/favicon/apple-touch-icon-precomposed.html\">\n");
      out.write("\t<!-- // Favorite Icons -->\n");
      out.write("\t\n");
      out.write("\t<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>\n");
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
      out.write("\t<link rel=\"stylesheet\" href=\"css/innerpage.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.theme.css\">\n");
      out.write("\t<!-- // PARTICULAR PAGES CSS FILES -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#commitorder\").click(function(){\n");
      out.write("                    checkform.action=\"CreateOrderServlet\";\n");
      out.write("                    checkform.submit();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form id=\"checkform\" method=\"POST\">\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\t<!-- SITE HEADER -->\n");
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
      out.write("\t\t\t\t\t\n");
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
      out.write("                \n");
      out.write("\t\t<!-- MAIN HEADER -->\n");
      out.write("\t\t<div class=\"main-header-wrapper\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"main-header\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- SITE LOGO -->\n");
      out.write("\t\t\t\t\t<div class=\"logo-wrapper\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index-2.html\" class=\"logo\" title=\"GFashion - Responsive e-commerce HTML Template\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/logo.png\" alt=\"GFashion - Responsive e-commerce HTML Template\" />\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- // SITE LOGO -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- // MAIN HEADER -->\n");
      out.write("\t</header>\n");
      out.write("\t<!-- // SITE HEADER -->\n");
      out.write("        <!-- BREADCRUMB -->\n");
      out.write("\t\t<div class=\"breadcrumb-container\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"relative\">\n");
      out.write("\t\t\t\t\t<ul class=\"bc unstyled clearfix\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">首页</a></li>\n");
      out.write("                                                <li><a href=\"#\">购物车</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"active\">下单</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- // BREADCRUMB -->\n");
      out.write("        <!-- SITE MAIN CONTENT -->\n");
      out.write("\t\t<main id=\"main-content\" role=\"main\">\n");
      out.write("                    \n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("                            \n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("                                    <!--<div class=\"m-t-b clearfix\">-->\n");
      out.write("                                            <section class=\"col-xs-12 col-sm-8 col-md-9\">\n");
      out.write("                                                <div>\n");
      out.write("                                                    <h4>您购买的商品总价为：￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(",请确认订单信息，并完善资料</h4>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"panel-group checkout\" id=\"checkout-collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#checkout-collapse\" href=\"#checkout-collapse1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"step\">01</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t订单详情\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                        <div id=\"checkout-collapse1\" class=\"panel-collapse collapse in\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"tbl-cart\" id=\"cartTable\">\n");
      out.write("                                                                                                        <thead>\n");
      out.write("                                                                                                            <tr>\n");
      out.write("                                                                                                                <th>商品名称</th>\n");
      out.write("                                                                                                                <th style=\"width: 15%;\">单价</th>\n");
      out.write("                                                                                                                <th style=\"width: 15%;\">数量</th>\n");
      out.write("                                                                                                                <th class=\"hidden-xs\" style=\"width: 15%;\">总价</th>\n");
      out.write("                                                                                                                <th class=\"hidden-xs\" style=\"width: 10%;\"></th>\n");
      out.write("                                                                                                            </tr>\n");
      out.write("                                                                                                        </thead>\n");
      out.write("                                                                                                        <tbody>\n");
      out.write("                                                                                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                                                        </tbody>\n");
      out.write("                                                                                                </table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#checkout-collapse\" href=\"#checkout-collapse2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"step\">02</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t收货人信息\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                        <div id=\"checkout-collapse2\" class=\"panel-collapse collapse in\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("                                                                                    <div class=\"form-horizontal\" role=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                                                            <div class=\"col-xs-12 col-sm-12 col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group stylish-input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputFirstname\" class=\"col-sm-4 col-lg-4 control-label required\">收货人姓名</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputFirstname\" name=\"shouname\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group stylish-input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputEmail2\" class=\"col-sm-4 col-lg-4 control-label required\">E-Mail</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"inputEmail2\" name=\"email\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group stylish-input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPhone\" class=\"col-sm-4 col-lg-4 control-label required\">手机号码</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputPhone\" name=\"telephone\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                            </div>\n");
      out.write("                                                                                            <div class=\"col-xs-12 col-sm-12 col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group stylish-input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputAddress1\" class=\"col-sm-4 col-lg-4 control-label required\">收货地址</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputAddress1\" name=\"address\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group stylish-input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPostcode\" class=\"col-sm-4 col-lg-4 control-label required\">邮编</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputPostcode\" name=\"postcode\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                                                <div class=\"form-group stylish-input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputRemark\" class=\"col-sm-4 col-lg-4 control-label\">备注</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-8 col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputRemark\" name=\"remark\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                            </div>\n");
      out.write("                                                                                        </div>\n");
      out.write("                                                                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#checkout-collapse\" href=\"#checkout-collapse3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"step\">03</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t确认下单\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                        <div id=\"checkout-collapse3\" class=\"panel-collapse collapse in\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                                                            <div class=\"col-xs-12 col-sm-6 pull-right center-sm\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"shop-summary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"total\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>总价:</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("                                                                                                                    <th><a href=\"#\" class=\"btn btn-default btn-round uppercase\" id=\"commitorder\">提交订单</a></th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\" class=\"btn btn-primary btn-round uppercase\">继续购物</a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("                                                                                            </div>\n");
      out.write("                                                                                        </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                            </section>\n");
      out.write("                                        <!--</div>-->\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                </main>\n");
      out.write("              <!-- SITE FOOTER -->\n");
      out.write("            <footer class=\"page-footer\">\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"footer-sub\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-links center-xs clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">合作伙伴</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">网站地图</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">关于</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">联系客服</a></li>\n");
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
      out.write("\t<!-- // SITE FOOTER -->                                        \n");
      out.write("        </div>\n");
      out.write("<!-- // PAGE WRAPPER -->\n");
      out.write("<!-- Essential Javascripts -->\n");
      out.write("<script src=\"js/minified.js\"></script>\n");
      out.write("<!-- // Essential Javascripts -->\n");
      out.write("\n");
      out.write("\t<!-- Particular Page Javascripts -->\n");
      out.write("\t<script src=\"js/products.js\"></script>\n");
      out.write("\t<!-- // Particular Page Javascripts -->\n");
      out.write("        </form>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goodsoncart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("goods");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                                                            <tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods.gid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                                                                <td>\n");
          out.write("                                                                                                                    <a class=\"entry-thumbnail\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods.gpic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-toggle=\"lightbox\">\n");
          out.write("                                                                                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods.gpic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                                                                                                                    </a>\n");
          out.write("                                                                                                                    <a class=\"entry-title\" href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods.gname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                                                                                </td>\n");
          out.write("                                                                                                                <td><span class=\"unit-price\">￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods.gprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></td>\n");
          out.write("                                                                                                                <td>\n");
          out.write("                                                                                                                   <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods.gnum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                                                                </td>\n");
          out.write("                                                                                                                <td class=\"hidden-xs\"><strong class=\"text-bold row-total\">￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${goods.gprice*goods.gnum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\n");
          out.write("                                                                                                            </tr>\n");
          out.write("                                                                                                            ");
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
