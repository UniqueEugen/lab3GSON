package work;

import entity.DwarvesBand;

import java.io.FileWriter;
import java.io.IOException;
//gson
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import initialize.BandUtil;


public class Work1 {

    public static void create() {
        DwarvesBand band = BandUtil.createBand();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(band);
        try (FileWriter writer = new FileWriter(BandUtil.JSON_FILE)) {
            gson.toJson(band.getDwarves(), writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
