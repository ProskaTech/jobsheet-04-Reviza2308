/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Created by : 21343031_Muhammad Reviza Dekry
 */
package js04;

/**
 *
 * @author Revskyyy
 */
public class TestAND {
    public static void main(String[]args){
        int i=0;
        int j=10;
        boolean test = true;
        
        //demonstrasi &&
        test = (i>j) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi &
        test = (i>j) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
