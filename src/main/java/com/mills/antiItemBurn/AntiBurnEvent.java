package com.mills.antiItemBurn;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Mob;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class AntiBurnEvent implements Listener {

    @EventHandler
    public void onItemBurn(EntityDamageEvent e) {
        Entity entity = e.getEntity();

        if (entity instanceof Item || entity instanceof Mob) {
            if (e.getCause() == EntityDamageEvent.DamageCause.LAVA || e.getCause()
                    == EntityDamageEvent.DamageCause.FIRE_TICK || e.getCause()
                    == EntityDamageEvent.DamageCause.FIRE || e.getCause() == EntityDamageEvent.DamageCause.DROWNING) {
                e.setCancelled(true);
            }
        }
    }
}
