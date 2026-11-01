package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.AppLovinSdk;
import com.inmobi.media.AbstractC3355zc;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import com.unity3d.services.core.fid.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3355zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f25834a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SignalsConfig f25835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mj.g f25837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mj.g f25838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f25839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p f25840g;

    public static final mj.r a(Bundle bundle, String str) {
        LinkedHashMap linkedHashMapA;
        ck.p.j(str, "topic");
        if (bundle != null) {
            try {
                if (ck.p.e(str, f25836c) && (linkedHashMapA = a(bundle)) != null) {
                    Og.f23290a.getClass();
                    Og.a(linkedHashMapA);
                    linkedHashMapA.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return mj.r.f64562a;
    }

    public static final boolean b() {
        try {
            int i10 = AppLovinCommunicator.f6799g;
            return ck.p.e(AppLovinCommunicator.class.getMethod(Constants.GET_INSTANCE, new Class[0]).getReturnType(), AppLovinCommunicator.class) && ck.p.e(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage")).getReturnType(), Void.TYPE) && ck.p.e(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", new Class[0]).getReturnType(), String.class);
        } catch (Error | Exception unused) {
            return false;
        }
    }

    static {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) Y3.f23815a.a(SignalsConfig.class);
        f25835b = signalsConfig;
        String topic = signalsConfig.getPublisherConfig().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = "max_revenue_events";
        }
        f25836c = topic;
        f25837d = kotlin.b.a(new bk.a() { // from class: b7.sc
            @Override // bk.a
            public final Object invoke() {
                return AbstractC3355zc.d();
            }
        });
        f25838e = kotlin.b.a(new bk.a() { // from class: b7.tc
            @Override // bk.a
            public final Object invoke() {
                return Boolean.valueOf(AbstractC3355zc.b());
            }
        });
        f25840g = new bk.p() { // from class: b7.uc
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return AbstractC3355zc.a((Bundle) obj, (String) obj2);
            }
        };
    }

    public static boolean c() {
        String str;
        Boolean bool = f25839f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String str2 = AppLovinSdk.VERSION;
            Object obj = AppLovinSdk.class.getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = com.ironsource.Y1.f27894f;
            }
        } catch (Throwable unused) {
        }
        List<String> incompatibleSdkVer = f25835b.getPublisherConfig().getAuto().getIncompatibleSdkVer();
        Objects.toString(incompatibleSdkVer);
        boolean z10 = ck.p.e(str, com.ironsource.Y1.f27894f) || incompatibleSdkVer.contains(str);
        f25839f = Boolean.valueOf(z10);
        return z10;
    }

    public static final SignalCollector d() {
        return new SignalCollector(nj.r.e(f25836c));
    }

    public static void a() {
        if (f25835b.getPublisherConfig().getAuto().getEnabled() && !c() && ((Boolean) f25838e.getValue()).booleanValue() && f25836c.length() != 0 && f25834a.compareAndSet(false, true)) {
            ((SignalCollector) f25837d.getValue()).setupAppLovinCommunicator(f25840g);
        }
    }

    public static LinkedHashMap a(Bundle bundle) {
        boolean z10;
        Object obj;
        Object obj2;
        ck.p.j(bundle, "data");
        if (!f25834a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = f25835b;
        if (!signalsConfig.getPublisherConfig().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisherConfig().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ck.p.g(setKeySet);
        if (setKeySet.contains("ad_format") && (obj2 = bundle.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (setKeySet.contains(key)) {
                String name = value.getName();
                if (F3.a(name) && (obj = bundle.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
