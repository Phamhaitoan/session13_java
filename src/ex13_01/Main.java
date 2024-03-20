package ex13_01;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8,5,8,9,3,0,12,34,45,10};
        //  Tạo HashMap để lưu trữ số lần xuất hiện
        Map<Integer, Integer> countMap = new HashMap<>();

        // Duyệt qua từng phần tử trong mảng
        for (int num : arr) {
            // Kiểm tra xem phần tử đã có trong HashMap hay chưa
            if (countMap.containsKey(num)) {
                // Nếu có, tăng số lần xuất hiện lên 1
                countMap.put(num, countMap.get(num) + 1);
            } else {
                //  thêm phần tử vào HashMap với số lần xuất hiện ban đầu là 1
                countMap.put(num, 1);
            }
        }

        //  Duyệt qua HashMap và in ra số lần xuất hiện của từng phần tử
        for (int key : countMap.keySet()) {
            System.out.println(  key + " xuất hiện " + countMap.get(key) + " lần.");
        }
    }
}
