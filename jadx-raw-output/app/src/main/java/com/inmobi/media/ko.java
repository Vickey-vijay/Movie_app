package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3028m9 f24704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24705b = new ConcurrentHashMap();

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str) {
        this.f24705b.put(str, gestureDetectorOnGestureListenerC2785ci);
        InterfaceC3028m9 interfaceC3028m9 = this.f24704a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void b(bk.l lVar) {
        ck.p.j(lVar, "action");
        ConcurrentHashMap concurrentHashMap = this.f24705b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC2785ci) entry.getValue()) instanceof C2987ki) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) ((Map.Entry) it.next()).getValue();
            ck.p.h(gestureDetectorOnGestureListenerC2785ci, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            lVar.invoke((C2987ki) gestureDetectorOnGestureListenerC2785ci);
        }
    }

    public ko(InterfaceC3028m9 interfaceC3028m9) {
        this.f24704a = interfaceC3028m9;
    }

    public final void a(String str) {
        ck.p.j(str, "id");
        this.f24705b.remove(str);
        InterfaceC3028m9 interfaceC3028m9 = this.f24704a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + str);
        }
    }

    public final void a(bk.l lVar) {
        ck.p.j(lVar, "action");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) this.f24705b.get("default");
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            lVar.invoke(gestureDetectorOnGestureListenerC2785ci);
        }
        ConcurrentHashMap concurrentHashMap = this.f24705b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!ck.p.e(entry.getKey(), "default")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            lVar.invoke((GestureDetectorOnGestureListenerC2785ci) ((Map.Entry) it.next()).getValue());
        }
    }

    public final GestureDetectorOnGestureListenerC2785ci a(Di di2, Context context, short s10, C3069o0 c3069o0, AdConfig adConfig) {
        Di di3;
        GestureDetectorOnGestureListenerC2785ci c2987ki;
        ck.p.j(di2, "route");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3069o0, "adMetaData");
        ck.p.j(adConfig, "adConfig");
        if (s10 == 0) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24704a;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + di2.f22535b);
            }
            c2987ki = new GestureDetectorOnGestureListenerC2785ci(context, c3069o0.f24931o, c3069o0.f24932p, c3069o0.f24933q, c3069o0.f24934r, 0L, c3069o0.f24935s, c3069o0.f24936t, di2, this, c3069o0, adConfig, 80);
            di3 = di2;
        } else if (s10 == 1) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24704a;
            di3 = di2;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + di3.f22535b);
            }
            c2987ki = new C2987ki(context, c3069o0.f24931o, c3069o0.f24936t, C3069o0.a(c3069o0, null, 4194047), this, di2, adConfig);
        } else {
            InterfaceC3028m9 interfaceC3028m11 = this.f24704a;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s10));
            }
            throw new IllegalArgumentException("Unsupported WebView type: " + ((int) s10));
        }
        a(c2987ki, di3.f22535b);
        return c2987ki;
    }
}
