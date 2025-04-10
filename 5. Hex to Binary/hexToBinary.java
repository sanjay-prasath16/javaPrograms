import java.util.Scanner;

public class hexToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a hex number: ");
        String hex = sc.nextLine();
        char[] hexdec = hex.toCharArray();

        for (int i = 0; i < hexdec.length; i++) {
            switch(hexdec[i]) {
                case '0':
                    System.out.print("0000");
                    break;
                case '1':
                    System.out.print("0001");
                    break;
                case '2':
                    System.out.print("0010");
                    break;
                case '3':
                    System.out.print("0011");
                    break;
                case '4':
                    System.out.print("0100");
                    break;
                case '5':
                    System.out.print("0101");
                    break;
                case '6':
                    System.out.print("0110");
                    break;
                case '7':
                    System.out.print("0111");
                    break;
                case '8':
                    System.out.print("1000");
                    break;
                case '9':
                    System.out.print("1001");
                    break;
                case 'A': case 'a':
                    System.out.print("1010");
                    break;
                case 'B': case 'b':
                    System.out.print("1011");
                    break;
                case 'C': case 'c':
                    System.out.print("1100");
                    break;
                case 'D': case 'd':
                    System.out.print("1101");
                    break;
                case 'E': case 'e':
                    System.out.print("1110");
                    break;
                case 'F': case 'f':
                    System.out.print("1111");
                    break;
                case '.':
                    System.out.print(".");
                    break;
                default:
                    System.out.println("\nInvalid hexadecimal digit " + hexdec[i]);
                    return;
            }
        }
    }
}