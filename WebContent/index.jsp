<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:template title="Dice Roller">
  <jsp:body>

    <div class="container">
	<h2 class="text-center">JSP Dice Roller</h2>
	<p class="text-center"><img class="logo" src="resources/img/logo.png"></img></p>
      <form class="form-signin" action="login" method="POST">
        <h2 class="form-signin-heading">Login</h2>
        <label for="username" class="sr-only">Usuário</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="Usuário" required autofocus>
        <label for="password" class="sr-only">Senha</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Senha" required>
       
        <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
      </form>

    </div> <!-- /container -->

  </jsp:body>
</t:template>
</html>
