

import java.util.ArrayList;


class Main {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        
        // adding in arraylist
        list.add(10);
        list.add(60);
        list.add(155);
        list.add(40);
        list.add(30);
        list.add(20);

        //  removing elements 
        list.remove(3);
        list.remove(Integer.valueOf(155));

        // printing elements and summing up 
        int sum = 0; 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            sum += list.get(i);
        }
        
        System.out.println("sum -> " + sum);

    }
}