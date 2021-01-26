package com.zh;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
dryRun=true,
features={"src/test/resources/features/hello中文.feature"},
plugin={"html:target/cucumber-report/zh_hello.html"}
)
public class HelloTest {

}
