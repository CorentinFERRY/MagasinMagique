package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinV2Test {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


}
