package es.alvaroFalomir.debug.Ejercicio3_4;

public class AnalizadorPalabras
{
    
   private String palabra;
   
   public AnalizadorPalabras(String unaPalabra)
   {
      palabra = unaPalabra;
   }

   /**
    * Gets the first repeated character. A character is <i>repeated</i>
    * if it occurs at least twice in adjacent positions. For example,
    * 'l' is repeated in "hollow", but 'o' is not. 
    * @return the first repeated character, or 0 if none found
    */
   /**
    * Devuelve el primer caracter repetido dentro de la cadena. Un caracter se considera
    * repetido si al menos se repite 2 veces en posiciones adyacente. Por ejemplo,
    * el caracter 'l' se considera repetido en "hollow", pero el caracter 'o' no. 
    * @return devuelve el primer caracter repetido o 0 sino se ha encontrado ninguno
    */
   public char primerCaracterRepetido()
   {
      for (int i = 0; i < palabra.length(); i++)
      {
         char ch = palabra.charAt(i);
         if (ch == palabra.charAt(i + 1))
            return ch;
      }
      return 0;
   }

   /**
    * Counts the groups of repeated characters. For example, "mississippi!!!" has 
    * four such groups: ss, ss, pp and !!!.
    * @return the number of repeated character groups 
    */
   /**
    * Cuenta grupos de caracteres repetidos. Por ejemplo, "mississippi!!!" tiene 
    * cuatro grupos de este tipo: ss, ss, pp y !!!.
    * @return el numero de grupos de caracteres repetidos
    */
   public int cuentaGruposCaracteresRepetidos()
   {
      int c = 0;
      for (int i = 1; i < palabra.length() - 1; i++)
      {
         if (palabra.charAt(i) == palabra.charAt(i + 1)) 
         {
            if (palabra.charAt(i - 1) != palabra.charAt(i)) 
               c++;
         }
      }     
      return c;
   }

}