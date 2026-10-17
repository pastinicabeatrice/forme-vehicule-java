package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args){

    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(3);
    list.add(2);

    System.out.println(list);

    ArrayList<String> list1=new ArrayList<>();
    list1.add("Apple");
    list1.add("Orange");
    list1.add("Banana");
    list1.add("Coconut");
    System.out.println(list1);


    Scanner scanner = new Scanner(System.in);
    ArrayList<String> foods = new ArrayList<>();
    System.out.println("Introdu mancare pe care vrei sa o mananci: ");
    int numOfFood=scanner.nextInt();
    scanner.nextLine();
    for(int i = 1; i<=numOfFood; i++){
        System.out.print("Introdu nr manacarii #"+i+": ");
        String food = scanner.nextLine();
        foods.add(food);
    }
    System.out.println(foods);
    scanner.close();

}

}
