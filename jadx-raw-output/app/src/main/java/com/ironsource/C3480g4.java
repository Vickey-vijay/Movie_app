package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3480g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MutableContextWrapper f28979a;

    public synchronized void a(Activity activity) {
        if (this.f28979a == null) {
            this.f28979a = new MutableContextWrapper(activity);
        }
        this.f28979a.setBaseContext(activity);
    }

    public synchronized void b() {
        this.f28979a = null;
    }

    public Activity a() {
        return (Activity) this.f28979a.getBaseContext();
    }
}
