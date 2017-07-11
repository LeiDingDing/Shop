<%-- 
    Document   : ordersuccess
    Created on : 2017-1-8, 10:52:21
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        
        <!--订单提交成功样式-->
        <link rel="stylesheet" type="text/css" href="css/buyConfirm.css" />
        <script>
            $(document).ready(function(){
                $("#gohome").click(function(){
                    successform.action="CategoryServlet";
                    successform.submit();
                });
            });
        </script>
    </head>
    <body>
        <form id="successform">
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
						<li><a id="gohome">首页</a></li>
                                                <li><a href="#">购物车</a></li>
						<li class="active">下单</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- // BREADCRUMB -->
                <div class="order-info">
                <div class="msg">
                    <h3>您的订单已提交成功！付款咯～</h3>
                    <p></p>
                    <p class="post-date">成功付款后，7天发货</p>
                </div>
                <div class="info">
                    <p>
                        金额：<span class="pay-total">${total}元</span>
                    </p>
                    <p>订单：${orderid}</p>
                    <p>配送：${arrive.shouname}<span class="line">/</span>
                             ${arrive.telephone}<span class="line">/</span>
                             ${arrive.address}<span class="line">/</span>
                             ${arrive.remark}                                   
                </div>
                <div class="icon-box">
                    <i class="iconfont"><img src="img/yes_ok.png"></i>
                </div>
            </div>
            <div class="xm-plain-box">
                                                <!-- 选择支付方式 -->
                <div class="box-hd bank-title clearfix">
                    <div id="titleWrap" class="title-wrap">
                        <h2 class="title">选择支付方式</h2>
                        <h2 class="title hide " >你还需要继续支付 <em>49.00</em> 元</h2>
                        <span class="tip-tag"></span>
                    </div>
                </div>
                <div class="box-bd" id="bankList">
                    <div class="payment-bd">
                    
                    <dl class="clearfix payment-box" >
                    <dt>
                        <strong>支付平台</strong>
                        <p>手机等大额支付推荐使用支付宝快捷支付</p>
                    </dt>
                    <dd>
                        <fieldset id="test4-input-input_tab1-input_tab2" style=" border:none;">
                        <ul class="payment-list clearfix" >
                            <li><input class="input_tab1" name="myradio" id="r1" type="radio" checked="checked"/><label for="r1" ><img src="images/xhw.png" alt=""/></label></label></li>
                            <li><input class="input_tab2" name="myradio" id="r2" type="radio" /><label for="r2" ><img src="images/zfb.png" alt=""/></label></li>
                            <li><input class="input_tab2" name="myradio" id="r2" type="radio" /><label for="r2" ><img src="images/yck.png" alt=""/></label></li>
                            <li><input class="input_tab2" name="myradio" id="r2" type="radio" /><label for="r2" ><img src="images/zxzf.png" alt=""/></label></li>
                        </ul>
                        </fieldset>
                    </dd>
                    </dl>
                    </div>
                </div>
            
            </div>
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
