package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Member m = new Member();
        Employee e = new Employee();

        //Medlems listen
        List<Member> members = new ArrayList<>();

        members.add(new Basic("Thomas","220399-3303"));
        members.add(new Full("Katrine","040863-0032"));
        members.add(new Full("Mads","010189-3967"));
        members.add(new Basic("Signe","020302-2342"));
        members.add(new Full("Bent","060493-2341"));

        System.out.println("\n\t\tFitness Medlemmer\n\n"+"Navn\t"+"Cpr\t\t\t"+" Medlemstype\t"+"Pris\n"+"*****************************************");
        for(Member me: members){
            System.out.println(me.getName()+"\t"+ me.getCpr()+"\t\t"+me.getMemberType()+"\t\t"+me.getFee()+"\n"+"–––––––––––––––––––––––––––––––––-------–");

        }
        //Medarbejder listen
      List<Employee> employees = new ArrayList<>();

      employees.add(new Instructor("Klara","220493-0032",22));
      employees.add(new Instructor("Sigrid","209390-2012",12));
      employees.add(new Administration("Morten","290392-1123"));
      employees.add(new Administration("Lise","090483-3992"));

      System.out.println("\n\t\tFitness Ansatte\n\n"+"Navn\t"+"\tCpr\t\t\t"+" Timetal\t"+"Løn\t"+"\tFerie\n"+"**************************************************");
      for(Employee em: employees){
          System.out.println(em.getName()+"\t\t"+em.getCpr()+"\t\t"+em.getHours()+"\t\t"+em.getSalary()+"\t"+em.getVacation()+"\n"+"-----------------–--------------------------------");
      }
        System.out.println("\n \n Medlemmer og Ansatte\n\n"+"Navn"+"\t\tCpr"+"\n***********************");
      for (Member me: members){
          System.out.println(me.getName()+"\t\t"+me.getCpr()+"\n-----------------------");
      }

      for (Employee em: employees){
          System.out.println(em.getName()+"\t\t"+em.getCpr()+"\n-----------------------");
      }




      
     



    }
}
