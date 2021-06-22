package com.dafeng.lib.sort;

/**
 * 快速排序
 * 思路：1.找一个基准点，然后选取L ,R两个指针相互移动
 * 2.大于基准点的放在左边，小于基准点的放在右边
 * 3.当L=R的时候结束
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] arr={2,4,1,3,9,5,7,6,8,0};
//        quickSort(arr,0,arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");
//        }

        maoPaoSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

    }


    //快速排序
    public static void quickSort(int[] arr,int left,int right){
        //校验判断数据异常情况
        if(left>right){
            return ;
        }
        //找一个基准点，取左边点
        int base=arr[left];
        int i=left;
        int j=right;
        //使用while循环，因为不知道循环次数
        //结束条件就是当i指针等于j指针
        while (i!=j){
            //因为取的是left为基准点，所以需要从右指针开始
            //右指针的结束条件是当前的数据要小于基准点的数据，然后换数据
            while (arr[j]>=base&&i<j){
                j--;
            }
            //左边同理也是要找到比基准点大的数据
            while (arr[i]<=base&&i<j){
                i++;
            }
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        //如果i和j相遇了，就停止检索，把基准数和相遇的位置的数交换
        //1.把相遇位置的元素赋值给基准位置的元素
        arr[left]=arr[i];
        //2.把基准数的位置确定了
        arr[i]=base;
        //以上就实现了基准数的归位，左边的数就比基准数小，右边的位置就比基准数大

        //下面就需要调用递归算法取排基准数两边的数据了

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    //冒泡排序
    public static void maoPaoSort(int[] arr){
        if (arr==null||arr.length==0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1]>arr[j]) {
                    int tem=arr[j+1];
                    arr[j=1]=arr[j];
                    arr[j]=tem;
                }
            }
        }



    }


}