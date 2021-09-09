package com.capgemeni.Model;

public class Generic<T> {

	T obj;

	Generic(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}

}
