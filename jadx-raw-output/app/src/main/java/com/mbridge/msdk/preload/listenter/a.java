package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PreloadListenerEx.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<PreloadListener> f36376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36377b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36378c = false;

    public boolean a() {
        return this.f36378c;
    }

    public void a(boolean z10) {
        this.f36378c = z10;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f36376a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f36376a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f36376a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f36376a.get().onPreloadSucceed();
    }

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f36376a = new WeakReference<>(preloadListener);
        }
    }
}
