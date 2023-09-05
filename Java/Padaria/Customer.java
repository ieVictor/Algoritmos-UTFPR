public class Customer
{
  Input input = new Input();
  // Order order = new Order();
  int customerCounter = 0;

  private int[] customerId = new int[5];
  private String[] customerName = new String[5];
  private double[] customerMoney = new double[5];

  // Methods ----------------------------------------------
  public void newCustomer()
  {
    if(customerCounter == 5)
    {
      System.out.println("Customer limit reached");
      return;
    }
    
    customerId[customerCounter] = customerCounter + 1;
    customerName[customerCounter] = input.inputString("Customer name:");
    customerMoney[customerCounter] = input.inputDouble("Customer money amount:");
    customerCounter++;
  }

  public void modifyCustomer(int id)
  {
    if(id - 1 > 5 || id - 1 < 0)
    {
      System.out.println("Id not found!\n");
      return;
    }

    customerName[id - 1] = input.inputString("New Customer name: ");
    customerMoney[id - 1] = input.inputDouble("New Customer money amount: ");
  }

  // Getters ----------------------------------------------
  public String getCustomerName(int id)
  {
    return customerName[id - 1];
  }

  public double getCustomerMoney(int id)
  {
    return customerMoney[id - 1];
  }

  // List all ---------------------------------------------
  public void listCustomers()
  {
    if(customerCounter == 0)
    {
      System.out.println("There are no registered customers!\n");
      return;
    }

    for(int i = 0; i < customerCounter; i++)
    {
      System.out.println("\nID: " + (i + 1));
      System.out.println("Customer name: " + customerName[i]);
      System.out.println("Customer money amount: " + customerMoney[i]);
    }
  }
}
