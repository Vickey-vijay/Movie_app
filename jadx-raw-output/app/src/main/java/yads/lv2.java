package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class lv2 extends sn1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f79941j = {ck.s.f(new MutablePropertyReference1Impl(lv2.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", 0)), ck.s.f(new MutablePropertyReference1Impl(lv2.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", 0)), ck.s.f(new MutablePropertyReference1Impl(lv2.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sn1 f79942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sn1 f79943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yz2 f79944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lm2 f79945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lm2 f79946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kv2 f79947i;

    @Override // yads.hk3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.f79942d.a((View) customizableMediaView);
        this.f79943e.a((View) customizableMediaView);
    }

    @Override // yads.sn1
    public final rn1 d() {
        return ((sn1) this.f79947i.getValue(this, f79941j[2])).d();
    }

    public lv2(CustomizableMediaView customizableMediaView, hv2 hv2Var, sn1 sn1Var, ao1 ao1Var, yz2 yz2Var) {
        super(customizableMediaView, ao1Var);
        this.f79942d = hv2Var;
        this.f79943e = sn1Var;
        this.f79944f = yz2Var;
        this.f79945g = mm2.a(null);
        this.f79946h = mm2.a(null);
        fk.a aVar = fk.a.f52963a;
        this.f79947i = new kv2(hv2Var, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_externalRelease(new iv2(new WeakReference(this)));
    }

    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        on1 on1Var = (on1) obj;
        this.f79942d.a(oiVar, kk3Var, on1Var);
        this.f79943e.a(oiVar, kk3Var, on1Var);
    }

    @Override // yads.hk3
    public final void a() {
        ((sn1) this.f79947i.getValue(this, f79941j[2])).a();
    }

    @Override // yads.sn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.f79942d.a(customizableMediaView);
        this.f79943e.a(customizableMediaView);
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        return ((sn1) this.f79947i.getValue(this, f79941j[2])).a(view, obj);
    }

    @Override // yads.sn1
    /* JADX INFO: renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, on1 on1Var) {
        lm2 lm2Var = this.f79945g;
        jk.k<?>[] kVarArr = f79941j;
        jk.k<?> kVar = kVarArr[0];
        lm2Var.getClass();
        lm2Var.f79854a = new WeakReference(customizableMediaView);
        lm2 lm2Var2 = this.f79946h;
        jk.k<?> kVar2 = kVarArr[1];
        lm2Var2.getClass();
        lm2Var2.f79854a = new WeakReference(on1Var);
        ((sn1) this.f79947i.getValue(this, kVarArr[2])).b(customizableMediaView, on1Var);
    }

    @Override // yads.sn1
    public final void a(on1 on1Var) {
        ((sn1) this.f79947i.getValue(this, f79941j[2])).a(on1Var);
    }
}
