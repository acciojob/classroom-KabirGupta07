package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentRepository {

    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Teacher> teachers = new HashMap<>();
    HashMap<String, ArrayList<String>> student_teacher_pair = new HashMap<>();

    public List<String> getAllStudents() {
        List<String> list = new ArrayList<>();
        // Iterate through the HashMap and store all the names in a List
        students.forEach((k,v) ->{
            list.add(k);
        });
        return list;
    }

    public ArrayList<String> getStudentsByTeacherName(String teacher) {
        ArrayList<String> students = student_teacher_pair.get(teacher);
        return students;
    }

    public void deleteTeacherByName(String teacher) {
        student_teacher_pair.remove(teacher);
        teachers.remove(teacher);
    }

    public Student getStudentByName(String name){
        return students.get(name);
    }

    public void addTeacher(Teacher teacher) {
        teachers.put(teacher.getName(), teacher);
    }

    public void addStudent(Student student) {
        students.put(student.getName(), student);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        ArrayList<String> list;
        list = student_teacher_pair.get(teacher);
        list.add(student);
        student_teacher_pair.put(teacher, list);
    }

    public Teacher getTeacherByName(String name) {
        return teachers.get(name);
    }

    public void deleteAllTeacher() {
        teachers = new HashMap<>();
    }
}
