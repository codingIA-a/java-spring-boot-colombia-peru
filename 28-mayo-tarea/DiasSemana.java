import java.util.concurrent.ThreadLocalRandom;
public class DiasSemana{
    public static void main(String[] args){
        //arreglo estático
        String[] diasSemana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        //generar el número random
        int randomNum = ThreadLocalRandom.current().nextInt(0,7);
        //acceder al arreglo mediante un índice random
        String diaAleatorio = diasSemana[randomNum];

        if(diaAleatorio == "Sábado" || diaAleatorio == "Domingo"){
            System.out.println("El día " + diaAleatorio + " es fin de semana");
        }else{
            System.out.println("El dia " + diaAleatorio + " es día hábil");
        }
    }
}