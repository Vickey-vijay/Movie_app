package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class v22 extends p32 implements w02 {
    public final u22 P;
    public final mi2 Q;

    @Override // yads.w02
    public final void a(r12 r12Var, pu puVar) {
        this.P.a(r12Var, puVar);
    }

    @Override // yads.w02
    public final void b(b10 b10Var) {
        this.P.b(b10Var);
    }

    @Override // yads.w02
    public final void a(r12 r12Var) {
        this.P.a(r12Var);
    }

    public final void b(z00 z00Var) {
        super.a(z00Var);
    }

    @Override // yads.w02
    public final y00 getAdAssets() {
        return this.P.getAdAssets();
    }

    @Override // yads.w02
    public final cq2 getAdType() {
        return this.P.getAdType();
    }

    @Override // yads.w02
    public final String getCampaignId() {
        return this.P.getCampaignId();
    }

    @Override // yads.w02
    public final String getCreativeId() {
        return this.P.getCreativeId();
    }

    @Override // yads.w02
    public final String getInfo() {
        return this.P.getInfo();
    }

    public final ArrayList i() {
        return new ArrayList(this.P.f83332a);
    }

    @Override // yads.p32, yads.w02
    public final void loadImages() {
        this.P.loadImages();
    }

    public v22(Context context, u22 u22Var, mi2 mi2Var, up upVar, fz1 fz1Var) {
        super(context, upVar, fz1Var);
        this.P = u22Var;
        this.Q = mi2Var;
        a(a(upVar.d().a()));
    }

    @Override // yads.w02
    public final gc a() {
        return this.P.a();
    }

    @Override // yads.w02
    public final void a(b10 b10Var) {
        this.P.a(b10Var);
    }

    @Override // yads.p32, yads.w02
    public final void a(z00 z00Var) {
        this.P.a(z00Var);
    }

    public final i22 a(d4 d4Var) {
        v42 v42Var = v42.f83737c;
        i22 i22Var = new i22(d4Var, "ad_unit", this.f81223i, this.f81224j, new f22(), null);
        i22Var.f78463f = q22.f81687c;
        return i22Var;
    }
}
