import java.util.Scanner;

public class VolumeCalculation {
    public static void main(String[] args) {
        int volume;
        Scanner scanner = new Scanner(System.in);
        Body cube = new Body();
    
        System.out.println("Enter the height");
        cube.height = scanner.nextInt();
        System.out.println("The height is " + cube.height);
    
        System.out.println("Enter the length");
        cube.length = scanner.nextInt();
        System.out.println("The height is " + cube.length);
    
        System.out.println("Enter the width");
        cube.width = scanner.nextInt();
        System.out.println("The height is " + cube.width);
       
        // volume = cube.height*cube.length*cube.width;
    
        volume = cube.volumen(cube.height,cube.length,cube.width);
    
        System.out.println("The volume is "+volume);
    
    }
    

}


