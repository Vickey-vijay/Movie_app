package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f15136b;

    public m0(Context context, w wVar) {
        this.f15135a = context;
        this.f15136b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        if (InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            n0.a(this.f15135a, this.f15136b);
            v vVar = u.f15211a.f15219b;
            if (vVar != null) {
                str = vVar.f15215a;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                n.a(this.f15135a, this.f15136b);
            }
        } catch (Throwable th2) {
            IAlog.b("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project" + th2.toString(), new Object[0]);
        }
    }
}
