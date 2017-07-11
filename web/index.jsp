<%-- 
    Document   : index
    Created on : 2016-12-29, 8:57:42
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<!-- Favorite Icons -->
	<link rel="icon" href="img/favicon/favicon.html" type="image/x-icon" />
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/favicon/apple-touch-icon-144x144-precomposed.html">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/favicon/apple-touch-icon-72x72-precomposed.html">
	<link rel="apple-touch-icon-precomposed" href="img/favicon/apple-touch-icon-precomposed.html">
	<!-- // Favorite Icons -->
	
	<!--<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>-->
	
	<!-- GENERAL CSS FILES -->
	<link rel="stylesheet" href="css/minified.css">
	<!-- // GENERAL CSS FILES -->
	
	<!--[if IE 8]>
		<script src="js/respond.min.js"></script>
		<script src="js/selectivizr-min.js"></script>
	<![endif]-->
	<!--
	<script src="js/jquery.min.js"></script>
	-->
	<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>');</script>
	<script src="js/modernizr.min.js"></script>	
	<!-- PARTICULAR PAGES CSS FILES -->
	<link rel="stylesheet" href="css/owl.carousel.css">
	<link rel="stylesheet" href="css/owl.theme.css">
	<link href="css/flexslider.css" rel="stylesheet" />
	<!-- // PARTICULAR PAGES CSS FILES -->
	<link rel="stylesheet" href="css/responsive.css">
        <!-- Essential Javascripts -->
        <script src="js/minified.js"></script>
<!-- // Essential Javascripts -->

	<!-- Particular Page Javascripts -->
	<script src="js/owl.carousel.js"></script>
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- // Particular Page Javascripts -->
        <script>
            $(document).ready(function(){
//                $.ajax({
//                    type : "post",
//                    async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
//                    url : "CategoryServlet",    //请求发送到TestServlet处
//                   data : {},
//                    dataType : "json",        //返回数据形式为json
//                    success : function(result) {
//                           if(result){
//                               var html='';
//                               for(var i=0;i<result.length;i++){
//                                   html+='<li>';
//                                   html+='<a class="cateadd" id='+result[i].cid+'>'+result[i].ctype+'</a>';
//                                   html+='</li>';
//                               }
//                               $("#uul").append(html);
//                           }
//                     },
//                error : function(errorMsg) {
//            //请求失败时执行该函数
//                    alert("请求数据失败!");
//                    
//                 }
//    
//                 });
                $(".cateadd").click(function(){
//                   $(this).parent().addClass("active");
//                   $(this).parent().siblings().removeClass("active");
                   var cid=$(this).attr("id");
                   $("#catehide").val(cid);
                   mainform.action="GoodsServlet";
                   mainform.submit();
                });
                $("#homeadd").click(function(){
//                    $("#catehide").val("");
//                    $(this).parent().addClass("active");
//                    $(this).parent().siblings().removeClass("active");
                    $("#catehide").val(0);
                    mainform.action="CategoryServlet";
                    mainform.submit();
                });
                $(".add-to-cart").click(function(){
                    var gid=$(this).attr("id");
                    $("#goodsid").val(gid);
                    mainform.action="AddToCart";
                    mainform.submit();
                });
                $("#showcart").click(function(){
                    mainform.action="QueryShopcartServlet";
                    mainform.submit();
                });
            });
        </script>
    </head>
    <body class="home">
      			
	<!-- PAGE WRAPPER -->
        <form id="mainform">
            <input type="hidden" id="catehide" name="cate">
