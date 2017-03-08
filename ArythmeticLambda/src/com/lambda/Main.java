package com.lambda;

import static com.lambda.Main.operate;

public class Main {

    public static int operate(int a, int b,
                              MathOperation mathoperation){
        return mathoperation.operation(a,b);
    }

    public static void main(String[] args) {

        MathOperation addition = (int a, int b) -> a+b;
        MathOperation substraction = (a,b) -> a-b;
        MathOperation multiplication
                = (a,b) -> a*b ;
        MathOperation division = (a,b) -> a/b;

        System.out.println(operate(56, 34, substraction));

    }
}
