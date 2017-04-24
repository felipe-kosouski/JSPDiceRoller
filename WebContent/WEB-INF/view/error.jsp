<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Error!!">
	<jsp:body>
		<h2>Ooops!! Algum erro aconteceu!</h2>
		<p>Pedimos desculpas! Você será redirecionado a página inicial</p>
		<p>
			<strong>Mensagem de Erro: </strong>
			${errorBean.message} 
		</p>		  
	</jsp:body>
</t:template>