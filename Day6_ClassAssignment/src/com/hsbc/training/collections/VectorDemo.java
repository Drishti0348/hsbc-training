package com.hsbc.training.collections;

import com.demo.io.entity.Emp;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class VectorDemo {

	public static void main(String[] args) {

		Emp empList[] = new Emp[5];
		for (int i = 0; i < empList.length; i++) {
			empList[i] = new Emp(i, "Emp" + i, "city" + i, 1000 + i);
		}

		Vector<Emp> emp = new Vector<Emp>();
		for (int i = 0; i < empList.length; i++)
			emp.add(empList[i]);

		System.out.println(emp);

		Iterator<Emp> itr = emp.iterator();
		while (itr.hasNext()) {
			String details = itr.next().getName();
			System.out.println(details);
		}

		Enumeration<Emp> enumEmp = emp.elements();
		while (enumEmp.hasMoreElements()) {
			Emp e1 = enumEmp.nextElement();
			System.out.println(e1.getName());
		}

		for (Emp e1 : empList) {
			System.out.println(e1.getName());
		}

	}

}
