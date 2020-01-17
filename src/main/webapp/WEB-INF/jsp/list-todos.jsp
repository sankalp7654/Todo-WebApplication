
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>


<div class="container"> 
<h1>Your todos</h1>
<table class="table table-striped">
	<caption>Your todos are</caption>
	<thead>
		<th>Description</th>
		<th>Target Date</th>
		<th>Is it done?</th>
		<th>Update</th>
		<th>Delete</th>
		
	</thead>
	<tbody>
		<c:forEach items="${list}" var="todo">
			<tr>
				<td>${todo.desc}</td>
				<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
				<td>${todo.done }</td>
				<td><a type="button" href="/update-todo?id=${todo.id}"class="btn btn-success">Update </a></td>
				<td><a type="button" href="/delete-todo?id=${todo.id}"class="btn btn-warning">Delete </a></td>			
			</tr>
		</c:forEach>
	</tbody>
	
</table>


<div class="button"> <a href="/add-todo">Add a Todo</a> </div>
</div>	    		

<%@ include file="common/footer.jspf" %>




		