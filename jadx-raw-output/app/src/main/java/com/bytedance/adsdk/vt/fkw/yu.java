package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yu {
    public static com.bytedance.adsdk.vt.lh.ouw.vt ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, boolean z10) throws IOException {
        return new com.bytedance.adsdk.vt.lh.ouw.vt(ouw(jsonReader, z10 ? com.bytedance.adsdk.vt.le.pno.ouw() : 1.0f, raVar, ryl.ouw));
    }

    public static com.bytedance.adsdk.vt.lh.ouw.pno lh(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        return new com.bytedance.adsdk.vt.lh.ouw.pno(ouw(jsonReader, com.bytedance.adsdk.vt.le.pno.ouw(), raVar, pd.ouw));
    }

    public static com.bytedance.adsdk.vt.lh.ouw.le vt(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        return new com.bytedance.adsdk.vt.lh.ouw.le(th.ouw(jsonReader, raVar, com.bytedance.adsdk.vt.le.pno.ouw(), tc.ouw, true));
    }

    public static com.bytedance.adsdk.vt.lh.ouw.ouw yu(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        return new com.bytedance.adsdk.vt.lh.ouw.ouw(ouw(jsonReader, raVar, ra.ouw));
    }

    public static com.bytedance.adsdk.vt.lh.ouw.yu ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        return new com.bytedance.adsdk.vt.lh.ouw.yu(ouw(jsonReader, raVar, rn.ouw));
    }

    public static com.bytedance.adsdk.vt.lh.ouw.lh ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, int i10) throws IOException {
        return new com.bytedance.adsdk.vt.lh.ouw.lh(ouw(jsonReader, raVar, new mwh(i10)));
    }

    public static <T> List<com.bytedance.adsdk.vt.ra.ouw<T>> ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, osn<T> osnVar) throws IOException {
        return th.ouw(jsonReader, raVar, 1.0f, osnVar, false);
    }

    public static <T> List<com.bytedance.adsdk.vt.ra.ouw<T>> ouw(JsonReader jsonReader, float f10, com.bytedance.adsdk.vt.ra raVar, osn<T> osnVar) throws IOException {
        return th.ouw(jsonReader, raVar, f10, osnVar, false);
    }
}
