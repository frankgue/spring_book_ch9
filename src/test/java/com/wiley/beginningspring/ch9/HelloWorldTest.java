package com.wiley.beginningspring.ch9;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldTest {
    ExpressionParser parser;

    @Before
    public void setup() {
        parser = new SpelExpressionParser();
    }
    @Test
    public void helloWorldParsedOK(){
        Expression expression = parser.parseExpression("'Hello World!'");
        String value = expression.getValue(String.class);
        assertThat(value, CoreMatchers.is("Hello World!"));
    }
}
