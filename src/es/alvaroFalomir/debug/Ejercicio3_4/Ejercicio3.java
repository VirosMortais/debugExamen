package es.alvaroFalomir.debug.Ejercicio3_4;

public class Ejercicio3
{
   public static void main(String[] args)
   {
      test("aardvark"); // resultado esperado: a
      test("roommate"); // resultado esperado: o (no m)
      test("mate"); // resultado esperado: 0 (No hay caracteres repetidos.)
      test("test");  /* resultado esperado: 0 (No hay caracteres repetidos... 
                        * la letra t se repite pero no de manera adyacente)
                        */
   }

   public static void test(String s)
   {
      AnalizadorPalabras analizador = new AnalizadorPalabras(s);
      char result = analizador.primerCaracterRepetido();
      
      if (result == 0)
         System.out.println("No hay caracteres repetidos." + result);
      else
         System.out.println("Primer caracter repetido = " + result);
   }
}