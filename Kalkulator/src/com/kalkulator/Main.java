package com.kalkulator;

import com.kalkulator.controller.CalculatorController;
import com.kalkulator.model.CalculatorModel;

public class Main{

    public static void main (String []args) {

        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorController calculatorController = new CalculatorController (calculatorView, calculatorModel);

        calculatorView.setVisible(true);

    }

}