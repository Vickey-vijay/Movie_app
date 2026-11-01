package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes11.dex */
public final class kv2 extends fk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lv2 f79602a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv2(hv2 hv2Var, lv2 lv2Var) {
        super(hv2Var);
        this.f79602a = lv2Var;
    }

    @Override // fk.b
    public final void afterChange(jk.k kVar, Object obj, Object obj2) {
        ck.p.j(kVar, "property");
        sn1 sn1Var = (sn1) obj2;
        sn1 sn1Var2 = (sn1) obj;
        if (ck.p.e(sn1Var, sn1Var2)) {
            return;
        }
        lm2 lm2Var = this.f79602a.f79945g;
        jk.k[] kVarArr = lv2.f79941j;
        jk.k kVar2 = kVarArr[0];
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) lm2Var.f79854a.get();
        if (customizableMediaView == null) {
            return;
        }
        lm2 lm2Var2 = this.f79602a.f79946h;
        jk.k kVar3 = kVarArr[1];
        on1 on1Var = (on1) lm2Var2.f79854a.get();
        if (on1Var == null) {
            return;
        }
        sn1Var2.a(customizableMediaView);
        customizableMediaView.post(new jv2(sn1Var, customizableMediaView, on1Var));
    }
}
