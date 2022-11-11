package structural.facade;

public class NonVegVitamin implements Hotel
{
	public Menus getMenus()
	{
		NonVegMenu nv = new NonVegMenu();
		return nv;
	}
}
