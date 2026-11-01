package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {
    public static com.bytedance.adsdk.vt.lh.ouw.fkw ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new com.bytedance.adsdk.vt.ouw.vt.bly(raVar, vm.ouw(jsonReader, raVar, com.bytedance.adsdk.vt.le.pno.ouw(), ex.ouw, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false)));
            }
            jsonReader.endArray();
            th.ouw(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.vt.ra.ouw(zih.vt(jsonReader, com.bytedance.adsdk.vt.le.pno.ouw())));
        }
        return new com.bytedance.adsdk.vt.lh.ouw.fkw(arrayList);
    }

    public static com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> vt(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.vt.lh.ouw.fkw fkwVarOuw = null;
        boolean z10 = false;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "k":
                    fkwVarOuw = ouw(jsonReader, raVar);
                    break;
                case "x":
                    if (jsonReader.peek() == JsonToken.STRING) {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    } else {
                        vtVarOuw = yu.ouw(jsonReader, raVar, true);
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z10) {
            raVar.ouw("Lottie doesn't support expressions.");
        }
        if (fkwVarOuw != null) {
            return fkwVarOuw;
        }
        return new com.bytedance.adsdk.vt.lh.ouw.bly(vtVarOuw, vtVarOuw2);
    }
}
