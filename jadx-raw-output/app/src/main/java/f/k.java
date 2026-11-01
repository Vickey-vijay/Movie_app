package f;

import android.app.Activity;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f52748a;

    public k(h hVar) {
        this.f52748a = hVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        int i10;
        int i11;
        NativeAd nativeAd = (NativeAd) ad2;
        f0 f0Var = this.f52748a.f52744b;
        f0Var.E = nativeAd;
        nativeAd.setAdInteractionListener(f0Var.G);
        h hVar = this.f52748a;
        f0 f0Var2 = hVar.f52744b;
        i.e eVar = f0Var2.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        int i13 = i11;
        d.a aVar = new d.a(hVar.f52743a, f0Var2.E);
        h hVar2 = this.f52748a;
        Activity activity = hVar2.f52743a;
        f0 f0Var3 = hVar2.f52744b;
        aVar.a(activity, i12, i13, f0Var3.B, f0Var3.C);
        gl.h.a(aVar.f51749d);
        this.f52748a.f52744b.D.onAdLoaded(aVar.f51749d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f52748a.f52744b.v(adError.getCode() + ", " + adError.getMessage());
    }
}
