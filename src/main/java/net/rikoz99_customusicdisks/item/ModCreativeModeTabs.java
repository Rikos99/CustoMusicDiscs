package net.rikoz99_customusicdisks.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rikoz99_customusicdisks.CustoMusicDisks;

@Mod.EventBusSubscriber(modid = CustoMusicDisks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCreativeModeTabs {
    public static CreativeModeTab MUSIC_DISC_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MUSIC_DISC_TAB = event.registerCreativeModeTab(new ResourceLocation(CustoMusicDisks.MOD_ID, "customusicdiscs_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.CUSTOM_DISK.get()))
                        .title(Component.translatable("creativemodetab.customusicdiscs_tab")));
    }
}
