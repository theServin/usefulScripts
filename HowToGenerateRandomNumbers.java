/*
 * The following program generates sets (files) of 
 * random numbers  between a specified range
 *@author Christian Servin, Ph.D.
 *<a href="#{@link}">{https://youtu.be/NH4_ipzZTz8}</a>.
 * <ul> 
 * <li> number_of_sets: how many sets of data is desired to generate</li>
 * <li> points: list of data points per set that will generated.</li>
 * <li> min_number: smallest random number to be generated, a.k.a., lower bound</li>
 * <li> max_number: largest random number to be generated, a.k.a., upper bound</li>
 * </ul>
 */
import java.io.*;
import java.util.*;
public class HowToGenerateRandomNumbers{
    public static void main(String[] args) throws IOException{
        int number_of_sets = 3;             // number of sets
        int[] points = {10, 50, 100};       // data points e.g., 1000, 10,000, 100,000, 1,000,000
        int min_number = -10000;            // lower bound
        int max_number = 10000;             // upper bound
    
        for (int i = 0; i < points.length; i++) {
            String set = points[i]+"";     // generate file name
            for (int j = 1; j <= number_of_sets; j++) {                   
                PrintWriter pr = new PrintWriter(set+"-"+j+".txt"); // naming the file 
                for (int k = 0; k < points[i]; k++) {
                    pr.println((int) ((Math.random() * (max_number - min_number)) + min_number));
                }
                pr.close();
            }
        }
    }
}