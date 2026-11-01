package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f22904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f22905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f22906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f22908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I8 f22909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f22910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3076o7 f22911h;

    public J8(AdConfig.ViewabilityConfig viewabilityConfig, T7 t10, C3076o7 c3076o7) {
        ck.p.j(viewabilityConfig, "viewabilityConfig");
        ck.p.j(t10, "visibilityTracker");
        ck.p.j(c3076o7, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f22904a = weakHashMap;
        this.f22905b = weakHashMap2;
        this.f22906c = t10;
        this.f22907d = J8.class.getSimpleName();
        this.f22910g = viewabilityConfig.getImpressionPollIntervalMillis();
        G8 g10 = new G8(this);
        InterfaceC3028m9 interfaceC3028m9 = t10.f23535d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c(VisibilityTracker.TAG, "setVisibilityTrackerListener logger");
        }
        t10.f23539h = g10;
        this.f22908e = handler;
        this.f22909f = new I8(this);
        this.f22911h = c3076o7;
    }

    public final void a(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f22904a.remove(view);
        this.f22905b.remove(view);
        this.f22906c.a(view);
    }
}
