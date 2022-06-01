package ru.netology;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemainIf1000() {
        int actual = service.remain(1000);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemain1000If0() {
        int actual = service.remain(0);
        int expected = 1000;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainIf2500() {
        int actual = service.remain(2500);
        int expected = 500;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCheckSystemIfAmountIncorrect() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {service.remain(-100);});
    }

    @org.testng.annotations.Test
    public void shouldRemainIf999() {
        int actual = service.remain(999);
        int expected = 1;
        org.testng.Assert.assertEquals(actual, expected);
    }
}