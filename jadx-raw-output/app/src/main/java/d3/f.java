package d3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: PangleRewardedAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements MediationRewardedAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f51850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f51851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.d f51852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3.b f51853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationRewardedAdCallback f51854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGRewardedAd f51855g;

    /* JADX INFO: compiled from: PangleRewardedAd.java */
    public class a implements com.google.ads.mediation.pangle.a.InterfaceC0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f51856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f51857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51858c;

        /* JADX INFO: renamed from: d3.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleRewardedAd.java */
        public class C0464a implements PAGRewardedAdLoadListener {
            public C0464a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                f fVar = f.this;
                fVar.f51854f = (MediationRewardedAdCallback) fVar.f51850b.onSuccess(f.this);
                f.this.f51855g = pAGRewardedAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = c3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                f.this.f51850b.onFailure(adErrorC);
            }
        }

        public a(String str, MediationRewardedAdConfiguration mediationRewardedAdConfiguration, String str2) {
            this.f51856a = str;
            this.f51857b = mediationRewardedAdConfiguration;
            this.f51858c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            f.this.f51850b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeSuccess() {
            PAGRewardedRequest pAGRewardedRequestF = f.this.f51853e.f();
            pAGRewardedRequestF.setAdString(this.f51856a);
            c3.c.a(pAGRewardedRequestF, this.f51856a, this.f51857b);
            f.this.f51852d.i(this.f51858c, pAGRewardedRequestF, new C0464a());
        }
    }

    /* JADX INFO: compiled from: PangleRewardedAd.java */
    public class b implements PAGRewardedAdInteractionListener {
        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedRewardFail(int i10, String str) {
            Log.d(PangleMediationAdapter.TAG, c3.a.c(i10, String.format("Failed to reward user: %s", str)).toString());
        }

        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (f.this.f51854f != null) {
                f.this.f51854f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (f.this.f51854f != null) {
                f.this.f51854f.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (f.this.f51854f != null) {
                f.this.f51854f.onAdOpened();
                f.this.f51854f.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            if (f.this.f51854f != null) {
                f.this.f51854f.onUserEarnedReward();
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.f51855g.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f51855g.show((Activity) context);
        } else {
            this.f51855g.show(null);
        }
    }

    public f(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, c3.d dVar, c3.b bVar) {
        this.f51850b = mediationAdLoadCallback;
        this.f51851c = aVar;
        this.f51852d = dVar;
        this.f51853e = bVar;
    }

    public void g(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = c3.a.a(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f51850b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            this.f51851c.b(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationRewardedAdConfiguration, string));
        }
    }
}
