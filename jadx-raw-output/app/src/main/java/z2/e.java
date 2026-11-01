package z2;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* JADX INFO: compiled from: MintegralNativeAdListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class e extends NativeAdWithCodeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f85916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f85917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f85918d;

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f85917c.f85910d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f85917c.f85910d.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        if (list == null || list.size() == 0) {
            AdError adErrorA = y2.d.a(104, "Mintegral SDK failed to return a native ad.");
            Log.w(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f85916b.onFailure(adErrorA);
        } else {
            this.f85917c.a(list.get(0), this.f85918d);
            d dVar = this.f85917c;
            dVar.f85910d = this.f85916b.onSuccess(dVar);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f85917c.f85910d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    public e(@NonNull d dVar, Context context, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f85918d = context;
        this.f85917c = dVar;
        this.f85916b = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i10, String str) {
        AdError adErrorB = y2.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f85916b.onFailure(adErrorB);
    }
}
