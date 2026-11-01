package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
final class fkw {
    public static com.bytedance.adsdk.vt.lh.vt.ouw ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    com.bytedance.adsdk.vt.lh.vt.ouw ouwVar2 = null;
                    while (true) {
                        boolean z10 = false;
                        while (true) {
                            if (!jsonReader.hasNext()) {
                                break;
                            }
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            if (strNextName2.equals("v")) {
                                if (z10) {
                                    ouwVar2 = new com.bytedance.adsdk.vt.lh.vt.ouw(yu.ouw(jsonReader, raVar, true));
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (!strNextName2.equals("ty")) {
                                jsonReader.skipValue();
                            } else if (jsonReader.nextInt() == 0) {
                                z10 = true;
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (ouwVar2 != null) {
                        ouwVar = ouwVar2;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return ouwVar;
    }
}
