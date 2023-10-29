package dummy;

import org.testng.annotations.Test;

public class LearnTestng {
	
	@Test
	public void createLead() {
		System.out.println("create Lead");
	}

	@Test(dependsOnMethods = {"mergeLead","createLead","deleteLead"})
	public void editLead() {
		System.out.println("edit lead");

	}
	@Test
	public void deleteLead() {
		System.out.println("delete lead");

	}
	@Test
	public void mergeLead() {
		System.out.println("duplicate lead");

	}
	
}
