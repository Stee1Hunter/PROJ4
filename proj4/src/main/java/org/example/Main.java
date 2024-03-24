package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int j=1;
        System.out.print("Введите число заказов, которые вы хотите сделать:");
        int m = cs.nextInt();
        String[] FirmName = {"Rolex", "Tissot", "Omega", "Swatch"};
        String[][] WatchModels ={{"Rolex","Oyster"}, {"Tissot","T114"}, {"Omega","21032422001001"}, {"Swatch","ORIGINALS"}};
        ArrayList<String> Clients = new ArrayList<>();
        while(j<=m) {
            System.out.println("Заказ - "+j+" Введите ваши контактные данные:");
            System.out.print("Введите ваше ФИО(введите без пробелов):");
            String FIO = cs.next();
            System.out.print("Введите ваш Email:");
            String Email = cs.next();
            System.out.print("Введите ваш Номер телефона:");
            String Phone = cs.next();
            System.out.println("Выберите одну из позиций, которая есть у нас в магазине:");
            for (int i = 0; i <= 3; i++) {
                System.out.println((i + 1) + ") " + WatchModels[i][0] + " - " + WatchModels[i][1]);
            }
            System.out.print("Введите номер товара:");
            String IndTov = cs.next();
            System.out.print("Введите количество, покупаемого вами товара:");
            String Kol = cs.next();
            Clients.add(FIO);
            Clients.add(Email);
            Clients.add(Phone);
            Clients.add(IndTov);
            Clients.add(Kol);
            j++;
        }
        System.out.println("Данные о товарах:");
        int p =1;
        int h =0;
        int hh =1;
        int hhh =2;
        int hhhh =3;
        int hhhhh =4;
        for(int i = 1; i <= m; i++){
            System.out.println("Заказ - " + p);
            System.out.println("ФИО клиента: "+Clients.get(h));
            System.out.println("Email клиента: "+Clients.get(hh));
            System.out.println("Номер телефона клиента: "+Clients.get(hhh));
            System.out.println("Позиция: "+Clients.get(hhhh));
            System.out.println("Количество товаров: "+Clients.get(hhhhh));
            h=h+5;
            hh=hh+5;
            hhh=hhh+5;
            hhhh=hhhh+5;
            hhhhh=hhhhh+5;
            p++;
        }
    }
}