package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
final class pno {
    public static com.bytedance.adsdk.vt.lh.vt.lh ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        String strNextString;
        String strNextString2;
        com.bytedance.adsdk.vt.lh.vt.lh lhVarOuw;
        jsonReader.beginObject();
        int iNextInt = 2;
        while (true) {
            strNextString = null;
            lhVarOuw = null;
            if (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                if (!strNextName.equals("d")) {
                    if (!strNextName.equals("ty")) {
                        jsonReader.skipValue();
                    } else {
                        strNextString2 = jsonReader.nextString();
                        break;
                    }
                } else {
                    iNextInt = jsonReader.nextInt();
                }
            } else {
                strNextString2 = null;
                break;
            }
        }
        if (strNextString2 == null) {
            return null;
        }
        switch (strNextString2) {
            case "el":
                lhVarOuw = le.ouw(jsonReader, raVar, iNextInt);
                break;
            case "fl":
                lhVarOuw = fvf.ouw(jsonReader, raVar);
                break;
            case "gf":
                lhVarOuw = jg.ouw(jsonReader, raVar);
                break;
            case "gr":
                ArrayList arrayList = new ArrayList();
                boolean zNextBoolean = false;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "hd":
                            zNextBoolean = jsonReader.nextBoolean();
                            break;
                        case "it":
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                com.bytedance.adsdk.vt.lh.vt.lh lhVarOuw2 = ouw(jsonReader, raVar);
                                if (lhVarOuw2 != null) {
                                    arrayList.add(lhVarOuw2);
                                }
                            }
                            jsonReader.endArray();
                            break;
                        case "nm":
                            strNextString = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                lhVarOuw = new com.bytedance.adsdk.vt.lh.vt.rn(strNextString, arrayList, zNextBoolean);
                break;
            case "gs":
                lhVarOuw = ko.ouw(jsonReader, raVar);
                break;
            case "mm":
                lhVarOuw = jqy.ouw(jsonReader);
                raVar.ouw("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case "rc":
                lhVarOuw = jae.ouw(jsonReader, raVar);
                break;
            case "rd":
                lhVarOuw = cd.ouw(jsonReader, raVar);
                break;
            case "rp":
                lhVarOuw = od.ouw(jsonReader, raVar);
                break;
            case "sh":
                lhVarOuw = bs.ouw(jsonReader, raVar);
                break;
            case "sr":
                lhVarOuw = ksc.ouw(jsonReader, raVar, iNextInt);
                break;
            case "st":
                lhVarOuw = fak.ouw(jsonReader, raVar);
                break;
            case "tm":
                lhVarOuw = uoy.ouw(jsonReader, raVar);
                break;
            case "tr":
                lhVarOuw = lh.ouw(jsonReader, raVar);
                break;
            default:
                com.bytedance.adsdk.vt.le.yu.vt("Unknown shape type ".concat(strNextString2));
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return lhVarOuw;
    }
}
