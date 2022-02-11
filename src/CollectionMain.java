import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionMain {

    public static void arrayListMethod(int a, int b){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<a; i++){
            arrayList.add(i*9);
        }

        for(int j=0; j<a; j++){
            if(arrayList.get(j) == b) {
                System.out.println("The index of the element is: "+ j);
            }
        }
        System.out.println("Arraylist is: "+arrayList);
    }
    public static void linkedListMethod(int a, int b){
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i=0; i<a; i++){
            linkedList.add(i*9);
        }

        for(int k=0; k<a; k++){
            if(linkedList.get(k) == b){
                System.out.println("The index of the element is: "+ k);
            }
        }

        System.out.println("The LinkedList is: "+ linkedList);

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("ArrayList is: ");
        arrayListMethod(a,b);

        System.out.println("LinkedList is: ");
        linkedListMethod(a,b);
    }
}
