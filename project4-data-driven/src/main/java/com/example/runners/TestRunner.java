package com.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/example/features/",
        glue = "com.example.steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {}