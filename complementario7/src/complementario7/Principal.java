package complementario7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia=0;
		int mes;
		String horoscopo="Belleteyn";
		//Hola hehe
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido a la aplicación que le dirá a que horóscopo pertenece");
		
		do
		{
			do
			{
				System.out.println("Introduzca primero el mes en el que nació, o introduzca un 13 para salir");
				mes=sc.nextInt();
			}
			while (mes<1 || mes>13);
			
			if (mes!=13)
			{
				do
				{
					System.out.println("Introduzca ahora el día en el que nació");
					dia=sc.nextInt();
				}
				while (((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia<1 || dia>31)) || ((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 || dia>30)) || (mes==2 && (dia<1 || dia>28)));
			}	
				
			switch (mes)
			{
				case 1:
					if (dia<=19)
					{
						horoscopo="Capricornio";
					}
					else
					{
						horoscopo="Acuario";
					}
					break;
			
				case 2:
					if (dia<=18)
					{
						horoscopo="Acuario";
					}
					else
					{
						horoscopo="Piscis";
					}
					break;
				
				case 3:
					if (dia<=20)
					{
						horoscopo="Piscis";
					}
					else
					{
						horoscopo="Aries";
					}
					break;
				
				case 4:
					if (dia<=19)
					{
						horoscopo="Aries";
					}
					else
					{
						horoscopo="Tauro";
					}
					break;
				
				case 5:
					if (dia<=20)
					{
						horoscopo="Tauro";
					}
					else
					{
						horoscopo="Géminis";
					}
					break;
				
				case 6:
					if (dia<=20)
					{
						horoscopo="Géminis";
					}
					else
					{
						horoscopo="Cáncer";
					}
					break;
				
				case 7:
					if (dia<=22)
					{
						horoscopo="Cáncer";
					}
					else
					{
						horoscopo="Leo";
					}
					break;
			
				case 8:
					if (dia<=22)
					{
						horoscopo="Leo";
					}
					else
					{
						horoscopo="Virgo";
					}
					break;
			
				case 9:
					if (dia<=22)
					{
						horoscopo="Virgo";
					}
					else
					{
						horoscopo="Libra";
					}
					break;
				
				case 10:
					if (dia<=22)
					{
						horoscopo="Libra";
					}
					else
					{
						horoscopo="Escorpio";
					}
					break;
				
				case 11:
					if (dia<=21)
					{
						horoscopo="Escorpio";
					}
					else
					{
						horoscopo="Sagitario";
					}
					break;
				
				case 12:
					if (dia<=21)
					{
						horoscopo="Sagitario";
					}
					else
					{
						horoscopo="Capricornio";
					}
					break;
				case 13:
				{
					System.out.println("Ha elegido salir");
				}
			}
			if (mes!=13)
			{
				System.out.println("Su horóscopo es: "+horoscopo);
			}
		}
		while (mes!=13);
		
		System.out.println("Gracias por usar la aplicación");
	}

}
