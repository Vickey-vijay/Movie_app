package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public final class jo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jm f2852;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2850 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2853 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jg f2851 = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3
        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jo.m2702(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jo.m2702(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jo.m2699(jo.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jo.m2703(jo.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jo.m2702(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jo.m2702(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jo.m2702(jo.this);
        }
    };

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2700(jo joVar) {
        joVar.f2850 = true;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2699(jo joVar, final Activity activity) {
        joVar.f2853.postDelayed(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                jo.m2700(jo.this);
                if (jo.this.f2852 != null) {
                    jo.this.f2852.mo380(activity);
                }
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2702(jo joVar) {
        joVar.f2853.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2703(jo joVar, Activity activity) {
        if (joVar.f2850) {
            joVar.f2850 = false;
            jm jmVar = joVar.f2852;
            if (jmVar != null) {
                jmVar.mo381(activity);
            }
        }
        joVar.f2853.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2704() {
        this.f2853.removeCallbacksAndMessages(null);
        if (this.f2851 != null) {
            jj.m2676().m2678(this.f2851);
            this.f2851 = null;
        }
    }

    public jo(jm jmVar) {
        this.f2852 = jmVar;
        jj.m2676().m2679(this.f2851);
    }
}
