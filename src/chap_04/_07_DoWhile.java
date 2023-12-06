package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Do While
        int distance = 25; // 전체 이동거리 25m
        int move = 0; // 현재 이동거리 0m
        int height = 2; // 사람 키 2m
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println("반복문 #1");

        //키가 엄청나게 큰 사람?
        move = 0; // 이동거리 초기화
        height = 25; // 키가 25m
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println("반복문 #2");

        // Do While 반복문, 최소 한 번은 반복문 수행
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        } while(move + height < distance);
        System.out.println("도착했습니다.");
        System.out.println("반복문 #3");
    }
}
