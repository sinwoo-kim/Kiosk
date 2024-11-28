package com.example.kiosk.kiosk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    Scanner sc = new Scanner(System.in);
    final private List<Menu> menus = new ArrayList<>();
    final private Menu menu;

    /**
     * [ 생성자를 통한 주입받기 ]
     *
     * @param menu      menu 클래스의 멤버를 사용하기 위함
     * @param menusName 주입받은 가변인자를 menus 리스트에 저장
     */
    public Kiosk(Menu menu, Menu... menusName) {
        this.menu = menu;
        this.menus.addAll(Arrays.asList(menusName));
    }

    /**
     * [ 메인 컨트롤러 메서드 ]
     * showMenu(): 상위 카테고리 메뉴를 출력합니다.
     * menu.selectMenu(): 상위 카테고리 메뉴를 선택&세부 아이템을 출력합니다.
     * menu.selectOption(): 아이템을 선택합니다.
     */
    public void start(){
        try {
            showMenu();
            menu.selectMenu(Integer.parseInt(sc.nextLine()));
            menu.selectOption(Integer.parseInt(sc.nextLine()));
        } catch (IllegalArgumentException e) {
            System.out.println("[ 예외 발생 ] " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }

    // [ 카테고리 메뉴 출력 메서드 ]
    private void showMenu() {
        System.out.println("[ MAIN MENU ]");
        int number = 1;
        for (Menu menu : menus) {
            // 실행 로직
            System.out.println(number++ + "." + menu.getMenuName());
        }
        System.out.println(0 + ". 종료");
        System.out.print("메뉴 번호를 입력하세요 (0 입력 시 종료): ");
    }
}


