package com.example.kiosk.kiosk3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // Kiosk 실행
    public void run() {
        start();
        showResult();
    }

    // 메뉴 표시 기능
    public void start() {
        int number = 1;
        for (MenuItem burger : menuItems) {
            // 검증 로직
            if (burger.name.equals("종료")) {
                number = 0;
            }
            // 실행 로직
            System.out.println(number++ + "." + burger.toString());
        }
    }
    // 입력 처리 기능
    public void showResult() {
        System.out.println("인덱스를 입력하면 해당 인덱스가 실행됩니다.");
        while (true) {
            try {
                int click = Integer.parseInt(sc.nextLine());
                // 입력된 숫자에 따른 처리
                if (click == 0) {
                    System.out.println(click + " <- 입력하셨습니다.");
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    break;
                } else if (click >= 0 && click < menuItems.size()) {
                    System.out.println(click + " <- 입력하셨습니다.");
                    System.out.println(click + "." + menuItems.get(click - 1));

                } else {
                    throw new Exception();
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
            } catch (Exception e) {
                System.out.println("인덱스 범위를 확인하세요.");
            }
        }
    }
}
