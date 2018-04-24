package listConverter;

import java.util.ArrayList;
import java.util.List;
import types.Element;
import types.Model;
import types.Part;
import utilities.UpCast;

public class Main {
	public void display(List<Part> parts) {
		parts.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<Model> models = new ArrayList<>();
		List<String> strings = new ArrayList<>();
		models.add(new Part("Screw","meta"));
		models.add(new Part("Screw cap","metal"));
		models.add(new Element("Arm","Hydraulic"));
		Main main = new Main();
		
		
		main.display(UpCast.cast(models, Part.class));	
//		main.display(UpCast.cast(strings, Part.class));

	}	
}
