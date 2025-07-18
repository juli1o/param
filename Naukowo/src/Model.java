import java.time.LocalTime;
import java.util.HashMap;

public class Model {
public static HashMap<Integer, String> id_and_description = new HashMap<>();



public static void wpis(int ID, String text){
    id_and_description.put(ID,text);
}


public static void wypisz(int ID){
    System.out.println(id_and_description.get(ID));
}

public static void main(String[] args){
    wpis(1,"Chuj mi w dupe");
    wpis(2,"cwel");
    wpis(3,"dupa");

    wpis(1,"ciekawe czy nadpisze");
    wypisz(1);




}

}
