package ex13_09;

import java.util.HashMap;

import static java.awt.Color.pink;
import static java.awt.Color.white;

public class Main {
    public static void main(String[] args) {
//        khơi tạo mới
        HashMap<String, Integer> newHash = new HashMap<>();
        newHash.put("red",7);
        newHash.put("yellow",10);
        newHash.put("blue",12);
        newHash.put("white",15);
        newHash.put("black",9);
        System.out.println(newHash);
//        kểm tra tồn tại
        // Kiểm tra sự tồn tại của khóa “red” trong HashMap

        boolean containsKey;
        if (newHash.containsKey("red")) containsKey = true;
        else containsKey = false;

        System.out.println(containsKey); // Output: true

// Kiểm tra sự tồn tại của khóa “pink” trong HashMap

        boolean nonExistingKey = newHash.containsKey("pink");

        System.out.println(nonExistingKey); // Output: false
    }
}
