package heritage;


import java.io.CharArrayReader;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String neighborhood;
    private LocalDate birthday;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public static void main(String... strings){
        List<Employee> roster = new ArrayList<>();
       // Map<String, Optional<Employee>> m =  roster.stream()
                /*.collect(Collectors.maxBy(Employee::getSalary,
                   Collectors.groupingBy(
                  Comparator.comparing(Employee::getNeighborhood()))));*/

               /* .collect(Collectors.groupingBy(Employee::getNeighborhood,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));*/
/*
                .collect(Collectors.groupingBy(e ->e.getNeighborhood(),
                        Collectors.maxBy((x,y)-> y.getSalary() - x.getSalary())));*/


    }

}


