package me.davidatnip.CustomDias.events;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class events implements Listener {

    @EventHandler
    public void enetitydeath(EntityDeathEvent event) {


        LivingEntity entity = event.getEntity();
        event.getDrops().clear();
        
        if (entity instanceof Zombie){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.BREAD));
        }

        else if (entity instanceof Skeleton){
            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.WITHER_SKELETON_SKULL));
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.STONE_SWORD));
        }

        else if (entity instanceof Wolf){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
        }

        else if (entity instanceof Pig){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.BEEF));
        }
        else if (entity instanceof Cow){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.PORKCHOP));
        }
        else if (entity instanceof Enderman){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.BLAZE_ROD));
        }
        else if (entity instanceof Blaze){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.ENDER_PEARL));
        }

        else if (entity instanceof WitherSkeleton){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.ARROW));

        }
        else if (entity instanceof Chicken){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.MUTTON));
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.WHITE_WOOL));
        }
        else if (entity instanceof Sheep){

            event.setDroppedExp(10);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.CHICKEN));
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.FEATHER));
        }
        else if (entity instanceof Bee) {

            event.setDroppedExp(999999999);
        }
        else if (entity instanceof Wither){

            event.setDroppedExp(999999999);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.DRAGON_EGG));

        }
        else if (entity instanceof EnderDragon){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.NETHER_STAR));

        }
        else if (entity instanceof Snowman){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.LAVA_BUCKET));

        }
        else if (entity instanceof Squid){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.BLACKSTONE));

        }
        else if (entity instanceof Villager){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.IRON_INGOT));

        }
        else if (entity instanceof IronGolem){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.EMERALD));

        }
        else if (entity instanceof WanderingTrader){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.LEAD));

        }
        else if (entity instanceof Strider){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.WATER_BUCKET));

        }
        else if (entity instanceof Piglin){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.CHAINMAIL_BOOTS));

        }
        else if (entity instanceof Spider){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.EGG));

        }
        else if (entity instanceof Llama){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.STRING));

        }
        else if (entity instanceof Phantom){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.ELYTRA));

        }
        else if (entity instanceof Creeper){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.FIREWORK_ROCKET));

        }
        else if (entity instanceof Silverfish){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.END_PORTAL_FRAME));

        }
        else if (entity instanceof Slime){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.HONEY_BLOCK));

        }

        else if (entity instanceof Witch){

            event.setDroppedExp(0);
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.CAULDRON));

        }
        

    }










}
