import java.util.*;
public class ArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // syntax

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(98);
        list.add(987);
        list.add(87);
        System.out.println(list);

        //input

        for(int i = 0; i<3; i++) {
            list.add(in.nextInt());
        }

        for(int i = 0; i<3; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
