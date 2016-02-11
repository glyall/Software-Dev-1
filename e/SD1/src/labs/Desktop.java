package labs;

public class Desktop extends Computer {
	private String monitorBrand= "";
	private String towerType = "" ;
	private double cPUSpeed = 0.0 ;
	private String towerBrand = "";

Desktop(){	
}


 Desktop (String m, String T, Double c ,String t){
	 
	 this.monitorBrand = m; 
	 this.towerType = T;
	 this.cPUSpeed = c; 
	 this.towerBrand = t;
	 }
 public String getmonitorBrand(){
	 return monitorBrand;
 }
 public String gettowerType(){
	 return towerType;
 }
 
 public double getcPUSpeed(){
	 return cPUSpeed;
 }
 
 public String gettowerBrand(){
	 return towerBrand;
 }
 
}
