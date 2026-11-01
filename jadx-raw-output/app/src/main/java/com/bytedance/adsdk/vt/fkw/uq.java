package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class uq implements osn<com.bytedance.adsdk.vt.ra.lh> {
    public static final uq ouw = new uq();

    private uq() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ com.bytedance.adsdk.vt.ra.lh ouw(JsonReader jsonReader, float f10) throws IOException {
        boolean z10;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.vt.ra.lh((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
