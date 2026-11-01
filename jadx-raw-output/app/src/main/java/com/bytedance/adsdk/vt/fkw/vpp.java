package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class vpp {
    public static com.bytedance.adsdk.vt.lh.vt.pno ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.vt.lh.vt.pno.ouw ouwVar = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.vt.lh.ouw.pno pnoVarLh = null;
        com.bytedance.adsdk.vt.lh.ouw.yu yuVarOuw = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "o":
                    yuVarOuw = yu.ouw(jsonReader, raVar);
                    break;
                case "pt":
                    pnoVarLh = yu.lh(jsonReader, raVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.hashCode();
                    switch (strNextString) {
                        case "a":
                            ouwVar = com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_ADD;
                            break;
                        case "i":
                            raVar.ouw("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            ouwVar = com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            ouwVar = com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_NONE;
                            break;
                        case "s":
                            ouwVar = com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            com.bytedance.adsdk.vt.le.yu.vt("Unknown mask mode " + strNextName + ". Defaulting to Add.");
                            ouwVar = com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.vt.lh.vt.pno(ouwVar, pnoVarLh, yuVarOuw, zNextBoolean);
    }
}
