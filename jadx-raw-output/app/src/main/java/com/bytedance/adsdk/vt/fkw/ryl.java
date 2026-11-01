package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ryl implements osn<Float> {
    public static final ryl ouw = new ryl();

    private ryl() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ Float ouw(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(zih.vt(jsonReader) * f10);
    }
}
