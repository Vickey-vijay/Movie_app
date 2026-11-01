package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* JADX INFO: compiled from: WindVaneApiManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap<String, Class> f36130d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f36132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindVaneWebView f36133c;

    public void a(Context context) {
        this.f36131a = context;
    }

    public void a(Object obj) {
        this.f36132b = obj;
    }

    public e(Context context, WindVaneWebView windVaneWebView) {
        this.f36131a = context;
        this.f36133c = windVaneWebView;
        a();
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f36130d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!g.class.isAssignableFrom(cls)) {
                return null;
            }
            g gVar = (g) cls.newInstance();
            gVar.initialize(context, windVaneWebView);
            gVar.initialize(this.f36132b, windVaneWebView);
            return gVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a(String str, Class cls) {
        if (f36130d == null) {
            f36130d = new HashMap<>();
        }
        f36130d.put(str, cls);
    }

    public Object a(String str) {
        if (f36130d == null) {
            f36130d = new HashMap<>();
        }
        return a(str, this.f36133c, this.f36131a);
    }

    public void a() {
        try {
            int i10 = interstitial.f35515i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f36003a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i11 = RewardSignal.f39108i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f36004b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i12 = VideoCommunication.f39134j;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f36005c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i13 = MraidSignalCommunication.f36074h;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f36007e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i14 = BannerSignalPlugin.f36062i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f36008f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            int i15 = SplashSignal.f37188i;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f36009g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i16 = WebGLCheckSignal.f36086g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f36010h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.util.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }
}
