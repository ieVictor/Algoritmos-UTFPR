public class Bakers
{
  Input input = new Input();
  // Work work = new Work();
  int bakerCounter = 0;

  private int[] bakerId = new int[5];
  private double[] bakerSalary = new double[5];
  private String[] bakerName = new String[5];

  // Methods ----------------------------------------------
  public void newBaker()
  {
    if(bakerCounter == 5)
    {
      System.out.println("Bakers limit reached!");
      return;
    }

    bakerId[bakerCounter] = bakerCounter + 1;
    bakerName[bakerCounter] = input.inputString("Baker name: ");
    bakerSalary[bakerCounter] = input.inputDouble("Baker salary: ");
    bakerCounter++;
  }

  public void modifyBaker(int id)
  {
    bakerName[id - 1] = input.inputString("Baker name: ");
    bakerSalary[id - 1] = input.inputDouble("Baker salary: ");
  }

  // Getters ----------------------------------------------
  public String getBakerName(int id)
  {
    return bakerName[id - 1]; 
  }
  
  public double getBakerSalary(int id)
  {
    return bakerSalary[id - 1];
  }

  public int[] getBakersIds()
  {
    return bakerId;
  }

  // List all ---------------------------------------------
  public void listBakers(Product product)
  {
    if(bakerCounter == 0)
    {
      System.out.println("\nThere are no registered bakers!");
    }

    for(int i = 0; i < bakerCounter; i++)
    {
      System.out.println("\nID: " + (i + 1));
      System.out.println("Baker name: " + bakerName[i]);
      System.out.println("Baker salary: " + bakerSalary[i]);
      salaryInfo(product, i);
    }
  }

  private void salaryInfo(Product products, int id)
  {
    for(int i = 0; i < products.productCounter; i++)
    {
      //if(products.getProductBakerId(i) == id)
      //{
        bakerSalary[id] += (products.getProductPrice(i) * 0.05) * (double)products.getProductAmount(i); 
        System.out.println("Salary with products maked: " + bakerSalary[id]);
      //}
    }
  }
}
