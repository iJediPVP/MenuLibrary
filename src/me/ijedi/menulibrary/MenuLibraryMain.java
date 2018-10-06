package me.ijedi.menulibrary;

import org.bukkit.plugin.java.JavaPlugin;

public class MenuLibraryMain extends JavaPlugin {

    //Enabled
    @Override
    public void onEnable(){
        //Call events
        new MenuListener(this);

        //Log
        this.getLogger().info("MenuLibrary has been enabled!");
    }

    //Disabled
    @Override
    public void onDisable(){
        //Log
        this.getLogger().info("MenuLibrary has been disabled!");
    }
}
