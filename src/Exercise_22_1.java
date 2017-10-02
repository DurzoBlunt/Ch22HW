import java.util.LinkedList;
import java.util.Scanner;

public class Exercise_22_1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        LinkedList<Character> maxIncreaseOrder = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Enter a string:");
        String s = input.nextLine();

        for(int i = 0; i < s.length(); i++){
            if(list.size() > 1 && s.charAt(i) <= list.getLast() && list.contains(s.charAt(i))){
                list.clear();
            }

            list.add(s.charAt(i));

            if(list.size() > maxIncreaseOrder.size()){
                maxIncreaseOrder.clear();
                maxIncreaseOrder.addAll(list);
            }
        }

        for(Character ch: maxIncreaseOrder){
            System.out.print(ch);
        }

        System.out.println();
    }
}
