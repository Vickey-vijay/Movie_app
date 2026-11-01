package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.MainThread;
import java.util.Iterator;
import nk.j;
import yads.d10;
import yads.g10;
import yads.g9;
import yads.iu3;
import yads.o02;
import yads.p02;
import yads.pt3;
import yads.v02;

/* JADX INFO: loaded from: classes2.dex */
public class NativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g10 f51047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f51048b = new e();

    @MainThread
    public final void setNativeAdLoadListener(NativeAdLoadListener nativeAdLoadListener) {
        pt3 pt3Var = nativeAdLoadListener != null ? new pt3(nativeAdLoadListener) : null;
        o02 o02Var = this.f51047a.f77584d;
        o02Var.f80885e.a();
        o02Var.f80886f = pt3Var;
        Iterator it = o02Var.f80884d.iterator();
        while (it.hasNext()) {
            v02 v02Var = ((p02) it.next()).f81196b.f80020x;
            v02Var.f83720d = pt3Var;
            v02Var.f83719c.a(pt3Var, null, null);
        }
    }

    public final void loadAd(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        g9 g9VarA = this.f51048b.a(nativeAdRequestConfiguration);
        g10 g10Var = this.f51047a;
        j.d(g10Var.f77583c, null, null, new d10(g10Var, g9VarA, null), 3, null);
    }

    public NativeAdLoader(Context context) {
        this.f51047a = new g10(context, new iu3(context));
    }
}
