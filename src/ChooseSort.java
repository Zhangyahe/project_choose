import java.util.Arrays;
/*
 * 选择排序
  * @param null
 * @return {@link null}
 * @throws
 * @author YaHe
 * @date 2020/4/26 22:00
 */
public class ChooseSort {
    public static void main(String[] args) {
        int[] arr = {7,20,16,31,0,7};
        selectionSort(arr);
        for (int a: arr) {
            System.out.println(a);
        }
    }
    private static void selectionSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        //0-n-1
        //1-n-1
        for(int i = 0; i<arr.length-1;i++){
            //最小值在哪个位置上
            int minIndex = i;
            for(int j = i+1 ; j<arr.length;j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr,int i,int minIndex){
        int temp;
        temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    /**
     * 比较用
     * @param arr
     */
    private static void compara(int[] arr){
        Arrays.sort(arr);
    }
}
