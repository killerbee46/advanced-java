package com.mvc.mainapplication;

import com.mvc.controller.ControllerApplication;
import com.mvc.model.ModelApplication;
import com.mvc.view.ViewApplication;

public class MainDemo {
public static void main(String[] args) {
	
	ModelApplication model = new ModelApplication();
	ViewApplication view = new ViewApplication();
	ControllerApplication controller = new ControllerApplication(view, model);
	controller.ApplicationControl();
	
}
}
