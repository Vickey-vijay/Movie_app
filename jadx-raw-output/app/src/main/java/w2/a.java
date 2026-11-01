package w2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import t2.e;
import t2.g;
import t2.h;
import t2.i;

/* JADX INFO: compiled from: InMobiWaterfallBannerAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends u2.a {

    /* JADX INFO: renamed from: w2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InMobiWaterfallBannerAd.java */
    public class C0772a implements com.google.ads.mediation.inmobi.a.InterfaceC0173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdSize f73330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f73331c;

        public C0772a(Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f73329a = context;
            this.f73330b = adSize;
            this.f73331c = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            a.this.f72522b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeSuccess() {
            a.this.a(this.f73329a, this.f73330b, this.f73331c);
        }
    }

    public a(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // u2.a
    public void b(@NonNull e eVar, @NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        h hVarA = i.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), "c_admob");
        eVar.f(hVarA.b());
        eVar.g(hVarA.a());
        eVar.b();
    }

    public void e(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = t2.d.b(context, mediationBannerAdConfiguration.getAdSize());
        if (adSizeB == null) {
            AdError adErrorA = g.a(102, String.format("The requested banner size: %s is not supported by InMobi SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(InMobiMediationAdapter.TAG, adErrorA.toString());
            this.f72522b.onFailure(adErrorA);
            return;
        }
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = t2.d.j(string, t2.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f72522b.onFailure(adErrorJ);
        } else {
            this.f72523c.b(context, string, new C0772a(context, adSizeB, mediationBannerAdConfiguration));
        }
    }
}
