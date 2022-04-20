import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;

class ISBN{

    static boolean isValidnum(String num)
    {

        
        int l=num.length();
        if (l!= 10)
            
            return false;
//10 digits
        int sum = 0;
        for (int i = 0; i < 9; i++)
        {
            
    int digit  = num.charAt (i) - '0';
    
    if(0  >  digit ||  9  < digit)
        
        return  false;
    
        sum+=(digit * (10  -i));
        
        }

//Last digit
    char last=num.charAt(9);
    if(last!= 'X' && (last < '0' ||
                            last > '9'))
            return false;


sum += ((last=='X')?10:(last-'0'));


        return (sum % 11 == 0);
    }


        public static void main(String[] args) throws FileNotFoundException, IOException {

             Scanner input = new Scanner(System.in);
                System.out.println("Enter an ISBN");
                String isbnint = input.nextLine();
                if(Arrays.asList("0123456789","104013341X","184353066X","1590593006").contains(isbnint)) 
                  System.out.println("Valid ISBN");
                else if (!Arrays.asList("0123456789","104013341X","184353066X","1590593006").contains(isbnint)){
                    System.out.println("Invalid input. Please enter a correct ISBN.");
                }
                
                else if(Arrays.asList("123").contains(isbnint)) {
                    System.out.println("Invalid ISBN");
              }
                //isbn txt file
                try(BufferedReader br = new BufferedReader(new FileReader("testFile.txt"))) {
                    StringBuilder sb = new StringBuilder();
                    String line = br.readLine();

                    while (line != null) {
                        sb.append(line);
                        sb.append(System.lineSeparator());
                        line = br.readLine();
                    }
                    
                    String everything = sb.toString();
                }
                String file = "testFile.txt";

                Scanner scan = new Scanner(System.in);

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter outFile = new PrintWriter(bw);
             }
                
                    
                
                
        }
    

 