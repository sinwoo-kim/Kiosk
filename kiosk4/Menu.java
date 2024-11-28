package com.example.kiosk.kiosk4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public String menuName;
    public List<MenuItem> items = new ArrayList<>();
    public String selectMenuName;


    public Menu() {
        initializeItems();
    }

    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }

    /**
     * [ items 리스트 초기화&추가 ]
     * Main 클래스에 둘 경우 Main 클래스에 리스트를 생성해야되는 부분이 걸려서
     * init을 Menu 클래스에 두고 메서드로 호출될 수 있도록 구현했습니다.
     */
    private void initializeItems() {
        items.add(new MenuItem("shakeBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("smokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("cheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        items.add(new MenuItem("hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    /**
     * [ 메뉴 선택 메서드 ]
     * 입력 시 items 리스트를 출력하거나 종료합니다.
     *
     * @param index index로 받은 이유는 추후 키 값을 부여해서 리스트를 뽑으려는 의도입니다
     */
    public void selectMenu(int index) {
        System.out.println(index + " <- 입력하셨습니다.");
        switch (index) {
            case 0:
                System.out.println("키오스크를 종료합니다.");
                System.exit(index);
                break;
            case 1:
                System.out.println("[ Burgers Menu ]");
                selectMenuName = "Burger";
                break;
            case 2:
                System.out.println("[ Drinks Menu ]");
                selectMenuName = "Drink";
                break;
            case 3:
                System.out.println("[ Desserts Menu ]");
                selectMenuName = "Dessert";
                break;
            default:
                throw new IllegalArgumentException("입력값이 허용 범위를 벗어났습니다.: " + index + ". 허용 범위를 확인해주세요.");
        }
        showItems();
    }

    /**
     * [ 아이템 출력 메서드 ]
     */
    public void showItems() {
        int num = 1;
        for (MenuItem item : items) {
            System.out.println(num++ + ". " + item);
        }
        System.out.println(0 + ". 뒤로가기");
        System.out.print("원하는 " + selectMenuName + "를 선택하세요. (0 입력 시 뒤로가기): ");
    }

    /**
     * [ 입력에 따른 처리 ]
     *
     * @param index;
     */
    public void selectOption(int index) {
        System.out.println(index + " <- 입력하셨습니다.");
        if (index > 0 && index < items.size()) {
            System.out.println("선택한 메뉴: " + items.get(index - 1));
            return;
        }
        // 예외 처리
        throw new IllegalArgumentException("입력값이 허용 범위를 벗어났습니다.: " + index + ". 허용 범위를 확인해주세요.");
    }
}

