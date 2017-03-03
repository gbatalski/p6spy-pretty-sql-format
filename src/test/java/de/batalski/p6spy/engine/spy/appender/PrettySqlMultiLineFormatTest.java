package de.batalski.p6spy.engine.spy.appender;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


/**
 * Created by gbatalski on 03.03.2017.
 */
class PrettySqlMultiLineFormatTest {
    @Test
    void formatMessage() {
        String formattedMessage = new PrettySqlMultiLineFormat().formatMessage(123, "Now", 1234L, "statement", "select * from some_table a where a.property = ?", "select * from some_table a where a.property = '77'");
        assertNotNull(formattedMessage);
    }

}