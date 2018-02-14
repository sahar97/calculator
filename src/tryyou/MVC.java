package tryyou;

public class MVC {

	public static void main(String[] args) {
view theview =new view ();
model themodel=new model();
controller thecontroller=new controller(theview ,themodel);
theview.setVisible(true);
	}

}
