package br.edu.utfpr.model;

import java.util.Random;

public class DiceBean {
	private static final int D2 = 2;
	private static final int D4 = 4;
	private static final int D6 = 6;
	private static final int D8 = 8;
	private static final int D10 = 10;
	private static final int D12 = 12;
	private static final int D20 = 20;
	
	private int numberOfFaces;
	private int modifier = 0;
	private int diceResult;
	private int finalResult;
	
	public DiceBean(int numberOfFaces, int modifier) {
		super();
		this.numberOfFaces = numberOfFaces;
		this.modifier = modifier;
	}

	public int getNumberOfFaces() {
		return numberOfFaces;
	}

	public void setNumberOfFaces(int numberOfFaces) {
		this.numberOfFaces = numberOfFaces;
	}

	public int getModifier() {
		return modifier;
	}

	public void setModifier(int modifier) {
		this.modifier = modifier;
	}

	public int getDiceResult() {
		return diceResult;
	}

	public void setDiceResult(int diceResult) {
		this.diceResult = diceResult;
	}

	public int getFinalResult() {
		return finalResult;
	}

	public void setFinalResult(int finalResult) {
		this.finalResult = finalResult;
	}
	
	public int rollD2(int modifier){
		Random random = new Random();
		finalResult = (random.nextInt(D2)+1) + modifier;
		return finalResult;
	}
	
	public String rollD4(int modifier){
		Random random = new Random();
		finalResult = (random.nextInt(D4)+1) + modifier;
		return "lalalal" + finalResult;
	}
	
	public int rollD6(int modifier){
		Random random = new Random();
		finalResult = (random.nextInt(D6)+1) + modifier;
		return finalResult;
	}
	
	public int rollD8(int modifier){
		Random random = new Random();
		finalResult = (random.nextInt(D8)+1) + modifier;
		return finalResult;
	}
	
	public int rollD10(int modifier){
		Random random = new Random();
		finalResult = (random.nextInt(D10)+1) + modifier;
		return finalResult;
	}
	
	public int rollD12(int modifier){
		Random random = new Random();
		finalResult = (random.nextInt(D12)+1) + modifier;
		return finalResult;
	}
	
	public int rollD20(int modifier){
		Random random = new Random();
		finalResult = (random.nextInt(D20)+1) + modifier;
		return finalResult;
	}
	
	public String showResult(){
		if (numberOfFaces == 1) {
			return ("(1d" + D4 + ")" + "+" + modifier + " => " + finalResult);
		}else if (numberOfFaces == 2) {
			return ("(1d" + D6 + ")" + "+" + modifier + " => " + finalResult);
		}else if (numberOfFaces == 3) {
			return ("(1d" + D8 + ")" + "+" + modifier + " => " + finalResult);
		}else if (numberOfFaces == 4) {
			return ("(1d" + D10 + ")" + "+" + modifier + " => " + finalResult);
		}else if (numberOfFaces == 5) {
			return ("(1d" + D12 + ")" + "+" + modifier + " => " + finalResult);
		}else if (numberOfFaces == 6) {
			return ("(1d" + D20 + ")" + "+" + modifier + " => " + finalResult);
		}
		return "Valor incorreto";
	}
}
