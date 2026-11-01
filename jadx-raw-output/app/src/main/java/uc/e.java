package uc;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: compiled from: ScarInterstitialAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends a<InterstitialAd> implements qc.a {
    @Override // uc.a
    public void b(AdRequest adRequest, qc.b bVar) {
        InterstitialAd.load(this.f72801b, this.f72802c.b(), adRequest, ((f) this.f72804e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qc.a
    public void show(Activity activity) {
        T t10 = this.f72800a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f72805f.handleError(oc.b.a(this.f72802c));
        }
    }

    public e(Context context, tc.a aVar, qc.c cVar, oc.c cVar2, oc.g gVar) {
        super(context, cVar, aVar, cVar2);
        this.f72804e = new f(gVar, this);
    }
}
