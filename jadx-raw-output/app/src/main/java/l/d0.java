package l;

import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f63322a;

    public d0(h hVar) {
        this.f63322a = hVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        int i10;
        int i11;
        NativeAd nativeAd = (NativeAd) ad2;
        w wVar = this.f63322a.f63338e;
        wVar.C = nativeAd;
        nativeAd.setAdInteractionListener(wVar.E);
        h hVar = this.f63322a;
        w wVar2 = hVar.f63338e;
        i.e eVar = wVar2.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 465;
        }
        int i13 = i11;
        d.a aVar = new d.a(hVar.f63334a, wVar2.C);
        h hVar2 = this.f63322a;
        aVar.a(hVar2.f63334a, i12, i13, hVar2.f63335b, hVar2.f63336c);
        gl.h.a(aVar.f51749d);
        this.f63322a.f63337d.onAdLoaded(aVar.f51749d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f63322a.f63338e.v(adError.getCode() + ", " + adError.getMessage());
    }
}
