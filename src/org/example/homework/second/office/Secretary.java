package org.example.homework.second.office;

public class Secretary {
    public Secretary() {
    }

    public void calmDown(Boss boss, Manager manager, SecurityGuard securityGuard) {
        System.out.println(boss.getName() + " не волнуйтесь, " + manager.getName() + " все успеет. " +
                securityGuard.getName() + " - подождите!");
    }
}
