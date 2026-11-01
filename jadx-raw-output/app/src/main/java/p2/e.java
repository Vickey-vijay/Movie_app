package p2;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbln;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
public final class e extends AdListener implements zzg, zze, zzd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final AbstractAdViewAdapter f65873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public final MediationNativeListener f65874d;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f65873c = abstractAdViewAdapter;
        this.f65874d = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f65874d.onAdClicked(this.f65873c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f65874d.onAdClosed(this.f65873c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f65874d.onAdFailedToLoad(this.f65873c, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f65874d.onAdImpression(this.f65873c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f65874d.onAdOpened(this.f65873c);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f65874d.onAdLoaded(this.f65873c, new a(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbln zzblnVar) {
        this.f65874d.zzc(this.f65873c, zzblnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbln zzblnVar, String str) {
        this.f65874d.zzd(this.f65873c, zzblnVar, str);
    }
}
