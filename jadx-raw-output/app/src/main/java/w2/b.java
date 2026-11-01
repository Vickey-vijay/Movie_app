package w2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import t2.h;
import t2.i;
import t2.j;

/* JADX INFO: compiled from: InMobiWaterfallInterstitialAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends u2.b {

    /* JADX INFO: compiled from: InMobiWaterfallInterstitialAd.java */
    public class a implements com.google.ads.mediation.inmobi.a.InterfaceC0173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialAdConfiguration f73334b;

        public a(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
            this.f73333a = context;
            this.f73334b = mediationInterstitialAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (b.this.f72528c != null) {
                b.this.f72528c.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeSuccess() {
            b.this.a(this.f73333a, this.f73334b);
        }
    }

    public b(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // u2.b
    public void b(@NonNull j jVar, @NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        h hVarA = i.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), "c_admob");
        jVar.d(hVarA.b());
        jVar.e(hVarA.a());
        jVar.b();
    }

    public void f(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = t2.d.j(string, t2.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f72528c.onFailure(adErrorJ);
        } else {
            this.f72529d.b(context, string, new a(context, mediationInterstitialAdConfiguration));
        }
    }
}
