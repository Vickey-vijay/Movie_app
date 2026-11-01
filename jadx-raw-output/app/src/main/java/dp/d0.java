package dp;

import android.widget.ImageView;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f52246a;

    public d0(i iVar) {
        this.f52246a = iVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        int i10;
        int i11;
        NativeAd nativeAd = (NativeAd) ad2;
        i0 i0Var = this.f52246a.f52255b;
        i0Var.G = nativeAd;
        nativeAd.setAdInteractionListener(i0Var.K);
        i iVar = this.f52246a;
        i0 i0Var2 = iVar.f52255b;
        i.e eVar = i0Var2.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        i0Var2.H = new d.a(iVar.f52254a, i0Var2.G);
        i iVar2 = this.f52246a;
        i0 i0Var3 = iVar2.f52255b;
        i0Var3.H.a(iVar2.f52254a, i12, i11, i0Var3.B, i0Var3.C);
        ImageView imageView = this.f52246a.f52255b.H.f51750e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        i0 i0Var4 = this.f52246a.f52255b;
        d.a aVar = i0Var4.H;
        r rVar = i0Var4.J;
        ImageView imageView2 = aVar.f51750e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(rVar);
        }
        gl.h.a(this.f52246a.f52255b.H.f51749d);
        i0 i0Var5 = this.f52246a.f52255b;
        i0Var5.F.onAdLoaded(i0Var5.H.f51749d);
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f52246a.f52255b.v(adError.getCode() + ", " + adError.getMessage());
    }
}
