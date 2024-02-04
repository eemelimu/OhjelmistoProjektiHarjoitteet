import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private static Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @AfterEach
    void tearDown() {
        account = null;
    }

    @Test
    void getBalance() {
        assertEquals(0, account.getBalance());
    }

    @Test
    void deposit() {
        assertEquals(0, account.getBalance());
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void withdraw() {
        account.deposit(100);
        assertEquals(50, account.withdraw(50));
        assertEquals(0, account.withdraw(51));
    }
}