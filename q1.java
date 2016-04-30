import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class DialogBox{
	private JTextField textField = new JTextField(20);
	public DialogBox(){
	}
	public int inputScreenSize(){
		String inputNumber = JOptionPane.showInputDialog(null, "Input the screen size of your tv(in inches):"");
		int check = JOptionPane.showConfirmDialog(null,"the inpuy is " + inputNumber +", is it correct?");
		if (check == JOptionPane.YES_OPTION){return Interger.toInterger(inputNumber));}
		else return 0;
	}
	public void checkScreenSize(){
		int size = 0;
		while (size == 0){
			size = inputScreenSize();
			if (size>=0){
				break;
			}else{
				JOptionPane.showMessageDialog(null, "The screen size should be greater than zero");
			}
		}
	}
	public static void main(String[] args){
		DialogBox a = new Dialogbox();
		a.checkScreenSize();
	}
}