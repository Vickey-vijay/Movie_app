package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
final class uoy {
    public static com.bytedance.adsdk.vt.lh.vt.th ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.vt.th.ouw ouwVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    vtVarOuw2 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "m":
                    ouwVarOuw = com.bytedance.adsdk.vt.lh.vt.th.ouw.ouw(jsonReader.nextInt());
                    break;
                case "o":
                    vtVarOuw3 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "s":
                    vtVarOuw = yu.ouw(jsonReader, raVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.vt.lh.vt.th(strNextString, ouwVarOuw, vtVarOuw, vtVarOuw2, vtVarOuw3, zNextBoolean);
    }
}
