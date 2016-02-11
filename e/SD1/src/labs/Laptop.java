package labs;

public class Laptop extends Computer {
 private double Charger = 0.0;
 private String Company= "";
 private double Size = 0.0;
Laptop(){
}

Laptop (double C, String Company, Double Size){
	this.Charger=C;
	this.Company=Company;
	this.Size=Size;
	}

public double getCharger(){
	return Charger;
}
public String getCompany(){
	return Company;
}
public double getSize(){
	return Size;
}


}
