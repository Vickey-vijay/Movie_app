package com.inmobi.media;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3126q7 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3051n7 f25145k = new C3051n7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3028m9 f25151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J8 f25152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T7 f25153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f25154i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3076o7 f25155j = new C3076o7(this);

    public final void a(View view) {
        J8 j10;
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f25151f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (ck.p.e(this.f25147b, "video") || ck.p.e(this.f25147b, "audio") || (j10 = this.f25152g) == null) {
            return;
        }
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        j10.f22904a.remove(view);
        j10.f22905b.remove(view);
        j10.f22906c.a(view);
        if (j10.f22904a.isEmpty()) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25151f;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            J8 j11 = this.f25152g;
            if (j11 != null) {
                j11.f22904a.clear();
                j11.f22905b.clear();
                j11.f22906c.a();
                j11.f22908e.removeMessages(0);
                j11.f22906c.b();
            }
            this.f25152g = null;
        }
    }

    public final void b(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f25151f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        T7 t10 = this.f25153h;
        if (t10 != null) {
            t10.a(view);
            if (t10.f23532a.isEmpty()) {
                InterfaceC3028m9 interfaceC3028m10 = this.f25151f;
                if (interfaceC3028m10 != null) {
                    ((C3053n9) interfaceC3028m10).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                T7 t11 = this.f25153h;
                if (t11 != null) {
                    t11.b();
                }
                this.f25153h = null;
            }
        }
        this.f25154i.remove(view);
    }

    public C3126q7(byte b10, String str, int i10, int i11, int i12, InterfaceC3028m9 interfaceC3028m9) {
        this.f25146a = b10;
        this.f25147b = str;
        this.f25148c = i10;
        this.f25149d = i11;
        this.f25150e = i12;
        this.f25151f = interfaceC3028m9;
    }

    public final void a(View view, View view2, Ln ln2, AdConfig.ViewabilityConfig viewabilityConfig, boolean z10) {
        int companionVisibilityMinPercentageViewed;
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(view2, "token");
        ck.p.j(ln2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ck.p.j(viewabilityConfig, "config");
        InterfaceC3028m9 interfaceC3028m9 = this.f25151f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        T7 t10 = this.f25153h;
        if (t10 == null) {
            if (z10) {
                t10 = new S3(viewabilityConfig, this.f25151f);
            } else {
                t10 = new T7(viewabilityConfig, (byte) 1, this.f25151f);
            }
            this.f25153h = t10;
        }
        C3101p7 c3101p7 = new C3101p7(this);
        InterfaceC3028m9 interfaceC3028m10 = t10.f23535d;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).c(VisibilityTracker.TAG, "setVisibilityTrackerListener logger");
        }
        t10.f23539h = c3101p7;
        this.f25154i.put(view, ln2);
        if (z10) {
            companionVisibilityMinPercentageViewed = viewabilityConfig.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.f25150e;
        }
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        t10.a(view, view, view2, companionVisibilityMinPercentageViewed);
    }

    public final void a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f25151f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("HtmlAdTracker", "onActivityStarted");
        }
        J8 j10 = this.f25152g;
        if (j10 != null) {
            ck.p.i(j10.f22907d, "TAG");
            for (Map.Entry entry : j10.f22904a.entrySet()) {
                View view = (View) entry.getKey();
                H8 h10 = (H8) entry.getValue();
                T7 t10 = j10.f22906c;
                View view2 = h10.f22788a;
                int i10 = h10.f22789b;
                t10.getClass();
                ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                t10.a(view, view, view2, i10);
            }
            if (!j10.f22908e.hasMessages(0)) {
                j10.f22908e.postDelayed(j10.f22909f, j10.f22910g);
            }
            j10.f22906c.e();
        }
        T7 t11 = this.f25153h;
        if (t11 != null) {
            t11.e();
        }
    }

    public final J8 a(byte b10, AdConfig.ViewabilityConfig viewabilityConfig) {
        J8 j10 = this.f25152g;
        if (j10 != null) {
            return j10;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f25151f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b10));
        }
        T7 t10 = new T7(viewabilityConfig, b10, this.f25151f);
        InterfaceC3028m9 interfaceC3028m10 = this.f25151f;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b10));
        }
        J8 j11 = new J8(viewabilityConfig, t10, this.f25155j);
        this.f25152g = j11;
        return j11;
    }
}
