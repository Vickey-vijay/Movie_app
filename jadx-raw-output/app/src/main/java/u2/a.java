package u2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;
import t2.e;
import t2.g;

/* JADX INFO: compiled from: InMobiBannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends BannerAdEventListener implements MediationBannerAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f72522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.ads.mediation.inmobi.a f72523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationBannerAdCallback f72524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t2.c f72525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t2.b f72526f;

    public abstract void b(@NonNull e eVar, @NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(@NonNull InMobiBanner inMobiBanner, Map map) {
        onAdClicked2(inMobiBanner, (Map<Object, Object>) map);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onRewardsUnlocked(@NonNull InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f72525e.b();
    }

    /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(@NonNull InMobiBanner inMobiBanner, Map<Object, Object> map) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f72524d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDismissed(@NonNull InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f72524d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDisplayed(@NonNull InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f72524d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(@NonNull InMobiBanner inMobiBanner) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f72524d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(@NonNull InMobiBanner inMobiBanner, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorB = g.b(t2.d.f(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        Log.w(InMobiMediationAdapter.TAG, adErrorB.toString());
        this.f72522b.onFailure(adErrorB);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(@NonNull InMobiBanner inMobiBanner, @NonNull AdMetaInfo adMetaInfo) {
        this.f72524d = this.f72522b.onSuccess(this);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onUserLeftApplication(@NonNull InMobiBanner inMobiBanner) {
        this.f72524d.onAdLeftApplication();
    }

    public a(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        this.f72522b = mediationAdLoadCallback;
        this.f72523c = aVar;
        this.f72526f = bVar;
    }

    public void a(@NonNull Context context, @NonNull AdSize adSize, @NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        t2.d.h();
        t2.d.a(mediationBannerAdConfiguration.getMediationExtras());
        e eVarB = this.f72526f.b(context, Long.valueOf(t2.d.g(mediationBannerAdConfiguration.getServerParameters())));
        eVarB.e(Boolean.FALSE);
        eVarB.d(InMobiBanner.AnimationType.ANIMATION_OFF);
        eVarB.i(this);
        String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            eVarB.j(new WatermarkData(watermark, 0.3f));
        }
        t2.c cVarA = this.f72526f.a(context);
        this.f72525e = cVarA;
        cVarA.c(new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        eVarB.h(new LinearLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        this.f72525e.a(eVarB);
        b(eVarB, mediationBannerAdConfiguration);
    }
}
