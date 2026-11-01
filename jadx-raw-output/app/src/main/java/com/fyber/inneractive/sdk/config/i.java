package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f15119b;

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.f15119b);
        return context != null ? context : this.f15118a;
    }

    public i(Context context, Context context2) {
        h hVar = new h(this);
        this.f15118a = context2;
        if (context instanceof Activity) {
            this.f15119b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(hVar);
        }
    }
}
