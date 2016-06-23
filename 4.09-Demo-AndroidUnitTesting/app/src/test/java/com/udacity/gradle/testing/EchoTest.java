package com.udacity.gradle.testing;

import org.junit.Test;

public class EchoTest {
    @Test
    public void verifyEchoResponse() {
        assert Echo.echo("hello").equals("hello");
    }

    @Test
    public void verifyLoggingEchoResponse() {

        assert Echo.echo("hello", false).equals("hello");
    }
}
