package com.company;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//         class ClickListener implements Button.OnClickListener {
//             public ClickListener() {
//                 System.out.println("I've been attached");
//             }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//         }
//
//         btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked");
            }
        });
        listen();


        // Primera definicion, la clase GearBox tiene una clase anidada (Gear)
        // Gear no es statica dentro de Gearbox, por lo que se tiene que crear una instancia (mclaren)
        // de Gearbox y a partir de ella instanciar una de Gear
        // GearBox.Gear first = mcLaren.new Gear(1,12.3);


        // Segundo caso: si la clase (Gear) dentro de Gearbox se manejase static, se podrian
        // crear instancias a partir de una instancia GearBox pero sin el keyword new
        // GearBox.Gear second = new GearBox.Gear(2, 15.4);

        // no valida
        // GearBox.Gear third = new mcLaren.Gear(3, 17.8);
        // System.out.println(first.driveSpeed(1000));

    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onCLick();
            }
        }
    }
}
