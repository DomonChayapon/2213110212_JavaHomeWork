import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int stock = scan.nextInt();
		Product[] product = new Product[stock];
		System.out.println();
		for(int i =0;i<product.length;i++) {
			product[i] = new Product();
			System.out.print("Input product id    : ");
			product[i].setid(scan.next());
			System.out.print("Input product Unit  : ");
			product[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("------------------------------------");
		for(Product _productLow : product) {
			if(_productLow.getUnit() <5) {
			System.out.println(">> "+_productLow.getId()+" has "+_productLow.getUnit()+" units");
			}
		}
		System.out.println("------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("------------------------------------");
		for(Product _productMedium : product) {
			if(_productMedium.getUnit() >=5&&_productMedium.getUnit()<=50) {
			System.out.println(">> "+_productMedium.getId()+" has "+_productMedium.getUnit()+" units");
			}
		}
		System.out.println("------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("------------------------------------");
		for(Product _productHigh : product) {
			if(_productHigh.getUnit() >50) {
			System.out.println(">> "+_productHigh.getId()+" has "+_productHigh.getUnit()+" units");
			}
		}
	}

}
