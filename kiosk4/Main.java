package com.example.kiosk.kiosk4;

public class Main {
    public static void main(String[] args) {
        Menu burgers = new Menu("Burgers");
        Menu drinks = new Menu("Drinks");
        Menu desserts = new Menu("Desserts");

        Kiosk kiosk = new Kiosk(new Menu(), burgers, drinks, desserts);

        /**
         * [ 키오스크 실행 ]
         * RuntimeException 으로 예외 처리한 이유는 런타임 에러 발생할 수 있다고 가정했을 때
         * 에러를 복구하기 위한 의도로 사용되었습니다. 발생된 모든 런타임 에러를 메인 클래스에서 통합 처리합니다.
         */
        while (true) {
            try {
                kiosk.start();
            } catch (RuntimeException e) {
                exceptionHandler(e);
            }
        }
    }
    //공통 예외 처리
    public static void exceptionHandler(RuntimeException e) {
        //공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out); //스택 트레이스 출력
    }
}