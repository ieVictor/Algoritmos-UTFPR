// Discente: Victor Gabriel Lucio
// i) Classe Float: métodos doubleValue() e floatValue().
// ii) O método doubleValue() retorna um valor do tipo double da variável v_Float
// floatValue() retorna um valor do tipo float da variável v_Doub
// Referência: https://www.geeksforgeeks.org/java-lang-float-class-in-java/?ref=lbp

public class TstFloat
{
  public void convertFloat_doub(Float v_Float, Double v_Doub)
  {
    double x = v_Float.doubleValue();
    float y = v_Doub.floatValue();

    System.out.println("\nSuccessful conversion!\n");
    System.out.println("The float value " + v_Float + " is " + x + " in double");
    System.out.println("The double value " + v_Doub + " is " + y + " in float\n");
  }
}
