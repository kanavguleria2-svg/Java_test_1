package basic_java;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;




class ProductLoader{
    private static List<Product> lt = new ArrayList<>();
    
    public static void loadProduct() throws Exception {
        
        BufferedReader bf = new BufferedReader(new FileReader(new File("src/basic_java/product.txt")));
        
        String line;
        while((line=bf.readLine())!=null)
        {
            String arr[] = line.split(",");



           Product pp = new Product(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]));
            
//            System.out.println(pp);



           lt.add(pp);
        }
        
//        System.out.println(lt);
    
    }
    
    public static List<Product> getProductList(){
        
        return lt;
        
    }
    
    public static Product searchProduct(String productID)
    {
        List <Product> temp_lt = getProductList();
//        System.out.println(temp_lt);
        
        for(Product p : temp_lt)
        {
            if(p.productID.equals(productID) )
            {
//                System.out.println(p);
                return p;
            }
        }
        return null;
        
    }
}





public class Product {



   String productID ;
    String productName;
    double price;
    int quantity;
    


   public Product(String productID, String productName, double price, int quantity) {
        super();
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


   public String getProductID() {
        return productID;
    }





   public String getProductName() {
        return productName;
    }




    public double getPrice() {
        return price;
    }





   public int getQuantity() {
        return quantity;
    }



   @Override
    public String toString() {
        return "Product \nproductID : " + productID + ",\nproductName : " + productName + ",\nprice : " + price + ", \nquantity : "
                + quantity;
    }



    
}
