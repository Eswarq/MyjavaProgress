public class Secondlargest {
    public static void main(String[] args){
        int[] arr = {12, 35, 1, 10, 34};
        int lar = arr[0];
        int seclar = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>lar){
                seclar = lar;
                lar = arr[i];
            }
            else if(lar > arr[i] && arr[i] > seclar){
                seclar = arr[i];

            }
        }System.out.println(seclar);
        

    }
}
        
        