import java.lang.Math;
import java.util.*;
class Vowels{
    public static void main(String[] args){
    Scanner ab = new Scanner(System.in);
    System.out.print("Enter Character: ");
    char A = ab.next().charAt(0);
    switch(A){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        System.out.println("Character " + A + " is vowel");
        break;
        default:
        System.out.println("Character " + A + " is consonant");
        break;
    }  
    ab.close();
    }
    
}