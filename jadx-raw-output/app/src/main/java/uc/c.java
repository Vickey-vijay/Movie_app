package uc;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: ScarBannerAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends a<AdView> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f72807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f72808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f72809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AdView f72810j;

    @Override // uc.a
    public void b(AdRequest adRequest, qc.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f72807g;
        if (relativeLayout == null || (adView = this.f72810j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f72810j.setAdSize(new AdSize(this.f72808h, this.f72809i));
        this.f72810j.setAdUnitId(this.f72802c.b());
        this.f72810j.setAdListener(((d) this.f72804e).d());
        this.f72810j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f72807g;
        if (relativeLayout == null || (adView = this.f72810j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }

    public c(Context context, RelativeLayout relativeLayout, tc.a aVar, qc.c cVar, int i10, int i11, oc.c cVar2, oc.f fVar) {
        super(context, cVar, aVar, cVar2);
        this.f72807g = relativeLayout;
        this.f72808h = i10;
        this.f72809i = i11;
        this.f72810j = new AdView(this.f72801b);
        this.f72804e = new d(fVar, this);
    }
}
