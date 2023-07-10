package giselle.skript.custom_fishing;

import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

import ch.njol.skript.Skript;
import ch.njol.skript.SkriptAddon;

public class SkCustomFishing extends JavaPlugin
{
	private static SkCustomFishing instance;

	public static SkCustomFishing instance()
	{
		return instance;
	}

	public SkCustomFishing()
	{
		instance = this;
	}

	@Override
	public void onEnable()
	{
		super.onEnable();

		SkriptAddon addon = Skript.registerAddon(this);

		try
		{
			addon.loadClasses(this.getClass().getPackageName(), "elements");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
