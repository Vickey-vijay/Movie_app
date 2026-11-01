package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends com.fyber.inneractive.sdk.dv.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.interstitial.a f14820j;

    public abstract void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity);

    public final void g() {
        try {
            new w(u.EVENT_READY_ON_CLIENT, this.f15746a, (i) this.f15747b).a((String) null);
        } catch (Exception unused) {
        }
    }

    public a(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f14820j = null;
    }
}
