package e;

import com.yk.e.util.IDUtil;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f52290a;

    public e(o oVar) {
        this.f52290a = oVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        NativeAd nativeAd = (NativeAd) ad2;
        h hVar = this.f52290a.f52306b;
        hVar.M = nativeAd;
        nativeAd.setAdInteractionListener(hVar.O);
        int dimensionPixelOffset = this.f52290a.f52305a.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f52290a.f52305a, "dp_135"));
        o oVar = this.f52290a;
        d.a aVar = new d.a(oVar.f52305a, oVar.f52306b.M);
        aVar.a(this.f52290a.f52305a, -1, dimensionPixelOffset, -1, dimensionPixelOffset);
        MediaView mediaView = aVar.f51751f;
        if (mediaView != null) {
            mediaView.setVisibility(8);
        }
        gl.h.a(aVar.f51749d);
        this.f52290a.f52306b.L.onAdLoaded(aVar.f51749d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f52290a.f52306b.v(adError.getCode() + ", " + adError.getMessage());
    }
}
