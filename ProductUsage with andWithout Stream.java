// ProductUsageWithoutStream.java

import java.util.List;
import java.util.ArrayList;
public class ProductUsageWithoutStream {
private static List<Product> productList = new ArrayList<>();
public static void main(String[] args) {
// adding products
productList.add(new Product(1, "HP Laptop", 45000.45));
productList.add(new Product(2, "DELL Laptop", 47000.45));
productList.add(new Product(3, "ACER Laptop", 35000.45));
productList.add(new Product(4, "APPLE Laptop", 85000.45));
productList.add(new Product(5, "LENEVO Laptop", 49000.45));
filtering(); }
private static void filtering() {
List<Double> productPriceList = new ArrayList<>();
// filtering
for (Product product : productList) {
if (product.getPrice() <= 49000.45)
// add it in the new collection
productPriceList.add(product.getPrice()); }
// displaying all
for (Double price : productPriceList) {
System.out.println("the filtered prices are " + price);}}}

//Stream

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ProductUsageWithStream {
static List<Product> productList=new ArrayList<Product>();
public static void main(String args[]){
// adding products
productList.add(new Product(1, "HP Laptop", 45000.45));
productList.add(new Product(2, "DELL Laptop", 47000.45));
productList.add(new Product(3, "ACER Laptop", 35000.45));
productList.add(new Product(4, "APPLE Laptop", 85000.45));
productList.forEach(System.out::println);
filtering();}
private static void filtering() {
List<Double> s =productList.stream().filter((product) -> product.getPrice() <= 49000.45)
.map((product) -> product.getPrice()).collect(Collectors.toList());
// display
//productPriceList.forEach((price) -> System.out.println(price)); }}