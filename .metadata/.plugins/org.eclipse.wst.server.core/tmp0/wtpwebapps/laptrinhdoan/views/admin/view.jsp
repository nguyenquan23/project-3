<%@page import="persistence.Inspect"%>
<%@page import="persistence.Position"%>
<%@page import="java.util.List"%>
<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
</head>
<body>
	<div>
		<table class="table align-middle mb-0 bg-white">
			<thead class="bg-light">
				<tr>
					<th>Name</th>
					<th>Phone</th>
					<th>Address</th>
					<th>Position</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Inspect> lists = (List<Inspect>) request.getAttribute("listInspect");
				for (Inspect list : lists) {
				%>

				<tr>
					<td>
						<div class="d-flex align-items-center">

							<div class="ms-3">
								<p class="fw-bold mb-1"><%=list.getName()%></p>

							</div>
						</div>
					</td>
					<td>
						<p class="fw-normal mb-1"><%=list.getPhone()%></p>

					</td>
					<td><span class="badge badge-warning rounded-pill d-inline"><%=list.getAddress()%></span>
					</td>
					<td><%=list.getPosition().getTitleName()%></td>
					</td>

					<td><a
						href="/laptrinhdoan/admin-views?inspectId=<%=list.getId()%>&action=delete " />DELETE</a>
					</td>


					<td><a
						href="/laptrinhdoan/admin-views?inspectId=<%=list.getId()%>&action=edit " />edit</a>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>