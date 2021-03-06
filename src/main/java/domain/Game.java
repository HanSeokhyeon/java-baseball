package domain;

public class Game {

    public static final String EXIT_NUMBER = "2";
    private boolean isFinish;

    public Game() {
        this.isFinish = false;
    }

    public boolean isRunning() {
        return !isFinish;
    }

    public void setFinish(MenuNumber menuNumber) {
        if (menuNumber.getMenu().equals(EXIT_NUMBER)) {
            isFinish = true;
        }
    }
}
