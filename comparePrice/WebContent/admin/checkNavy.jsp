<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Check Navy</title>
    <link rel="stylesheet" href="<s:url value="/css/bootstrap-theme.min.css" />" />
    <link rel="stylesheet" href="<s:url value="/css/bootstrap.min.css" />" />
    <link rel="stylesheet" href="<s:url value="/css/forbidCommodity.css" />" />
    <link rel="stylesheet" href="<s:url value="/css/admin.css" />" />

    <script src=<s:url value="/js/bootstrap.min.js" /> type="text/javascript"></script>
    <script src=<s:url value="/js/jquery-2.1.0.js" /> type="text/javascript"></script>
</head>
<body>
    <div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
        <div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            	<span class="icon-bar"></span>
            	<span class="icon-bar"></span>
            	<span class="icon-bar"></span>
          	</button>
			<a class="navbar-brand" class="active" >iBiJia</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
          	<li><a href='<s:url action="ManageSensitiveCommentAction"/>'>敏感评论</a></li>
          	<li><a href='<s:url action="SensitiveWordAction"/>'>敏感词</a></li>
          	<li class="active"><a href='<s:url action="CheckNavyAction"/>'>水军</a></li>
            <li><a href='<s:url action="BeforeForbidAction"/>'>商品屏蔽</a></li>
            <li><a href='<s:url action="BrandWeightAction"/>'>商家权重</a></li>
            <li><a href='<s:url action="candidateWordAction"/>'>商家候选词</a></li>
            <li><a href='<s:url action="specialWordCommentAction"/>'>候选词评论</a></li>
            <li><a href='<s:url action="CrawlerWebsiteAction"/>'>爬虫网站</a></li>
          </ul>
          	<div class="navbar-form navbar-right nav navbar-nav" >
          		<a class="btn btn-success"><s:property value="session.adminId" /></a>
				<a href='<s:url action="adminLogout"/>' class="btn btn-success">logout</a>
			</div> 
        </div>
      </div>
    </div>
    
    
    <div class="container">
        <div class="navy">
            <table class="table">
                <caption>水军列表</caption>
                <tr>
                    <th>ID</th>
                    <th>用户ID</th>
                    <th>用户名</th>
                </tr>
                
                <s:iterator value="navyList"  status="st">
                <tr>
                    <td class="td_sensitiveWordId"><s:property value="id" /></td>
                    <td class="td_sensitiveWordId"><s:property value="uid" /></td>
                    <td><s:property value="user.name" /></td>
                </tr>
                </s:iterator>
            </table>
        
        </div>
    
    
    </div>


</body>
</html>