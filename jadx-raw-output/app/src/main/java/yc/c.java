package yc;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: ScarBannerAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends a<AdView> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f85682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AdView f85685j;

    @Override // yc.a
    public void b(AdRequest adRequest, qc.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f85682g;
        if (relativeLayout == null || (adView = this.f85685j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f85685j.setAdSize(new AdSize(this.f85683h, this.f85684i));
        this.f85685j.setAdUnitId(this.f85677c.b());
        this.f85685j.setAdListener(((d) this.f85679e).d());
        this.f85685j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f85682g;
        if (relativeLayout == null || (adView = this.f85685j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }

    public c(Context context, RelativeLayout relativeLayout, xc.a aVar, qc.c cVar, int i10, int i11, oc.c cVar2, oc.f fVar) {
        super(context, cVar, aVar, cVar2);
        this.f85682g = relativeLayout;
        this.f85683h = i10;
        this.f85684i = i11;
        this.f85685j = new AdView(this.f85676b);
        this.f85679e = new d(fVar, this);
    }
}
