// Discente: Victor Gabriel Lucio
// i) Classe Short: métodos valueOf() e reverseBytes
// ii) O método valueOf retorna um valor short da String val_Str caso a mesma tenha um valor Short.
// reverseBytes retorna um valor short primitivo que intervete a ordem dos bits do valor dado.
// iii) Referência: https://www.geeksforgeeks.org/java-lang-short-class-java/?ref=lbp
public class TstShort
{
  public void convertShort_revBytes(String val_Str)
  {
    Short x = Short.valueOf(val_Str);

    System.out.println("\nSuccesfull conversion!\n");
    System.out.println("The string value \"" + val_Str + "\" is " + x + " in Short");
    System.out.println("The short" + x + " has the value " + Short.reverseBytes(x) + " if its bytes are reversed\n");
  }
}
