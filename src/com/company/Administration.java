package com.company;

public class Administration extends Employee {

    public Administration(String n,String c){
        setName(n);
        setCpr(c);
    }

    @Override
    public int getHours() {
        return 37;
    }

    @Override
    public int getSalary() {
        return 33000;
    }

    @Override
    public int getVacation() {
        return 5;
    }
}
