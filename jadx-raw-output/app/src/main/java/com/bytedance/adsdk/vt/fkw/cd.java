package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class cd {
    public static com.bytedance.adsdk.vt.lh.vt.mwh ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "r":
                    vtVarOuw = yu.ouw(jsonReader, raVar, true);
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
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.vt.lh.vt.mwh(strNextString, vtVarOuw);
    }
}
