package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f55790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S7 f55791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4125co f55792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Jm f55793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vi f55794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ti f55795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A6 f55796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public R7 f55797i;

    public final synchronized R7 a() {
        return this.f55797i;
    }

    public final synchronized boolean b(U7 u10) {
        boolean z10;
        if (u10.a() == T7.f55910b) {
            return false;
        }
        if (ck.p.e(u10, this.f55797i.b())) {
            return false;
        }
        List listA = (List) this.f55792d.mo1invoke(this.f55797i.a(), u10);
        boolean z11 = listA != null;
        if (listA == null) {
            listA = this.f55797i.a();
        }
        if (this.f55791c.a(u10, this.f55797i.b())) {
            z10 = true;
        } else {
            u10 = (U7) this.f55797i.b();
            z10 = false;
        }
        if (z10 || z11) {
            R7 r10 = this.f55797i;
            R7 r11 = (R7) this.f55793e.mo1invoke(u10, listA);
            this.f55797i = r11;
            this.f55790b.save(r11);
            AbstractC4223gj.a("Update distribution data: %s -> %s", r10, this.f55797i);
        }
        return z10;
    }

    public final synchronized U7 c() {
        if (!this.f55795g.a()) {
            U7 u10 = (U7) this.f55794f.invoke();
            this.f55795g.b();
            if (u10 != null) {
                b(u10);
            }
        }
        return (U7) this.f55797i.b();
    }

    public final U7 a(U7 u10) {
        U7 u7C;
        this.f55796h.a(this.f55789a);
        synchronized (this) {
            b(u10);
            u7C = c();
        }
        return u7C;
    }

    public Q7(Context context, ProtobufStateStorage protobufStateStorage, S7 s10, InterfaceC4125co interfaceC4125co, Jm jm2, Vi vi2, Ti ti2, A6 a10, R7 r10) {
        this.f55789a = context;
        this.f55790b = protobufStateStorage;
        this.f55791c = s10;
        this.f55792d = interfaceC4125co;
        this.f55793e = jm2;
        this.f55794f = vi2;
        this.f55795g = ti2;
        this.f55796h = a10;
        this.f55797i = r10;
    }

    public final U7 b() {
        this.f55796h.a(this.f55789a);
        return c();
    }
}
