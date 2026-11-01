package yc;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: compiled from: ScarRewardedAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends a<RewardedAd> implements qc.a {
    @Override // yc.a
    public void b(AdRequest adRequest, qc.b bVar) {
        RewardedAd.load(this.f85676b, this.f85677c.b(), adRequest, ((h) this.f85679e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qc.a
    public void show(Activity activity) {
        T t10 = this.f85675a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((h) this.f85679e).f());
        } else {
            this.f85680f.handleError(oc.b.a(this.f85677c));
        }
    }

    public g(Context context, xc.a aVar, qc.c cVar, oc.c cVar2, oc.h hVar) {
        super(context, cVar, aVar, cVar2);
        this.f85679e = new h(hVar, this);
    }
}
