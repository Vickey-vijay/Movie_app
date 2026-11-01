package com.inmobi.media;

import com.inmobi.media.C2962ji;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2962ji extends AbstractC2836ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2987ki f24620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko f24621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Di f24622c;

    public static final void a(ko koVar, Di di2, C2987ki c2987ki, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        String str = di2.f22534a;
        koVar.getClass();
        ck.p.j(str, "id");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) koVar.f24705b.get(str);
        if (gestureDetectorOnGestureListenerC2785ci2 == null) {
            InterfaceC3028m9 logger = c2987ki.getLogger();
            if (logger != null) {
                ((C3053n9) logger).b(c2987ki.f24686k1, "Source RenderView not found for id: " + di2.f22534a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC2785ci.getWvStateMachine().a(3);
        if (numA != null) {
            int iIntValue = numA.intValue();
            InterfaceC3028m9 logger2 = c2987ki.getLogger();
            if (logger2 != null) {
                ((C3053n9) logger2).b(c2987ki.f24686k1, "Failed to transition to FIRE_AD_FAILED state: " + iIntValue);
            }
            gestureDetectorOnGestureListenerC2785ci2.a("loadWebView", AbstractC3211ti.a(gestureDetectorOnGestureListenerC2785ci.getRoute().f22535b, iIntValue));
        }
    }

    public static final void b(ko koVar, Di di2, C2987ki c2987ki, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) throws JSONException {
        String str = di2.f22534a;
        koVar.getClass();
        ck.p.j(str, "id");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) koVar.f24705b.get(str);
        if (gestureDetectorOnGestureListenerC2785ci2 == null) {
            InterfaceC3028m9 logger = c2987ki.getLogger();
            if (logger != null) {
                ((C3053n9) logger).b(c2987ki.f24686k1, "Source RenderView not found for id: " + di2.f22534a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC2785ci.getWvStateMachine().a(2);
        if (numA == null) {
            c2987ki.b(gestureDetectorOnGestureListenerC2785ci2, di2.f22535b);
            return;
        }
        int iIntValue = numA.intValue();
        InterfaceC3028m9 logger2 = c2987ki.getLogger();
        if (logger2 != null) {
            ((C3053n9) logger2).b(c2987ki.f24686k1, "Failed to transition to FIRE_AD_READY state: " + iIntValue);
        }
        gestureDetectorOnGestureListenerC2785ci2.a("loadWebView", AbstractC3211ti.a(gestureDetectorOnGestureListenerC2785ci.getRoute().f22535b, iIntValue));
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void f(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void g(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void j(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
    }

    public C2962ji(C2987ki c2987ki, ko koVar, Di di2) {
        this.f24620a = c2987ki;
        this.f24621b = koVar;
        this.f24622c = di2;
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void e(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void h(final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        final ko koVar = this.f24621b;
        final Di di2 = this.f24622c;
        final C2987ki c2987ki = this.f24620a;
        Runnable runnable = new Runnable() { // from class: b7.v8
            @Override // java.lang.Runnable
            public final void run() {
                C2962ji.a(koVar, di2, c2987ki, gestureDetectorOnGestureListenerC2785ci);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void i(final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        final ko koVar = this.f24621b;
        final Di di2 = this.f24622c;
        final C2987ki c2987ki = this.f24620a;
        Runnable runnable = new Runnable() { // from class: b7.w8
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C2962ji.b(koVar, di2, c2987ki, gestureDetectorOnGestureListenerC2785ci);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void k(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().k(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, final boolean z10) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        final C2987ki c2987ki = this.f24620a;
        final Di di2 = this.f24622c;
        Runnable runnable = new Runnable() { // from class: b7.u8
            @Override // java.lang.Runnable
            public final void run() {
                C2962ji.a(c2987ki, di2, z10);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void b(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(C2890gk c2890gk) {
        AbstractC2836ei listener;
        ck.p.j(c2890gk, "telemetryOnAdImpression");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(c2890gk);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(HashMap map) {
        ck.p.j(map, "params");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(map);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(String str, HashMap map) {
        AbstractC2836ei listener;
        ck.p.j(str, "eventType");
        ck.p.j(map, "kv");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(str, map);
    }

    @Override // com.inmobi.media.AbstractC2836ei, com.inmobi.media.InterfaceC2736al
    public final void a() {
        AbstractC2836ei listener;
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str, Map map) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, str, map);
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(V1 v10) {
        AbstractC2836ei listener;
        ck.p.j(v10, "audioStatusInternal");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(v10);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(boolean z10) {
        AbstractC2836ei listener;
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z10);
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final void a(String str) {
        AbstractC2836ei listener;
        ck.p.j(str, "data");
        GestureDetectorOnGestureListenerC2785ci adRenderView = this.f24620a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(str);
    }

    public static final void a(C2987ki c2987ki, Di di2, boolean z10) {
        if (c2987ki.getWvStateMachine().a(4) != null) {
            c2987ki.a("loadWebView", AbstractC3211ti.a(di2.f22535b, 307));
        }
        GestureDetectorOnGestureListenerC2785ci adRenderView = c2987ki.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z10);
        }
    }
}
