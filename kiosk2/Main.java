package com.example.kiosk.kiosk2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<MenuItem> burgerList = new ArrayList<>();

        burgerList.add(new MenuItem("shakeBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("smokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("cheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        burgerList.add(new MenuItem("종료"));

        // 세부메뉴 표시
        int number = 1;
        for (MenuItem burger : burgerList) {
            // 검증 로직
            if (burger.name.equals("종료")) {
                number = 0;
            }
            // 실행 로직
            System.out.println(number++ + "." + burger.toString());
        }
        // 사용자 입력(인덱스)에 따른 결과 처리
        while(true) {
        int click = sc.nextInt();
        // 입력된 숫자에 따른 처리
            if(click == 0) {
                System.out.println("프로그램을 종료합니다.");
                sc.close();
                break;
            }
            System.out.println(burgerList.get(click-1));
        }

    }
}
