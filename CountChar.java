import java.util.ArrayList;
import java.util.List;


class CountChar{
    public static void main(String[] args) {
        char[] c = {'a','e','i','o','u'};
        int count=0;
        for (char x : c) {
            System.out.print(x+ " ");
        }
        for (char x : c) {
            count++;
        }
        System.out.println("\nthe number of elements in array c is "+count);

        System.out.println("\nconverting char array to list");

        List<Character> clist = new ArrayList<>();
        for (char x : c) {
            clist.add(x);
        }
        System.out.println("\nlist values are\n"+clist);

        System.out.println("\nthe size of the list is "+clist.size());

    }


}