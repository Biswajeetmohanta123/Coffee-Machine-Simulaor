import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CoffeeMachineSimulator coffeeMachine = new CoffeeMachineSimulator();
        int espressoCount = 0;
        int latteCount = 0;
        int cappuccinoCount = 0;


        while(true){
            System.out.println("To Select Option: ");
            System.out.println("1 - Buy Coffee");
            System.out.println("2 - Fill Ingredients");
            System.out.println("3 - Take Money");
            System.out.println("4 - Show Ingredients");
            System.out.println("5 - Show Analytics");
            System.out.println("6 - Show Money");
            System.out.println("0 - Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("To Select Type Of Coffee");
                    System.out.println("1 - Espresso ($4)");
                    System.out.println("2 - Latte ($7)");
                    System.out.println("3 - Cappuccino ($6)");
                    int coffeeChoice = sc.nextInt();
                    switch (coffeeChoice){
                        case 1:
                            if(coffeeMachine.canMakeCoffee(250,0,16)){
                                System.out.println("Enjoy Your Espresso !!");
                                coffeeMachine.makeCoffee(250,0,16,4);
                                espressoCount++;
                            }
                            else{
                                System.out.println("Sorry!! Not Enough Ingredients To make Espresso.");
                            }
                            break;
                        case 2:
                            if(coffeeMachine.canMakeCoffee(350,75,20)){
                                System.out.println("Enjoy Your Latte !!");
                                coffeeMachine.makeCoffee(350,75,20,7);
                                latteCount++;
                            }
                            else{
                                System.out.println("Sorry!! Not Enough Ingredients To make Latte.");
                            }
                            break;
                        case 3:
                            if(coffeeMachine.canMakeCoffee(200,100,12)){
                                System.out.println("Enjoy Your Espresso !!");
                                coffeeMachine.makeCoffee(200,100,16,6);
                                cappuccinoCount++;
                            }
                            else{
                                System.out.println("Sorry!! Not Enough Ingredients To make Cappuccino.");
                            }
                            break;
                        default:
                            System.out.println("Invalid!! Coffee Selection");
                            break;
                    }
                case 2:
                    System.out.println("Enter The Amount of Water To Fill");
                    int water = sc.nextInt();
                    System.out.println("Enter the amount of Milk To Fill");
                    int milk = sc.nextInt();
                    System.out.println("Enter the amount of Beans To Fill");
                    int beans = sc.nextInt();
                    coffeeMachine.fill(water,milk,beans);
                    System.out.println("Ingredients Added Successfully!!");
                    break;
                case 3:
                    coffeeMachine.takeMoney();
                    break;
                case 4:
                    coffeeMachine.showIngredients();
                    break;
                case 5:
                    coffeeMachine.showAnalysis(espressoCount,latteCount,cappuccinoCount);
                    break;
                case 6:
                    coffeeMachine.showMoney();
                    break;
                case 0:
                    System.out.println("Exciting Coffee Machine Simulator...!!");
                    return;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }
}