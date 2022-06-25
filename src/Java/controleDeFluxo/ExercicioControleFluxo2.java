package Java.controleDeFluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        byte dia = 9;
        switch(dia) {
            case 1:
                System.out.println("Domingo - Fim de semana");
                break;
            case 2:
                System.out.println("Lunes - Dia util");
                break;
            case 3:
                System.out.println("Martes - Dia util");
                break;
            case 4:
                System.out.println("Miercoles - Dia util");
                break;
            case 5:
                System.out.println("Jueves - Dia util");
                break;
            case 6:
                System.out.println("Viernes - Dia util");
                break;
            case 7:
                System.out.println("Sabado - Fim de semana");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
