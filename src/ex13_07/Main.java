package ex13_07;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        khai báo hashmap gốc
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ferrari",400000);
        hashMap.put("volvo",250000);
        hashMap.put("toyota",90000);
        hashMap.put("vinfast",50000);
        hashMap.put("nissan",270000);
//        khai báo một hashmap mới
        HashMap<String, Integer> newHash = new HashMap<>();
//        sao chép
        newHash.putAll(hashMap);
//        kiểm tra
//        for (Map.Entry<String, Integer> entry : newHash.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//
//            if (!newHash.containsKey(key) || !newHash.get(key).equals(value)) {
//                System.out.println("lỗi " + key + " vơi giá trị " + value + " không tìm thấy");
//            }
//        }
        System.out.println("HashMap gốc:");
        System.out.println(hashMap);
        System.out.println("HashMap mới sao chép:");
        System.out.println(newHash);
    }
}
