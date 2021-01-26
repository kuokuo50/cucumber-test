package com.en;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HelloSteps {
	private Hello hello;
	private String hi;
	
	@Given("^測試問候語 \"([^\"]*)\"$")
	public void I_have_a_greeting_application_with(String str) {
		hello = new Hello(str);
	}
	
	@When("^我說你好$")
	public void I_ask_it_to_say_hi() {
		hi = hello.sayHi();
	}
	
	@Then("^我收到 \"([^\"]*)\"$")
	public void I_receive(String expectedHi) {
		assertEquals(expectedHi, hi);
	}
}
