package uc;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: compiled from: ScarRewardedAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends a<RewardedAd> implements qc.a {
    @Override // uc.a
    public void b(AdRequest adRequest, qc.b bVar) {
        RewardedAd.load(this.f72801b, this.f72802c.b(), adRequest, ((h) this.f72804e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qc.a
    public void show(Activity activity) {
        T t10 = this.f72800a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((h) this.f72804e).f());
        } else {
            this.f72805f.handleError(oc.b.a(this.f72802c));
        }
    }

    public g(Context context, tc.a aVar, qc.c cVar, oc.c cVar2, oc.h hVar) {
        super(context, cVar, aVar, cVar2);
        this.f72804e = new h(hVar, this);
    }
}
