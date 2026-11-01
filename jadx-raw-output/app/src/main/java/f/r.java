package f;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f52754b;

    public r(t tVar) {
        this.f52754b = tVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        int i10;
        int i11;
        z zVar = this.f52754b.f52756b;
        zVar.E = nativeAd;
        zVar.H = System.currentTimeMillis();
        z zVar2 = this.f52754b.f52756b;
        zVar2.E.setOnPaidEventListener(zVar2.J);
        t tVar = this.f52754b;
        z zVar3 = tVar.f52756b;
        i.e eVar = zVar3.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        zVar3.F = new d.b(tVar.f52755a, nativeAd);
        t tVar2 = this.f52754b;
        z zVar4 = tVar2.f52756b;
        zVar4.F.a(tVar2.f52755a, i12, i11, zVar4.B, zVar4.C);
    }
}
