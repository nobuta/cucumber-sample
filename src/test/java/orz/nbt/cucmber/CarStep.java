package orz.nbt.cucmber;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarStep {

	private Car car;
	
	@Given("^車のタンクには、(\\d+)リットルの燃料が入っている$")
	public void 車のタンクには_リットルの燃料が入っている(int arg1) throws Throwable {
        car = new Car(arg1);
	}

	@When("^運転手は、(\\d+)リットルの燃料を補給した$")
	public void 運転手は_リットルの燃料を補給した(int arg1) throws Throwable {
        car.addFuel(arg1);
	}

	@Then("^タンクには、(\\d+)リットルの燃料が入っている$")
	public void タンクには_リットルの燃料が入っている(int arg1) throws Throwable {
        int actualFuelLevel = car.getFuelLevel();
        assertThat(actualFuelLevel, is(arg1));
	}
}
