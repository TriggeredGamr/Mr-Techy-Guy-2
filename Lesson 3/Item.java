public class Item {
	String Object;
	double price;
	int ID;
	public Item(String o, double p, int d){
	Object = o;
	price = p;
	ID = d;
	}
	
	public String getObject(){
		return Object;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setObject(String o){
		Object = o;
	}
	
	public void setPrice(double p){
		price = p;
	}
	
	public void setID(int d){
		ID = d;
	}
	public String toString(){
	return "(" + ID + ")" + Object + "................" + " " + price;
	}
}

		