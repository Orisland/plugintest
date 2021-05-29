package com.orisland;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.console.MiraiConsole;
import net.mamoe.mirai.console.plugin.PluginManager;

public class test {
    public static void main(String[] args) {

        PluginManager.INSTANCE.loadPlugin(Plugin.INSTANCE);
        PluginManager.INSTANCE.enablePlugin(Plugin.INSTANCE);

        Bot bot =  BotFactory.INSTANCE.newBot(2687717861L,"zhaolong123");
        bot.login();
    }
}
