package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
final class ksc {
    public static com.bytedance.adsdk.vt.lh.vt.tlj ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.vt.tlj.ouw ouwVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw3 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw4 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw5 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw6 = null;
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
                case "r":
                    vtVarOuw2 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    vtVarOuw3 = yu.ouw(jsonReader, raVar, true);
                    break;
                case "is":
                    vtVarOuw5 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    vtVarOuw4 = yu.ouw(jsonReader, raVar, true);
                    break;
                case "os":
                    vtVarOuw6 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "pt":
                    vtVarOuw = yu.ouw(jsonReader, raVar, false);
                    break;
                case "sy":
                    ouwVarOuw = com.bytedance.adsdk.vt.lh.vt.tlj.ouw.ouw(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.vt.lh.vt.tlj(strNextString, ouwVarOuw, vtVarOuw, mwhVarVt, vtVarOuw2, vtVarOuw3, vtVarOuw4, vtVarOuw5, vtVarOuw6, zNextBoolean, z10);
    }
}
