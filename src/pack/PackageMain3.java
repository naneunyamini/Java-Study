package pack;

import pack.a.User; //클래스 명이 같은 경우에는 import는 하나만 할 수 있음


public class PackageMain3 {

    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
