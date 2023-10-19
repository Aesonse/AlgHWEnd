package ru.geekbrains.lesson4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {



        HashMap<String, String> hashMap = new HashMap<>(4);
        String oldValue = hashMap.put("+79001112233", "AAAAAAAA");
        oldValue = hashMap.put("+79001112231", "BBBBBB");
        oldValue = hashMap.put("+79001112232", "CCCCCC");
        oldValue = hashMap.put("+79001112233", "DDDDDDDD");
        oldValue = hashMap.put("+79001112234", "EEEEEEE");
        oldValue = hashMap.put("+79001112235", "MMMMMM");
        oldValue = hashMap.put("+79001112236", "FFFFF");
        oldValue = hashMap.put("+79001112237", "GGGGG1");
        oldValue = hashMap.put("+79001112238", "GGGG2");
        oldValue = hashMap.put("+79001116543", "GGGG3");
        oldValue = hashMap.put("+79001342230", "GGGG4");
        oldValue = hashMap.put("+79044112231", "aBBBBB");
        oldValue = hashMap.put("+79001662232", "aCCCCC");
        oldValue = hashMap.put("+79001111113", "aDDDDDDD");
        oldValue = hashMap.put("+79001122234", "aEEEEEE");
        oldValue = hashMap.put("+79025412235", "aMMMMM");
        oldValue = hashMap.put("+79654112236", "aFFFF");
        oldValue = hashMap.put("+79088812237", "aGGGG1");
        oldValue = hashMap.put("+79446112238", "aGGGG2");
        oldValue = hashMap.put("+79336512239", "aGGGG3");
        oldValue = hashMap.put("+79066642230", "aGGGG4");

        System.out.println(hashMap);


    }

}
