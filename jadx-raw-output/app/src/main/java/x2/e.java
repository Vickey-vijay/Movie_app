package x2;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: IronSourceInterstitialAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements MediationInterstitialAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    public static final ConcurrentHashMap<String, WeakReference<e>> f74254e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f74255f = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationInterstitialAdCallback f74256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f74257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74258d;

    public static e a(@NonNull String str) {
        ConcurrentHashMap<String, WeakReference<e>> concurrentHashMap = f74254e;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    public static f c() {
        return f74255f;
    }

    public static void i(@NonNull String str) {
        f74254e.remove(str);
    }

    public MediationInterstitialAdCallback b() {
        return this.f74256b;
    }

    public MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> d() {
        return this.f74257c;
    }

    public final boolean e(@NonNull Context context) {
        AdError adErrorI = a.i(context, this.f74258d);
        if (adErrorI != null) {
            h(adErrorI);
            return false;
        }
        if (a.c(this.f74258d, f74254e)) {
            return true;
        }
        h(new AdError(103, String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.f74258d), IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN));
        return false;
    }

    public final void h(@NonNull AdError adError) {
        Log.e(d.f74253a, adError.toString());
        MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.f74257c;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public void j(@NonNull MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.f74256b = mediationInterstitialAdCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        IronSource.showISDemandOnlyInterstitial(this.f74258d);
    }

    public e(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f74258d = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f74257c = mediationAdLoadCallback;
    }

    public final boolean f(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (!e(mediationInterstitialAdConfiguration.getContext())) {
            return false;
        }
        f74254e.put(this.f74258d, new WeakReference<>(this));
        Log.d(d.f74253a, String.format("Loading IronSource interstitial ad with instance ID: %s", this.f74258d));
        return true;
    }

    public void g(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (!f(mediationInterstitialAdConfiguration)) {
            return;
        }
        IronSource.loadISDemandOnlyInterstitial((Activity) mediationInterstitialAdConfiguration.getContext(), this.f74258d);
    }
}
