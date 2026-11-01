package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class le {
    public static com.bytedance.adsdk.vt.lh.vt.vt ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "p":
                    mwhVarVt = ouw.vt(jsonReader, raVar);
                    break;
                case "s":
                    leVarVt = yu.vt(jsonReader, raVar);
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
        return new com.bytedance.adsdk.vt.lh.vt.vt(strNextString, mwhVarVt, leVarVt, z10, zNextBoolean);
    }
}
