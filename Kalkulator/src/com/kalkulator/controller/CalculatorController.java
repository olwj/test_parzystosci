package com.kalkulator.controller;

import com.kalkulator.CalculatorView;
import com.kalkulator.model.CalculatorModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aleksandra on 02.03.2017.
 */
public class CalculatorController {

    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;

    public CalculatorController (CalculatorView calculatorView, CalculatorModel calculatorModel) {

        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
        this.calculatorView = addCalculatorListener(new CalculatorListener());
    }

    class CalculatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            firstNumber = calculatorView.getFirstNumber();
            secondNumber = calculatorView.getSecondNumber();

            calculatorModel.addTwoNumbers(firstNumber, secondNumber);
            calculatorView.addTwoNumbers(firstNumber, secondNumber);
        }
    }
}
