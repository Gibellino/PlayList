<%@page import="model.Musica"%>
<%@page import="java.util.ArrayList"%>
<div class="container-fluid">
	<ul class="nav nav-pills">
		<li role="presentation" class="active"><a
			href="Handler?pag=musicas">Musicas</a></li>
		<li role="presentation"><a href="Handler?pag=musica&f=add">Adicionar</a></li>
	</ul>
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Musicas</h1>
		</div>
	</div>
	<%
		if (request.getParameter("f") != null) {
			if (request.getParameter("f").equals("add")) {
	%>
	<jsp:include page="/addMusic.jsp" />
	<%
		} else if (request.getParameter("f").equals("play")) {
	%>
	<jsp:include page="/play.jsp" />
	<%
		}
		} else {
	%>

	<div class="row">
		<div class="col-md-12">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>#</th>
						<th>Música</th>
						<th>Ano</th>
					</tr>
				</thead>
				<tbody>
					<%
						ArrayList musicas = (ArrayList) request.getAttribute("musicas");
					
							for (int i = 0; i < musicas.size(); i++) {

								Musica musica = (Musica) musicas.get(i);

								out.append("<tr onclick='play(" + i + ")'>");
								out.append("<td>" + musica.getMusica_id() + "</td>");
								out.append("<td>" + musica.getMusica_nome() + "</td>");
								out.append("<td>" + musica.getMusica_ano() + "</td>");
								out.append("</tr>");
							}
					%>
				</tbody>
			</table>
		</div>
	</div>

	<%
		}
	%>

</div>


<script>
	function play(field) {
		window.location = "Handler?pag=musica&f=play&m=" + field;
	}
</script>