package giselle.skript.custom_fishing.elements;

import javax.annotation.Nullable;

import org.bukkit.event.Event;

import ch.njol.skript.Skript;
import ch.njol.skript.expressions.base.EventValueExpression;
import ch.njol.skript.lang.ExpressionType;
import net.momirealms.customfishing.fishing.FishResult;

public class ExprResult extends EventValueExpression<FishResult>
{
	static
	{
		Skript.registerExpression(ExprResult.class, FishResult.class, ExpressionType.SIMPLE, "[event-]result");
	}

	public ExprResult()
	{
		super(FishResult.class);
	}

	@Override
	public String toString(@Nullable Event event, boolean debug)
	{
		return "event-result";
	}

}
