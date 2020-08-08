package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Feature/Reusable.feature", plugin =
{
 "pretty",
}, glue =
{
 "com.StepDefinition"
}, monochrome = true, dryRun = false)
public class RunnerClass
{

}
