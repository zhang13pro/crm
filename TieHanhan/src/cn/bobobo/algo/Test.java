package cn.bobobo.algo;

/**
 * @Author: bobobo
 * @Date: 2019/7/24 16:22
 * @Version：1.0
 */
public class Test {
    public static void main(String[] args) {
        int N = 1000000;
        Integer[] arr = new Integer[N];
        for (int i = 0;i < N;i++){
            arr[i] = new Integer(i);
        }

        for (int i = 0;i < 2*N;i++){
            int v = BinarySearch.find(arr,new Integer(i));
            if (i < N){
                assert v == i;
            }else {
                assert v == -1;
            }
        }
    }
}
