import java.util.ArrayList;

/**
 * Just a scratch file to practice Java
 */
public class xJunk {
    
    public static void main(String[] args){

        String[] names2 = {"Julia", "Jon", "Jon", "Aidan", "Brynn", "Mollie", "Elisa", "Harry", "Kai", "Parker", "Ryan"};
        
        // the problem with arrays, is that they're immutable.
        // so let's build a fancy new ArrayList
        ArrayList<String> nameList = new ArrayList<>();

        // traversing the String array's indexes using a standard for loop
        for(int i = 0; i < names2.length; i++){
            nameList.add(names2[i]);
        }

        // print the names with Jon still in the list
        System.out.println(nameList);

        // seek and destroy
        for(int i = 0; i < nameList.size(); i++){
            // put something here
            if (nameList.get(i).equals("Jon")){
                nameList.remove(i);
            }
        }
        // change a property of an array
        names2[5+2] = "Peter Parker";

        // insert a value in an ArrayList
        nameList.add(7, "Peter Parker");
        // modify a value in an ArrayList
        nameList.set(7, "Spiderman");

        // print the names without Jon in the list
        System.out.println(nameList);
    }

}
