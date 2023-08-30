// Discente: Victor Gabriel Lucio
// i) Classe Long: métodos valueOf() e toBinaryString()
// ii) O método parseLong() converte a String v_Str para um valor do tipo Long e o armazena na variável y.
// toBinaryString retorna uma String com a represetanção binária do valor long y
// iii) Referência: https://www.geeksforgeeks.org/java-lang-long-class-in-java/?ref=lbp

public class TstLong
{
  public void convertLong_bin(String v_Str)
  {
    long y = Long.parseLong(v_Str);
    String bin = Long.toBinaryString(y);

    System.out.println("\nSuccessfull conversion!\n");
    System.out.println("The String number \"" + v_Str + "\" is " + y + " in long");
    System.out.println("The Long number " + y + " is " + bin + " in binary\n");
  }
}


