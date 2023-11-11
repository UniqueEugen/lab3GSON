package work;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import entity.Dwarf;
import entity.DwarvesBand;
import initialize.BandUtil;
import myLibrary.console.Console;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Stream;

public class Unparser {
    public static void unpars() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                //.excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.TRANSIENT)
                .create();

        try( Reader reader = new FileReader(BandUtil.JSON_FILE)) {
            Type collectionType = new TypeToken<List<Dwarf>>(){}.getType();
            List<Dwarf> bandIsBack =  gson.fromJson(reader, collectionType);
            DwarvesBand band = new DwarvesBand(bandIsBack);
            band.toString();

        }catch (Exception e){
            Console.log(e);
        }
    }
  //  {

        // Convert JSON File to Java Object
        // Staff staff = gson.fromJson(reader, Staff.class);

        /*    Software software = gson.fromJson(reader, Software.class);
            System.out.println(software);*/

/*
        Type collectionType = new TypeToken<List<Staff>>() {
        }.getType();
        List<Staff> lcs = (List<Staff>) new Gson()
                .fromJson(reader, collectionType);

        // print staff
        System.out.println(lcs);

    } catch(
    IOException e)

    {
        e.printStackTrace();
    }*/

    public Unparser() throws FileNotFoundException {
    }
}
