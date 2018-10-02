import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class DupKeys{
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("cat");
        names.add("dog");
        names.add("snake");
        names.add("dog");
        names.add("monkey");
        names.add("cat");

        Set<String> set = new HashSet<>();

        System.out.println("new list has the following values");
        for ( String name : names) {
        System.out.println(name);            
        }

        System.out.println("\nthe values that are duplicate in the list are as follows");
        for (String name : names) {
            if(set.add(name)==false){
                System.out.println(name);
            }
            
        }

    }
}