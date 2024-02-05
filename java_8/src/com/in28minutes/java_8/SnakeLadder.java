package com.in28minutes.java_8;

public class SnakeLadder {

	public static void main(String[] args) {
		int diceOutpot = 5;
		Sllayer p1 = new Sllayer();
//		Sllayer p2 = new Sllayer();
		
		Ladder l1 = new Ladder(99,9);
		Ladder l2 = new Ladder(30,3);
		
		Snake s1 = new Snake(5,25);
		Snake s2 = new Snake(13,95);
		while(p1.getPosition()!=100) {
			p1.setPosition(p1.getPosition()+ diceOutpot);
			if(p1.getPosition()==l1.getStartPoint()) {
				p1.setPosition(l1.getEndPoint());
			}else if(p1.getPosition()==l2.getStartPoint()) {
				p1.setPosition(l2.getEndPoint());
			}else if(p1.getPosition()==s1.getStartPoint()) {
				p1.setPosition(s1.getEndPoint());
			}else if(p1.getPosition()==s2.getStartPoint()) {
				p1.setPosition(s2.getEndPoint());
			}else if(p1.getPosition()>100){
				p1.setPosition(p1.getPosition() - diceOutpot);
			}
		}
		
		if(p1.getPosition()==100) {
			System.out.println("win");
		}

	}

}

class Sllayer {
	private int position;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
}

class Ladder{
	private int startPoint;
	private int endPoint;
	
	public Ladder(int startPoint, int endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public int getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}
	public int getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}
}

class Snake{
	private int startPoint;
	private int endPoint;
	
	public Snake(int startPoint, int endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public int getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}
	public int getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}
}



