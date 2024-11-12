package org.system;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        SignIn frm = new SignIn();
        JFrame frame = new JFrame();
        frm.setDefaultCloseOperation(SignIn.EXIT_ON_CLOSE);
        //frm.setSize(350, 500);
        frm.setVisible(true);

	}

}
