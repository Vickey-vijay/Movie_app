package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f18759a;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44970p);
        p10.startActivity(p11);
    }

    public u0(v0 v0Var) {
        this.f18759a = v0Var;
    }

    @JavascriptInterface
    public void onBackButtonPressed() {
        WeakReference weakReference = this.f18759a.f18777q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InternalStoreWebpageActivity) this.f18759a.f18777q.get()).finish();
    }

    @JavascriptInterface
    public void onCancelButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.ignite.m mVar2;
        v0 v0Var = this.f18759a;
        v0Var.f18764d = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        String str = v0Var.f18770j;
        if (str != null) {
            v0Var.f18782v.set(true);
            v0Var.f18781u.set(false);
            com.fyber.inneractive.sdk.ignite.h hVar = v0Var.f18762b;
            r0 r0Var = new r0(v0Var);
            if (!hVar.n() || hVar.o()) {
                for (com.fyber.inneractive.sdk.ignite.r rVar : hVar.f15787h) {
                    if (rVar != null) {
                        rVar.c((hVar.o() ? com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED).a());
                    }
                }
            } else {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = hVar.f15781b;
                    Bundle bundle = hVar.f15782c;
                    hVar.f15783d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.a(r0Var));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    r0Var.a(false);
                }
            }
            com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(new s0(v0Var), 2500L);
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.f18768h;
            if (vVar != null && !v0Var.f18778r && (mVar2 = v0Var.f18764d) != null) {
                v0Var.f18778r = true;
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar2);
            }
        }
        v0 v0Var2 = this.f18759a;
        com.fyber.inneractive.sdk.flow.v vVar2 = v0Var2.f18768h;
        if (vVar2 == null || v0Var2.f18778r || (mVar = v0Var2.f18764d) == null) {
            return;
        }
        v0Var2.f18778r = true;
        vVar2.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onInstallButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var = this.f18759a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        v0Var.f18764d = mVar2;
        v0Var.f18762b.a(v0Var.f18763c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f18766f, mVar2, v0Var.f18768h.f15699a));
        v0 v0Var2 = this.f18759a;
        com.fyber.inneractive.sdk.flow.v vVar = v0Var2.f18768h;
        if (vVar == null || v0Var2.f18779s || (mVar = v0Var2.f18764d) == null) {
            return;
        }
        v0Var2.f18779s = true;
        vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f18759a.f18783w = true;
    }

    @JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f18759a.f18783w = false;
    }

    @JavascriptInterface
    public void onOpenButtonPressed() {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(this.f18759a.f18763c)) {
            v0 v0Var = this.f18759a;
            v0Var.getClass();
            IAlog.f("%smPackageName is null", IAlog.a(v0Var));
            return;
        }
        if (TextUtils.isEmpty(this.f18759a.f18767g)) {
            launchIntentForPackage = com.fyber.inneractive.sdk.util.o.f18599a.getPackageManager().getLaunchIntentForPackage(this.f18759a.f18763c);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            v0 v0Var2 = this.f18759a;
            launchIntentForPackage.setClassName(v0Var2.f18763c, v0Var2.f18767g);
        }
        if (launchIntentForPackage == null) {
            v0 v0Var3 = this.f18759a;
            v0Var3.getClass();
            IAlog.f("%sPackage %s not found", IAlog.a(v0Var3), this.f18759a.f18763c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.fyber.inneractive.sdk.util.o.f18599a, launchIntentForPackage);
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.flow.v vVar = this.f18759a.f18768h;
            if (vVar != null) {
                String simpleName = th2.getClass().getSimpleName();
                String message = th2.getMessage();
                com.fyber.inneractive.sdk.flow.w wVar = vVar.f15699a;
                com.fyber.inneractive.sdk.network.z.a(simpleName, message, wVar.f15746a, wVar.f15747b);
            }
        }
    }

    @JavascriptInterface
    public void onTransitionEnded() {
        this.f18759a.f18784x = false;
    }

    @JavascriptInterface
    public void onTransitionStarting() {
        this.f18759a.f18784x = true;
    }
}
