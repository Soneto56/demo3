package com.example;

import com.example.utils.Calculator;
import com.example.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Git 实践项目 - Java 版本");

        // 使用 Calculator 类
        int sum = Calculator.add(15, 25);
        int product = Calculator.multiply(4, 7);

        System.out.println("加法结果: " + sum);
        System.out.println("乘法结果: " + product);

        // 使用 StringUtils 类
        String original = "hello git";
        String capitalized = StringUtils.capitalize(original);

        System.out.println("原始字符串: " + original);
        System.out.println("首字母大写: " + capitalized);

        // 测试空值检查
        System.out.println("是否为空: " + StringUtils.isNullOrEmpty(""));
    }
}