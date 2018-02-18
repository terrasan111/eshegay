package ru.job4j.collections.bank;

import java.util.*;

import static java.util.Arrays.asList;

public class Bank {

     private Map<User, List<Account>> cells = new HashMap<>();

    public void addUser(User user) {
        cells.putIfAbsent(user, null);
    }

    public void deleteUser(User user) {
        cells.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        Set<User> tmp = cells.keySet();
        cells.put(existUser(tmp, passport), asList(account));

        }

    public void deleteAccountFromUser(String passport, Account account) {
        Set<User> tmp = cells.keySet();
        cells.remove(existUser(tmp, passport));
    }

    public List<Account> getUserAccounts(String passport) {
        Set<User> tmp = cells.keySet();
           List<Account> result = cells.get(existUser(tmp, passport));
        return result;
    }

    public boolean transferMoney(String srcPassport, int srcRequisite, String destPassport, int dstRequisite, double amount) {
      boolean result = false;

                   Set<User> tmp2 = cells.keySet();
                   List<Account> list = cells.get(existUser(tmp2, srcPassport));
                   for (Account account : list) {
                      if (account.getValue() >= amount) {
                          List<Account> list2 = cells.get(existUser(tmp2, destPassport));
                          for (Account account2 : list2) {
                             double result2 = account2.getValue();
                             result2 += amount;
                             result = true;
                          }
                      }
               }
      return result;
    }

    public User existUser(Set<User> list, String passport) {
        User tmp2 = new User("", "");
        for (User user2 : list) {
            if (passport.equals(user2.getPassport())) {
                tmp2 = user2;
                break;
            }
        }
        return tmp2;
    }

}
