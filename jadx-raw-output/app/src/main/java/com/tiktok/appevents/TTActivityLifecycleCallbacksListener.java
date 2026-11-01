package com.tiktok.appevents;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import jc.b;

/* JADX INFO: loaded from: classes7.dex */
class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f45215d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45217c;

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        b(this.f45216b);
        this.f45217c = System.currentTimeMillis();
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        if (!f45215d) {
            f45215d = false;
        } else {
            a(this.f45217c);
            this.f45216b = System.currentTimeMillis();
            throw null;
        }
    }

    public final void a(@NonNull long j10) {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }

    public final void b(@NonNull long j10) {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }
}
