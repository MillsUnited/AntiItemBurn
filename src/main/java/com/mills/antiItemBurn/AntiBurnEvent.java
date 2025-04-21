package com.mills.antiItemBurn;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class AntiBurnEvent implements Listener {

    @EventHandler
    public void onItemBurn(EntityDamageEvent e) {
        Entity entity = e.getEntity();

        if (entity instanceof Item) {
            if (e.getCause() == EntityDamageEvent.DamageCause.LAVA || e.getCause()
                    == EntityDamageEvent.DamageCause.FIRE_TICK || e.getCause()
                    == EntityDamageEvent.DamageCause.FIRE) {
                e.setCancelled(true);
            }
        }
    }
}
