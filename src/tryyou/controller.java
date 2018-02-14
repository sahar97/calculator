package tryyou;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
	
	private view theview ;
	private model themodel ;
	
	public controller(view theview,model themodel){
		this .theview=theview;
		this.themodel=themodel;
		this .theview.addcalculationlistener(new calculatelistener());
		
	}
	class calculatelistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==theview.addition){
				int firstnumber,secondnumber=0;
				try{
					firstnumber=theview.getfistnum();
					secondnumber=theview.getsecondnum();
					themodel.addtwonum(firstnumber,secondnumber);
					theview.setcalcultionval(themodel.getcalculationvalue());

				}//try
				catch(NumberFormatException ex ){
					theview.displayErrorMessage("you need to enter two numbers");
					
				}//catch
			}//if   
			else if (e.getSource()==theview.subtract ){
				int firstnumber,secondnumber=0;
				try{
					firstnumber=theview.getfistnum();
					secondnumber=theview.getsecondnum();
					themodel.subtwonum(firstnumber,secondnumber);
					theview.setcalcultionval(themodel.getcalculationvalue());

				}//try
				catch(NumberFormatException ex ){
					theview.displayErrorMessage("you need to enter two numbers");
					
				}//catch
				
			}
			
			else if (e.getSource()==theview.multiply ){
				int firstnumber,secondnumber=0;
				try{
					firstnumber=theview.getfistnum();
					secondnumber=theview.getsecondnum();
					themodel.mul(firstnumber,secondnumber);
					theview.setcalcultionval(themodel.getcalculationvalue());

				}//try
				catch(NumberFormatException ex ){
					theview.displayErrorMessage("you need to enter two numbers");
					
				}//catch
			
		}
			
			else if (e.getSource()==theview.division ){
				int firstnumber,secondnumber=0;
				try{
					firstnumber=theview.getfistnum();
					secondnumber=theview.getsecondnum();
					themodel.divtwonum(firstnumber,secondnumber);
					theview.setcalcultionval(themodel.getcalculationvalue());

				}//try
				catch(NumberFormatException ex ){
					theview.displayErrorMessage("you need to enter two numbers");
					
				}//catch
			}
			else if (e.getSource()==theview.modop ){
				int firstnumber,secondnumber=0;
				try{
					firstnumber=theview.getfistnum();
					secondnumber=theview.getsecondnum();
					themodel.modtwonum(firstnumber,secondnumber);
					theview.setcalcultionval(themodel.getcalculationvalue());

				}//try
				catch(NumberFormatException ex ){
					theview.displayErrorMessage("you need to enter two numbers");
					
				}//catch
	}
			else if (e.getSource()==theview.sqrroot ){
				int firstnumber;
				try{
					firstnumber=theview.getfistnum();
					
					themodel.sqrnum(firstnumber);
					theview.setcalcultionval(themodel.getcalculationvalue());

				}//try
				catch(NumberFormatException ex ){
					theview.displayErrorMessage("you need to enter two numbers");
					
				}//catch
			}
			

	}
		}
}
