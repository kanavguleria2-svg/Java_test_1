package basic_java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class TestProduct {

	public static void main(String[] args) throws Exception {
		
		 ProductLoader pp = new ProductLoader();
		 pp.loadProduct();
	 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id of the Product : ");
		 String pro_Id = sc.nextLine();
		 if(pp.searchProduct(pro_Id)!=null)
		 {
			 System.out.println(pp.searchProduct(pro_Id));
		 }
		 
		 else
		 {

			 String productId = pro_Id;
			 System.out.println("enter the product name ");
			 String product_name = sc.nextLine();
			 
			 System.out.println("enter the price of product ");
			 String price=sc.nextLine();
			 
			 System.out.println("enter the quantity ");
			 String quantity =sc.nextLine();
			 
			 String str = productId+","+product_name+","+price+","+quantity;
			 
//			 Product new_p = new Product(productId,product_name,Double.parseDouble(price),Integer.parseInt(quantity));
			 String filename = "src/basic_java/product.txt";
			 BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
			 
			 out.write(str);
			 out.close();
			 
			 
			 
		 }
		 
		 
		 
		
	}

}
