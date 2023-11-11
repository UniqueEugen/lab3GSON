package work;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import deserializers.DwarfDeserializer;
import entity.Dwarf;
import entity.DwarvesBand;
import initialize.BandUtil;
import myLibrary.console.Console;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class DeserializeUnparser {
    public static void unpars() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Dwarf.class, new DwarfDeserializer())
                .create();

        try( Reader reader = new FileReader(BandUtil.JSON_FILE_SERIOLIZE)) {
            Type collectionType = new TypeToken<List<Dwarf>>(){}.getType();
            List<Dwarf> bandIsBack =  gson.fromJson(reader, collectionType);
            DwarvesBand band = new DwarvesBand(bandIsBack);
            band.toString();

        }catch (Exception e){
            Console.log(e);
        }
    }
}
