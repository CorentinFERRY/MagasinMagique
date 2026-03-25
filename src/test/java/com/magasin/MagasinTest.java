package com.magasin;

import org.junit.jupiter.api.Test;

import java.awt.event.ItemListener;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        MagasinV1 app = new MagasinV1(items);
        Item[] itemsV2 = new Item[] { new Item("foo", 0, 0) };
        MagasinV2 appV2 = new MagasinV2(itemsV2);
        app.updateQuality();
        appV2.updateQuality();
        assertEquals(toString(itemsV2),toString(items));
    }

    @Test
    void compte(){
        Item[] items = new Item[] { new Item("Comté", 2, 4),
                                    new Item("Comté", 360, 10) };
        MagasinV1 app = new MagasinV1(items);
        Item[] itemsV2 = new Item[] { new Item("Comté", 2, 4),
                new Item("Comté", 360, 10) };
        MagasinV2 appV2 = new MagasinV2(itemsV2);
        app.updateQuality();
        appV2.updateQuality();
        assertEquals(toString(itemsV2),toString(items));
    }

    @Test
    void kryptonite(){
        Item[] items = new Item[] { new Item("Kryptonite", 2, 4),
                                    new Item("Kryptonite", 70, 30) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Kryptonite, 2, 4 Kryptonite, 70, 30", app.items[0].toString()+' '+app.items[1].toString());

    }

    @Test
    void passVIPConcert(){
        Item[] items = new Item[] { new Item("Pass VIP Concert", 2, 4), new Item("Pass VIP Concert", 10, 50) };
        MagasinV1 app = new MagasinV1(items);
        app.updateQuality();
        assertEquals("Pass VIP Concert, 1, 7 Pass VIP Concert, 9, 50", app.items[0].toString()+' '+app.items[1].toString());
    }

    private String toString(Item[] items){
        StringBuilder s = new StringBuilder();
        for (Item item : items){
            s.append(item.toString()+ "\n");
        }
        return s.toString();
    }

}
