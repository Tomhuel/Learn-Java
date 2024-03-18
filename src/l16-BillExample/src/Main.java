import org.tomhuel.billapp.domain.Bill;
import org.tomhuel.billapp.presentation.CreateBill;

public class Main {
    public static void main(String[] args) {
        Bill bill = CreateBill.create();
        System.out.println(bill);
    }
}