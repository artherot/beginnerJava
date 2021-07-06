package Chapter06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }

    public static void showHi(int cnt) {
        System.out.println("Hi ~");
        if(cnt == 1)
            return;
        showHi(cnt--);          // cnt 값이 전달된 다음에 cnt의 값이 감소를 해서 결국 다시 3이 됨, 이로 이해서 무한
        //showHi(--cnt);        // 이걸로 하거나
        //showHi(cnt - 1);      // 이걸로 해야함
    }
}
