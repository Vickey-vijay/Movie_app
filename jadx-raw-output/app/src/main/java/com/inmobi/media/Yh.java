package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Yh implements InterfaceC2757bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23855a;

    public Yh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f23855a = gestureDetectorOnGestureListenerC2785ci;
    }

    public final void a(String str, int i10, String str2, long j10, int i11) {
        ck.p.j(str, "id");
        ck.p.i(GestureDetectorOnGestureListenerC2785ci.f24141g1, "access$getTAG$cp(...)");
        JSONObject jSONObjectA = Xh.a("code", i10);
        if (str2 != null) {
            jSONObjectA.put(NotificationCompat.CATEGORY_MESSAGE, str2);
        }
        jSONObjectA.put("retryCount", i11);
        String string = jSONObjectA.toString();
        ck.p.i(string, "toString(...)");
        this.f23855a.g("window.imraidview.broadcastEvent('onPingComplete', '" + str + "', " + j10 + ", '" + string + "');");
    }
}
