package com.tutorialspoint.eclipselink.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-10-18T19:34:58.199-0300")
@StaticMetamodel(Teacher.class)
public class Teacher_ {
	public static volatile SingularAttribute<Teacher, Integer> tid;
	public static volatile SingularAttribute<Teacher, String> tname;
	public static volatile SingularAttribute<Teacher, String> subject;
	public static volatile SetAttribute<Teacher, Clas> clasSet;
}
