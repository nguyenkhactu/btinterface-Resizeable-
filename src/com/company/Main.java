package com.company;

public class Main {

    public static void main(String[] args) {
	Circle [] circles =new Circle[3];
    circles[0] = new Circle();
    circles[1] = new Circle(10);
    circles[2] = new Circle(10,"red",true);

        System.out.println("hien thi");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(10,20);
        rectangles[2] = new Rectangle(10,20,"red",false);

        System.out.println(" hien thi");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
