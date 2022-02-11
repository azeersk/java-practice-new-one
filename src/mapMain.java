import java.util.*;

public class mapMain {

    public static void priorityMapMethod(int a, int b){
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("Name ", " Tokyo");
        hashMap.put("Id ", " 118055");
        hashMap.put("Roll No ", " 49");
        hashMap.put("age ", " 23");
        System.out.println(hashMap);
        System.out.print("Key set: ");
        for(String i: hashMap.keySet()){
            System.out.print(i+ " ");
        }

        System.out.println("Values set: ");
        for(String j: hashMap.values()){
            System.out.print(j+ " ");
        }
        System.out.println();

        System.out.println("Size of the map is: " + hashMap.size());
        System.out.println("Entry set of the map is: "+hashMap.entrySet());
        System.out.println("Is Map is empty: "+ hashMap.isEmpty());

        Map<String, String> mapTwo = new LinkedHashMap<>();

        mapTwo.putAll(hashMap);
        System.out.println(mapTwo);
        mapTwo.put("Name1 "," Nairobi");
        mapTwo.put("Id1 "," 118034");
        mapTwo.put("Roll No1: ", " 53");
        mapTwo.put("age ", " 25");

        System.out.println("final map is "+ mapTwo);
        System.out.println("Keys set is: "+ mapTwo.keySet());
        System.out.println("Values set is: "+mapTwo.values());

    }

    public static void SetMethod(){
        Set<Integer> numbers = new HashSet<>();

        for(int i=0; i<7; i++){
            numbers.add(i+5);
        }
        numbers.add(10);
        numbers.add(6);
        System.out.println("Numbers count is: "+ numbers);
        System.out.println("Sorted set is: "+numbers.stream().sorted());

        System.out.println( "numbers empty check: "+ numbers.isEmpty());


        Set<Integer> SetTwo = new LinkedHashSet<>();
        SetTwo.addAll(numbers);
        System.out.println("second set is: "+ SetTwo);
        System.out.println("Size of the Set is: "+ SetTwo.size());
        SetTwo.clear();
        System.out.println("Empty check: "+ SetTwo.isEmpty());
        SetTwo.clear();
        for(int j=1; j<7; j++){
            SetTwo.add(j*3);
        }

        System.out.println("Empty Check: "+SetTwo.isEmpty());
        System.out.println("Second set is with new values: "+ SetTwo);

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        priorityMapMethod(a,b);

        System.out.println("Set is: ");
         SetMethod();

    }
}
