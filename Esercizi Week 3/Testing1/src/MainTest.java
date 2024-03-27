import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @org.junit.jupiter.api.Test
    void sum() {
        int result = testing.sum(1, 2);
        assertEquals(3, result, "Somma di 1 + 2 dovrebbe essere 3");
    }
}