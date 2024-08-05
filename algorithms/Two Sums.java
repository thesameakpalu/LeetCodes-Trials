import java.util.HashMap;//Importing Hashmap

public class HeightChecker{
    public static   int[] TwoSum(int[] numbers, int target){
        //Creating a Hash Map to Store the Value and it's index
        HashMap<Integer, Integer> map = new HashMap<>();
        //Iterating through the array to look for two numbers that complements the target value, such that they sum up to the target value
        for(int i = 0; i < numbers.length; i++){
            int complement = target - numbers[i];
// Checking if the complemnt is conatained in the array provided
            if(map.containsKey(complement)){
                return  new int[] { map.get(complement),i};
            }else{
                map.put(numbers[i],i);
            }

        }
        //If no solution is found throw this error
        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String args[]){

        int[] numbers = {1,4,5,6,7,};
        int target = 6;

        int[] result = TwoSum(numbers,target);

        System.out.println("Indices:" + result[0] + " " + result[1]);
    }
}