// i) Classe Boolean: métodos parseBoolean() e valueOf()
// ii) O método a seguir irá converter o valor de um Boolean para o tipo String
// e também um tipo String para um Boolean.
// iii) Referência: Slides disponibilizados pelo professor.
public class TstBool
{
	public void convertBool_str(boolean val_Bool, String val_Str)
	{
		boolean x = Boolean.parseBoolean(val_Str);
		String frase = String.valueOf(val_Bool);

		System.out.println("\nSuccessful conversion!\n");

		System.out.println("The Boolean " + val_Bool + " has been converted to the String \"" + frase + "\"");
		System.out.println("The String \"" + val_Str + "\" has been converted to the Boolean " + x + "\n");
	}
}

