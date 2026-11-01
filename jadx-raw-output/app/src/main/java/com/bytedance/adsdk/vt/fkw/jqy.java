package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
final class jqy {
    public static com.bytedance.adsdk.vt.lh.vt.bly ouw(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.vt.lh.vt.bly.ouw ouwVarOuw = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    ouwVarOuw = com.bytedance.adsdk.vt.lh.vt.bly.ouw.ouw(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.vt.lh.vt.bly(strNextString, ouwVarOuw, zNextBoolean);
    }
}
