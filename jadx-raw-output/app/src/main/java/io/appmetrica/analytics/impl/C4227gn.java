package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4227gn implements InterfaceC4531t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4581v f56858b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4556u f56857a = new C4556u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mj.g f56859c = kotlin.b.a(new C4201fn(this));

    @Override // io.appmetrica.analytics.impl.InterfaceC4531t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) this.f56859c.getValue());
        return map;
    }

    public C4227gn(Context context) {
        this.f56858b = new C4581v(context);
    }
}
