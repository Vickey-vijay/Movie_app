package w2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import t2.h;
import t2.i;
import t2.j;

/* JADX INFO: compiled from: InMobiWaterfallRewardedAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends u2.d {

    /* JADX INFO: compiled from: InMobiWaterfallRewardedAd.java */
    public class a implements com.google.ads.mediation.inmobi.a.InterfaceC0173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f73340b;

        public a(Context context, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f73339a = context;
            this.f73340b = mediationRewardedAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (d.this.f72541c != null) {
                d.this.f72541c.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeSuccess() {
            d.this.a(this.f73339a, this.f73340b);
        }
    }

    public d(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        super(mediationAdLoadCallback, aVar, bVar);
    }

    @Override // u2.d
    public void b(@NonNull j jVar, @NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        h hVarA = i.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), "c_admob");
        jVar.d(hVarA.b());
        jVar.e(hVarA.a());
        jVar.b();
    }

    public void f(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorJ = t2.d.j(string, t2.d.g(serverParameters));
        if (adErrorJ != null) {
            this.f72541c.onFailure(adErrorJ);
        } else {
            this.f72542d.b(context, string, new a(context, mediationRewardedAdConfiguration));
        }
    }
}
