package com.applovin.impl.sdk;

import com.applovin.impl.g7;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f9194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f9195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g7 f9196d;

    public static b a(t1 t1Var, a.InterfaceC0044a interfaceC0044a, k kVar) {
        b bVar = new b(t1Var, interfaceC0044a, kVar);
        bVar.a(t1Var.getTimeToLiveMillis());
        return bVar;
    }

    public t1 b() {
        return (t1) this.f9194b.get();
    }

    private b(t1 t1Var, a.InterfaceC0044a interfaceC0044a, k kVar) {
        this.f9194b = new WeakReference(t1Var);
        this.f9195c = new WeakReference(interfaceC0044a);
        this.f9193a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f9193a.f().a(this);
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f9193a.a(x4.f9884b1)).booleanValue() || !this.f9193a.m0().isApplicationPaused()) {
            this.f9196d = g7.a(j10, this.f9193a, new Runnable() { // from class: com.applovin.impl.sdk.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9590b.c();
                }
            });
        }
    }

    public void d() {
        a();
        t1 t1VarB = b();
        if (t1VarB == null) {
            return;
        }
        t1VarB.setExpired();
        a.InterfaceC0044a interfaceC0044a = (a.InterfaceC0044a) this.f9195c.get();
        if (interfaceC0044a == null) {
            return;
        }
        interfaceC0044a.onAdExpired(t1VarB);
    }

    public void a() {
        g7 g7Var = this.f9196d;
        if (g7Var != null) {
            g7Var.a();
            this.f9196d = null;
        }
    }
}
