package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23466a;

    public Rh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f23466a = gestureDetectorOnGestureListenerC2785ci;
    }

    public final void a(JSONObject jSONObject) {
        ck.p.j(jSONObject, "jsonObject");
        InterfaceC3028m9 interfaceC3028m9 = this.f23466a.f24162i;
        if (interfaceC3028m9 != null) {
            String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).a(str, "onCCTLifeCycleEvent");
        }
        this.f23466a.c(jSONObject);
    }
}
