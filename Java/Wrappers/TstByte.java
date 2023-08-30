public class TstByte
{
	public void convertByte_int(String v_Str)
	{
		try
		{
			byte x = Byte.valueOf(v_Str);

			System.out.println("\nSuccesfull conversion!");
			System.out.println("The String \"" + v_Str + "\" can be a byte!\n");
		}

		catch (NumberFormatException e)
		{
			System.out.println("\nOh no!");
			System.out.println("The String \"" + v_Str + "\" cannot be converted to byte!\n");
		}
	}
}
