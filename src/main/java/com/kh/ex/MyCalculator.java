package com.kh.ex;

public class MyCalculator {
	
	// ��� : �ش� Ŭ������ calculator�� �̿��ؼ� �������
	// 		  ��Ʈ�ѷ� ����.
	
	public Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	// ������.
	public MyCalculator() {
		
	}

	public void add() {
		calculator.addition(firstNum , secondNum);
	}

	public void sub() {
		calculator.subtraction(firstNum , secondNum);
	}

	public void mul() {
		calculator.multiplication(firstNum , secondNum);
	}

	public void div() {
		calculator.division(firstNum , secondNum);
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	
	// Getter , Setter 
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}
}