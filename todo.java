import java.util.*;
import java.util.ArrayList;

public class ToDo {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int options;
do{
        System.out.println("\n \n Hey friend welcome to the to do list program. Here are your options to choose from: \n " +
                "1. Add new item to list\n" +
                "2. Print to do list\n" +
                "3. Remove an item from the to do list\n" +
                "4. I want to replace an item with something else." +
                "\n 5. quit");
       options = s.nextInt();



        switch (options) {
            case 1:
                System.out.print("What do you want on your list?");
                String thing = s.next();
                list.add(thing);
                System.out.print("added to list ho..");
                break;

            case 2:
                System.out.print("Ok here's all the stuff you added:\n");
                int iterator = 0;
                for (String item : list) {
                    iterator = iterator + 1;
                    System.out.println(iterator + ". " + item);
                }
                break;

            case 3:
                System.out.print("Okay what the heck do you want to remove?");
                String remove = s.next();
                list.remove(remove);
                System.out.println("Do you want to remove anything else?..." +
                        "\n type yes or no.");
                String dec = s.next();
                if (dec.equals("yes")) {
                    System.out.println("ok lmk what else u wanna remove");
                    String removetwo = s.next();
                    list.remove(removetwo);
                }
                 break;

            case 4:
                System.out.print("OK queen let me know what item you're looking to replace:");
                String item= s.next();
                int index1 = list.indexOf(item);
                System.out.print("Cute ok what do you want to replace it with?");
                String replace = s.next();
                list.set(index1, replace);
                break;


            default:
                System.out.print("Error message, please try again.");
            

        }
    } while (options != 5);

    System.out.println("Okay fine you clearly dont want to talk to me anymore.");

    }
}
