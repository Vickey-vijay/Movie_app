package com.bytedance.adsdk.vt.fkw;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
final class fvf {
    public static com.bytedance.adsdk.vt.lh.vt.ko ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        com.bytedance.adsdk.vt.lh.ouw.yu yuVar = null;
        int iNextInt = 1;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVarYu = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    ouwVarYu = yu.yu(jsonReader, raVar);
                    break;
                case "o":
                    yuVar = yu.ouw(jsonReader, raVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (yuVar == null) {
            yuVar = new com.bytedance.adsdk.vt.lh.ouw.yu(Collections.singletonList(new com.bytedance.adsdk.vt.ra.ouw(100)));
        }
        return new com.bytedance.adsdk.vt.lh.vt.ko(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, ouwVarYu, yuVar, zNextBoolean2);
    }
}
