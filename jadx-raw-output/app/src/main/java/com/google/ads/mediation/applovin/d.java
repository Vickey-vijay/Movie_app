package com.google.ads.mediation.applovin;

import android.content.Context;
import androidx.annotation.NonNull;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* JADX INFO: compiled from: AppLovinInitializer.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f18820b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18821a = new h();

    /* JADX INFO: compiled from: AppLovinInitializer.java */
    public class a implements AppLovinSdk.SdkInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f18822a;

        public a(b bVar) {
            this.f18822a = bVar;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.f18822a.onInitializeSuccess();
        }
    }

    /* JADX INFO: compiled from: AppLovinInitializer.java */
    public interface b {
        void onInitializeSuccess();
    }

    public static d a() {
        if (f18820b == null) {
            f18820b = new d();
        }
        return f18820b;
    }

    public void b(@NonNull Context context, @NonNull String str, @NonNull b bVar) {
        this.f18821a.a(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider("admob").setPluginVersion(BuildConfig.ADAPTER_VERSION).build(), new a(bVar));
    }

    public AppLovinSdk c(Context context) {
        return this.f18821a.a(context);
    }
}
