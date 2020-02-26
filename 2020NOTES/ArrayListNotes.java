
/**
 * Write a description of class ArrayListNotes here.
 *
 * @author Auckland V
 * @version 2/25/20
 */
public class ArrayListNotes{
    public static void testerMethod(){
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Llama");
        animals.add("Llama");
        animals.add("Llama");
        animals.add("Llama");
        animals.add("Llama");
        animals.add("Llama");
        //this will remove all the llamas from the list
        for(int i = animals.size()-1; i >= 0; i--){
            if(animals.get(i).equals("Llama")){
                animals.remove(i);
            }
        }
        
        for(String animal : animals){
            System.out.println(animal);
        }
        System.out.println("We have " +animals.size() +"animals left");
    }
    
}
