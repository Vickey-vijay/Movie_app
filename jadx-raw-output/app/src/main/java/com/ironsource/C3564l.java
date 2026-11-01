package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3564l implements qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f29386a;

    @Override // com.ironsource.qg
    public void a() {
        Activity activity = this.f29386a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }

    public C3564l(Activity activity) {
        this.f29386a = new WeakReference<>(activity);
    }
}
