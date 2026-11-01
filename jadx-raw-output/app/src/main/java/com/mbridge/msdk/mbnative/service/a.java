package com.mbridge.msdk.mbnative.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.controller.d;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: NativeProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeController f35977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f35978b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f35979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f35980d;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeProvider.java */
    public class RunnableC0351a implements Runnable {
        public RunnableC0351a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
        }
    }

    public a() {
    }

    public void b(View view, Campaign campaign) {
        q0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f35977a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public void d() {
        a(0, "");
    }

    public void e() {
        a(1, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f35979c.onAdLoadError("current request is loading");
        this.f35979c.b();
    }

    public static void preload(Map<String, Object> map, int i10) {
        q0.c("NativeProvider", "native provider preload");
        new d().a(map, i10);
    }

    public void a(com.mbridge.msdk.mbnative.listener.a aVar) {
        this.f35979c = aVar;
    }

    public String c() {
        NativeController nativeController = this.f35977a;
        return nativeController != null ? nativeController.g() : "";
    }

    public void g() {
        try {
            this.f35977a.i();
        } catch (Exception unused) {
            q0.b("NativeProvider", "release failed");
        }
    }

    public a(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f35979c = aVar;
        this.f35980d = nativeTrackingListener;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f35980d = nativeTrackingListener;
    }

    public void a(Context context, Resources resources, Map<String, Object> map) {
        this.f35977a = new NativeController(this.f35979c, this.f35980d, map, context);
    }

    public void b(View view, List<View> list, Campaign campaign) {
        q0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f35977a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public void a(String str) {
        a(0, str);
    }

    public void a() {
        try {
            this.f35977a.d();
        } catch (Exception unused) {
            q0.b("NativeProvider", "clear cache failed");
        }
    }

    public String b() {
        NativeController nativeController = this.f35977a;
        return nativeController != null ? nativeController.e() : "";
    }

    public void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f35977a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public void a(View view, Campaign campaign) {
        q0.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f35977a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    private void a(int i10, String str) {
        if (this.f35977a != null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f35979c;
            if (aVar != null && aVar.a()) {
                if (v0.h()) {
                    f();
                    return;
                } else {
                    this.f35978b.post(new RunnableC0351a());
                    return;
                }
            }
            com.mbridge.msdk.mbnative.listener.a aVar2 = this.f35979c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.f35977a.a(i10, str);
        }
    }
}
