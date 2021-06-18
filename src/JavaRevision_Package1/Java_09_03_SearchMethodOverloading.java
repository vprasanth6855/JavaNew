package JavaRevision_Package1;

public class Java_09_03_SearchMethodOverloading {

	public static void main(String[] args) {
		Java_09_03_SearchMethodOverloading mySearch = new Java_09_03_SearchMethodOverloading();
		mySearch.search("macBook");
		int finalPrice = mySearch.search("iPhone", 10000);
		System.out.println(finalPrice);
	}
	
	public void search(String name){
		System.out.println("Search by : "+ name);
	}
	public int search(String name, int price){
		System.out.println("Serach by : "+ name + " and "+ price);
		int totalprice = price-100;
		return totalprice;
	}

}
