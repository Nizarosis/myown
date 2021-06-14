

public class App {
    public static void main(String[] args) 
    
    {
        weinachten(20);
    }

    public static void weinachten(int a) {
    //System.out.println(arr[0]);


String s="*";
String stamm="#";
//System.out.println(s);
for (int i = 1; i < a ; i++) {
    String ls="";
       for (int j = 1; j <= a-i ; j ++) {
        
        ls= ls+ " " ;
        
       }
       System.out.println(ls + s);
       s=s+"**";
       stamm= " " + stamm;
       
}
System.out.println(stamm);



  
    }
}
// package tannenbaum;

// import java.util.Scanner;

// /**
//  *
//  * @author Sven Schreier
//  */

// /*
//  * Didaktische Aenderungen und Kommentare durch Daniel
//  * $var für den Wert in var -- nur zur Klarheit in den Kommentaren in PHP-Stil geschrieben
//  */
// public class Tannenbaum {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int zielhoehe;
//         System.out.print("Hoehe eingeben!");                //Ausgabe des Textes -- ohne Zeilenumbruch
//         zielhoehe = scn.nextInt();                          //Werte aus dem Scanner in a zuweisen

//         for (int i = 0; i <= zielhoehe; i++) {              //mache (zielhoehe + 1)-mal ...

//             for (int j = 0; j <= (((2 * zielhoehe - 1) - i) - (zielhoehe - 1)); j++) {  //mache für jede Hoehestufe -- immer oefter je tiefer
//                 System.out.print(" ");                                                  //freie Stellen anfügen
//             }
//             for (int k = 0; k <= (2 * i); k++) {
//                 System.out.print("*");                      //Sternchen anfügen
//             }

//             System.out.println("");                         //setze Zeilenumbruch

//         }
//         int dickeStamm;
//         dickeStamm = (2 * zielhoehe) / 3;                   //Zieldicke des Stamms

//         for (int zeileImStamm = 0; zeileImStamm <= dickeStamm / 2; zeileImStamm++) {

//             for (int einzugStamm = 0; einzugStamm <= dickeStamm + 1; einzugStamm++) {
//                 System.out.print(" ");
//             }
//             for (int dickeInZeileImStamm = 0; dickeInZeileImStamm <= dickeStamm; dickeInZeileImStamm++) {
//                 System.out.print("*");
//             }
//             System.out.println("");                         //je Stammzeile ein Umbruch
//         }
//     }
// }
