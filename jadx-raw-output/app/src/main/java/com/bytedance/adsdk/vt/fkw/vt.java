package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vt {
    public static com.bytedance.adsdk.vt.lh.ouw.cf ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.vt.lh.ouw.cf cfVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (!strNextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                com.bytedance.adsdk.vt.lh.ouw.ouw ouwVarYu = null;
                com.bytedance.adsdk.vt.lh.ouw.ouw ouwVarYu2 = null;
                com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
                com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "t":
                            vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                            break;
                        case "fc":
                            ouwVarYu = yu.yu(jsonReader, raVar);
                            break;
                        case "sc":
                            ouwVarYu2 = yu.yu(jsonReader, raVar);
                            break;
                        case "sw":
                            vtVarOuw = yu.ouw(jsonReader, raVar, true);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                cfVar = new com.bytedance.adsdk.vt.lh.ouw.cf(ouwVarYu, ouwVarYu2, vtVarOuw, vtVarOuw2);
            }
        }
        jsonReader.endObject();
        if (cfVar == null) {
            return new com.bytedance.adsdk.vt.lh.ouw.cf(null, null, null, null);
        }
        return cfVar;
    }
}
