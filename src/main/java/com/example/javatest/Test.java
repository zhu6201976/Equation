package com.example.javatest;


import java.util.Scanner;

/**
 * 输入一元二次方程系数，若有实数根，求根并输出，否则输出“不是二次方程或没有实数根”的信息
 */
public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入系数a:");
        double a = input.nextDouble();
        System.out.println("请输入系数b:");
        double b = input.nextDouble();
        System.out.println("请输入系数c:");
        double c = input.nextDouble();
        if (a==0){
            System.out.println("不是二次方程");
            return;
        }
        double d = Math.sqrt(b * b - 4 * a * c);
        if (d < 0) {
            System.out.println("没有实数根");
        } else {
            double x1 = (-b + d) / 2 * a;
            double x2 = (-b - d) / 2 * a;
            System.out.println("此方程实根x1=" + x1 + ",x2=" + x2);
        }


    }

}

