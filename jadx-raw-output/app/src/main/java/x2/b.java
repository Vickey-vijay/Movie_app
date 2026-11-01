package x2;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: IronSourceBannerAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements MediationBannerAd {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    public static final ConcurrentHashMap<String, WeakReference<b>> f74246g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f74247h = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationBannerAdCallback f74248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f74249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f74250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ISDemandOnlyBannerLayout f74251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ISBannerSize f74252f;

    public static void a(@NonNull String str) {
        for (String str2 : f74246g.keySet()) {
            if (!str2.equals(str)) {
                Log.d(d.f74253a, String.format("IronSource Banner Destroy ad with instance ID: %s", str2));
                IronSource.destroyISDemandOnlyBanner(str2);
                j(str2);
            }
        }
    }

    public static b d(@NonNull String str) {
        ConcurrentHashMap<String, WeakReference<b>> concurrentHashMap = f74246g;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    public static void j(@NonNull String str) {
        f74246g.remove(str);
    }

    public MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> b() {
        return this.f74249c;
    }

    public MediationBannerAdCallback c() {
        return this.f74248b;
    }

    public FrameLayout e() {
        return this.f74250d;
    }

    public ISDemandOnlyBannerLayout f() {
        return this.f74251e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f74250d;
    }

    public final void i(@NonNull AdError adError) {
        Log.w(d.f74253a, adError.toString());
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback = this.f74249c;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public void k(MediationBannerAdCallback mediationBannerAdCallback) {
        this.f74248b = mediationBannerAdCallback;
    }

    public b(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f74249c = mediationAdLoadCallback;
    }

    public final boolean g(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        Context context = mediationBannerAdConfiguration.getContext();
        AdError adErrorI = a.i(context, string);
        if (adErrorI != null) {
            i(adErrorI);
            return false;
        }
        if (!a.c(string, f74246g)) {
            i(new AdError(103, "An IronSource banner is already loaded for instance ID: " + string, IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN));
            return false;
        }
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        ISBannerSize iSBannerSizeF = a.f(context, adSize);
        this.f74252f = iSBannerSizeF;
        if (iSBannerSizeF == null) {
            i(new AdError(105, "There is no matching IronSource banner ad size for Google ad size: " + adSize, IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN));
            return false;
        }
        return true;
    }

    public void h(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        if (!g(mediationBannerAdConfiguration)) {
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        Context context = mediationBannerAdConfiguration.getContext();
        Activity activity = (Activity) context;
        f74246g.put(string, new WeakReference<>(this));
        this.f74250d = new FrameLayout(context);
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutCreateBannerForDemandOnly = IronSource.createBannerForDemandOnly(activity, this.f74252f);
        this.f74251e = iSDemandOnlyBannerLayoutCreateBannerForDemandOnly;
        iSDemandOnlyBannerLayoutCreateBannerForDemandOnly.setBannerDemandOnlyListener(f74247h);
        Log.d(d.f74253a, String.format("Loading IronSource banner ad with instance ID: %s", string));
        IronSource.loadISDemandOnlyBanner(activity, this.f74251e, string);
    }
}
