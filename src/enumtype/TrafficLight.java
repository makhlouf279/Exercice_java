package enumtype;

public enum TrafficLight {
    RED("Stop"),
    YELLOW("Wait"),
    GREEN("Go");

    private String action;

    // constructeur
    private TrafficLight(String action){
        this.action=action;
    }

    public String getAction() {
        return action;
    }
}
