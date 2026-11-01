package com.bytedance.adsdk.vt.fkw;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
final class jg {
    public static com.bytedance.adsdk.vt.lh.vt.fkw ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        com.bytedance.adsdk.vt.lh.ouw.yu yuVarOuw = null;
        Path.FillType fillType = Path.FillType.WINDING;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.vt.ra raVar2 = null;
        com.bytedance.adsdk.vt.lh.ouw.lh lhVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    leVarVt2 = yu.vt(jsonReader, raVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            lhVarOuw = yu.ouw(jsonReader, raVar, iNextInt);
                        } else if (strNextName2.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    yuVarOuw = yu.ouw(jsonReader, raVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    leVarVt = yu.vt(jsonReader, raVar);
                    break;
                case "t":
                    raVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.vt.lh.vt.ra.LINEAR : com.bytedance.adsdk.vt.lh.vt.ra.RADIAL;
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
        return new com.bytedance.adsdk.vt.lh.vt.fkw(strNextString, raVar2, fillType, lhVarOuw, yuVarOuw == null ? new com.bytedance.adsdk.vt.lh.ouw.yu(Collections.singletonList(new com.bytedance.adsdk.vt.ra.ouw(100))) : yuVarOuw, leVarVt, leVarVt2, null, null, zNextBoolean);
    }
}
