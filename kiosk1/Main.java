package com.example.kiosk.kiosk1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //리스트를 만든다.
        List<Kiosk> burgers = new ArrayList<>();
        burgers.add(new Kiosk("shackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new Kiosk("smokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new Kiosk("cheeseBurger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new Kiosk("hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        //리스트 출력
        int number = 1;
        System.out.println("[ SHACKSHACK MENU ]");
        for(Kiosk burger : burgers) {
            System.out.println(number + "." + burger.toString());
            number++;
        }

        //입력한 인덱스 값에 따라 인덱스 값을 반환한다.

        System.out.println("종료하시겠습니까? (0을 입력시 종료)");
        Scanner sc = new Scanner(System.in);
        int click = sc.nextInt();

        // 검증 로직
        if(click == 0) {
            System.out.println(click + " <-");
            System.out.println("프로그램을 종료합니다.");
            return;
        }
        // 실행 로직
        System.out.println(click + " <-");
        System.out.println(burgers.get(click));

    }
}
