package work;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import initialize.BandUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Modifier;

public class Unparserars {
    private 
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.TRANSIENT)
            .create();

    try{
        Reader reader = new FileReader(BandUtil.JSON_FILE);
    }

    {

        // Convert JSON File to Java Object
        // Staff staff = gson.fromJson(reader, Staff.class);

        /*    Software software = gson.fromJson(reader, Software.class);
            System.out.println(software);*/


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
    }

    public Unparserars() throws FileNotFoundException {
    }
}
