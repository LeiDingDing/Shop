<%-- 
    Document   : cart
    Created on : 2017-1-6, 14:46:10
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Favorite Icons -->
	<link rel="icon" href="img/favicon/favicon.html" type="image/x-icon" />
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/favicon/apple-touch-icon-144x144-precomposed.html">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/favicon/apple-touch-icon-72x72-precomposed.html">
	<link rel="apple-touch-icon-precomposed" href="img/favicon/apple-touch-icon-precomposed.html">
	<!-- // Favorite Icons -->
	
	<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
	
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
	<link rel="stylesheet" href="css/innerpage.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
	<link rel="stylesheet" href="css/owl.theme.css">
	<!-- // PARTICULAR PAGES CSS FILES -->
	<link rel="stylesheet" href="css/responsive.css">
        <script>
            $(document).ready(function(){
               $(".close").click(function(){
                   var gid=$(this).parent().parent().attr("id");
                   $("#delgid").val(gid);
                   cartform.action="DeleteGoodsOnCart";
                   cartform.submit();
               }); 
               $("#checkmoney").click(function(){
                   var temp=$("#totalprice").text();
                   var orderprice=temp.replace( /^\D+/g, '');
                   $("#totalpr").val(orderprice);
                   var gidarr="";
                   $("#cartTable tbody tr").each(function() {
                      if($(this).find(":checkbox").prop("checked") == true){
                          if($(this).attr("id")!==undefined){
                              gidarr+=$(this).attr("id")+",";
                          }
                          
                      }
                    });
                    $("#gids").val(gidarr);
                    if(parseFloat(orderprice)>0){
                        cartform.action="ReadyToOrderServlet";
                        cartform.submit();
                    }else{
                        alert("请先选择商品");
                    }
                    
               });
               $("#homehref").click(function(){
                   cartform.action="CategoryServlet";
                   cartform.submit();
               });
               $("#buygoods").click(function(){
                   cartform.action="CategoryServlet";
                   cartform.submit();
               });
            });
        </script>
    </head>
    <body>
        			
	<!-- PAGE WRAPPER -->
        <form id="cartform">
            <input type="hidden" id="delgid" name="deleid"/>
            <input type="hidden" id="totalpr" name="orderprice">
            <input type="hidden" id="gids" name="gidarr">
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
		<div class="main-header-wrapper">
			<div class="container">
				<div class="main-header">
					
					<!-- SITE LOGO -->
					<div class="logo-wrapper">
						<a class="logo" title="GFashion">
							<img src="img/logo.png" alt="GFashion" />
						</a>
					</div>
					<!-- // SITE LOGO -->
					
				</div>
			</div>
		</div>
		<!-- // MAIN HEADER -->
	</header>
	<!-- // SITE HEADER -->
	
		<!-- BREADCRUMB -->
		<div class="breadcrumb-container">
			<div class="container">
				<div class="relative">
					<ul class="bc unstyled clearfix">
						<li><a id="homehref">首页</a></li>
						<li class="active">购物车</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- // BREADCRUMB -->
		
		<!-- SITE MAIN CONTENT -->
		<main id="main-content" role="main">
				
			<section class="section">
				<div class="container">
					
                                    <table class="tbl-cart" id="cartTable">
						<thead>
							<tr>
                                                                <th style="width: 5%;"><label><input class="check-all check" type="checkbox" />全选</label></th>
								<th>商品名称</th>
								<th style="width: 15%;">单价</th>
								<th style="width: 15%;">数量</th>
								<th class="hidden-xs" style="width: 15%;">总价</th>
								<th class="hidden-xs" style="width: 10%;"></th>
							</tr>
						</thead>
						<tbody>
                                                    
                                                    <c:if test="${shopcart.size()==0}">
                                                        <tr class="empty-cart">
								<td colspan="5">
									购物车里没有商品,请先 <a id="buygoods">购物</a>.
								</td>
							</tr>
                                                    </c:if>
                                                    <c:if test="${shopcart.size()>0}">
                                                        <c:forEach items="${shopcart}" var="goods">
                                                            <tr id="${goods.gid}">
                                                                <td>
                                                                    <input type="checkbox" class="check-one check" />
                                                                </td>
                                                                <td>
									<a class="entry-thumbnail" href="${goods.gpic}" data-toggle="lightbox">
										<img src="${goods.gpic}" alt="" />
									</a>
									<a class="entry-title" href="#">${goods.gname}</a>
								</td>
								<td><span class="unit-price">￥${goods.gprice}</span></td>
								<td>
									<div class="qty-btn-group">
										<button type="button" class="down"><i class="iconfont-caret-down inline-middle"></i></button>
										<input type="text" value="${goods.gnum}" />
										<button type="button" class="up"><i class="iconfont-caret-up inline-middle"></i></button>
									</div>
								</td>
								<td class="hidden-xs"><strong class="text-bold row-total">￥${goods.gprice*goods.gnum}</strong></td>
                                                                <td class="hidden-xs"><button type="button" class="close" aria-hidden="true">×</button></td>
                                                            </tr>
                                                        </c:forEach>
                                                        
                                                      </c:if>
                                                        
						</tbody>
					</table>
					<div class="shopcart-total pull-right clearfix">
                                                            <div class="cart-total text-bold m-b-lg clearfix">
                                                            <span class="pull-left">总价:</span>
                                                            <span class="pull-right" id="totalprice">￥0</span>
                                                            </div>
                                                            <div class="text-right">
                                                                <a class="btn btn-round btn-default uppercase" id="checkmoney">结算</a>
                                                            </div>
                                        </div>
                                        
					
				</div>
			</section>
			
		</main>
		<!-- // SITE MAIN CONTENT -->
		
		<!-- SITE FOOTER -->
            <footer class="page-footer">
		
		
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

<!-- Essential Javascripts -->
<script src="js/minified.js"></script>
<!-- // Essential Javascripts -->

	<!-- Particular Page Javascripts -->
	<script src="js/products.js"></script>
	<script src="js/owl.carousel.js"></script>
	<!-- // Particular Page Javascripts -->
</form>
    </body>
</html>
