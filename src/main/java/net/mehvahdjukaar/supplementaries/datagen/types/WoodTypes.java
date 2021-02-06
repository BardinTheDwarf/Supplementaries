package net.mehvahdjukaar.supplementaries.datagen.types;


import net.minecraft.util.ResourceLocation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WoodTypes {
    //nbt translation map
    public static final Map<ResourceLocation,IWoodType> TYPES = new HashMap<>();

    static {
        for (IWoodType w : VanillaWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : AtmosphericWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : AutumnityWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : EndergeticWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : UpgradeAquaticWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : EnhancedMushroomsWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : OuterEndWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : BygWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : PokecubeLegendsWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : PokecubeWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : ForbiddenArcanusWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : ExtendedMushroomsWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : DruidcraftWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : BetterEndWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : BotaniaWoodTypes.values()){
            //TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : GreekFantasyWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : GoodNightSleepWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : OmniWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : MysticalWorldWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : RediscoveredWoodTypes.values()){
            //TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : PremiumWoodWoodTypes.values()){
            //TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : SilentGearWoodTypes.values()){
            //TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : SimplyTeadWoodTypes.values()){
            TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : StructurizeWoodTypes.values()){
            //TYPES.put(w.toResourceLocation(),w);
        }
        for (IWoodType w : TerraqueousWoodTypes.values()){
            //TYPES.put(w.toResourceLocation(),w);
        }
    }
    public static IWoodType fromString(String s){
        if(TYPES.containsKey(new ResourceLocation(s))) return  TYPES.get(s);
        //remove in the future
        else {
            for(ResourceLocation res : TYPES.keySet()) {
                if(res.getPath().equals(s))
                    return TYPES.get(res);
            }
        }
        return VanillaWoodTypes.OAK;
    }

    public static Collection<IWoodType> all(){
        return TYPES.values();
    }


}