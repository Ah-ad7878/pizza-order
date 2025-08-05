import java.util.*;
public class pizaaOrderApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //declare the price of pizza
        int price = 0;
        int samll = 500;
        int medium = 1200;
        int large = 2000;
        int toppingprice = 150;

        //user choice
        System.out.println("Welcome to pizza House");
        System.out.println("coice pizza size 1-3");
        System.out.println("1.small pizza - Rs"+ samll);
        System.out.println("2.medium pizza - Rs"+ medium);
        System.out.println("3.large pizza - Rs"+ large);
        System.out.println("Choice from manue book:");
        

        int sizechoice = sc.nextInt();
        //use of switch case

        switch (sizechoice){
            case 1:
            price += samll;
            System.out.println("you have choosen small pizza");
            break;

            case 2:
            price += medium;
            System.out.println("you have choosen medium pizza");
            break;

            case 3:
            price += large;
            System.out.println("you have choosen large pizza");
            break;

            default:
            System.out.println("invalid choice");
            


        }

        //Topping
        System.out.println("Add topping on your pizza");
        System.out.println("Topping price-Rs"+toppingprice);
        System.out.println("1-cheeze");
        System.out.println("2-chicken");
        System.out.println("3-olives");
        System.out.println("4-mashroom");
        System.out.println("5-Done");

        int toppingcount = 0;
        while(true){
            System.out.println("Select topping from 1-5");
            int toppingchoice = sc.nextInt();
            if(toppingchoice>=1 && toppingchoice<=4){
                toppingcount++;
                System.out.println("Add your topping");
            }
            else if(toppingchoice == 5){
                System.out.println("You have choosen done");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
            
            


        }

        price += toppingcount*toppingprice;


        //bill section

        System.out.println("Your billl");
        System.out.println("Toppings: " + toppingcount);
        System.out.println("Total Price: Rs. " + price);
        System.out.println("Thank you for your order!");





    }
}
