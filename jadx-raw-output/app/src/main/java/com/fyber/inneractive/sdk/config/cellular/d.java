package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f15045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f15046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList f15047c = new CopyOnWriteArrayList();

    public abstract void a();

    public abstract void a(a aVar);

    public abstract void a(h hVar);

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList = this.f15047c;
        if (copyOnWriteArrayList == null) {
            IAlog.a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        for (h hVar : copyOnWriteArrayList) {
            if (hVar != null) {
                hVar.a(z0Var);
            }
        }
    }

    public d(Context context) {
        this.f15045a = (TelephonyManager) context.getSystemService("phone");
        this.f15046b = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
