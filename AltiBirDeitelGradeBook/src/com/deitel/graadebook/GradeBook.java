package com.deitel.graadebook;

public class GradeBook {
	
	public static void selamla() {
		System.out.println("Bastır diyar");
	}

	
	public void displayMessage(String p_isim)
	{
		System.out.println("Welcome to the GradeBook "  + p_isim);
		System.out.printf("Welcome to the GradeBook %s", p_isim); //Ustteki ile ayni isi yapiyor.Sekil farkli
		
	}

}