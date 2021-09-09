/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANDO MAKAULA
 */
import java.util.Scanner;
public class NewMain {

    /**
     * @param n1
     * @return 
     */
  
    public static int function(int n1){
        int r =1;
        if (n1 >= 0) {   
	    int i;    
	    for(i=1;i<=n1;i++)    
		 r=r*i;}
        return r;
    }
	 
    public static int function1(int n1){
	  
	if (n1 >= 0) { 
	    if(n1 == 1 || n1 == 0){
                 return 1;}
        }
        return n1 * function1(n1 - 1);
    }

    public static void main(String[] args) {
		    
		    //this is factorial using While loop
	while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("positive interger please");
            int n = s.nextInt();
                if (n >=0){
                    int i = function(n);
                    int r = function1(n);
                    System.out.println("Factorial of "+n+" is: "+i+ "; Recursive is:" +r);
                }
        }
    }
}

