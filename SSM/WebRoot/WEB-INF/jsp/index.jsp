<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="statics/css/style.css">
	<script type="text/javascript" src="statics/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="statics/js/cx.js">
		
	</script>
  </head>
  
  <body>
    <table>
    	<tr>
    	<td colspan="6" class="font1">航班查询</td>
    	</tr>
    	<tr>
    	<form action="flight.action" method="post">
    	<td colspan="6">日期：<input type="date" pattern="yyyy-MM-dd" name="flightDate"/>
    	城市：从<input type="text" name="takeoff"/>
    	到<input type="text" name="landing"/>
    	<input type="submit" value="搜索"/></td>
    	</form>
    	</tr>
    	<tr>
    	<td>航空公司/航班机型</td>
    	<td>起飞时间</td>
    	<td>机场</td>
    	<td>飞行时长</td>
    	<td>经停</td>
    	<td>参考报价</td>
    	</tr>
    	<c:if test="${empty flightsList}">
	    	<tr>
	    	<td colspan="6">没有找到任何航班信息</td>
	    	</tr>
    	</c:if>
    	<c:forEach var="flights" items="${flightsList}">
    	<tr>
    	<td>${flights.airline}${flights.flightCode}<br/>${flights.type}</td>
    	<td>${flights.takeoffTime}<br/>${flights.landingTime}</td>
    	<td>${flights.airline}</td>
    	<td>${flights.flightTime}</td>
    	<td>${flights.stopAirport}</td>
    	<td>￥${flights.referencePrice}<br/>
    		<input type="button" onclick="javascript:cx(${flights.id})" value="查询机票"/>
    	</td>
    	</tr>
    	<tbody class="hk" id="hk">
    		</tbody>
    	</c:forEach>
    </table>
  </body>
</html>
