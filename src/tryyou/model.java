package tryyou;

public class model {

private double calculationvalue;
public void addtwonum( int firstnum, int  secondnum){
	calculationvalue=firstnum+secondnum;
	
}

public void subtwonum( int firstnum, int  secondnum){
	calculationvalue=firstnum-secondnum;
	
}

public void mul( int firstnum, int  secondnum){
	calculationvalue=firstnum*secondnum;
	
}


public void divtwonum( int firstnum, int  secondnum){
	calculationvalue=firstnum/secondnum;
	
}


public void modtwonum( int firstnum, int  secondnum){
   int x= firstnum/secondnum;
   int  y= x*secondnum;
    calculationvalue= (int) (firstnum-y);
	
}

public void sqrnum( double firstnum){
	calculationvalue= Math.sqrt(firstnum);
	  
		
	}


public double getcalculationvalue(){

return calculationvalue;



}
}