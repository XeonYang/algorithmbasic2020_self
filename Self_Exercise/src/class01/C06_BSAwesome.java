package class01;

// 注意题目是随便一个最小值
public class C06_BSAwesome {
    public static int getLessIndex(int[] arr) {
        // 异常边界
        if (arr == null || arr.length == 0) {
            return -1;
        }
        // 第0元素就是答案
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        // 最后一个元素就是答案
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }
        // 不是第一也不是最后1个
        int left = 1;
        int right = arr.length - 2;
    }
}
