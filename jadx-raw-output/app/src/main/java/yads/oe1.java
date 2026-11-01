package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes9.dex */
public final class oe1 implements vy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0 f81021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f81022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sp2 f81023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rx f81024d;

    public oe1(qw qwVar, at1 at1Var, sp2 sp2Var, rx rxVar) {
        this.f81021a = qwVar;
        this.f81022b = at1Var;
        this.f81023c = sp2Var;
        this.f81024d = rxVar;
    }

    @Override // yads.vy0
    public final se1 a(Context context, v9 v9Var, w02 w02Var, kz kzVar, z00 z00Var) {
        y00 adAssets = w02Var.getAdAssets();
        sp2 sp2Var = this.f81023c;
        int i10 = R$dimen.monetization_ads_internal_landscape_horizontal_icon_size;
        sp2Var.getClass();
        ly lyVar = new ly(adAssets, ek.b.c(context.getResources().getDimension(i10)));
        rx rxVar = this.f81024d;
        zf0 zf0Var = this.f81021a;
        io2 io2Var = this.f81022b;
        rxVar.getClass();
        return new se1(R$layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, new jy(lyVar, rx.a(w02Var, kzVar, z00Var, zf0Var, io2Var), new pj1(adAssets), new fd2(adAssets), new gn3(), new xs(w02Var)), new ua2(2));
    }
}
