package com.company;

import java.util.Scanner;

public class node {
    char[][] state;
    int bx = 1, by = 1;

    node(int x, int y) {
        state = new char[x + 3][y + 3];
    }

    public void fill(int X, int Y) {
        for (int k = 0; k <= X + 1; k++) {
            for (int m = 0; m <= Y + 1; m++) {
                if ((k == 0 || m == 0) || (k == X + 1 || m == Y + 1))
                    state[k][m] = 'x';

                else
                    state[k][m] = '.';

            }
        }
        print(state,X,Y);
        System.out.print("Enter number of walls:");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int k = 0; k < x; k++) {
            System.out.print("Enter Position of wall["+x+"]:");
            int wx = s.nextInt();
            int wy = s.nextInt();
            state[wx][wy] = 'x';
        }

        //IDENTIFYING BALL POSITION
        int bx = 1;
        int by = 1;
        state[bx][by] = 'B';
        print(state, X, Y);
    }

    public void print(char[][] state, int X, int Y) {
        for (int k = 0; k <= X + 1; k++) {
            for (int m = 0; m <= Y + 1; m++)
                System.out.print(state[k][m]);
            System.out.println();
        }
    }
}
