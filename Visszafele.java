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
    
    System.out.println(userInput);  
    

  }
}