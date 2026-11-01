package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class u22 implements w02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w02 f83333b;

    @Override // yads.w02
    public final void a(r12 r12Var, pu puVar) {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            w02Var.a(r12Var, puVar);
        }
    }

    @Override // yads.w02
    public final void b(b10 b10Var) {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            w02Var.b(b10Var);
        }
    }

    @Override // yads.w02
    public final void a(r12 r12Var) {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            w02Var.a(r12Var);
        }
    }

    @Override // yads.w02
    public final d12 b() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            return w02Var.b();
        }
        return null;
    }

    @Override // yads.w02
    public final d42 c() {
        d42 d42VarC;
        w02 w02Var = this.f83333b;
        return (w02Var == null || (d42VarC = w02Var.c()) == null) ? new d42(null, null) : d42VarC;
    }

    @Override // yads.w02
    public final List d() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            return w02Var.d();
        }
        return null;
    }

    @Override // yads.w02
    public final void destroy() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            w02Var.destroy();
        }
    }

    @Override // yads.w02
    public final y00 getAdAssets() {
        y00 adAssets;
        w02 w02Var = this.f83333b;
        return (w02Var == null || (adAssets = w02Var.getAdAssets()) == null) ? new y00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false) : adAssets;
    }

    @Override // yads.w02
    public final cq2 getAdType() {
        cq2 adType;
        w02 w02Var = this.f83333b;
        return (w02Var == null || (adType = w02Var.getAdType()) == null) ? cq2.f76403c : adType;
    }

    @Override // yads.w02
    public final String getCampaignId() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            return w02Var.getCampaignId();
        }
        return null;
    }

    @Override // yads.w02
    public final String getCreativeId() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            return w02Var.getCreativeId();
        }
        return null;
    }

    @Override // yads.w02
    public final String getInfo() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            return w02Var.getInfo();
        }
        return null;
    }

    @Override // yads.w02
    public final void loadImages() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            w02Var.loadImages();
        }
    }

    public u22(ArrayList arrayList) {
        w02 w02Var;
        this.f83332a = arrayList;
        if (arrayList.isEmpty()) {
            w02Var = null;
        } else {
            w02Var = (w02) arrayList.get(0);
        }
        this.f83333b = w02Var;
    }

    @Override // yads.w02
    public final gc a() {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            return w02Var.a();
        }
        return null;
    }

    @Override // yads.w02
    public final void a(b10 b10Var) {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            w02Var.a(b10Var);
        }
    }

    @Override // yads.w02
    public final void a(z00 z00Var) {
        w02 w02Var = this.f83333b;
        if (w02Var != null) {
            w02Var.a(z00Var);
        }
    }
}
