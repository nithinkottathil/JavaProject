package com.gadgeon.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.gadgeon.model.Employee;
import com.gadgeon.model.Login;

public class EmployeeDAO {

	public int saveEmp(Employee emp) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
        	System.out.println("start a transaction");
            transaction = session.beginTransaction();
			int id = (int)session.save(emp);
            transaction.commit();
            return id;
        } catch (Exception e) {
        	System.out.println("error occured");
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		return 0;
}
	
	public boolean login(Login login) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
        	System.out.println("start a transaction");
            transaction = session.beginTransaction();
            String hql = "FROM Login l where l.email=:email and l.password=:password";
			Query query = session.createQuery(hql);
			query.setParameter("email", login.getEmail());
			query.setParameter("password", login.getPasword());
			List result = query.list();
            transaction.commit();
            
            if(result.isEmpty()) 
            	return false;
            return true;
        } catch (Exception e) {
        	System.out.println("error occured");
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		return true;
	}
	
	public List<Employee> listEmployees() {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
        	System.out.println("start a transaction");
            transaction = session.beginTransaction();
            String hql = "FROM Employee";
			List<Employee> empList = (List<Employee>)session.createQuery(hql).list();
            transaction.commit();
            return empList;
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
            e.printStackTrace();
        }
		return new ArrayList<Employee>();
	}
	
	public void editEmployee() {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
        	System.out.println("start a transaction");
            transaction = session.beginTransaction();
            String hql = "FROM Employee";
			List<Employee> empList = (List<Employee>)session.createQuery(hql).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
            e.printStackTrace();
        }
	}
	
	public void deleteEmployee(int id) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
        	System.out.println("start a transaction");
            transaction = session.beginTransaction();      
            Employee emp = new Employee();
            emp.setId(id);
            session.delete(emp);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               transaction.rollback();
            }
            e.printStackTrace();
        }
	}
	
	public Employee getEmp(int id) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
			Employee emp = (Employee)session.get(Employee.class, id);
            transaction.commit();
            return emp;
        } catch (Exception e) {
        	System.out.println("error occured");
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		return null;	
}
	public void updateEmp(Employee emp) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
			session.update(emp);
            transaction.commit();
        } catch (Exception e) {
        	System.out.println("error occured");
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
	}
}
	
