package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class K3 implements InterfaceC3713t7, InterfaceC3713t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xc f26923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3636of f26924b;

    public K3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC3713t7
    public synchronized M3 a(String str) {
        ck.p.j(str, "identifier");
        M3 m3A = this.f26923a.a(str);
        if (m3A.d()) {
            return m3A;
        }
        return this.f26924b.a(str);
    }

    @Override // com.ironsource.InterfaceC3713t7.a
    public synchronized void b(String str) {
        ck.p.j(str, "identifier");
        this.f26923a.b(str);
        this.f26924b.b(str);
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26925a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26925a = iArr;
        }
    }

    public K3(InterfaceC3710t4 interfaceC3710t4, M7 m10, T8 t10) {
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        ck.p.j(m10, "pacingDataRepository");
        ck.p.j(t10, "showCountDataRepository");
        this.f26923a = new Xc(interfaceC3710t4, m10);
        this.f26924b = new C3636of(interfaceC3710t4, t10);
    }

    @Override // com.ironsource.InterfaceC3713t7.a
    public synchronized Object a(String str, O3 o10, InterfaceC3679r7 interfaceC3679r7) {
        Object objA;
        ck.p.j(str, "identifier");
        ck.p.j(o10, "cappingType");
        ck.p.j(interfaceC3679r7, "cappingConfig");
        int i10 = a.f26925a[o10.ordinal()];
        if (i10 == 1) {
            objA = this.f26923a.a(str, o10, interfaceC3679r7);
        } else if (i10 == 2) {
            objA = this.f26924b.a(str, o10, interfaceC3679r7);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Result.a aVar = Result.Companion;
            objA = Result.m3458constructorimpl(mj.r.f64562a);
        }
        return objA;
    }

    public /* synthetic */ K3(InterfaceC3710t4 interfaceC3710t4, M7 m10, T8 t10, int i10, ck.i iVar) {
        interfaceC3710t4 = (i10 & 1) != 0 ? new InterfaceC3710t4.a() : interfaceC3710t4;
        if ((i10 & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            ck.p.i(applicationContext, "getInstance().applicationContext");
            m10 = new Yc(new C3544jf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i10 & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            ck.p.i(applicationContext2, "getInstance().applicationContext");
            t10 = new C3600mf(new C3544jf(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC3710t4, m10, t10);
    }
}
