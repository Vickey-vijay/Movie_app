package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class rn implements osn<Integer> {
    public static final rn ouw = new rn();

    private rn() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ Integer ouw(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(zih.vt(jsonReader) * f10));
    }
}
