
package enumtype;

public class TrafficLightTest {
    public static void main(String[] args) {

        TrafficLight[]lights=TrafficLight.values();
        // boucle for-each to access to Enum elements

        for(TrafficLight light:lights){
            System.out.println("light : " +light.toString()+ " Action : " +light.getAction());
        }


    }
}
