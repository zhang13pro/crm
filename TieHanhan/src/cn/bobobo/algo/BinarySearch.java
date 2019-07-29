package cn.bobobo.algo;


/**
 * @Author: bobobo
 * @Date: 2019/7/24 15:42
 * @Version：1.0
 */
public class BinarySearch {
    private BinarySearch(){};

    public static int find(Comparable[] arr,Comparable target){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int mid = l + (r-1)/2;
            /*
            * Comparable接口的compareTO()
            * 与目标比较 小于返回负整数
            * */
            if (arr[mid].compareTo(target) == 0){
                return mid;
            }
            if (arr[mid].compareTo(target) < 0) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
