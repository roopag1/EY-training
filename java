class Product { 

private String  productName;  
private double price;  
public Product(String productName,  double price) 

{ 
this.productName = productName; 
this.price = price;
 }
}

public class ProductMethods
{

public String getName() 
{ 
return productName; 
} 
public double getPrice()
{
 return price;
}

}
