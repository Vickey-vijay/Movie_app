package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
final class fak {
    public static com.bytedance.adsdk.vt.lh.vt.vm ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        int i10;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar = null;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVarYu = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.vt.vm.ouw ouwVar = null;
        com.bytedance.adsdk.vt.lh.vt.vm.vt vtVar2 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.vt.lh.ouw.yu yuVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            boolean z10 = zNextBoolean;
            int i11 = 1;
            switch (strNextName) {
                case "c":
                    ouwVarYu = yu.yu(jsonReader, raVar);
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            vtVar = vtVar;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        com.bytedance.adsdk.vt.lh.ouw.vt vtVar3 = vtVar;
                        jsonReader.endObject();
                        strNextString2.hashCode();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i10 = 1;
                                raVar.mwh = true;
                                arrayList.add(vtVarOuw2);
                                i11 = i10;
                                vtVar = vtVar3;
                                break;
                            case "o":
                                vtVar = vtVarOuw2;
                                i11 = 1;
                                break;
                            default:
                                i10 = 1;
                                i11 = i10;
                                vtVar = vtVar3;
                                break;
                        }
                    }
                    com.bytedance.adsdk.vt.lh.ouw.vt vtVar4 = vtVar;
                    int i12 = i11;
                    jsonReader.endArray();
                    if (arrayList.size() != i12) {
                        vtVar = vtVar4;
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        zNextBoolean = z10;
                        vtVar = vtVar4;
                    }
                    break;
                case "o":
                    yuVar = yu.ouw(jsonReader, raVar);
                    break;
                case "w":
                    vtVarOuw = yu.ouw(jsonReader, raVar, true);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    ouwVar = com.bytedance.adsdk.vt.lh.vt.vm.ouw.values()[jsonReader.nextInt() - 1];
                    break;
                case "lj":
                    vtVar2 = com.bytedance.adsdk.vt.lh.vt.vm.vt.values()[jsonReader.nextInt() - 1];
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            zNextBoolean = z10;
        }
        boolean z11 = zNextBoolean;
        if (yuVar == null) {
            yuVar = new com.bytedance.adsdk.vt.lh.ouw.yu(Collections.singletonList(new com.bytedance.adsdk.vt.ra.ouw(100)));
        }
        return new com.bytedance.adsdk.vt.lh.vt.vm(strNextString, vtVar, arrayList, ouwVarYu, yuVar, vtVarOuw, ouwVar, vtVar2, fNextDouble, z11);
    }
}
