public class iterateArray {

    public static void main(String[] args){

        int[] numbers = {3, 7, 1, 45};

        for(int i=0; i<numbers.length; i++){
            // code to be executed
            System.out.println(numbers[i]);
        }

        // easier way to work with an array - no need to declare and increment i
        String[] animals = {"cat", "dog", "elephant", "horse"};
        for(String animal: animals){
            System.out.println(animal);
        }
    }
}
