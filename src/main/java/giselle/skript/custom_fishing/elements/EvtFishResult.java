package giselle.skript.custom_fishing.elements;

import javax.annotation.Nullable;

import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.registrations.EventValues;
import ch.njol.skript.util.Getter;
import net.momirealms.customfishing.api.event.FishResultEvent;
import net.momirealms.customfishing.fishing.FishResult;

public class EvtFishResult extends SkriptEvent
{
	static
	{
		Skript.registerEvent("CustomFishResult", EvtFishResult.class, FishResultEvent.class, "customfishing result");
		EventValues.registerEventValue(FishResultEvent.class, ItemStack.class, new Getter<ItemStack, FishResultEvent>()
		{
			@Override
			@Nullable
			public ItemStack get(final FishResultEvent e)
			{
				return e.getItemStack();
			}
		}, EventValues.TIME_NOW);
		EventValues.registerEventValue(FishResultEvent.class, FishResult.class, new Getter<FishResult, FishResultEvent>()
		{
			@Override
			@Nullable
			public FishResult get(final FishResultEvent e)
			{
				return e.getResult();
			}
		}, EventValues.TIME_NOW);
	}

	@Override
	public boolean init(Literal<?>[] args, int matchedPattern, ParseResult parseResult)
	{
		return true;
	}

	@Override
	public String toString(@Nullable Event e, boolean debug)
	{
		return "customfishing result";
	}

	@Override
	public boolean check(Event event)
	{
		return true;
	}

}
