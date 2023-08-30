public class tstWrap
{
	static Leitura l = new Leitura();
	static TstInt cInt = new TstInt();
	static TstBool cBool = new TstBool();
	static TstChar cChar = new TstChar();
	static TstDoub cDoub = new TstDoub();
	static TstByte cByte = new TstByte();
	static TstShort cShort = new TstShort();
	static TstFloat cFloat = new TstFloat();
	static TstLong cLong = new TstLong();

	public static void main(String[] args)
	{
		int decision = 1;

		do
		{
			menu();
			decision = Integer.parseInt(l.entDados("\nChoose an option:"));
			selection(decision);
		}
		while(decision != 0);
	}

	// Menu
	public static void menu()
	{
		System.out.println("1) Integer");
		System.out.println("2) Boolean");
		System.out.println("3) Character");
		System.out.println("4) Double");
		System.out.println("5) Byte");
		System.out.println("6) Short");
		System.out.println("7) Float");
		System.out.println("8) Long");
		System.out.println("0) EXIT");
	}	

	// Selection processing
	public static void selection(int decision)
	{
		switch (decision)
		{
			case 0:
				System.out.println("\nExiting...");
				System.out.println("See you soon!");
				break;

			case 1:
				System.out.println("\nConversion of INT <-> STRING");
				cInt.convertStr_int(l.entDados("String:"), Integer.parseInt(l.entDados("Int:")));
				break;

			case 2:
				System.out.println("\nConversion of Boolean <-> String");
				cBool.convertBool_str(Boolean.parseBoolean(l.entDados("Boolean:")), l.entDados("String:"));
				break;

			case 3:
				System.out.println("\nConversion of LowerCase <-> UpperCase");
				System.out.println("Type only one char, if you type a string, only the first char will be used!");
				cChar.convertChar_upOrLow(l.entDados("Char:").charAt(0));
				break;

			case 4:
				System.out.println("\nHexadecimal representation of a Double");
				cDoub.convertDoub_hexLongB(Double.parseDouble(l.entDados("Double:")));
				break;

			case 5:
				System.out.println("\nString equivalent in Byte");
				cByte.convertByte_int(l.entDados("String:"));
				break;

			case 6:
				System.out.println("\nShort number reversed bytes");
				cShort.convertShort_revBytes(l.entDados("Short number:"));
				break;

			case 7:
				System.out.println("\nFloat number to Double number");
				cFloat.convertFloat_doub(Float.parseFloat(l.entDados("Float:")), Double.parseDouble(l.entDados("Double:")));
				break;

			case 8:
				System.out.println("\nString number -> Long -> Binary conversion");
				cLong.convertLong_bin(l.entDados("String number:"));
				break;

			default:
				System.out.println("\nWrong Option!\n");
		}
	}
}

