package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.v0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f14972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f14974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f14975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g f14976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14977f = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (rVar != null) {
            mVar = rVar.f15004l;
            this.f14973b = rVar.f15003k;
            this.f14972a = rVar.f15002j;
        } else {
            mVar = mVar2;
        }
        return mVar != mVar2 && IAConfigManager.O.E.n() && (v0Var = this.f14972a) != null && v0Var.f18772l;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f14977f = true;
        this.f14974c = null;
    }

    public g(f fVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        this.f14974c = fVar;
        this.f14975d = g1Var;
        this.f14976e = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        PackageInfo packageInfo;
        d0 d0Var;
        v0 v0Var = this.f14972a;
        if (v0Var != null) {
            boolean z10 = this.f14973b;
            if (v0Var.C) {
                g0 g0Var = g0.FAILED;
                IllegalStateException illegalStateException = new IllegalStateException("Store controller is already open");
                context.getClass();
                d0Var = new d0(g0Var, illegalStateException);
            } else {
                v0Var.C = true;
                try {
                    context.getClass();
                } catch (Throwable unused) {
                }
                v0Var.D = true;
                if (v0Var.f18770j.equals("invalid_task_id") && !v0Var.f18786z) {
                    v0Var.f18764d = z10 ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
                }
                v0Var.B = z10;
                if (v0Var.A) {
                    v0Var.d("onInstallationSuccess();");
                } else if (!v0Var.f18786z) {
                    String str = v0Var.f18763c;
                    try {
                        packageInfo = !TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.o.f18599a.getPackageManager().getPackageInfo(str, 0) : null;
                    } catch (Exception unused2) {
                    }
                    if (packageInfo != null) {
                        v0Var.d("onInstallationSuccess();");
                    } else if (z10) {
                        v0Var.f18762b.a(v0Var.f18763c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f18766f, v0Var.f18764d, v0Var.f18768h.f15699a));
                        v0Var.d("onShowInstallStarted();");
                    }
                }
                try {
                    InternalStoreWebpageActivity.startActivity(context, v0Var.f18765e);
                    d0Var = new d0(g0.OPENED_INTERNAL_STORE, null);
                } catch (ActivityNotFoundException e10) {
                    d0Var = new d0(g0.FAILED, e10);
                }
            }
            Throwable th2 = d0Var.f18573b;
            if (th2 == null) {
                IAConfigManager.O.f15024s.a(new h1(new e(this, list, uri), uri.toString()));
                return new b(uri.toString(), q.OPEN_INTERNAL_STORE, "IgniteGooglePlay", null);
            }
            if (list != null) {
                list.add(new j(this.f14972a.f18771k, false, q.OPEN_INTERNAL_STORE, th2.toString()));
            }
            return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController.show has failed");
        }
        return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController is null");
    }
}
