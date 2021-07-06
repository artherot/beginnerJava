package Chapter06;

public class MethodDef {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작");
        hiEveryone(12);         // 12를 전달하여 hiEveryone 호출
        hiEveryone(13);         // 13을 전달하여 hiEveryone 호출
    }

    public static void  hiEveryone(int age) {
        System.out.println("좋은 아침이니다.");
        System.out.println("제 나이는 " + age + "세 입니다.");
    }
}
