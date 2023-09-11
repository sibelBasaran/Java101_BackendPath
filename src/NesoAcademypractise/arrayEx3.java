package NesoAcademypractise;

public class arrayEx3 {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,3,5};
        int searchElement = 1;
        System.out.println(getNumberOcc(numbers,searchElement));

    }
    public static int getNumberOcc(int[] numbers, int searchElement){
        int occ = 0;
        for( int i =0; i<numbers.length; i++)
            if(searchElement == numbers[i])
                occ++;
            return occ;
    }
}
