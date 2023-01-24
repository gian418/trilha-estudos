package gianhaack.command;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME UM COMANDO: ");

        while (scanner.hasNext()) {
            String comando = scanner.next();
            Invoker.invoke(comando);
        }

    }
}
