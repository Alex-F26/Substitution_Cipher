import java.util.Scanner;
import java.util.*;

public class EncDec{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        boolean option = false;

        System.out.println("E: Encrypt" + '\n' + "D: Decrypt");
        char choice = Character.toLowerCase(scnr.nextLine().charAt(0));
        System.out.println();


        while(!option){
            if(choice != 'e' && choice != 'd'){
                System.out.print("Invalid input, please retry" + '\n');
                choice = scnr.nextLine().charAt(0);
            }
            else{
                option = true;
            }
        }

        System.out.println("Password");

        String password = scnr.nextLine();
        
        if(password != null){

            String lowPassword = password.toLowerCase();
            System.out.println();
            int length = password.length();

            String[] encryptedArray = new String[length];

            //Encryption
                if(choice == 'e'){
                    option = true;
                    for(int i = 0; i <= length-1; i++){
                        switch(lowPassword.charAt(i)){
                            case 'a':
                                encryptedArray[i] = "1";
                                break;
                            case 'b':
                                encryptedArray[i] = "2";
                                break;
                            case 'c':
                                encryptedArray[i] = "3";
                                break;
                            case 'd':
                                encryptedArray[i] = "4";
                                break;
                            case 'e':
                                encryptedArray[i] = "5";
                                break;
                            case 'f':
                                encryptedArray[i] = "6";
                                break;
                            case 'g':
                                encryptedArray[i] = "7";
                                break;
                            case 'h':
                                encryptedArray[i] = "8";
                                break;
                            case 'i':
                                encryptedArray[i] = "9";
                                break;
                            case 'j':
                                encryptedArray[i] = "~";
                                break;
                            case 'k':
                                encryptedArray[i] = "!";
                                break;
                            case 'l':
                                encryptedArray[i] = "@";
                                break;
                            case 'm':
                                encryptedArray[i] = "#";
                                break;
                            case 'n':
                                encryptedArray[i] = "$";
                                break;
                            case 'o':
                                encryptedArray[i] = "%";
                                break;
                            case 'p':
                                encryptedArray[i] = "^";
                                break;
                            case 'q':
                                encryptedArray[i] = "&";
                                break;
                            case 'r':
                                encryptedArray[i] = "*";
                                break;
                            case 's':
                                encryptedArray[i] = "(";
                                break;
                            case 't':
                                encryptedArray[i] = ")";
                                break;
                            case 'u':
                                encryptedArray[i] = "_";
                                break;
                            case 'v':
                                encryptedArray[i] = "+";
                                break;
                            case 'w':
                                encryptedArray[i] = "[";
                                break;
                            case 'x':
                                encryptedArray[i] = "]";
                                break;
                            case 'y':
                                encryptedArray[i] = ";";
                                break;
                            case 'z':
                                encryptedArray[i] = "`";
                                break;
                            case '1':
                                encryptedArray[i] = ",";
                                break;
                            case '2':
                                encryptedArray[i] = ".";
                                break;
                            case '3':
                                encryptedArray[i] = "<";
                                break;
                            case '4':
                                encryptedArray[i] = ">";
                                break;
                            case '5':
                                encryptedArray[i] = "?";
                                break;
                            case '6':
                                encryptedArray[i] = "\\";
                                break;
                            case '7':
                                encryptedArray[i] = "|";
                                break;
                            case '8':
                                encryptedArray[i] = "{";
                                break;
                            case '9':
                                encryptedArray[i] = "}";
                                break;
                            case '0':
                                encryptedArray[i] = "=";
                                break;

                            case '!':
                                encryptedArray[i] = "a";
                                break;
                            case '?':
                                encryptedArray[i] = "B";
                                break;
                            case '.':
                                encryptedArray[i] = "c";
                                break;
                            case '-':
                                encryptedArray[i] = "D";
                                break;
                            case '_':
                                encryptedArray[i] = "e";
                                break;
                            case ']':
                                encryptedArray[i] = "F";
                                break;
                            case '#':
                                encryptedArray[i] = "g";
                                break;
                            case '/':
                                encryptedArray[i] = "H";
                                break;
                            case '[':
                                encryptedArray[i] = "i";
                                break;
                            case '^':
                                encryptedArray[i] = "J";
                                break;
                            case ' ':
                                encryptedArray[i] = "k";
                                break;
                                

                        }
                    } 
                }
                //Decryption
                else if(choice == 'd'){
                    option = true;
                    for(int i = 0; i <= length-1; i++){
                        switch(password.charAt(i)){
                            case '1':
                                encryptedArray[i] = "a";
                                break;
                            case '2':
                                encryptedArray[i] = "b";
                                break;
                            case '3':
                                encryptedArray[i] = "c";
                                break;
                            case '4':
                                encryptedArray[i] = "d";
                                break;
                            case '5':
                                encryptedArray[i] = "e";
                                break;
                            case '6':
                                encryptedArray[i] = "f";
                                break;
                            case '7':
                                encryptedArray[i] = "g";
                                break;
                            case '8':
                                encryptedArray[i] = "h";
                                break;
                            case '9':
                                encryptedArray[i] = "i";
                                break;
                            case '~':
                                encryptedArray[i] = "j";
                                break;
                            case '!':
                                encryptedArray[i] = "k";
                                break;
                            case '@':
                                encryptedArray[i] = "l";
                                break;
                            case '#':
                                encryptedArray[i] = "m";
                                break;
                            case '$':
                                encryptedArray[i] = "n";
                                break;
                            case '%':
                                encryptedArray[i] = "o";
                                break;
                            case '^':
                                encryptedArray[i] = "p";
                                break;
                            case '&':
                                encryptedArray[i] = "q";
                                break;
                            case '*':
                                encryptedArray[i] = "r";
                                break;
                            case '(':
                                encryptedArray[i] = "s";
                                break;
                            case ')':
                                encryptedArray[i] = "t";
                                break;
                            case '_':
                                encryptedArray[i] = "u";
                                break;
                            case '+':
                                encryptedArray[i] = "v";
                                break;
                            case '[':
                                encryptedArray[i] = "w";
                                break;
                            case ']':
                                encryptedArray[i] = "x";
                                break;
                            case ';':
                                encryptedArray[i] = "y";
                                break;
                            case '`':
                                encryptedArray[i] = "z";
                                break;
                            case ',':
                                encryptedArray[i] = "1";
                                break;
                            case '.':
                                encryptedArray[i] = "2";
                                break;
                            case '<':
                                encryptedArray[i] = "3";
                                break;
                            case '>':
                                encryptedArray[i] = "4";
                                break;
                            case '?':
                                encryptedArray[i] = "5";
                                break;
                            case '\\':
                                encryptedArray[i] = "6";
                                break;
                            case '|':
                                encryptedArray[i] = "7";
                                break;
                            case '{':
                                encryptedArray[i] = "8";
                                break;
                            case '}':
                                encryptedArray[i] = "9";
                                break;
                            case '=':
                                encryptedArray[i] = "0";
                                break;

                            case 'a':
                                encryptedArray[i] = "!";
                                break;
                            case 'B':
                                encryptedArray[i] = "?";
                                break;
                            case 'c':
                                encryptedArray[i] = ".";
                                break;
                            case 'D':
                                encryptedArray[i] = "-";
                                break;
                            case 'e':
                                encryptedArray[i] = "_";
                                break;
                            case 'F':
                                encryptedArray[i] = "]";
                                break;
                            case 'g':
                                encryptedArray[i] = "#";
                                break;
                            case 'H':
                                encryptedArray[i] = "/";
                                break;
                            case 'i':
                                encryptedArray[i] = "[";
                                break;
                            case 'J':
                                encryptedArray[i] = "^";
                                break;
                            case 'k':
                                encryptedArray[i] = " ";
                                break;
                                

                            }
                        }
                }

            scnr.close();
            if(choice == 'e'){
                    System.out.println("Here is your encrypted password:");}
                
            else if(choice == 'd'){
                System.out.println("Here is your decrypted password:");}
            
            for(int i = 0; i <= encryptedArray.length-1; i++){

                if(encryptedArray[i] == ""){
                    System.out.println();
                    System.out.println();
                }

                System.out.print(encryptedArray[i]);
            }
            System.out.println('\n');
        }    
        else{
            System.out.println("Type in your password");
            password = scnr.nextLine();
        }
    }
}