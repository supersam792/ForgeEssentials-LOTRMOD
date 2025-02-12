package com.forgeessentials.jscripting.wrapper.mc.event.fml.common;

import com.forgeessentials.jscripting.wrapper.mc.entity.JsEntityPlayer;
import com.forgeessentials.jscripting.wrapper.mc.event.JsEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.command.ICommandSender;

public class JsPlayerEvent<T extends PlayerEvent> extends JsEvent<T> {

    public JsEntityPlayer getPlayer()
    {
        return JsEntityPlayer.get(_event.player);
    }

    /**
     * @tsd.ignore
     */
    @Override
    public ICommandSender _getSender()
    {
        return _event.player;
    }
}
