/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensiratarata;

/**
 *
 * @author lenovo
 */
public class Arraymultidimensiratarata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data [][] = {{4,6,4, 2,8,4,2,10}, {4,6,4,2,8,4,2,10}};
        double total = 0;
        int putaran = 0;
        for (int a = 0; a < data.length; a++){
            for ( int b = 0; b < data [0].length; b++){
                total += data[a][b];
                putaran++;
            }
           
        }
        
    }
    
}
