// Discente: Victor Gabriel Lucio
// i) Classe Integer: métodos parseInt() e ToString()
// ii) O método a seguir irá converter o valor de uma String para o tipo primitivo int
// e também um tipo int para uma String.
// iii) Referência: https://www.geeksforgeeks.org/java-lang-integer-class-java/?ref=lbp

public class TstInt
{
	public void convertStr_int(String val_Str, int val_int)
	{
		int x = Integer.parseInt(val_Str);
		String frase = Integer.toString(val_int);

		System.out.println("\nSuccessful conversion!\n");
		System.out.println("The String \"" + val_Str + "\" has been converted to the integer " + x);
		System.out.println("The Integer " + val_int + " has been converted to the String \"" + frase + "\"\n");
	}
}
