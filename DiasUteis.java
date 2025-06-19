import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiasUteis {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2025, 6, 10);
        int DiasUteis = 0;

        while (DiasUteis < 7) {
            data = data.plusDays(1);

            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;

            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            if (!fimDeSemana && !feriado) {
                DiasUteis++;
            }

            
        }

        System.out.println(data);
    }    
}
