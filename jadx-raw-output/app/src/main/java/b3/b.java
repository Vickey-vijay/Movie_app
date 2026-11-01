package b3;

import android.util.Log;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import y2.k;

/* JADX INFO: compiled from: MintegralWaterfallBannerAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends z2.b {
    public b(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    public void b(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        BannerSize bannerSizeA = z2.b.a(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), false);
        if (bannerSizeA == null) {
            AdError adErrorA = y2.d.a(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f85900b.onFailure(adErrorA);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = k.g(string, string2);
        if (adErrorG != null) {
            this.f85900b.onFailure(adErrorG);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration.getContext());
        this.f85901c = mBBannerView;
        mBBannerView.init(bannerSizeA, string2, string);
        this.f85901c.setLayoutParams(new FrameLayout.LayoutParams(k.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getWidth()), k.b(mediationBannerAdConfiguration.getContext(), bannerSizeA.getHeight())));
        this.f85901c.setBannerAdListener(this);
        this.f85901c.load();
    }
}
