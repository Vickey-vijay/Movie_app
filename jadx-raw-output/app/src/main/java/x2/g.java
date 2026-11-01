package x2;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: IronSourceRewardedAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements MediationRewardedAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    public static final ConcurrentHashMap<String, WeakReference<g>> f74259e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f74260f = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationRewardedAdCallback f74261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f74262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74263d;

    public static g a(@NonNull String str) {
        ConcurrentHashMap<String, WeakReference<g>> concurrentHashMap = f74259e;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    public static h b() {
        return f74260f;
    }

    public static void i(@NonNull String str) {
        f74259e.remove(str);
    }

    public MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> c() {
        return this.f74262c;
    }

    public MediationRewardedAdCallback d() {
        return this.f74261b;
    }

    public final boolean e(@NonNull Context context) {
        AdError adErrorI = a.i(context, this.f74263d);
        if (adErrorI != null) {
            h(adErrorI);
            return false;
        }
        if (a.c(this.f74263d, f74259e)) {
            return true;
        }
        h(new AdError(103, String.format("An IronSource Rewarded ad is already loading for instance ID: %s", this.f74263d), IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN));
        return false;
    }

    public final void h(@NonNull AdError adError) {
        Log.w(d.f74253a, adError.toString());
        this.f74262c.onFailure(adError);
    }

    public void j(@NonNull MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.f74261b = mediationRewardedAdCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        Log.d(d.f74253a, String.format("Showing IronSource rewarded ad for instance ID: %s", this.f74263d));
        IronSource.showISDemandOnlyRewardedVideo(this.f74263d);
    }

    public g(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f74263d = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f74262c = mediationAdLoadCallback;
    }

    public final boolean f(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (!e(mediationRewardedAdConfiguration.getContext())) {
            return false;
        }
        f74259e.put(this.f74263d, new WeakReference<>(this));
        Log.d(d.f74253a, String.format("Loading IronSource rewarded ad with instance ID: %s", this.f74263d));
        return true;
    }

    public void g(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (!f(mediationRewardedAdConfiguration)) {
            return;
        }
        IronSource.loadISDemandOnlyRewardedVideo((Activity) mediationRewardedAdConfiguration.getContext(), this.f74263d);
    }
}
