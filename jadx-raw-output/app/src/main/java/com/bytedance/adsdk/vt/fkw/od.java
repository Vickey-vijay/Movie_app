package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class od {
    public static com.bytedance.adsdk.vt.lh.vt.ryl ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        com.bytedance.adsdk.vt.lh.ouw.ryl rylVarOuw = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "c":
                    vtVarOuw = yu.ouw(jsonReader, raVar, false);
                    break;
                case "o":
                    vtVarOuw2 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    rylVarOuw = lh.ouw(jsonReader, raVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.vt.lh.vt.ryl(strNextString, vtVarOuw, vtVarOuw2, rylVarOuw, zNextBoolean);
    }
}
