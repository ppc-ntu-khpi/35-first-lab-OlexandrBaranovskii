public class Shirt {
  public int shirtID = 4;
  public String description = "Adidas Originals";

  public char colorCode = 'U';
  public double price = 5.25;
  public int quantityInStock = 0;
  
  
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}