<div class="container">
	<div class="row">
		<div class="col-lg-12">
			<h3 class="page-header">Adicionar Musica</h3>
		</div>
	</div>
	<div class="row">
		<div class="container">
			<div class="col-lg-8">
				<form method="post" action="HandlerMusica" enctype="multipart/form-data">
					<div class="form-group">
						<label>Musica:</label> <input type="text" class="form-control"
							name="add_musica_nome" placeholder="Nome Musica">
					</div>
					<div class="form-group">
						<label>Localização:</label> <input type="file" id="file"
							class="form-control" name="file" accept="audio/*" onchange="setFileInfo(this.files)">
							<input type="hidden" name="duracao" id="getD">
					</div>
					<div class="form-group">
						<label>Ano:</label> <input type="text" class="form-control"
							name="add_musica_ano" pattern="[0-9]{4,4}">
					</div>
					<div class="form-group">
						<input type="hidden" name="path" id="filepath" />
						<input type="hidden" name="logica" id="logica" value="SMusica" />
						<input type="hidden" name="acao" id="acao" value="addMusica" /> 
						<input class="btn btn-success" type="submit" value="Inserir"
							name="inserir" />
					</div>
				</form>
			</div>
		</div>
	</div>

	<script>

		var myVideos = [];
		window.URL = window.URL || window.webkitURL;
		
		function setFileInfo(files) {
			myVideos.push(files[0]);
			var video = document.createElement('video');
			video.preload = 'metadata';
			video.onloadedmetadata = function() {
				window.URL.revokeObjectURL(this.src)
				var duration = video.duration;
				myVideos[myVideos.length - 1].duration = duration;
				updateInfos();
			}
			video.src = URL.createObjectURL(files[0]);
		}

		function updateInfos() {
			for (i = 0; i < myVideos.length; i++) {
				$("#getD").val(myVideos[i].duration/60);
			}
		}

	</script>
</div>