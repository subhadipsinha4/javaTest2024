import java.util.HashMap;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] numbers={4,7,8,9,1,7,5,4,3,2,6,9,4,3,7,2,2,2,2,2,2,2,2};
        findDuplicateAndCount(numbers);
    }

    private static void findDuplicateAndCount(int[] numbers) {
        HashMap<Integer,Integer> mapInfo=new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            if(mapInfo.containsKey(numbers[i])){
                mapInfo.put(numbers[i], mapInfo.get(numbers[i])+1);
            }else{
                mapInfo.put(numbers[i],1);
            }
        }
        System.out.println(mapInfo);
    }
}
