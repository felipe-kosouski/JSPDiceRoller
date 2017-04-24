<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Dice Roller">
	<jsp:body>
		<h1 class="text-center">Escolha seu dado e aperte em rolar</h1>
		
		<div class="row">
			<div class="form-group">
        		<div class="col-xs-3 center">
        			<p class="text-center"><img class="dice-img fix" id="dice" src="resources/img/d20.png"></p>
        			<form class="form-group" method="POST" action="roll-dice">
            			<select class="form-control" id="dice-select" name="dice" onchange="changeImg()">
                			<option value="">Selecione um dado</option>
                			<option value="1">D4</option>
                			<option value="2">D6</option>
                			<option value="3">D8</option>
                			<option value="4">D10</option>
                			<option value="5">D12</option>
                			<option value="6">D20</option>
            			</select><br>
	          			<p class="text-center"><label for="modifier">Modificador</label></p>
          				<p class="text-center"><input type="text" class="form-control" name="modifier" id="modifier"></p> 
	        			<p class="text-center"><button type="submit" class="btn btn-primary">Rolar</a></p>
          			</form>
        		</div>
    		</div>
      	</div>
      	
      	<div class="row">
			<div class="col-xs-6 center">
				<h2>Resultados</h2>
				<p>${bean.showResult()}</p>
				<br>
			<%--	
				<h2>Resultados Anteriores</h2>
				<c:if test="${empty beans}">
        			<div class="row">
                		<h5>Não há resultados!</h5>
            		</div>
        		</c:if>
        	
        	 	<c:if test="${not empty beans}">
        			<div class="row">
        				<c:forEach var="bean" items="${beans}" varStatus="status">       
        					<p>${bean.showResult()}</p>
	                </div>                               
             		</c:forEach>        
        		</c:if> --%>
			</div>      	
      	</div>
	</jsp:body>
</t:template>