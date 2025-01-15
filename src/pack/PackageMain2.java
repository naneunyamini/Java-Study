package pack;

//import pack.a.User; //클래스 명까지 다 import를 해줘야함
//import pack.a.User2;

import pack.a.*; // pack.a의 모든 클래스 사용

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();//import 사용으로 패키지 명 생략 가능함
        User2 user2 = new User2();
    }
}
