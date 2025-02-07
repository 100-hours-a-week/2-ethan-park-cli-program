package domain.Choice;

public enum Choice_Vehicle {
    GASLINECAR(1), ELECTRONICCAR(2), NOMALCIRCLE(3), ELECTRONICCIRCLE(4);

    private int choice;

    Choice_Vehicle(int choice) {
        this.choice = choice;
    }

    public int getChoice() { return choice; }

    public static Choice_Vehicle fromChoice (int choice_user) {
        for (Choice_Vehicle choiceVehicle : Choice_Vehicle.values()) {
            if (choiceVehicle.getChoice() == choice_user) {
                return choiceVehicle;
            }
        }
        return null; // 예외 처리를 위해 null 반환
    }


}