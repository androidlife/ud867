package com.udacity;
import com.google.common.base.Strings;
import com.google.gson.Gson;

public class DependencyPerson{
	public DependencyPerson(){
		Gson gson;
	}	

    public String getName() {
        return Strings.emptyToNull("Hello");
    }
}