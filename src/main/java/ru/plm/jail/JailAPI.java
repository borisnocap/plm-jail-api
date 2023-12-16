package ru.plm.jail;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface JailAPI {

    boolean isPrisoner(Player player);

    boolean isPrisoner(String playerName);

    boolean isInJail(Location location);
}
