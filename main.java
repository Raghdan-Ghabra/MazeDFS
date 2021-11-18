package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter x,y");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        node n = new node(x, y);
        game g = new game();
        n.fill(x, y);
        g.play(n, x, y);
    }
}
