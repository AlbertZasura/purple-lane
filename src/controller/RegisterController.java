package controller;

import java.util.Vector;

import core.controller.Controller;
import core.model.Model;
import core.view.View;
import model.Users;
import view.RegisterView;

public class RegisterController extends Controller {
	
	private static RegisterController controller;
	
	public static RegisterController getInstance() {
		return controller = (controller == null) ? new RegisterController() : controller;
	}

	@Override
	public View view() {
		return new RegisterView();
	}

	@Override
	public Vector<Model> getAll() {
		return null;
	}
	
	public void insert(String username, Integer roleId, String password) {
		Users u = new Users();
		u.setUsername(username);
		u.setRoleId(roleId);
		u.setPassword(password);
		u.insert();
	}

}
