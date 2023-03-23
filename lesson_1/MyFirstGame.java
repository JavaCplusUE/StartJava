public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        int secretNum = 1;
        int playerNum = 71;
        int num = 1;
        while(playerNum != secretNum) {
            if (playerNum > secretNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            } else if (playerNum < secretNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            }
        }
        System.out.println("Вы Победили!");
    }
}
