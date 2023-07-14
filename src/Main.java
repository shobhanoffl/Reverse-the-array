public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int[] arrayReversed = new int[5];

        int c=0;
        for(int i= array.length-1;i>=0;i--){
            arrayReversed[i]=array[c];
            c++;
        }

        for(int i=0;i< array.length;i++){
            System.out.println(arrayReversed[i]);
        }

    }
}