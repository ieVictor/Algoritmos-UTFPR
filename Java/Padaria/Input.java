import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input
{
  // String
	public String inputString(String rotulo)
  {
		System.out.print(rotulo);
		String resp = "";

    InputStreamReader teclado = new InputStreamReader(System.in);

    BufferedReader buff = new BufferedReader(teclado);

	  try
    {
		  resp = buff.readLine();
  	}

	  catch(IOException ioe)
    {
		  System.out.println("ERRO");
	  }

	  return resp;
	}

  // Inteiro
  public int inputInt(String rotulo)
  {
    // Impressão da frase de pergunta
		System.out.print(rotulo);
		int resp = 0;

    // Leitura do que é escrito
    InputStreamReader teclado = new InputStreamReader(System.in);

    // Definição dos limites
    BufferedReader buff = new BufferedReader(teclado);

	  try
    {
		  resp = Integer.parseInt(buff.readLine());
  	}

	  catch(IOException ioe)
    {
		  System.out.println("ERRO");
	  }

	  return resp;
	}

  // Double
  public double inputDouble(String rotulo)
  {
    // Impressão da frase de pergunta
    System.out.print(rotulo);
    double resp = 0.0;

    // Leitura do que é escrito
    InputStreamReader teclado = new InputStreamReader(System.in);

    // Definição dos limites
    BufferedReader buff = new BufferedReader(teclado);

    try
    {
      resp = Double.parseDouble(buff.readLine());
    }

    catch(IOException ioe)
    {
      System.out.println("ERRO");
    }

    return resp;
  }
 }
