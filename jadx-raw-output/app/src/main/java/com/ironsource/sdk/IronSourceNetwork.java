package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.A8;
import com.ironsource.B8;
import com.ironsource.C3396ba;
import com.ironsource.C3676r4;
import com.ironsource.C3731u8;
import com.ironsource.I5;
import com.ironsource.Mc;
import com.ironsource.O9;
import com.ironsource.S9;
import com.ironsource.Y9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30733a = "IronSourceNetwork";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Y9 f30734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Mc> f30735c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C3396ba f30736d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            I5 i5A = B8.a(jSONObject);
            if (i5A.a()) {
                A8.a(i5A, B8.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(Mc mc2) {
        C3396ba c3396ba = f30736d;
        if (c3396ba == null) {
            f30735c.add(mc2);
        } else if (c3396ba.b()) {
            mc2.onSuccess();
        } else {
            mc2.onFail(f30736d.a());
        }
    }

    public static synchronized void destroyAd(O9 o10) throws Exception {
        a();
        f30734b.b(o10);
    }

    public static synchronized e getControllerManager() {
        return f30734b.a();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(f30733a, "applicationKey is NULL");
            return;
        }
        if (f30734b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                Logger.e(f30733a, "Failed to init event tracker: " + e10.getMessage());
            }
            f30734b = S9.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(O9 o10) {
        Y9 y10 = f30734b;
        if (y10 == null) {
            return false;
        }
        return y10.a(o10);
    }

    public static synchronized void loadAd(O9 o10, Map<String, String> map) throws Exception {
        a();
        f30734b.a(o10, map);
    }

    public static synchronized void loadAdView(Activity activity, O9 o10, Map<String, String> map) throws Exception {
        a();
        f30734b.b(activity, o10, map);
    }

    public static void onPause(Activity activity) {
        Y9 y10 = f30734b;
        if (y10 == null) {
            return;
        }
        y10.onPause(activity);
    }

    public static void onResume(Activity activity) {
        Y9 y10 = f30734b;
        if (y10 == null) {
            return;
        }
        y10.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        Y9 y10 = f30734b;
        if (y10 == null) {
            return;
        }
        y10.a(activity);
    }

    public static synchronized void showAd(Activity activity, O9 o10, Map<String, String> map) throws Exception {
        a();
        f30734b.a(activity, o10, map);
    }

    public static synchronized void updateInitFailed(C3731u8 c3731u8) {
        f30736d = new C3396ba(c3731u8);
        Iterator<Mc> it = f30735c.iterator();
        while (it.hasNext()) {
            it.next().onFail(c3731u8);
        }
        f30735c.clear();
    }

    public static synchronized void updateInitSucceeded() {
        f30736d = new C3396ba();
        Iterator<Mc> it = f30735c.iterator();
        while (it.hasNext()) {
            it.next().onSuccess();
        }
        f30735c.clear();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    private static synchronized void a() throws Exception {
        if (f30734b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }
}
