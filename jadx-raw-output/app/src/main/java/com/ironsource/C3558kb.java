package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;

/* JADX INFO: renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3558kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3594mb f29356a;

    /* JADX INFO: renamed from: com.ironsource.kb$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C3558kb f29357a = new C3558kb(null);

        public final a a(String str) {
            ck.p.j(str, "adUnitId");
            this.f29357a.a(str);
            return this;
        }

        public final a a(InterfaceC3632ob interfaceC3632ob) {
            ck.p.j(interfaceC3632ob, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f29357a.a(interfaceC3632ob);
            return this;
        }

        public final a b(String str) {
            ck.p.j(str, "placementName");
            this.f29357a.b(str);
            return this;
        }

        public final C3558kb a() {
            return this.f29357a;
        }
    }

    public /* synthetic */ C3558kb(ck.i iVar) {
        this();
    }

    private C3558kb() {
        this.f29356a = new C3594mb(C3815z7.f31705a.a(), this);
    }

    public final void a() {
        this.f29356a.f();
    }

    public final String b() {
        return this.f29356a.h();
    }

    public final String c() {
        return this.f29356a.i();
    }

    public final String d() {
        return this.f29356a.j();
    }

    public final InterfaceC3576lb.a e() {
        return this.f29356a.k();
    }

    public final AdapterNativeAdViewBinder f() {
        return this.f29356a.l();
    }

    public final String g() {
        return this.f29356a.m();
    }

    public final void h() {
        this.f29356a.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f29356a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.f29356a.b(str);
    }

    public final void a(InterfaceC3632ob interfaceC3632ob) {
        this.f29356a.a(interfaceC3632ob);
    }
}
