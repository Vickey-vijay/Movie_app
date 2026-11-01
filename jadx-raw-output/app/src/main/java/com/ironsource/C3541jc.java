package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3541jc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29275e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile C3541jc f29276f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Cd f29277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f29278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T3 f29280d;

    /* JADX INFO: renamed from: com.ironsource.jc$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final C3541jc a() {
            C3541jc c3541jc = C3541jc.f29276f;
            if (c3541jc == null) {
                synchronized (this) {
                    c3541jc = C3541jc.f29276f;
                    if (c3541jc == null) {
                        c3541jc = new C3541jc(null);
                        C3541jc.f29276f = c3541jc;
                    }
                }
            }
            return c3541jc;
        }

        private a() {
        }

        public final InterfaceC3441e1 a(IronSource.a aVar) {
            ck.p.j(aVar, "adFormat");
            C3541jc c3541jc = C3541jc.f29276f;
            T3 t3B = c3541jc != null ? c3541jc.b() : null;
            C3541jc c3541jc2 = C3541jc.f29276f;
            Cd cdE = c3541jc2 != null ? c3541jc2.e() : null;
            if (t3B != null && cdE != null) {
                return new C3675r3(t3B, cdE, aVar);
            }
            return new C3608n5();
        }
    }

    public /* synthetic */ C3541jc(ck.i iVar) {
        this();
    }

    private C3541jc() {
        this.f29278b = new AtomicBoolean(false);
        this.f29279c = "";
    }

    public static final C3541jc d() {
        return f29275e.a();
    }

    public final T3 b() {
        return this.f29280d;
    }

    public final AtomicBoolean c() {
        return this.f29278b;
    }

    public final Cd e() {
        return this.f29277a;
    }

    public final String f() {
        return this.f29279c;
    }

    public final void g() {
        this.f29278b.set(true);
    }

    public final void a(Cd cd2) {
        this.f29277a = cd2;
    }

    public final void a(String str) {
        ck.p.j(str, "<set-?>");
        this.f29279c = str;
    }

    public final void a(T3 t10) {
        this.f29280d = t10;
    }
}
