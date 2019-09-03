public class Finder{
    //function to find the maximum element
    static Integer findMax(int arr[]){

        if(arr == null){
            System.out.println("This array is null.");
            return null;
        }

        if(arr.length == 0){
            System.out.println("This array is empty.");
            return null;
        }

        else {
            int low = 0;
            int high = arr.length - 1;
            int max = arr[low];
            int i;
            for (i = low; i <= high; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("The maximun number is " + max);
            return max;
        }
    }

    static Integer findMin(int arr[]){
        if(arr == null){
            System.out.println("This array is null.");
            return null;
        }
        if(arr.length == 0){
            System.out.println("This array is empty.");
            return null;
        }
        else {
            int low =0;
            int high = arr.length -1;
            int min = arr[low];
            int i;
            for (i = low; i <= high; i++) {
                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.println("The minimun number is " + min);
            return min;
        }
    }

}
