package open.developer.learnjava.a02Algorithm;

public class A002BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = new int[] {5, 7 , 4, 9, 0};
        System.out.println("数组arr1" +  arrayToString(arr1));
        sort(arr1);
        System.out.println("经过排序结果为" +  arrayToString(arr1));

        int[] arr2 = new int[] {15, 17, 24, 5, 3, 4, 20, 6, 1, 8};
        System.out.println("数组arr2" +  arrayToString(arr2));
        sort(arr2);
        System.out.println("经过排序结果为" +  arrayToString(arr2));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]).append(",");
        }
        if (str.toString().endsWith(",")) {
            str.deleteCharAt(str.length() - 1);
        }
        str.append("]");
        return str.toString();
    }

    /**
     * 使用冒泡排序对一个无序数组进行排序
     * 冒泡排序需要进行数组长度对应的次数的排序，每次排序中需要循环多次比对前后元素
     * @param arr 无序数组
     */
    public static void sort(int[] arr) {
        // 变量i对应排序次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 变量j对应多次比对，此处进行优化，对后面几个元素不进行比对
            // 因为前几次排序每次经过排序已经将当次最大的冒泡(移)到数组最后方
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 前一项大于后一项，则进行元素位置交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
