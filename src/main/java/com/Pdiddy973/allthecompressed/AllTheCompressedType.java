package com.Pdiddy973.allthecompressed;

import com.Pdiddy973.allthecompressed.blocks.atm.*;
import com.Pdiddy973.allthecompressed.blocks.ato.*;
import com.Pdiddy973.allthecompressed.blocks.mekanism.*;
import com.Pdiddy973.allthecompressed.blocks.minecraft.*;
import com.Pdiddy973.allthecompressed.blocks.thermal.*;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


public enum AllTheCompressedType {
    //Minecraft
    GLASS("glass", Glass::new),
    GLOWSTONE("glowstone", Glowstone::new),

    //ATM
    ALLTHEMODIUM("allthemodium", Allthemodium::new),
    VIBRANIUM("vibranium", Vibranium::new),
    UNOBTAINIUM("unobtainium", Unobtainium::new),
    VA_ALLOY("va_alloy", va_alloy::new),
    UA_ALLOY("ua_alloy", ua_alloy::new),
    UV_ALLOY("uv_alloy", uv_alloy::new),

    //ATO
    ALUMINUM("aluminum", Aluminum::new),
    COPPER("copper", Copper::new),
    LEAD("lead", Lead::new),
    NICKEL("nickel", Nickel::new),
    OSMIUM("osmium", Osmium::new),
    PLATINUM("platinum", Platinum::new),
    SILVER("silver", Silver::new),
    TIN("tin", Tin::new),
    URANIUM("uranium", Uranium::new),
    ZINC("zinc", Zinc::new),

    //Mekanism
    STEEL("steel", Steel::new),

    //Thermal
    BRONZE("bronze", Bronze::new),
    CONSTANTAN("constantan", Constantan::new),
    ELECTRUM("electrum", Electrum::new),
    ENDERIUM("enderium", Enderium::new),
    INVAR("invar", Invar::new),
    LUMIUM("lumium", Lumium::new),
    SIGNALUM("signalum", Signalum::new);

    public static final AllTheCompressedType[] VALUES = values();

    public final String name;
    public final Supplier<Block> factory;
    public final List<Block> blocks;

    AllTheCompressedType(String n, Supplier<Block> f) {
        name = n;
        factory = f;
        blocks = new ArrayList<>();
    }
}