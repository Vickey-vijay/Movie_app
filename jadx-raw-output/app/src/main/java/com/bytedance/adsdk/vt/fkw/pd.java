package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pd implements osn<com.bytedance.adsdk.vt.lh.vt.jg> {
    public static final pd ouw = new pd();

    private pd() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ com.bytedance.adsdk.vt.lh.vt.jg ouw(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listOuw = null;
        List<PointF> listOuw2 = null;
        List<PointF> listOuw3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "c":
                        zNextBoolean = jsonReader.nextBoolean();
                        break;
                    case "i":
                        listOuw2 = zih.ouw(jsonReader, f10);
                        break;
                    case "o":
                        listOuw3 = zih.ouw(jsonReader, f10);
                        break;
                    case "v":
                        listOuw = zih.ouw(jsonReader, f10);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listOuw != null && listOuw2 != null && listOuw3 != null) {
                    if (listOuw.isEmpty()) {
                        return new com.bytedance.adsdk.vt.lh.vt.jg(new PointF(), false, Collections.emptyList());
                    }
                    int size = listOuw.size();
                    PointF pointF = listOuw.get(0);
                    ArrayList arrayList = new ArrayList(size);
                    for (int i10 = 1; i10 < size; i10++) {
                        PointF pointF2 = listOuw.get(i10);
                        int i11 = i10 - 1;
                        arrayList.add(new com.bytedance.adsdk.vt.lh.ouw(com.bytedance.adsdk.vt.le.ra.ouw(listOuw.get(i11), listOuw3.get(i11)), com.bytedance.adsdk.vt.le.ra.ouw(pointF2, listOuw2.get(i10)), pointF2));
                    }
                    if (zNextBoolean) {
                        PointF pointF3 = listOuw.get(0);
                        int i12 = size - 1;
                        arrayList.add(new com.bytedance.adsdk.vt.lh.ouw(com.bytedance.adsdk.vt.le.ra.ouw(listOuw.get(i12), listOuw3.get(i12)), com.bytedance.adsdk.vt.le.ra.ouw(pointF3, listOuw2.get(0)), pointF3));
                    }
                    return new com.bytedance.adsdk.vt.lh.vt.jg(pointF, zNextBoolean, arrayList);
                }
                throw new IllegalArgumentException("Shape data was missing information.");
            }
        }
    }
}
