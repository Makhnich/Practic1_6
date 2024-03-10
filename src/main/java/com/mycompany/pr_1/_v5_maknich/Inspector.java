/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr_1._v5_maknich;


class Inspector {
    public void closeStore(Store store) {
        if (store.getName().equals("IKEA")) {
            store.setName(null);
        }
    }

    public void rebrand(Store store) {
        if (store.getName().equals("MacDonalds")) {
            store.setName("Вкусно и точка");
        } else {
            store.setName(store.getName().substring(1));
        }
    }
}