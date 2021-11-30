package com.github.vasiljeu95.tmshw1.task3;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 7;

		/*
		int a = 1;
        int b = 4;
        int c = 2;
        */

        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
