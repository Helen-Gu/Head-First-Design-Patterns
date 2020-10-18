package headfirst.designpatterns.templatemethod.barista;

public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
