package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinV1Test {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void compte(){
        Item[] items = new Item[] { new Item("Compté", 2, 4) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Compté", app.items[0].name);
    }

    @Test
    void kryptonite(){
        Item[] items = new Item[] { new Item("Kryptonite", 2, 4) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Kryptonite", app.items[0].name);
    }

    @Test
    void passVIPConcert(){
        Item[] items = new Item[] { new Item("Pass VIP Concert", 2, 4) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Pass VIP Concert", app.items[0].name);
    }

}
