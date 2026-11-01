package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class th {
    public static <T> List<com.bytedance.adsdk.vt.ra.ouw<T>> ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, float f10, osn<T> osnVar, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            raVar.ouw("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (!strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(vm.ouw(jsonReader, raVar, f10, osnVar, false, z10));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(vm.ouw(jsonReader, raVar, f10, osnVar, true, z10));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(vm.ouw(jsonReader, raVar, f10, osnVar, false, z10));
            }
        }
        jsonReader.endObject();
        ouw(arrayList);
        return arrayList;
    }

    public static <T> void ouw(List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = list.get(i11);
            i11++;
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = list.get(i11);
            ouwVar.pno = Float.valueOf(ouwVar2.f11337ra);
            if (ouwVar.f11336lh == null && (t10 = ouwVar2.vt) != null) {
                ouwVar.f11336lh = t10;
                if (ouwVar instanceof com.bytedance.adsdk.vt.ouw.vt.bly) {
                    ((com.bytedance.adsdk.vt.ouw.vt.bly) ouwVar).ouw();
                }
            }
        }
        com.bytedance.adsdk.vt.ra.ouw<T> ouwVar3 = list.get(i10);
        if ((ouwVar3.vt == null || ouwVar3.f11336lh == null) && list.size() > 1) {
            list.remove(ouwVar3);
        }
    }
}
