package open.developer.learnjava.a02Algorithm;

/**
 * 二分查找
 */
public class A001BinarySearch {

    public static void main(String[] args) {
        // 构造有序数组
        int[] arr = new int[] {1, 2, 5, 6, 8, 10, 17, 20, 24, 25};
        int index = search(arr, 5);
        System.out.println("在数组中搜索24:" + index);
        index = search(arr, 20);
        System.out.println("在数组中搜索20:" + index);
        index = search(arr, 30);
        System.out.println("在数组中搜索30:" + index);
    }

    /**
     * 在给定数组中使用二分查找查找目标项，如果存在返回其在数组中的索引
     * @param arr 有序数组
     * @param target 查找目标
     * @return 如果存在返回其在数组中的索引，否则返回-1
     */
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            // 计算中间位置的索引
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // 以中间位置+1的位置为低位起点，在下次循环查找右半边
                low = mid + 1;
            } else {
                // 以中间位置-1的位置为高位终点，在下次循环查找左半边
                high = mid - 1;
            }
        }
        // 未搜索到返回-1
        return -1;
    }
}
