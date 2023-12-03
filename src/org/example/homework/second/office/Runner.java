package org.example.homework.second.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        SecurityGuard securityGuard = new SecurityGuard("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office(boss, securityGuard, secretary, manager);
        office.workDay();
    }
}
