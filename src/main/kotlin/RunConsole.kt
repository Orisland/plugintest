import net.mamoe.mirai.alsoLogin
import net.mamoe.mirai.console.MiraiConsole
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.enable
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.load
import net.mamoe.mirai.console.terminal.MiraiConsoleTerminalLoader
import com.orisland.Plugin;
import net.mamoe.mirai.console.plugin.PluginManager

suspend fun main() {
    MiraiConsoleTerminalLoader.startAsDaemon()

    //如果是kotlin
//    PluginMain.load()
//    PluginMain.enable()
    //如果是java
    Plugin.INSTANCE.load()
    Plugin.INSTANCE.enable()

    //下面填机器人信息
    val bot = MiraiConsole.addBot(123456789, "这是密码") {
        fileBasedDeviceInfo()
    }.alsoLogin()

    MiraiConsole.job.join()
}