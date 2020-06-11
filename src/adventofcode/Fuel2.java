package adventofcode;

import java.util.Scanner;
import java.io.*;
 
public class Fuel2 {
   
    public static void main (String[] args) throws IOException{
       
        int sum = 0;
       
        File input = new File("C:\\Users\\Rohith\\Desktop\\modules.txt");
        Scanner modules = new Scanner(input);
       
        FileWriter output = new FileWriter("C:\\Users\\Rohith\\Desktop\\answer.txt");
       
        while(modules.hasNext()){
            int mass = modules.nextInt();
            double fuel = (Math.floor((mass/3)))-2;
            double fuelTotal = fuel;
            while(fuel>0) {
                fuel = (Math.floor((fuel/3)))-2;
                if(fuel>0) {
                    fuelTotal += fuel;
                }
            }
            sum += fuelTotal;
        }
       
        System.out.println("The total fuel required is " + sum);
        output.write(sum);
   
    }
   
}