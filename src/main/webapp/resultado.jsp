<!DOCTYPE html>
<html class="no-js">
<head>
	<title>Encurtador de URL</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
	<body>
	<!-- Paste this code after body tag -->
	<div class="se-pre-con"></div>
	<!-- Ends -->
	<main>
	  <h1>Encurtador de Link</h1>
	  <input type="text" id="input" placeholder="Insira ou digite sua URL">
	  <div class="botoes">
		<button id="refazUrl">Refazer</button>
		<button id="encurtador">Encurtar</button>
	  </div>
	  <section id="section">
	  Encurtada: <s:property value="App.URL_OR" /> <br />
	Original : <s:property value="App.URL_CUT" /> <br />
	Usuário: <s:property value="App.Id_USR" /> <br />
	</section>
	</main>
	<link rel="stylesheet" href="CSS/boilerplate.min.css" type="text/css">
	<link rel="stylesheet" href="CSS/curta.css" type="text/css">

	<script src="JS/jquery-3.2.1.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(window).on("load", function (e) {
		// Animate loader off screen
			$(".se-pre-con").fadeOut("slow");
		});
	</script>
</body>
</html>
