package com.example.EmployeeManagement;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // Get session from HibernateUtil
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            // Create Employee object
            Employee emp = new Employee("dedeep", "Developer", 50000);

            // Save employee
            session.save(emp);

            transaction.commit();
            System.out.println("Employee saved successfully!");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        HibernateUtil.shutdown();
    }
}
