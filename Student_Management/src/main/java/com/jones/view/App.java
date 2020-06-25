package com.jones.view;

import java.util.Scanner;

import com.jones.dao.StudentDao;
import com.jones.model.Student;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	private static StudentDao studentDAO = new StudentDao();

	public static void main(String[] args) {

		System.out.println("The student management program");
		System.out.println("1. Add new student");
		System.out.println("2. Update Student");
		System.out.println("3. Delete Student by NameId");
		System.out.println("4. Exit");
		boolean flag = true;
		while (flag) {
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addNewRealStudent();
				break;
			case 2:
				UpdateStudent();
				break;
			case 3:
				delete();
				break;
			case 4:
				System.out.println("System end");
				flag = false;
				break;
			}

		}
	}

	public static void addNewRealStudent() {
		System.out.println("Add new student function");
		try {
			System.out.print("Input NameId: ");
			// String id=scanner.nextLine();
			int nameId = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Input Name: ");
			String name = scanner.nextLine();
			System.out.print("Input DateOfBirth: ");
			String date = scanner.nextLine();
			System.out.print("Input Nationnal: ");
			String national = scanner.nextLine();
			System.out.print("Input Class: ");
			String clazz = scanner.nextLine();
			System.out.print("Input School: ");
			String school = scanner.nextLine();
			Student student = new Student(nameId, name, date, national, clazz, school);
			studentDAO.addNewStudent(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void UpdateStudent() {
		System.out.println("Update Student");
		try {
			System.out.print("Input NameId");
			int nameId = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Input Name: ");
			String name = scanner.nextLine();
			System.out.print("Input DateOfBirth: ");
			String date = scanner.nextLine();
			
			System.out.print("Input Nationnal: ");
			String national = scanner.nextLine();
			System.out.print("Input Class: ");
			String clazz = scanner.nextLine();
			System.out.print("Input School: ");
			String school = scanner.nextLine();
			Student student = new Student(nameId, name, date, national, clazz, school);
			studentDAO.modify(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete() {
		System.out.print("Delete Student");
		try {
			System.out.println("Input NameId");
			int nameId = scanner.nextInt();
			//scanner.nextLine();
			Student student=new Student(nameId);
			studentDAO.delete(student);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
