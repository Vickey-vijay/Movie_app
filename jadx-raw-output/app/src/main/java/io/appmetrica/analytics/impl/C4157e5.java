package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4157e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f56636a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f56637b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f56638c;

    public C4157e5(Context context) {
        this.f56638c = context.getApplicationContext();
    }

    public final Ha a(R4 r10, C4462q4 c4462q4, P7 p10, HashMap map) {
        Ha ha2 = (Ha) map.get(r10.toString());
        if (ha2 == null) {
            Ha haA = p10.a(this.f56638c, r10, c4462q4);
            map.put(r10.toString(), haA);
            return haA;
        }
        ha2.a(c4462q4);
        return ha2;
    }
}
