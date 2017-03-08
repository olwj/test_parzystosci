package com.swingproject;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("Kliknij mnie");

        frame.add(button);

        frame.setSize(500,500);

        frame.setVisible(true);
    }
}
