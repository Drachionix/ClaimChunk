package com.cjburkey.claimchunk.cmds;

import com.cjburkey.claimchunk.ClaimChunk;
import com.cjburkey.claimchunk.Utils;
import com.cjburkey.claimchunk.cmd.Argument;
import com.cjburkey.claimchunk.cmd.ICommand;
import com.cjburkey.claimchunk.cmd.MainHandler;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdAdminUnclaim implements ICommand {

    @Override
    public String getCommand() {
        return "adminunclaim";
    }

    @Override
    public String getDescription() {
        return ClaimChunk.getInstance().getMessages().cmdAdminUnclaim;
    }

    @Override
    public boolean hasPermission(CommandSender sender) {
        return Utils.hasPerm(sender, false, "admin");
    }

    @Override
    public String getPermissionMessage() {
        return ClaimChunk.getInstance().getMessages().unclaimNoPermAdmin;
    }

    @Override
    public Argument[] getPermittedArguments() {
        return new Argument[] {};
    }

    @Override
    public int getRequiredArguments() {
        return 0;
    }

    @Override
    public boolean onCall(String cmdUsed, Player executor, String[] args) {
        MainHandler.unclaimChunk(true, false, executor);
        return true;
    }

}
