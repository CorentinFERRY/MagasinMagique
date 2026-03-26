package com.magasin;

class MagasinV2 {
    Item[] items;

    public MagasinV2(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        switch (item.name) {
            case "Kryptonite":
                updateKryptonite(item);
                break;
            case "Comté":
                updateComte(item);
                break;
            case "Pass VIP Concert":
                updateConcertPass(item);
                break;
            case "Pouvoirs Magiques":
                updateMagicPowier(item);
                break;
            default:
                updateNormalItem(item);
                break;
        }
    }

    private void updateMagicPowier(Item item) {
        item.sellIn--;
        item.quality = Math.max(0, item.quality - (item.sellIn < 0 ? 4 : 2));
    }

    private void updateNormalItem(Item item) {
        item.sellIn--;
        item.quality = Math.max(0, item.quality - (item.sellIn < 0 ? 2 : 1));
    }

    private void updateKryptonite(Item item) {
        // Aucune modifications
    }

    private void updateComte(Item item) {
        item.sellIn--;
        int increment = item.sellIn < 0 ? 2 : 1;
        item.quality = Math.min(50, item.quality + increment);
    }

    private void updateConcertPass(Item item) {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
            return;
        }

        int increment = 1;
        if (item.sellIn < 5)
            increment = 3;
        else if (item.sellIn < 10)
            increment = 2;

        item.quality = Math.min(50, item.quality + increment);
    }
}
