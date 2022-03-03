package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static <e> void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Enter expression:");
            String input = in.nextLine();
            if (Objects.equals(input, "quit")){
                in.close();
                System.out.println("The end");
                break;
            }
            Fraction f1 = new Fraction(0,0);
            Fraction f2 = new Fraction(0,0);
            int c = 0;
            char operation = ' ';
            int haserrors = 0;
            for (int i = 0; i < input.length(); i++){
                if (input.charAt(i) == '/'){
                    c++;
                    continue;
                }
                switch (input.charAt(i)){
                    case '+':
                        operation = '+';
                        c++;
                        break;
                    case '-':
                        operation = '-';
                        c++;
                        break;
                    case ':':
                        operation = ':';
                        c++;
                        break;
                    case '*':
                        operation = '*';
                        c++;
                        break;
                    default:
                        if (input.charAt(i) < '9' && input.charAt(i) > '0'){
                            switch (c){
                                case 0:
                                    f1.numerator = f1.numerator*10 + input.charAt(i)-'0';
                                    break;
                                case 1:
                                    f1.denominator = f1.denominator*10 + input.charAt(i)-'0';
                                    break;
                                case 2:
                                    f2.numerator = f2.numerator*10 + input.charAt(i)-'0';
                                    break;
                                case 3:
                                    f2.denominator = f2.denominator*10 + input.charAt(i)-'0';
                                    break;
                            }
                        }else {
                            haserrors = 1;
                        }
                }
            }
            if (haserrors == 1){
                System.out.println("Some errors in input");
                continue;
            }
            System.out.print("Result:");
            switch (operation){
                case '+':
                    try {
                        System.out.println(f1 + " + " + f2 +" = " + Fraction.add(f1,f2));
                    }catch (Exception e){
                        System.out.println("Some errors in input");
                    }
                    break;
                case '-':
                    try {
                        System.out.println(f1 + " - " + f2 +" = " + Fraction.dif(f1,f2));
                    }catch (Exception e){
                        System.out.println("Some errors in input");
                    }
                    break;
                case ':':
                    try {
                        System.out.println(f1 + " : " + f2 +" = " + Fraction.division(f1,f2));
                    }catch (Exception e){
                        System.out.println("Some errors in input");
                    }
                    break;
                case '*':
                    try {
                        System.out.println(f1 + " * " + f2 +" = " + Fraction.multiply(f1,f2));
                    }catch (Exception e){
                        System.out.println("Some errors in input");
                    }
                    break;
            }
        }

//        System.out.print("input numerator1:");
//        int numerator1 = in.nextInt();
//
//        System.out.print("input denominator1 :");
//        int denominator1 = in.nextInt();
//
//        System.out.print("input numerator2:");
//        int numerator2 = in.nextInt();
//
//        System.out.print("input denominator2 :");
//        int denominator2 = in.nextInt();
//
//        Fraction frac1 = new Fraction(denominator1, numerator1);
//
//        Fraction frac2 = new Fraction(denominator2, numerator2);
//
//        Fraction sum1 = frac1.add(frac2);
//        System.out.println(frac1 + " + " + frac2 +" = " + sum1);
//
//        Fraction sum2 = Fraction.add(frac1, frac2);
//        System.out.println(frac1 + " + " + frac2 +" = " + sum2);
//
//        Fraction sub1 = frac1.dif(frac2);
//        System.out.println(frac1 + " - " + frac2 +" = " + sub1);
//
//        Fraction sub2 = Fraction.dif(frac1, frac2);
//        System.out.println(frac1 + " - " + frac2 +" = " + sub2);
//
//        Fraction mult1 = frac1.multiply(frac2);
//        System.out.println(frac1 + " * " + frac2 +" = " + mult1);
//
//        Fraction mult2 = Fraction.multiply(frac1, frac2);
//        System.out.println(frac1 + " * " + frac2 +" = " + mult2);
//
//        Fraction div1 = frac1.division(frac2);
//        System.out.println(frac1 + " : " + frac2 +" = " + div1);
//
//        Fraction div2 = Fraction.division(frac1, frac2);
//        System.out.println(frac1 + " : " + frac2 +" = " + div2);
    }
}
