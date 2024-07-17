package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Tag("slow")
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Test
public @interface SlowTest {
}
