package com.company.stud.Homeworks.April10_17.Task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File of1 = new File("test1IO.txt");
        File of2 = new File("test1O.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(of1));
             BufferedWriter brOut = new BufferedWriter(new FileWriter(of2))) {

        /*try (FileInputStream task1IO = new FileInputStream("test1IO.txt")){
             Reader rd = new InputStreamReader(task1IO, "utf-8");
             BufferedReader br = new BufferedReader(rd);
 можно было сокращённо вот так
BufferedReader br = new BufferedReader(InputStreamReader(new FileInputStream ("test1IO.txt"), "utf-8")); */

            String line = br.readLine();
            String[] arraySt = line.split(" ");
            //int[] arrayIO = new int[arraySt.length];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arraySt.length; i++) {
                sb.append((int) Math.pow(Integer.parseInt(arraySt[i]), 3)).append(" ");
                //arrayIO[i] = (int)Math.pow(Integer.parseInt(arraySt[i]), 3);
            }
            brOut.write(sb.toString().trim());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

