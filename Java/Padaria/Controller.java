public class Controller
{
  Input input = new Input();
  Customer customer = new Customer();
  Bakers bakers = new Bakers();
  Menu menu = new Menu();
  int userSelection = 0;
  Product products = new Product(bakers);

  public void selectionProcess(int selection)
  {
    do
    {
      switch (selection)
      {
        case 0:
          System.out.println("\nGoodbye!\n");
          break;

        case 1:
          menu.showMenuCustomer();
          userSelection = input.inputInt("\nSelection: ");
          if (userSelection == 0) break;
          customerProcess(userSelection);
          break;

        case 2:
          menu.showMenuBakers();
          userSelection = input.inputInt("\nSelection: ");
          if (userSelection == 0) break;
          employeeProcess(userSelection);
          break;

        default:
          System.out.println("\nSelection not found!");
          break;
      }
    }while(selection != 0 && userSelection != 0);
  }

  public void customerProcess(int selection)
  {
    switch (selection)
    {
      case 0:
        break;

      case 1:
        customer.newCustomer();
        break;

      case 2:
        customer.modifyCustomer(input.inputInt("\nCustomer id: "));
        break;

      case 3:
        customer.listCustomers();
        break;

      case 4:
        // Order
        break;

      default:
        System.out.println("\nSelection not found!");
        break;
    }
  }

  public void employeeProcess(int selection)
  {
    switch (selection)
    {
      case 1:
        bakers.newBaker();
        break;

      case 2:
        bakers.modifyBaker(input.inputInt("\nBaker id: "));
        break;

      case 3:
        bakers.listBakers(products);
        break;

      case 4:
        products.newProduct();
        break;

      default:
        System.out.println("\nSelection not found!");
        break;
    }
  }

  // Reflexivity ------------------------------------------
  public Bakers getBakers()
  {
    return bakers;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  //public Product getProducts()
  //{
   // return bakers.getProducts();
  //}
}
