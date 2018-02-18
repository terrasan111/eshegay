package ru.job4j.collections.bank;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class BankTest {

    @Test
    public void getUserAccounts() {
        User user1 = new User("Pavel", "Russia");
        User user2 = new User("Ekaterina", "Ukraina");
        Bank bank = new Bank();
        Account account1 = new Account(100, 123456);
        Account account2 = new Account(500, 654321);
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser(user1.getPassport(), account1);
        bank.addAccountToUser(user2.getPassport(), account2);
        List<Account> expect = new ArrayList<>();
        expect.add(account2);
        List<Account> result = new ArrayList<>();
        result = bank.getUserAccounts(user2.getPassport());
        assertThat(result, is(expect));
    }

   @Test
    public void transferMoneyTest() {
       User user1 = new User("Pavel", "Russia");
       User user2 = new User("Ekaterina", "Ukraina");
       Bank bank = new Bank();
       Account account1 = new Account(100.0, 123456);
       Account account2 = new Account(500.0, 654321);
       bank.addUser(user1);
       bank.addUser(user2);
       bank.addAccountToUser(user1.getPassport(), account1);
       bank.addAccountToUser(user2.getPassport(), account2);
       boolean result = bank.transferMoney("Russia", 123456, "Ukraina", 654321, 100.0);
       boolean expect = true;
       assertThat(result, is(expect));

   }

}