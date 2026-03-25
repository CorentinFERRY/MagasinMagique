package com.magasin;

import org.junit.jupiter.api.Test;

import java.awt.event.ItemListener;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0),new Item("foo", 0, 5) };
        MagasinV1 app = new MagasinV1(items);
        Item[] itemsV2 = new Item[] { new Item("foo", 0, 0),new Item("foo", 0, 5) };
        MagasinV2 appV2 = new MagasinV2(itemsV2);
        app.updateQuality();
        appV2.updateQuality();
        assertEquals(toString(itemsV2),toString(items));
    }

    @Test
    void compte(){
        Item[] items = new Item[] { new Item("Comté", 2, 4),
                new Item("Comté", 360, 10),
                new Item("Comté", -1, 10),
                new Item("Comté", -1, 50)};
        MagasinV1 app = new MagasinV1(items);
        Item[] itemsV2 = new Item[] { new Item("Comté", 2, 4),
                new Item("Comté", 360, 10),
                new Item("Comté", -1, 10),
                new Item("Comté", -1, 50)};
        MagasinV2 appV2 = new MagasinV2(itemsV2);
        app.updateQuality();
        appV2.updateQuality();
        assertEquals(toString(itemsV2),toString(items));
    }

    @Test
    void kryptonite(){
        Item[] items = new Item[] { new Item("Kryptonite", 2, 4),
                new Item("Kryptonite", 70, 30),
                new Item("Kryptonite", -1, 30)};
        MagasinV1 app = new MagasinV1(items);
        Item[] itemsV2 = new Item[] { new Item("Kryptonite", 2, 4),
                new Item("Kryptonite", 70, 30),
                new Item("Kryptonite", -1, 30)};
        MagasinV2 appV2 = new MagasinV2(itemsV2);
        app.updateQuality();
        appV2.updateQuality();
        assertEquals(toString(itemsV2),toString(items));

    }

    @Test
    void passVIPConcert(){
        Item[] items = new Item[] { new Item("Pass VIP Concert", 2, 4),
                new Item("Pass VIP Concert", 11,4),
                new Item("Pass VIP Concert", 10,49),
                new Item("Pass VIP Concert", 5,49),
                new Item("Pass VIP Concert", -1,49)};
        MagasinV1 app = new MagasinV1(items);
        Item[] itemsV2 = new Item[] { new Item("Pass VIP Concert", 2, 4),
                new Item("Pass VIP Concert", 11,4),
                new Item("Pass VIP Concert", 10,49),
                new Item("Pass VIP Concert", 5,49),
                new Item("Pass VIP Concert", -1,49)};
        MagasinV2 appV2 = new MagasinV2(itemsV2);
        app.updateQuality();
        appV2.updateQuality();
        assertEquals(toString(itemsV2),toString(items));
    }

    @Test
    void magicPower(){
        Item[] items = new Item[] {
                new Item("Pouvoirs Magiques",6,10),
                new Item("Pouvoirs Magiques",-1,10)
        };
        MagasinV2 appV2 = new MagasinV2(items);
        appV2.updateQuality();
        assertEquals(8, items[0].quality);
        assertEquals(6, items[1].quality);
    }

    private String toString(Item[] items){
        StringBuilder s = new StringBuilder();
        for (Item item : items){
            s.append(item.toString()+ "\n");
        }
        return s.toString();
    }

}
