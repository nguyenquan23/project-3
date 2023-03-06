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
	<style type="text/css">
	
	</style>
	
</head>
<body>
<a href='<c:url value="/admin-new?action=addInspect"/>'>
<svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor" class="bi bi-person-add" viewBox="0 0 16 16">
  <path d="M12.5 16a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7Zm.5-5v1h1a.5.5 0 0 1 0 1h-1v1a.5.5 0 0 1-1 0v-1h-1a.5.5 0 0 1 0-1h1v-1a.5.5 0 0 1 1 0Zm-2-6a3 3 0 1 1-6 0 3 3 0 0 1 6 0ZM8 7a2 2 0 1 0 0-4 2 2 0 0 0 0 4Z"></path>
  <path d="M8.256 14a4.474 4.474 0 0 1-.229-1.004H3c.001-.246.154-.986.832-1.664C4.484 10.68 5.711 10 8 10c.26 0 .507.009.74.025.226-.341.496-.65.804-.918C9.077 9.038 8.564 9 8 9c-5 0-6 3-6 4s1 1 1 1h5.256Z"></path>
</svg>
</a>
	<div>
		<table class="table align-middle mb-0 bg-white">
			<thead class="bg-light">
				<tr>
					<th>Name</th>
					<th>Phone</th>
					<th>Address</th>
					<th>Position</th>
					<th class="text-center">Edit</th>
					<th class="text-center">ChangePassAndAccount<th>
				 	<th class="text-center">Delete</th>
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
					

					<td class="text-center"><a
						href="/laptrinhdoan/admin-views?inspectId=<%=list.getId()%>&action=edit " />✍</a>
					</td>
					<td  class="text-center" colspan="2"><a
						href="/laptrinhdoan/views/admin/viewPassAndAccount.jsp?inspectId=<%=list.getId()%>" />✎</a>
					</td>

					 <td class="text-center"><a
						href="/laptrinhdoan/admin-views?inspectId=<%=list.getId()%>&action=delete " />&#10062;</a>
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