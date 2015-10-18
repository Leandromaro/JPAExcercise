package com.tutorialspoint.eclipselink.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-10-18T19:24:54.318-0300")
@StaticMetamodel(Employee.class)
public class Employee_ {
	public static volatile SingularAttribute<Employee, Integer> eid;
	public static volatile SingularAttribute<Employee, String> ename;
	public static volatile SingularAttribute<Employee, Double> salary;
	public static volatile SingularAttribute<Employee, String> deg;
	public static volatile SingularAttribute<Employee, Department> department;
}
