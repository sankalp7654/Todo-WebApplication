
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>


<div class="container">

	<h1>Add a Todo</h1>
	<hr>

	<form:form method="post" modelAttribute="todo">
			<form:input type="hidden" path="id" />
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label> 
				<form:input path="desc" type="text"
					class="form-control" required="required"/>
				<form:errors path="desc" cssClass="text-warning"/>
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="targetDate">Target Date</form:label> 
				<form:input path="targetDate" type="text"
					class="form-control" required="required"/>
				<form:errors path="targetDate" cssClass="text-warning"/>
			</fieldset>

			<button type="submit" class="btn btn-success">Add</button>
		</form:form>
</div>


<%@ include file="common/footer.jspf" %>
