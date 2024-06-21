import java.util.HashMap;

public class Maps{
    public static void main(String[] args) {
        //inicializar un hashmap
        HashMap<Integer, String> estudianteDojo = new HashMap<>();

        estudianteDojo.put(1, "Nancy Ninja");
        estudianteDojo.put(2, "Sam Samurai");
        estudianteDojo.put(3, "Walter Wizard");

        //obtener un estudiante por id
        String estudiante1 = estudianteDojo.get(1);
        System.out.println(estudiante1);
        //System.out.println(estudianteDojo);

        String estudiante2 = estudianteDojo.getOrDefault(2, "");
        System.out.println(estudiante2);

        //Eliminar elementos
        estudianteDojo.remove(3);
        for (Integer clave: estudianteDojo.keySet()){
            System.out.println(clave);
        }
    }
}