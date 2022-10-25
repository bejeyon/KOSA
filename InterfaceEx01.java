/*
HWJava18_06_InterfaceEx01_배재연.java
01. MouseListener 상속 : Interface
*/

package classes;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class InterfaceEx01 implements MouseListener {
	public void mouseClicked(MouseEvent e) {}	// public : 상속 받은 클래스 멤버 메소드의 access modifier 범위가 더 크거나 같아야 함.
	public void mouseEntered(MouseEvent e) {	}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
