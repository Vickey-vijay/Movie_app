package com.inmobi.media;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.E0;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static A0 f22557b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static nk.l0 f22560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static nk.l0 f22561f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f22556a = kotlin.b.a(new bk.a() { // from class: b7.v
        @Override // bk.a
        public final Object invoke() {
            return E0.a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mj.g f22558c = kotlin.b.a(new bk.a() { // from class: b7.w
        @Override // bk.a
        public final Object invoke() {
            return E0.b();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f22559d = new B0();

    public static final H0 a() {
        return new H0(AbstractC2904h9.b());
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        ck.p.j(str, "url");
        ck.p.j(jSONObject, "extras");
        ck.p.j(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        gestureDetectorOnGestureListenerC2785ci.getAdQualityManager().a(activity, str, z10, jSONObject, qh2);
        A0 a10 = f22557b;
        if (a10 == null) {
            ck.p.B("executor");
            a10 = null;
        }
        a10.getClass();
        ck.p.j(str, "beaconUrl");
        ck.p.j(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        a10.f22331c.put(str, new WeakReference(qh2));
        String creativeID = gestureDetectorOnGestureListenerC2785ci.getCreativeID();
        if (creativeID.length() > 0) {
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f23815a.a(AdConfig.class);
            mj.g gVar = f22558c;
            if (((CopyOnWriteArrayList) gVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) gVar.getValue()).add(creativeID);
            }
        }
    }

    public static final CopyOnWriteArrayList b() {
        return new CopyOnWriteArrayList();
    }

    public static void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2, String str, boolean z10, JSONObject jSONObject, Qh qh2) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "adView");
        ck.p.j(gestureDetectorOnGestureListenerC2785ci2, "renderView");
        ck.p.j(str, "url");
        ck.p.j(jSONObject, "extras");
        ck.p.j(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        gestureDetectorOnGestureListenerC2785ci2.getAdQualityManager().a(gestureDetectorOnGestureListenerC2785ci, str, z10, jSONObject, qh2);
        A0 a10 = f22557b;
        if (a10 == null) {
            ck.p.B("executor");
            a10 = null;
        }
        a10.getClass();
        ck.p.j(str, "beaconUrl");
        ck.p.j(qh2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        a10.f22331c.put(str, new WeakReference(qh2));
        String creativeID = gestureDetectorOnGestureListenerC2785ci2.getCreativeID();
        if (creativeID.length() > 0) {
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f23815a.a(AdConfig.class);
            mj.g gVar = f22558c;
            if (((CopyOnWriteArrayList) gVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) gVar.getValue()).add(creativeID);
            }
        }
    }
}
