public class Padaria
{
  static Controller c = new Controller();
  static Menu menu = new Menu();
  static Input input = new Input();
  static int selection = 0;

  public static void main(String[] args)
  {
    do
    {
      menu.showMenuController();
      selection = input.inputInt("\nSelection: ");
      c.selectionProcess(selection);
    }
    while(selection != 0);
  }
}
