package com.en;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
dryRun=true,
features={"src/test/resources/features/hello.feature"},
glue="com.en",
plugin={"html:target/cucumber-report/en_hello.html"}
)
public class HelloTest {

}
