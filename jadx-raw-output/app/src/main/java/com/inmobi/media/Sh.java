package com.inmobi.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class Sh implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23526a;

    public Sh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f23526a = gestureDetectorOnGestureListenerC2785ci;
    }

    public final void a(E6 e10) {
        ck.p.j(e10, "metrics");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f23526a;
        float f10 = e10.f22570a;
        F6 f11 = e10.f22571b;
        Object jSONArray = "null";
        Object objA = f11 != null ? G6.a(f11) : "null";
        ArrayList arrayList = e10.f22572c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(G6.a((F6) it.next()));
            }
            jSONArray = new JSONArray((Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC2785ci.g("window.mraidview.broadcastEvent('exposureChange', " + f10 + ", " + objA + ", " + jSONArray + ");");
    }
}
