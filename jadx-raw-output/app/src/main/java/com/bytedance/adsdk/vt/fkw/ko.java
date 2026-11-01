package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
final class ko {
    public static com.bytedance.adsdk.vt.lh.vt.le ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        com.bytedance.adsdk.vt.lh.vt.vm.ouw ouwVar;
        com.bytedance.adsdk.vt.lh.vt.vm.vt vtVar;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.vt.ra raVar2 = null;
        com.bytedance.adsdk.vt.lh.ouw.lh lhVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt2 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.vt.vm.ouw ouwVar2 = null;
        com.bytedance.adsdk.vt.lh.vt.vm.vt vtVar2 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar3 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.vt.lh.ouw.yu yuVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            zNextBoolean = zNextBoolean;
            com.bytedance.adsdk.vt.lh.ouw.vt vtVar4 = vtVar3;
            float f10 = fNextDouble;
            switch (strNextName) {
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.vt.lh.vt.vm.vt vtVar5 = vtVar2;
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            com.bytedance.adsdk.vt.lh.vt.vm.ouw ouwVar3 = ouwVar2;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                            } else {
                                jsonReader.skipValue();
                            }
                            vtVar2 = vtVar5;
                            ouwVar2 = ouwVar3;
                        }
                        com.bytedance.adsdk.vt.lh.vt.vm.ouw ouwVar4 = ouwVar2;
                        com.bytedance.adsdk.vt.lh.vt.vm.vt vtVar6 = vtVar2;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            vtVar4 = vtVarOuw2;
                        } else if (strNextString2.equals("d") || strNextString2.equals("g")) {
                            raVar.mwh = true;
                            arrayList.add(vtVarOuw2);
                        }
                        vtVar2 = vtVar6;
                        ouwVar2 = ouwVar4;
                    }
                    ouwVar = ouwVar2;
                    vtVar = vtVar2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        vtVar3 = vtVar4;
                    } else {
                        vtVar3 = vtVar4;
                    }
                    vtVar2 = vtVar;
                    fNextDouble = f10;
                    ouwVar2 = ouwVar;
                    break;
                case "e":
                    leVarVt2 = yu.vt(jsonReader, raVar);
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "g":
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.hashCode();
                        if (strNextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            lhVarOuw = yu.ouw(jsonReader, raVar, iNextInt);
                        } else if (strNextName3.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "o":
                    yuVar = yu.ouw(jsonReader, raVar);
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "s":
                    leVarVt = yu.vt(jsonReader, raVar);
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "t":
                    raVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.vt.lh.vt.ra.LINEAR : com.bytedance.adsdk.vt.lh.vt.ra.RADIAL;
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "w":
                    vtVarOuw = yu.ouw(jsonReader, raVar, true);
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "lc":
                    ouwVar2 = com.bytedance.adsdk.vt.lh.vt.vm.ouw.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "lj":
                    vtVar2 = com.bytedance.adsdk.vt.lh.vt.vm.vt.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    zNextBoolean = zNextBoolean;
                    vtVar3 = vtVar4;
                    fNextDouble = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    ouwVar = ouwVar2;
                    vtVar = vtVar2;
                    vtVar3 = vtVar4;
                    vtVar2 = vtVar;
                    fNextDouble = f10;
                    ouwVar2 = ouwVar;
                    break;
            }
        }
        com.bytedance.adsdk.vt.lh.vt.vm.ouw ouwVar5 = ouwVar2;
        com.bytedance.adsdk.vt.lh.vt.vm.vt vtVar7 = vtVar2;
        float f11 = fNextDouble;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar8 = vtVar3;
        boolean z10 = zNextBoolean;
        if (yuVar == null) {
            yuVar = new com.bytedance.adsdk.vt.lh.ouw.yu(Collections.singletonList(new com.bytedance.adsdk.vt.ra.ouw(100)));
        }
        return new com.bytedance.adsdk.vt.lh.vt.le(strNextString, raVar2, lhVarOuw, yuVar, leVarVt, leVarVt2, vtVarOuw, ouwVar5, vtVar7, f11, arrayList, vtVar8, z10);
    }
}
