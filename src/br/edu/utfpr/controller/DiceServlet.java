package br.edu.utfpr.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.utfpr.model.DiceBean;

/**
 * Servlet implementation class DiceServlet
 */
@WebServlet("/roll-dice")
public class DiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processResult(request, response);
	}
	
	private void processResult(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String modifier = request.getParameter("modifier");
		String dice = request.getParameter("dice");

		if (modifier == "") {
			modifier = "0";
		}
		
//		System.out.println(dice);
		
		int intMod;
		int intDice;
		try {
			intMod = Integer.parseInt(modifier);
			intDice = Integer.parseInt(dice);
			
			DiceBean diceBean = new DiceBean(intDice, intMod);
			request.setAttribute("bean", diceBean);
			
			switch (intDice) {
			case 1:
				diceBean.rollD4(intMod);
				break;
			case 2:
				diceBean.rollD6(intMod);
				break;
			case 3:
				diceBean.rollD8(intMod);
				break;
			case 4:
				diceBean.rollD10(intMod);
				break;
			case 5:
				diceBean.rollD12(intMod);
				break;
			case 6:
				diceBean.rollD20(intMod);
				break;
			default:
				System.out.println("Erro");
				break;
			}
			
			request.getRequestDispatcher("/WEB-INF/view/roll.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
