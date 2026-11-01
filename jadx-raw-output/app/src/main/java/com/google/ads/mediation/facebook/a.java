package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: FacebookInitializer.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements AudienceNetworkAds.InitListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f18854d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18855a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18856b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0172a> f18857c = new ArrayList<>();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FacebookInitializer.java */
    public interface InterfaceC0172a {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f18855a = false;
        this.f18856b = initResult.isSuccess();
        for (InterfaceC0172a interfaceC0172a : this.f18857c) {
            if (initResult.isSuccess()) {
                interfaceC0172a.onInitializeSuccess();
            } else {
                interfaceC0172a.onInitializeError(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f18857c.clear();
    }

    public static a a() {
        if (f18854d == null) {
            f18854d = new a();
        }
        return f18854d;
    }

    public void b(Context context, ArrayList<String> arrayList, InterfaceC0172a interfaceC0172a) {
        if (this.f18855a) {
            this.f18857c.add(interfaceC0172a);
        } else {
            if (this.f18856b) {
                interfaceC0172a.onInitializeSuccess();
                return;
            }
            this.f18855a = true;
            a().f18857c.add(interfaceC0172a);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.20.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }
}
