// Discente: Victor Gabriel Lucio
// i) Classe Double: métodos toHexString() e doubleToLongBits()
// ii) toHexString transforma o valor double em um string hexadecimal
// doubleToLongBits transforma o valor double em um LongBit
// iii) Referência: https://www.geeksforgeeks.org/java-lang-double-class-java/?ref=lbp

public class TstDoub
{
	public void convertDoub_hexLongB(Double v_Doub)
	{
		String hex = Double.toHexString(v_Doub);
		long longB = Double.doubleToLongBits(v_Doub);

		System.out.println("\nSuccesfull conversion!\n");
		System.out.println("The double " + v_Doub + " is " + hex + " in Hexadecimal String");
		System.out.println("And " + longB + " in LongBits\n");
	}
}
