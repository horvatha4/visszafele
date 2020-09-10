import java.util.Scanner;  // Import the Scanner class

class Visszafele {
  public static void main(String[] args) {
    boolean nem_helyes_a_szo = true;
    Scanner sorolvaso = new Scanner(System.in);  // Create a Scanner object
    String userInput;
    do { 
        System.out.println("Kerlek, irj be egy szot!");

        userInput = sorolvaso.nextLine();  // Read user input
        String[] parts = userInput.split(" "); // parts nevü valtozoba kerülnek a szavak ha a user több szot adott meg szoközzel elvalasztva
        if ( parts.length > 1) {
           System.out.println("Kerlek csak egy szot irj be!");  
        } else {
            if ( userInput.isEmpty() ) {
                System.out.println("Kérlek adj meg egy legalább egy betüböl allo szot!");  
            } else { 
                char[] karakterek = userInput.toCharArray();
                for ( Character k : karakterek) {
                    if ( k.isDigit(k) ) {
                        System.out.println("Kérlek ne szamokat adj meg!");  
                    } else {
                     nem_helyes_a_szo = false;   
                    }
                }
                
            }
        }
    }
    while (nem_helyes_a_szo);
    
    int lenght = userInput.length(); // user input hossza
    char[] szo = new char[length]; // hosszat egy arrayba akarom tarolni

    for (int i=0; i<lenght; i++) // a loop ami az array karaktereit tarolja
    {
        szo[i] = userInput.charAt(i);
            System.out.println(arr[i] + " ");

    }
    // elakadtam, mert nem tudom, hogyan irjam ki forditottan a szot, hogy ha nem tudom, hany karakterböl allo szot ad meg a user
    
    System.out.println(userInput);  
    

  }
}
