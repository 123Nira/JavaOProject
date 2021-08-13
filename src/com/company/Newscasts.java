package com.company;
class Frog {
   int id;
   String name;
    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return String.format("%-4d: %s", id, name);
    }
}
public class Newscasts {
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Freddy");
        frog1.id=23;
        Frog frog2 = new Frog(5, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);
//        StringBuilder sc=new StringBuilder();
//        sc.append("This is me")
//                .append("ok")
//                .append(" ")
//                .append("greate");
//        System.out.println(sc);

    }
}
