import java.time.LocalDate;
import java.time.Month;

public interface Swimmable {
     int MAX_DEPTH = 5;

    public void swim(int howFar); // Phương thức để bơi bao xa

    public default void dive(int howDeep) { // Phương thức mặc định để quyết định lặn
        if (isSummer()) {
            System.out.println("OK, sẽ lặn. Nước chắc là ấm.");
        } else {
            System.out.println("Không lặn đâu! Nước lạnh quá.");
        }
    };

    // Phương thức tĩnh kiểm tra xem có phải mùa hè không
    static boolean isSummer() {
        Month month = LocalDate.now().getMonth();
        return month == Month.JUNE || month == Month.JULY || month == Month.AUGUST;
    }
}
