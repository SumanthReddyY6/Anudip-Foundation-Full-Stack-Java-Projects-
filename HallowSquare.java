import java.util.Scanner;
public class HallowSquare {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input size of the square
	        System.out.print("Enter the size of the square: ");
	        int size = scanner.nextInt();
	        
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                // Print '*' for the borders and ' ' for the inner part
	                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    
	}

}
