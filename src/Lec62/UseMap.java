package Lec62;

public class UseMap{

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Hardik", 90);
        map.put("Bhesia", 12);
        map.put("Gadhi", 78);
        map.put("uiiate", 45);
        map.put("bosdiwala", 355);
        map.put("Hardik", 98);

        System.out.println(map.containsKey("bosdiwala"));
        System.out.println(map.containsKey("bosdi"));
        System.out.println(map.get("Hardik"));

        System.out.println(map);

    }
}
