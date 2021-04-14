package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Prisoner> prisoners = new ArrayList<Prisoner>();
    private static int alive;

    public static void Execution(int p, int s) {
        int count = 0;
        while (alive > 1) {
            for (Prisoner pr : prisoners) {
                if (!pr.isDead()) {
                    count++;
                }
                if (count == s && !pr.isDead() && alive > 1) {
                    pr.setDead(true);
                    alive--;
                    count = 0;
                }
            }
        }
    }

    private static void createPrisoners(int p) {
        for (int i = 0; i < p; i++) {
            prisoners.add(new Prisoner());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int p = Integer.parseInt(input[0]);
            int s = Integer.parseInt(input[1]);

            alive = p;
            createPrisoners(p);
            Execution(p, s);

            for (Prisoner pr : prisoners) {
                if (!pr.isDead()) {
                    System.out.printf("With %d prisoners and %d syllables, I'd like to be number %d.", p, s, (prisoners.indexOf(pr) + 1));
                }
            }

        }
    }
}
