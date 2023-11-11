package work;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Dwarf;
import entity.DwarvesBand;
import initialize.BandUtil;
import serializers.DwarfSerializer;

import java.io.FileWriter;
import java.io.IOException;

public class SerializeWork1 {
    public static void create() {
        DwarvesBand company = BandUtil.createBand();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Dwarf.class, new DwarfSerializer())
                .create();
        String json = gson.toJson(company);
        try (FileWriter writer = new FileWriter(BandUtil.JSON_FILE_SERIOLIZE)) {
            gson.toJson(company.getDwarves(), writer);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