<div id="page-wrapper">
        <!-- SITE HEADER -->
	<header id="site-header" role="banner">
		<!-- HEADER TOP -->
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-7">
						<!-- CONTACT INFO -->
						<div class="contact-info">
							<i class="iconfont-headphones round-icon"></i>
							<strong>+444 (100) 1234</strong>
							<span>(Mon- Fri: 09.00 - 21.00)</span>
							</div>
						<!-- // CONTACT INFO -->
					</div>
					<div class="col-xs-12 col-sm-6 col-md-5">
						<ul class="actions unstyled clearfix">
							<li>
								<!-- SEARCH BOX -->
								<div class="search-box">
									<form action="#" method="post">
										<div class="input-iconed prepend">
											<button class="input-icon"><i class="iconfont-search"></i></button>
											<label for="input-search" class="placeholder">搜索</label>
											<input type="text" name="q" id="input-search" class="round-input full-width" required />
										</div>
									</form>
								</div>
								<!-- // SEARCH BOX -->
							</li>
							
							<li data-toggle="sub-header" data-target="#sub-cart">
								<!-- SHOPPING CART -->
								<a href="javascript:void(0);" id="total-cart">
									<i class="iconfont-shopping-cart round-icon"></i>
								</a>
								
								<div id="sub-cart" class="sub-header">
									<div class="cart-header">
										<span>您的购物车为空</span>
										<small><a href="#">(See All)</a></small>
									</div>
									<ul class="cart-items product-medialist unstyled clearfix"></ul>
									<div class="cart-footer">
										
										<div class="text-right">
                                                                                    <a class="btn btn-default btn-round view-cart" id="showcart">查看购物车</a>
										</div>
									</div>
								</div>
								<!-- // SHOPPING CART -->
                                                               
							</li>
                                                        <li data-toggle="sub-header" data-target="#sub-social">
								<!-- SOCIAL ICONS -->
                                                                <a title="查看订单" id="showorder">
                                                                    <i class="round-icon"><img src="img/order.png"></i>
								</a>
                                                        </li>

						</ul>
					</div>
				</div>
			</div>
			
			<!-- ADD TO CART MESSAGE -->
			<div class="cart-notification">
				<ul class="unstyled"></ul>
			</div>
			<!-- // ADD TO CART MESSAGE -->
		</div>
		<!-- // HEADER TOP -->
		<!-- MAIN HEADER -->
<!--                <form id="ff2" action="CategoryServlet">-->
		<div class="main-header-wrapper">
			<div class="container">
				<div class="main-header">
					<!-- SITE LOGO -->
					<div class="logo-wrapper">
						<a class="logo" title="GFashion - Responsive e-commerce HTML Template">
							<img src="img/logo.png" alt="GFashion - Responsive e-commerce HTML Template" />
						</a>
					</div>
					<!-- // SITE LOGO -->
					<!-- SITE NAVIGATION MENU -->
                                        <nav id="site-menu" role="navigation">
                                            
                                            <ul class="main-menu hidden-sm hidden-xs" id="uul">
                                                    <li>
							<a id="homeadd">首页</a>
                                                    </li>
                                                    <c:forEach items="${categorylist}" var="cates">
                                                        <li>
                                                            <a class="cateadd" id="${cates.cid}">${cates.ctype}</a>
                                                        </li>
                                                    </c:forEach>
                                                </ul>
                                            
					</nav>
                                        
					<!-- // SITE NAVIGATION MENU -->
				</div>
			</div>
		</div>
                    <!--</form>-->
		<!-- // MAIN HEADER -->
	</header>
	<!-- // SITE HEADER -->
        <div id="maindiv">
            <%
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
                
                
            %>
           <%--<%@include file="home.jsp"%>--%>
           <jsp:include page="<%=jsppage%>"></jsp:include>
        </div>
        <input type="hidden" name="goodsid" id="goodsid">
        
		<!-- SITE FOOTER -->
	<footer class="page-footer">
		
		<!-- WIDGET AREA -->
		<div class="widgets">
		</div>
		<!-- // WIDGET AREA -->
		
		<div class="footer-sub">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-6">
						<div class="footer-links center-xs clearfix">
							<ul class="unstyled">
								<li><a href="#">合作伙伴</a></li>
								<li><a href="#">网站地图</a></li>
								<li><a href="#">关于</a></li>
								<li><a href="#">联系客服</a></li>
							</ul>
						</div>
						
					</div>
					
					<div class="space40 visible-xs"></div>
					
					<div class="col-xs-12 col-sm-6 center-xs">
						<div class="pull-right">
							<div class="vmid">
								<span class="uppercase">Payment Accept&emsp;</span>
								<a href="#"><img src="img/visacard.png" alt="" width="40" /></a>
								<a href="#"><img src="img/mastercard.png" alt="" width="40" /></a>
								<a href="#"><img src="img/paypal.png" alt="" width="40" /></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	</footer>
	<!-- // SITE FOOTER -->
		
</div>
<!-- // PAGE WRAPPER -->
</form>

    </body>
</html>
