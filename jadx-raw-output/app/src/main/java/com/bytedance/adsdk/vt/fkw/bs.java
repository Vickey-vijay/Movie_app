package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class bs {
    public static com.bytedance.adsdk.vt.lh.vt.zih ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.pno pnoVarLh = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ks":
                    pnoVarLh = yu.lh(jsonReader, raVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.vt.lh.vt.zih(strNextString, iNextInt, pnoVarLh, zNextBoolean);
    }
}
