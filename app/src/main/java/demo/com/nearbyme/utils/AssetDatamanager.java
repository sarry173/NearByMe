package demo.com.nearbyme.utils;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by MobileProg on 25-May-16.
 */
public class AssetDatamanager
{
    public static String AssetJSONFile ( Context context) throws IOException {
        AssetManager manager = context.getAssets();
        InputStream file = manager.open("customers.json");
        byte[] formArray = new byte[file.available()];
        file.read(formArray);
        file.close();

        return new String(formArray);
    }

}
