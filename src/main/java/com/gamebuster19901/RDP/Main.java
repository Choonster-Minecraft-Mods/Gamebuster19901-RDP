package com.gamebuster19901.RDP;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

import static com.gamebuster19901.RDP.Main.MODID;
import static com.gamebuster19901.RDP.Main.VERSION;

import com.gamebuster19901.RDP.proxy.key.ClientProxy;
import com.gamebuster19901.RDP.proxy.key.KeyEventHandler;

@Mod(modid = MODID, version = VERSION)
public class Main {
    public static final String MODID = "rdp";
    public static final String VERSION = "0.0.0.0";
    @SidedProxy(clientSide = "com.gamebuster19901.RDP.proxy.key.ClientProxy", serverSide = "com.gamebuster19901.RDP.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
    	
    }
    
    @EventHandler
    public void preInit(FMLInitializationEvent e){
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
    	
    }
}
