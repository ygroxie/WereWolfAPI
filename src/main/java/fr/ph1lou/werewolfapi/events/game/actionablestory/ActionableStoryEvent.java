package fr.ph1lou.werewolfapi.events.game.actionablestory;

import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ActionableStoryEvent extends Event implements Cancellable {

    private final IPlayerWW playerWW;
    private boolean cancel = false;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public ActionableStoryEvent(IPlayerWW playerWW) {
        this.playerWW = playerWW;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public IPlayerWW getPlayerWW() {
        return playerWW;
    }

    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}