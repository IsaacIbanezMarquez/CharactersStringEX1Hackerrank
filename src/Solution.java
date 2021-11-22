
import java.io.*;
import java.util.*;

// ENUNCIADO:

// Compta vocals:

/* Donada una cadena de caràcters entrada per teclat, calcula quants d'ells són vocals. S'ha de considerar que tant el caràcter a com el caràcter A són vocals.

Input Format

Cadena de caràcters.

Constraints

No n'hi ha.

Output Format

Nombre de vocals

Sample Input 0

Estudio DAM a l'INS Poblenou.
Sample Output 0

11
 */



public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);



        String letras = sc.nextLine();

        int contador = 0;

        letras = letras.toLowerCase();

        for (int i = 0; i < letras.length(); i++ )
        {
            if (letras.charAt(i) == 'a'||letras.charAt(i) == 'e'||letras.charAt(i) == 'i'||letras.charAt(i) == 'o'||letras.charAt(i)=='u')
            {
                contador++;
            }
        }
        System.out.println(contador);
    }

}
