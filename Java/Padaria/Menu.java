public class Menu
{
  public void showMenuController()
  {
    System.out.println("\n\n\n- User selection -\n");
    System.out.println("[1] - Customers");
    System.out.println("[2] - Employees");
    System.out.println("[0] - Exit");
  }

  // Customer Menus
  public void showMenuCustomer()
  {
    System.out.println("\n\n\n- Customer Options -\n");
    System.out.println("[1] - Add Customer");
    System.out.println("[2] - Modify Customer");
    System.out.println("[3] - List Customers");
    System.out.println("[4] - Make a order");
    System.out.println("[0] - Back");
  }  

  // Employee Menus
  public void showMenuBakers()
  {
    System.out.println("\n\n\n- Employee Options -\n");
    System.out.println("[1] - New Baker");
    System.out.println("[2] - Modify Baker");
    System.out.println("[3] - List Bakers");
    System.out.println("[4] - Work");
    System.out.println("[0] - Back");
  }
}
