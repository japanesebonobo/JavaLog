package jp.techacademy.yuuta.yoshitomi.javalog;

import android.util.Log;

/**
 * Created by yoshitomi on 2017/03/25.
 */
class Dog extends Animal {
    static String to_jp = "犬";

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
