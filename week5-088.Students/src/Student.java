/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Student {

    private String name;
    private final String studentNumber;

    public Student(String n,String number) {
        name = n;
        studentNumber = number;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return name + " (" + studentNumber + ")";

    }
}
