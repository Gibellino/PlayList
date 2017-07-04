<%@page import="model.Musica"%>
<%@page import="java.util.ArrayList"%>
<div class="container">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">
				<%
					ArrayList musicas = (ArrayList) request.getAttribute("musicas");

					Musica musica = (Musica) musicas.get(Integer.parseInt(request.getParameter("m")));

				%>
			</h1>
		</div>
	</div>
	<div class="row">
		<audio controls autoplay><source src="<%= musica.getMusica_path() %>" type="audio/mpeg"></audio>
	</div>
</div>

<script>
	<%--$(document).ready(function() {

		<%-- var path = <%= musica.getMusica_path() %>;
		var fileURL = new File(path);
		alert(fileURL);
	});--%>
</script>