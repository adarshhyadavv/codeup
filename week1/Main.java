/*
 * Ownwer-> Yadav Adarsh Ramesh
 * Date-> 07/11/2025
 * Stories Week 1
 * problems->
 * 1. The Efficient Traveler
 * 2. The Sum That Stands Out
 * 3. Flip the Switch
 * 4. The Odd One Out
 * 5. Smart Pair Finder
 * 6. The Minimalist Painter
 * 7. Coordiante Geometry library.
 */
import java.util.Scanner;

public class Main {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        boolean keepGoing;
        Stories storiesObject = new Stories();
        String options = """
                1. The Efficient Traveller.
                2. The Sum that stands out.
                3. Flip the Switch
                4. The odd one out.
                5. Smart pair finder.
                6. The minimalist painter.
                7. Coordinate Geometry .
                """;
                do {
                    System.out.print("Which of these stories would you like to explore ? :\n" + options + "enter operation to perform: ");
                    String optionNumber = userInput.nextLine();
                    switch(optionNumber){

                        case "1" -> {
                            System.out.print("Initial Energy: ");
                            int initialEnergy = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("size of array: ");
                            int size = userInput.nextInt();
                            System.out.print("Enter the elements inside the array: ");
                            int[] num = new int[size];
                            for(int index = 0; index < size; index++){
                                num[index] = userInput.nextInt();
                            }
                            userInput.nextLine();
                            System.out.println("The number of cities Travelled before which the energy exhausted is: " + storiesObject.citiesTravelled(num, initialEnergy));
                        }

                        case "2" -> {
                            System.out.print("size of array: ");
                            int size = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the elements inside the array: ");
                            int[] arr = new int[size];
                            for(int index = 0; index < size; index++){
                                arr[index] = userInput.nextInt();
                            }
                            userInput.nextLine();
                            System.out.println("The element  which divides array equally is: " + storiesObject.standOut(arr));
                        }

                        case "3" -> {
                            System.out.print("size of array: ");
                            int size = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the elements inside the array (Only 0's and 1's): ");
                            int[] arr = new int[size];
                            for(int index = 0; index < size; index++){
                                arr[index] = userInput.nextInt();
                            }
                            userInput.nextLine();
                            System.out.println("The minumum number of flips required are: " + storiesObject.noOfFlips(arr));
                        }

                        case "4" -> {
                            System.out.print("size of array: ");
                            int size = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the elements inside the array: ");
                            int[] arr = new int[size];
                            for(int index = 0; index < size; index++){
                                arr[index] = userInput.nextInt();
                            }
                            userInput.nextLine();
                            System.out.println("The element which is odd one out is: " + storiesObject.unique(arr));
                        }

                        case "5" -> {
                            System.out.print("size of array: ");
                            int size = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the value you want to check as the sum of the pair of elements: ");
                            int k = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the elements inside the array: ");
                            int[] arr = new int[size];
                            for(int index = 0; index < size; index++){
                                arr[index] = userInput.nextInt();
                            }
                            userInput.nextLine();
                            if(storiesObject.hasSmartPair(k, arr)){
                                System.out.println("Yes,this array contain two elements which are sum of key.");
                            }else{
                                System.out.println("No,this array doesn't contain any two elements which are sum of key.");
                            }
                        }

                        case "6" -> {
                            System.out.print("size of array: ");
                            int size = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the elements inside the array: ");
                            int[] arr = new int[size];
                            for(int index = 0; index < size; index++){
                                arr[index] = userInput.nextInt();
                            }
                            userInput.nextLine();
                            System.out.println("The sum of the minumum time slots is: " + storiesObject.minTime(arr));
                        }

                        case "7" -> {
                            System.out.println("The Geometry library");
                            System.out.print("Enter coordinates for Point 1 (x1 y1): ");
                            float x1 = userInput.nextFloat();
                            float y1 = userInput.nextFloat();
                            System.out.print("Enter coordinates for Point 2 (x2 y2): ");
                            float x2 = userInput.nextFloat();
                            float y2 = userInput.nextFloat();
                            System.out.print("Enter radius for Circle: ");
                            double radius = userInput.nextDouble();
                            System.out.print("Enter side for Square: ");
                            double side = userInput.nextDouble();
                            System.out.print("Enter translation values (dx dy): ");
                            float dx = userInput.nextFloat();
                            float dy = userInput.nextFloat();
                            userInput.nextLine(); 

                            System.out.println("\nResults");
                            
                            System.out.println(storiesObject.runGeometryStory(x1, y1, x2, y2, radius, side, dx, dy));
                        }

                        default -> System.out.println("Invalid Input!");
                    }
                    System.out.print("Do you want explore further (y/n)?: ");
                    String userResponse = userInput.nextLine();
                    keepGoing = userResponse.equalsIgnoreCase("y");
                } while (keepGoing);

                System.out.println("\nOperation Ends");
                
    }
}