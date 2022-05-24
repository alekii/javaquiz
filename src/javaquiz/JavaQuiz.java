/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaquiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        List<String> wordsArr = new ArrayList<>();
        wordsArr.add("hello world");
        wordsArr.add("i am a cat");
        wordsArr.add("abracatamba"); 
 
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine(); 
            for(String wordString: wordsArr){  
                if(wordString.contains(s)){
                    System.out.println(wordString);
                    } 
            } 
        
        }
        
    }
    
}
