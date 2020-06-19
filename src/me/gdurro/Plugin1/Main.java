package me.gdurro.Plugin1;

import org.bukkit.plugin.java.JavaPlugin;

import static java.lang.System.out;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        out.println("Ładowanie.....");
        out.println("Załadowano.");

    }

    @Override
    public void onDisable() {
        super.onDisable();
        out.println("Wyłączono plugin.");

    }
}
