package com.company;
import House.House;

public class Main {

    public static void main(String[] args) {
       new Main().run();
    }
    private void run()
    {
        House[] houses=fillHouseArray();
        printA(houses,2);
        System.out.println("____________________________________________");
        printB(houses,1,1,2);
        System.out.println("____________________________________________");
        printC(houses,150);
    }

    private void printA(House[] house,int countOfRooms)
    {
        for (int i=0;i<house.length;i++)
        {
            if (house[i].getCountOfRooms()==countOfRooms)
            {
                System.out.println(house[i]);
            }

        }
    }
    private void printB(House[] house,int countOfRooms,int firstPoint,int secondPoint)
    {
        for (int i=0;i<house.length;i++)
        {
            if (house[i].getCountOfRooms()==countOfRooms &&
                    house[i].getFloor()<= secondPoint&&
                    house[i].getFloor()>=firstPoint)
            {
                System.out.println(house[i]);
            }

        }
    }
    private  void printC(House[]house,double apartArea)
    {
        for (int i=0;i<house.length;i++)
        {
            if (house[i].getApartArea()>apartArea)
            {
                System.out.println(house[i]);
            }
        }
    }


    private  House[] fillHouseArray(){
        return  new House[]
                {
                        new House(1,34,200,1,1,"Some Street"),
                        new House(2,35,150,2,2,"Some Street"),
                        new House(3,13,20,1,1,"Some Street"),
                        new House(4,37,200,2,5,"Some Street")
                };
    }
}
