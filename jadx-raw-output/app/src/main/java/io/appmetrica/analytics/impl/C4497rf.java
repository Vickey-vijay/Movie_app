package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4497rf implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f57602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final JSONObject f57603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final T7 f57606e;

    @Override // io.appmetrica.analytics.impl.U7
    @NonNull
    public final T7 a() {
        return this.f57606e;
    }

    @NonNull
    public static C4497rf a(@Nullable JSONObject jSONObject) {
        T7 t10;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i10 = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        T7[] t7ArrValues = T7.values();
        int length = t7ArrValues.length;
        while (true) {
            if (i10 >= length) {
                t10 = null;
                break;
            }
            t10 = t7ArrValues[i10];
            if (ck.p.e(t10.f55915a, strOptStringOrNull2)) {
                break;
            }
            i10++;
        }
        return new C4497rf(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, t10 == null ? T7.f55910b : t10);
    }

    @Nullable
    public final JSONObject b() {
        if (!this.f57604c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f57602a);
            if (this.f57603b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f57603b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f57602a);
            jSONObject.put("additionalParams", this.f57603b);
            jSONObject.put("wasSet", this.f57604c);
            jSONObject.put("autoTracking", this.f57605d);
            jSONObject.put("source", this.f57606e.f55915a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f57602a + "', additionalParameters=" + this.f57603b + ", wasSet=" + this.f57604c + ", autoTrackingEnabled=" + this.f57605d + ", source=" + this.f57606e + '}';
    }

    public C4497rf(@Nullable String str, @NonNull JSONObject jSONObject, boolean z10, boolean z11, @NonNull T7 t10) {
        this.f57602a = str;
        this.f57603b = jSONObject;
        this.f57604c = z10;
        this.f57605d = z11;
        this.f57606e = t10;
    }
}
