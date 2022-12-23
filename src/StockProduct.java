import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] product = new Product[4];
		DecimalFormat frm = new DecimalFormat("#,###.00");
		for(int i=0;i<product.length;i++) {
			product[i] = new Product();
			System.out.print("Input product id    : ");
			product[i].setid(scan.next());
			System.out.print("Input product Unit  : ");
			product[i].setUnit(scan.nextInt());
			while(!(product[i].getUnit()>0)) {
				System.out.print("Input product Unit,agian : ");
				product[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			product[i].setPrice(scan.nextDouble());
			while(!(product[i].getPrice()>0)) {
				System.out.print("Input product Price,agian : ");
				product[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		double sum=0;
		for(Product _product:product) {
			System.out.println("Product ID : "+_product.getId()+", Total price = "+frm.format(_product.calculate())+" baht.");
			sum += _product.calculate();
		}
		System.out.println("------------------------------------");
		System.out.println("Total price of all products is "+ frm.format(sum) +" baht.");
	}
}
