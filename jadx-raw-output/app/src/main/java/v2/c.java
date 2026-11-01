package v2;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import t2.h;
import t2.i;
import t2.m;

/* JADX INFO: compiled from: InMobiRtbNativeAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends u2.c {
    @Override // u2.c
    public void b(m mVar) {
        h hVarA = i.a(this.f72532b.getContext(), this.f72532b.getMediationExtras(), "c_google");
        mVar.l(hVarA.b());
        mVar.m(hVarA.a());
        mVar.j(this.f72532b.getBidResponse().getBytes());
    }

    public void c() {
        a(this.f72532b.getContext(), t2.d.g(this.f72532b.getServerParameters()));
    }

    public c(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull t2.b bVar) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, aVar, bVar);
    }
}
