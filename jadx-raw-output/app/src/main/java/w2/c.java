package w2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import t2.h;
import t2.i;
import t2.m;

/* JADX INFO: compiled from: InMobiWaterfallNativeAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends u2.c {

    /* JADX INFO: compiled from: InMobiWaterfallNativeAd.java */
    public class a implements com.google.ads.mediation.inmobi.a.InterfaceC0173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f73336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f73337b;

        public a(Context context, long j10) {
            this.f73336a = context;
            this.f73337b = j10;
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(InMobiMediationAdapter.TAG, adError.toString());
            if (c.this.f72533c != null) {
                c.this.f72533c.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.a.InterfaceC0173a
        public void onInitializeSuccess() {
            c.this.a(this.f73336a, this.f73337b);
        }
    }

    @Override // u2.c
    public void b(m mVar) {
        h hVarA = i.a(this.f72532b.getContext(), this.f72532b.getMediationExtras(), "c_admob");
        mVar.l(hVarA.b());
        mVar.m(hVarA.a());
        mVar.i();
    }

    public void f() {
        Context context = this.f72532b.getContext();
        Bundle serverParameters = this.f72532b.getServerParameters();
        String string = serverParameters.getString("accountid");
        long jG = t2.d.g(serverParameters);
        AdError adErrorJ = t2.d.j(string, jG);
        if (adErrorJ != null) {
            this.f72533c.onFailure(adErrorJ);
        } else {
            this.f72536f.b(context, string, new a(context, jG));
        }
    }

    public c(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, aVar, bVar);
    }
}
