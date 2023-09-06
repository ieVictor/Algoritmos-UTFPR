public class Product
{
  Input input = new Input();
  private int[] productId = new int[5];
  private String[] productName = new String[5];
  private int[] productBakerId = new int[5];
  private int[] productAmount = new int[5];
  private double[] productPrice = new double[5];
  private int[] bakerId;
  int baker;
  int productCounter = 0;

  // Constructor
  public Product(Bakers bakers)
  {
    bakerId = bakers.getBakersIds();
    baker = 0;
  }
  
  // Methods
  public void newProduct()
  {
    if(productCounter == 5) return;

    baker = input.inputInt("Baker id:") - 1;
    productBakerId[productCounter] = bakerId[baker];

    productName[productCounter] = input.inputString("Product name: ");
    productPrice[productCounter] = input.inputDouble("Product price: ");
    productAmount[productCounter] = input.inputInt("Product amount: ");
    productCounter++;
  }

  public void modifyProduct(int id)
  {
    if(id > productCounter || id - 1 < 0) 
    {
      System.out.println("\nProduct not found!");
      return;
    }

    productBakerId[id] = bakerId[input.inputInt("Baker id: ")];
    productName[id] = input.inputString("Product name: ");
    productPrice[id] = input.inputDouble("Product price: ");
  }

  public void listProducts()
  {
    if(productCounter == 0)
    {
      System.out.println("There are no products registered yet!");
      return;
    }

    for(int i = 0; i < productCounter; i++)
    {
      System.out.println("\nProduct ID: " + (productId[i] + 1));
      System.out.println("Baker ID: " + productBakerId[i]);
      System.out.println("Product name: " + productName[i]);   
      System.out.println("Product Price: " + productPrice[i]);
      System.out.println("Product amount: " + productAmount[i]);
    }
  }

  // Getters
  public int getProductBakerId(int id)
  {
    return productBakerId[id];
  }

  public double getProductPrice(int id)
  {
    return productPrice[id];
  }

  public int getProductAmount(int id)
  {
    return productAmount[id];
  }
}
