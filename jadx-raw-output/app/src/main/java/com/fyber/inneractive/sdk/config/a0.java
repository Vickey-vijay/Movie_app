package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f15032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f15033b;

    public a0(IAConfigManager iAConfigManager, Context context) {
        this.f15032a = iAConfigManager;
        this.f15033b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = Omid.f21456a;
            com.fyber.inneractive.sdk.util.r.f18607b.post(new z(this));
        } catch (Throwable unused) {
        }
    }
}
