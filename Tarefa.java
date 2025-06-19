public class Tarefa {
    public static void main(String[] args) {
        int prioridade = 4;
        int urgencia = 8;

        if(prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa Critica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa Importante");
        } else {
            System.out.println("Tarefa Comum");
        }
    }
}
