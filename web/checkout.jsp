<%-- 
    Document   : checkout
    Created on : 2017-1-6, 21:21:35
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                $("#commitorder").click(function(){
                    if($("input").attr("id")!="inputRemark"&&$.trim($("input").val())==""){
                        alert("打*号的信息不能为空！");
                    }else{
                        checkform.action="CreateOrderServlet";
                        checkform.submit();
                    }
                    
                });
                $("#continueshop").click(function(){
                    checkform.action="CategoryServlet";
                    checkform.submit();
                });
                $("#homehr").click(function(){
                    checkform.action="CategoryServlet";
                    checkform.submit();
                });
            });
        </script>
    </head>
    <body>
        <form id="checkform" method="POST">
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
						<li><a id="homehr">首页</a></li>
                                                <li><a href="#">购物车</a></li>
						<li class="active">下单</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- // BREADCRUMB -->
        <!-- SITE MAIN CONTENT -->
		<main id="main-content" role="main">
                    
			<div class="container">
                            
				<div class="row">
                                    <!--<div class="m-t-b clearfix">-->
                                            <section class="col-xs-12 col-sm-8 col-md-9">
                                                <div>
                                                    <h4>您购买的商品总价为：￥${total},请确认订单信息，并完善资料</h4>
                                                </div>
                                                <div class="panel-group checkout" id="checkout-collapse">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#checkout-collapse" href="#checkout-collapse1">
												<span class="step">01</span>
												订单详情
											</a>
										</h4>
									</div>
                                                                        <div id="checkout-collapse1" class="panel-collapse collapse in">
										<div class="panel-body">
											<div class="row">
                                                                                            <!--订单中商品信息-->
												<table class="tbl-cart" id="cartTable">
                                                                                                        <thead>
                                                                                                            <tr>
                                                                                                                <th>商品名称</th>
                                                                                                                <th style="width: 15%;">单价</th>
                                                                                                                <th style="width: 15%;">数量</th>
                                                                                                                <th class="hidden-xs" style="width: 15%;">总价</th>
                                                                                                                <th class="hidden-xs" style="width: 10%;"></th>
                                                                                                            </tr>
                                                                                                        </thead>
                                                                                                        <tbody>
                                                                                                            <c:forEach items="${goodsoncart}" var="goods">
                                                                                                            <tr id="${goods.gid}">
                                                                                                                <td>
                                                                                                                    <a class="entry-thumbnail" href="${goods.gpic}" data-toggle="lightbox">
                                                                                                                    <img src="${goods.gpic}" alt="" />
                                                                                                                    </a>
                                                                                                                    <a class="entry-title" href="#">${goods.gname}</a>
                                                                                                                </td>
                                                                                                                <td><span class="unit-price">￥${goods.gprice}</span></td>
                                                                                                                <td>
                                                                                                                   <p>${goods.gnum}</p>
                                                                                                                </td>
                                                                                                                <td class="hidden-xs"><strong class="text-bold row-total">￥${goods.gprice*goods.gnum}</strong></td>
                                                                                                            </tr>
                                                                                                            </c:forEach>
                                                                                                        </tbody>
                                                                                                </table>
												
												
											</div>
										</div>
									</div>
                                                                </div>
                                                                <div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#checkout-collapse" href="#checkout-collapse2">
												<span class="step">02</span>
												收货人信息
											</a>
										</h4>
									</div>
                                                                        <div id="checkout-collapse2" class="panel-collapse collapse in">
										<div class="panel-body">
                                                                                    <div class="form-horizontal" role="form">
                                                                                        <!--收货人信息-->
											<div class="row">
                                                                                            <div class="col-xs-12 col-sm-12 col-md-6">
														<div class="form-group stylish-input">
															<label for="inputFirstname" class="col-sm-4 col-lg-4 control-label required">收货人姓名</label>
															<div class="col-sm-8 col-lg-8">
																<input type="text" class="form-control" id="inputFirstname" name="shouname"/>
															</div>
														</div>
														<div class="form-group stylish-input">
															<label for="inputEmail2" class="col-sm-4 col-lg-4 control-label required">E-Mail</label>
															<div class="col-sm-8 col-lg-8">
																<input type="email" class="form-control" id="inputEmail2" name="email"/>
															</div>
														</div>
														<div class="form-group stylish-input">
															<label for="inputPhone" class="col-sm-4 col-lg-4 control-label required">手机号码</label>
															<div class="col-sm-8 col-lg-8">
																<input type="text" class="form-control" id="inputPhone" name="telephone"/>
															</div>
														</div>
                                                                                            </div>
                                                                                            <div class="col-xs-12 col-sm-12 col-md-6">
														<div class="form-group stylish-input">
															<label for="inputAddress1" class="col-sm-4 col-lg-4 control-label required">收货地址</label>
															<div class="col-sm-8 col-lg-8">
																<input type="text" class="form-control" id="inputAddress1" name="address"/>
															</div>
														</div>
														
														<div class="form-group stylish-input">
															<label for="inputPostcode" class="col-sm-4 col-lg-4 control-label required">邮编</label>
															<div class="col-sm-8 col-lg-8">
																<input type="text" class="form-control" id="inputPostcode" name="postcode"/>
															</div>
														</div>
                                                                                                                <div class="form-group stylish-input">
															<label for="inputRemark" class="col-sm-4 col-lg-4 control-label">备注</label>
															<div class="col-sm-8 col-lg-8">
																<input type="text" class="form-control" id="inputRemark" name="remark"/>
															</div>
														</div>
                                                                                            </div>
                                                                                        </div>
                                                                                    </div>
										</div>
									</div>
                                                                </div>
                                                                <div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#checkout-collapse" href="#checkout-collapse3">
												<span class="step">03</span>
												确认下单
											</a>
										</h4>
									</div>
                                                                        <div id="checkout-collapse3" class="panel-collapse collapse in">
										<div class="panel-body">
											<div class="row">
                                                                                            <div class="col-xs-12 col-sm-6 pull-right center-sm">
													<table class="shop-summary">
														
														<tr class="total">
															<th>总价:</th>
															<td>￥${total}</td>
														</tr>
														<tr>
                                                                                                                    <th><a href="#" class="btn btn-default btn-round uppercase" id="commitorder">提交订单</a></th>
															<td><a id="continueshop" class="btn btn-primary btn-round uppercase">继续购物</a></td>
														</tr>
													</table>
                                                                                            </div>
                                                                                        </div>
                                                                                </div>
                                                                        </div>
                                                                </div>
                                            </section>
                                        <!--</div>-->
                                </div>
                        </div>
                </main>
              <!-- SITE FOOTER -->
            <footer class="page-footer">
		
		
		<div class="footer-sub">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-6">
						<div class="footer-links center-xs clearfix">
							<li><a href="#">合作伙伴</a></li>
							<li><a href="#">网站地图</a></li>
							<li><a href="#">关于</a></li>
							<li><a href="#">联系客服</a></li>
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
	<!-- // Particular Page Javascripts -->
        </form>
    </body>
</html>
