package org.example;

public class Main {
    public static void main(String[] args) {
        contaESalta(10);
    }
    public static void contaESalta(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}