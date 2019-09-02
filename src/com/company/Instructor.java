package com.company;

public class Instructor extends Employee {

    public Instructor(String n,String c,int h){
        setName(n);
        setCpr(c);
        setHours(h);

    }
    @Override
    public int getVacation() {
        return 0;
    }

    @Override
    public int getSalary() {

        return getHours()*199;
    }
}
