package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinV1Test {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("foo, -1, 0", app.items[0].toString());
    }

    @Test
    void compte(){
        Item[] items = new Item[] { new Item("Comté", 2, 4),
                                    new Item("Comté", 360, 10) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Comté", app.items[0].name);
        assertEquals(5, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(11, app.items[1].quality);
        assertEquals(359, app.items[1].sellIn);
    }

    @Test
    void kryptonite(){
        Item[] items = new Item[] { new Item("Kryptonite", 2, 4),
                                    new Item("Kryptonite", 70, 30) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Kryptonite", app.items[0].name);
        assertEquals(4, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(30, app.items[1].quality);
        assertEquals(70, app.items[1].sellIn);

    }

    @Test
    void passVIPConcert(){
        Item[] items = new Item[] { new Item("Pass VIP Concert", 2, 4), new Item("Pass VIP Concert", 10, 50) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Pass VIP Concert", app.items[0].name);
//        assertEquals(7, app.items[0].quality);
//        assertEquals(1, app.items[0].sellIn);
//        assertEquals(50, app.items[1].quality);
//        assertEquals(9, app.items[1].sellIn);
        assertEquals("Pass VIP Concert, 9, 50", app.items[1].toString());
        assertEquals("Pass VIP Concert, 1, 7", app.items[0].toString());
    }

}
