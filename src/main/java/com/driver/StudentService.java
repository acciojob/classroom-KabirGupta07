package com.driver;

import java.util.List;

public class StudentService {

    StudentRepository studentRepository = new StudentRepository();
    public void deleteAllTeachers() {
        studentRepository.deleteAllTeacher();
    }

    public void deleteTeacherByName(String teacher) {
        studentRepository.deleteTeacherByName(teacher);
    }

    public List<String> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public List<String> getStudentsByTeacherName(String teacher) {
        return studentRepository.getStudentsByTeacherName(teacher);
    }

    public Teacher getTeacherByName(String name) {
        return studentRepository.getTeacherByName(name);
    }

    public Student getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        studentRepository.addStudentTeacherPair(student, teacher);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }
}
