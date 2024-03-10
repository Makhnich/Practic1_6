/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr_1._v5_maknich;

import java.util.Scanner;

public class PR_16_V5_Maknich {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название магазина: ");
        String storeName = scanner.nextLine();

        Store store = new Store(storeName);
        Inspector inspector = new Inspector();

        inspector.closeStore(store);
        inspector.rebrand(store);

        System.out.println(store.getName());
    }
}