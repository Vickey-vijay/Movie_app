package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import c3.b;
import c3.d;
import com.applovin.mediation.adapters.bytedance.BuildConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PangleInitializer.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f18927f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18928a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18929b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0174a> f18930c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f18931d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f18932e = new b();

    /* JADX INFO: renamed from: com.google.ads.mediation.pangle.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PangleInitializer.java */
    public interface InterfaceC0174a {
        void onInitializeError(@NonNull AdError adError);

        void onInitializeSuccess();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i10, @NonNull String str) {
        this.f18928a = false;
        this.f18929b = false;
        AdError adErrorC = c3.a.c(i10, str);
        Iterator<InterfaceC0174a> it = this.f18930c.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adErrorC);
        }
        this.f18930c.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        this.f18928a = false;
        this.f18929b = true;
        Iterator<InterfaceC0174a> it = this.f18930c.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.f18930c.clear();
    }

    @NonNull
    public static a a() {
        if (f18927f == null) {
            f18927f = new a();
        }
        return f18927f;
    }

    public void b(@NonNull Context context, @NonNull String str, @NonNull InterfaceC0174a interfaceC0174a) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorA = c3.a.a(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
            interfaceC0174a.onInitializeError(adErrorA);
        } else if (this.f18928a) {
            this.f18930c.add(interfaceC0174a);
        } else {
            if (this.f18929b) {
                interfaceC0174a.onInitializeSuccess();
                return;
            }
            this.f18928a = true;
            this.f18930c.add(interfaceC0174a);
            this.f18931d.c(context, this.f18932e.a().appId(str).setAdxId("207").setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setUserData(String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", BuildConfig.VERSION_NAME)).build(), this);
        }
    }
}
