package adventofcode;

import java.util.Scanner;
import java.io.*;
 
public class Fuel {
   
    public static void main (String[] args) throws IOException{
       
        int sum = 0;
       
        File input = new File("C:\\Users\\Rohith\\Desktop\\modules.txt");
        Scanner modules = new Scanner(input);
       
        FileWriter output = new FileWriter("C:\\Users\\Rohith\\Desktop\\answer.txt");
       
        while(modules.hasNext()){
            int mass = modules.nextInt();
            double fuel = (mass / 3);
            fuel = (Math.round(fuel))-2;
            sum += fuel;
        }
       
        System.out.println("The total fuel required is " + sum);
        output.write(sum);
   
    }
   
}