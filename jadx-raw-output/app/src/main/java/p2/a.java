package p2;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzc;
import com.google.android.gms.ads.formats.zzh;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends UnifiedNativeAdMapper {
    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        if (view instanceof zzh) {
            throw null;
        }
        if (((zzc) zzc.zza.get(view)) != null) {
            throw null;
        }
    }

    public a(UnifiedNativeAd unifiedNativeAd) {
        setHeadline(unifiedNativeAd.zza());
        setImages(unifiedNativeAd.zzb());
        setBody(unifiedNativeAd.zzc());
        setIcon(unifiedNativeAd.zzd());
        setCallToAction(unifiedNativeAd.zze());
        setAdvertiser(unifiedNativeAd.zzf());
        setStarRating(unifiedNativeAd.zzg());
        setStore(unifiedNativeAd.zzh());
        setPrice(unifiedNativeAd.zzi());
        zzb(unifiedNativeAd.zzk());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zza(unifiedNativeAd.zzj());
    }
}
