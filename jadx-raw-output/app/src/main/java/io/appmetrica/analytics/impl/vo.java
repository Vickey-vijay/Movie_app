package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class vo implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D8 f57854a;

    public vo() {
        this(new D8());
    }

    public vo(D8 d10) {
        this.f57854a = d10;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C4350lh c4350lh) {
        if (!((Y4) c4350lh.f57208l).B() && !TextUtils.isEmpty(o10.f55674b)) {
            try {
                JSONObject jSONObject = new JSONObject(o10.f55674b);
                jSONObject.remove("preloadInfo");
                o10.f55674b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f57854a.a(o10, c4350lh);
    }
}
