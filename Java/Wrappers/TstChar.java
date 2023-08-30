// i) Classe Character: métodos isLowerCase(), toUpperCase e toLowerCase 
// ii) O método convertChar_upOrLow converte um char para maiúsculo caso ele seja minúsculo
// e para minúsculo caso contrário
// iii) Referência: https://www.geeksforgeeks.org/character-class-java/?ref=lbp

public class TstChar
{
	public void convertChar_upOrLow(char v_Chr)
	{
		System.out.println("Succesfull conversion!");
		if(Character.isLowerCase(v_Chr))
		{
			char x = Character.toUpperCase(v_Chr);
			System.out.println("Char '" + v_Chr + "' converted to UpperCase '" + x + "'\n");
		}
		else
		{
			char x = Character.toLowerCase(v_Chr);
			System.out.println("Char '" + v_Chr + "' converted to LowerCase '" + x + "'\n");
		}
	}
}
