package yc;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: compiled from: ScarInterstitialAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends a<InterstitialAd> implements qc.a {
    @Override // yc.a
    public void b(AdRequest adRequest, qc.b bVar) {
        InterstitialAd.load(this.f85676b, this.f85677c.b(), adRequest, ((f) this.f85679e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qc.a
    public void show(Activity activity) {
        T t10 = this.f85675a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f85680f.handleError(oc.b.a(this.f85677c));
        }
    }

    public e(Context context, xc.a aVar, qc.c cVar, oc.c cVar2, oc.g gVar) {
        super(context, cVar, aVar, cVar2);
        this.f85679e = new f(gVar, this);
    }
}
