import java.util.HashSet;
//This programm creates a Set of numbers and removes all numbers higher than 50

public class NumbersList{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();//create a HashSet
        set.add(49); //adding 4 Integers to the HashSet
        set.add(100);
        set.add(25);
        set.add(65);
            
        System.out.println("Numbers in HashSet: " + set); //First output displays all the elements in the HashSet
        
        set.removeIf(x -> x>50); //Numbers bigger than 50 get removed
        System.out.println("Numbers lower 50. " + set); //Second output displays only the elements that are lower than 50
         
    }
}
