package com.kkaty.testing_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


 
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printTables(10, 10);
        //android.util.Log.d("TAG", "onCreate: " + returnVal);
    }

    //    Print a multiplication table from 1 to 10 using
//    multidimensional array

    public void printTables(int x, int y) {

        int[][] multi = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                multi[i][j] = (i + 1) * (j + 1);
            }
        }
        String line = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                line = line + multi[i][j] + " ";
            }
            Log.d("RESULTS:", line);
            line = "";
        }
    }
}
//problem1
// package com.kkaty.trainingweekonedaytwo;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class MainActivity extends AppCompatActivity
//{
//
//    private List<String> strings;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        int returnFromMethod = someMethod(32);
//        Log.d("TAG", "onCreate: " + returnFromMethod);
//    }
//
//    public int someMethod(int i) {
//        System.out.println("Passed int = " + 1);
//        return i + 6;
//    }
//
//
//    public void findDuplicates(List<String> strings) {
//        this.strings = strings;
//        ArrayList<String> results = new ArrayList<>();
//
//        for (int i = 0; i < strings.size(); i++) {
//            String temp = strings.get(i);
//            for (int j = 0; j < strings.size(); j++) {
//                if (i != j) {
//                    if (temp.equals(strings.get(j))) {
//                        results.add(temp);
//                    }
//                }
//            }
//        }
//        for (String str : results)
//        {
//            System.out.println(str);
//        }
//
//
//    }
//
//}

//problem2
//package com.kkaty.testing_application;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//
//
// 
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        boolean returnVal = checkPalindrome(" AFTER");
//        android.util.Log.d("TAG", "onCreate: " + returnVal);
//    }
//
//    public boolean checkPalindrome(String word) {
//        boolean isPalindrome = true;
//
//        // start from first character to middle 
//        word = word.replace(" ", "");
//
//        for (int i = 0; i < word.length() / 2; i++) {
//            //checking upto to the last charater
//            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
//                isPalindrome = false;
//            }
//        }
//        return isPalindrome;
//    }
//}

//problem3
//package com.kkaty.testing_application;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//
//
// 
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        int returnVal = fizzBuzz(20);
//        android.util.Log.d("TAG", "onCreate: " + returnVal);
//    }
//
//    public int fizzBuzz(int count) {
//        boolean answer = false;
//        String result = "";
//        
//        for (int i = 1; i < count + 1; i++) {
//            // "fizz" if the number is divisible by 3
//            if (i % 3 == 0) {
//                //System.out.printf("fizz");
//                result = "fizz";
//                answer = true;
//            }
//            // "buzz" if the number is divisible by 5
//            if (i % 5 == 0) {
//                //System.out.printf("buzz");
//                result = result + "buzz";
//                answer = true;
//            }
//            // "fizzbuzz" if the number is divisible by both
//            if (!answer) {
//                // and the integer for the rest
//                //System.out.printf("%d\n", i);
//                result = result + i;
//            }
//            Log.d("RESULTS", "fizzBuzz: " + result);
//            answer = false;
//            result = "";
//        }
//        return count;
//    }
//}
//problem4
//package com.kkaty.testing_application;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//
//
// 
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        boolean returnVal = checkAnagrams("arc", "cat");
//        android.util.Log.d("TAG", "onCreate: " + returnVal);
//    }
//
//    public boolean checkAnagrams(String word1, String word2) {
//        boolean isAnagram = true;
//        word1 = word1.replace(" ","");
//        word2 = word2.replace(" ","");
//
//        if (word1.length() != word2.length()) {
//            isAnagram = false;
//            return isAnagram;
//        }
//        boolean found = false;
//        String new2 = "";
//        for (int i = 0; i < word1.length() && isAnagram; i++) {
//            for (int j = 0; j < word2.length(); j++) {
//                if (word1.charAt(i) == word2.charAt(j) && !found) {
//                    found = true;
//                } else {
//                    new2 = new2 + word2.charAt(j);
//                }
//            }
//            if (!found) isAnagram = false;
//            word2 = new2;
//        }
//        return isAnagram;
//    }
//}