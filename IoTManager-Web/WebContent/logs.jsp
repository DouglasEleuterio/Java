<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="./resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
	<link href="./resources/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript" src="./resources/js/bootstrap.min.js"></script>
<title>Web Home - Logging</title>
</head>
<body>
	
	<div class="col-xs-12 col-md-12">
		<h2>Web Home - Logging</h2>
	</div>
	<div class="col-xs-12 col-md-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3>Logs de Mensagens</h3>
			</div>
			<div class="panel-body">
				<table class="table-striped">
				<thead>
						<tr>
							<th>
								#
							</th>
							<th>
								<fmt:message key="form.fatos.codigo"/>
							</th>
							<th>
								<fmt:message key="form.fatos.data" />
							</th>
							<th>
								<fmt:message key="form.fatos.hora" />
							</th>
							<th>
								<fmt:message key="form.fatos.origem" />
							</th>
							<th>
								<fmt:message key="form.fatos.sensor" />
							</th>
							<th> 
								<fmt:message key="form.fatos.informacao" />
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listarFatosTudo}" var="fatos">
							<tr>
								<td width="15%">
									${fatos.codigo}
								</td>
								<td width="15%">
									${fatos.data}
								</td> 
								<td width="15%">
									${fatos.hora}
								</td>
								<td width="25%">
									${fatos.origem}
								</td>
								<td width="20%">
									${fatos.sensor}
								</td>
								<td width="30%">
									${fatos.informacao}
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>