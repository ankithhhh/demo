package runners;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.ConfigurationParameter;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("feature/SecondSprint/PostRequest.feature")
@SelectClasspathResource("feature/SecondSprint/GetRequest.feature")
@SelectClasspathResource("feature/SecondSprint/PutRequest.feature")
@SelectClasspathResource("feature/SecondSprint/DeleteRequest.feature")

@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps,hooks") 
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-reports.html, json:target/cucumber-reports.json")
@ConfigurationParameter(key = "cucumber.publish", value = "true")
public class SecondTests {
}
