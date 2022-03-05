package com.example.business;

import com.example.domain.*;
public class EmployeeStockPlan {
    private final int EmployeeShares = 10;
    private final int ManagerShares = 100;
    private final int DirectorShares = 1000;

    public int grantStock(Employee emp) {
        if(emp instanceof Director) {
            return DirectorShares;
        }
        else if(emp instanceof Manager) {
            return ManagerShares;
        }
        else {
            return EmployeeShares;
        }

    }
}
