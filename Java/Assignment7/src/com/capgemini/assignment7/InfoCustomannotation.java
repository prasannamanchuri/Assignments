package com.capgemini.assignment7;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface info {
	int Authorid();

	String Author() default "Author name";

	String Supervisor() default "Supervisor name";

	String Date();

	String Time();

	int Version();

	String Description() default "method description";

}

class InfoCustomannotation {
	@info(Authorid = 12, Date = "september 4", Time = "5:50pm", Version = 5)
	double officeid;

	public static void main(String[] args) throws NoSuchFieldException {

		// create Field object
		Field field = InfoCustomannotation.class.getDeclaredField("officeid");

		// apply getAnnotation()
		info i = field.getAnnotation(info.class);

		// print results
		System.out.println("info is:" + i.Authorid() + "\n" + i.Author() + "\n" + i.Supervisor() + "\n" + i.Date() + "\n"
				+ i.Time() + "\n" + i.Version() + "\n" + i.Description());
	}
}