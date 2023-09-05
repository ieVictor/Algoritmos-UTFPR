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

  // List all ---------------------------------------------
  public void listBakers()
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
    }
  }
}
