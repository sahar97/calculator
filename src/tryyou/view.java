package tryyou;
import java.awt.event.ActionListener;

import javax.swing.*;

public class view extends JFrame {

	JTextField firstn=new JTextField  ("First Number",30);
	JTextField  secondn=new JTextField("Second Number",30);
	JTextField  result=new JTextField ("Answer",30);
    JButton addition=new JButton("ADD");
    JButton subtract=new JButton("SUB");
    JButton division=new JButton("DIV");
    JButton multiply=new JButton("MUL");
    JButton modop=new JButton("MOD");
    JButton sqrroot=new JButton("SQRT");
	
	view(){
		
		JPanel calcpanel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this .setSize(400,200);
		calcpanel.add(firstn);
		calcpanel.add(secondn);
		calcpanel.add(result);
		calcpanel.add(addition);
		calcpanel.add(subtract);
		calcpanel.add(division);
		calcpanel.add(multiply);
		calcpanel.add(modop);
		calcpanel.add(sqrroot);
        this .add(calcpanel);
		
	}//end of constructor
	
	public int getfistnum(){
		
		return  Integer.parseInt(firstn.getText());
		
	}
	
	
public int getsecondnum(){
		
		return  Integer.parseInt(secondn.getText());
		
	}
	
public int getcalcultionval(){
	
	return  Integer.parseInt(result.getText());
	
}
	
	
	
public void setcalcultionval(double d){
	
result.setText(Double.toString(d));	
}
	
	

void addcalculationlistener(ActionListener listenforbutton){
	addition.addActionListener(listenforbutton);
	subtract.addActionListener(listenforbutton);
	division.addActionListener(listenforbutton);
	multiply.addActionListener(listenforbutton);
	modop.addActionListener(listenforbutton);
	sqrroot.addActionListener(listenforbutton);

}
	
	void displayErrorMessage(String errormessage){
		JOptionPane.showMessageDialog(this, errormessage);
	}
	
	
	
	
	
}//end of view
