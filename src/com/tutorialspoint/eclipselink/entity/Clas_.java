package com.tutorialspoint.eclipselink.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-10-18T19:33:12.340-0300")
@StaticMetamodel(Clas.class)
public class Clas_ {
	public static volatile SingularAttribute<Clas, Integer> cid;
	public static volatile SingularAttribute<Clas, String> cname;
	public static volatile SetAttribute<Clas, Teacher> teacherSet;
}
