package Arrays;

public class harmonicAverage {
    public static void main(String[] args) {
        int[]arr = new int[]{1,3,5,7,9,11,13};
        double average = 1;
        for(int i : arr){
            average+=1.0/i;

        }
        System.out.println("Dizinin Harmonik Ortalaması:"+arr.length/average);
    }
}
