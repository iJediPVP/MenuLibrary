package me.ijedi.menulibrary;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    //Enabled
    @Override
    public void onEnable(){
        //Call events
        new MenuListener(this);

        //Log
        this.getLogger().info("MenuLibrary has been enabled!");
    }
}
