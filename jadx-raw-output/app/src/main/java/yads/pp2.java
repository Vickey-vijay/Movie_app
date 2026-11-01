package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes10.dex */
public final class pp2 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qp2 f81532c;

    public pp2(qp2 qp2Var) {
        this.f81532c = qp2Var;
    }

    public final /* synthetic */ void a() {
        qp2 qp2Var = this.f81532c;
        if (qp2Var.f81927f != null) {
            qp2Var.a();
        }
    }

    public final void b() {
        qp2 qp2Var = this.f81532c;
        if (qp2Var.f81927f == null || (qp2Var.f81926e & 3) == 0) {
            return;
        }
        qp2Var.a();
    }

    public final void c() {
        this.f81532c.f81925d.post(new Runnable() { // from class: cp.j8
            @Override // java.lang.Runnable
            public final void run() {
                this.f51393b.a();
            }
        });
    }

    public final void d() {
        this.f81532c.f81925d.post(new Runnable() { // from class: cp.k8
            @Override // java.lang.Runnable
            public final void run() {
                this.f51410b.b();
            }
        });
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        if (z10) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        if (this.f81530a && this.f81531b == zHasCapability) {
            if (zHasCapability) {
                d();
            }
        } else {
            this.f81530a = true;
            this.f81531b = zHasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
