package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class Kj extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ck.p.j(network, "network");
        ConcurrentHashMap concurrentHashMap = Lj.f23091a;
        ck.p.i("Lj", "access$getTAG$p(...)");
        super.onAvailable(network);
        ((C3305xc) Ji.f22955e.getValue()).b(new I2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ck.p.j(network, "network");
        ConcurrentHashMap concurrentHashMap = Lj.f23091a;
        ck.p.i("Lj", "access$getTAG$p(...)");
        super.onLost(network);
        ((C3305xc) Ji.f22955e.getValue()).b(new I2(10, 4, "lost"));
    }
}
