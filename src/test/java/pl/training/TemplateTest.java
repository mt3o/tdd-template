package pl.training;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TemplateTest {

    @Test
    public void shouldEvaluateTextWithExpressions() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("firstName", "John");
        parameters.put("lastName", "Smith");

        Template template = new Template("My name is ${firstName} ${lastName}");
        Assert.assertEquals(template.evaluate(parameters), "My name is John Smith");
    }

}
