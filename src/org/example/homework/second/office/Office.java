package org.example.homework.second.office;

public class Office {
    Boss boss;
    SecurityGuard securityGuard;
    Secretary secretary;
    Manager manager;

    public Office(Boss boss, SecurityGuard securityGuard, Secretary secretary, Manager manager) {
        this.boss = boss;
        this.securityGuard = securityGuard;
        this.secretary = secretary;
        this.manager = manager;
    }

    public void workDay() {
        boss.rush(manager);
        manager.scream();
        securityGuard.askForAdvance();
        secretary.calmDown(boss, manager, securityGuard);
    }
}
