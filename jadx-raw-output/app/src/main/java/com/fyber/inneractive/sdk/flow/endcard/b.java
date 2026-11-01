package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15357a = IAlog.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f15358b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f15359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f15360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15362f;

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        n nVar = this.f15360d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public abstract void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(JSONArray jSONArray) {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return f().b();
    }

    public abstract n c();

    public abstract com.fyber.inneractive.sdk.util.g g();

    public abstract l h();

    public abstract com.fyber.inneractive.sdk.model.vast.i i();

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public static boolean b(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar == null) {
            return false;
        }
        Boolean boolC = uVar.c("shouldEnableEndCardAutoClick");
        return boolC != null ? boolC.booleanValue() : false;
    }

    public com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.u uVar = this.f15359c.f15758g;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.f18056a = l();
        cVar.f18061f = i();
        boolean zB = b(uVar);
        Integer numValueOf = Integer.valueOf(a(uVar));
        if (zB) {
            cVar.f18059d = numValueOf;
        }
        return cVar;
    }

    public final n f() {
        if (this.f15360d == null) {
            this.f15360d = c();
        }
        return this.f15360d;
    }

    public b(int i10, x0 x0Var) {
        this.f15359c = x0Var;
        this.f15362f = i10;
    }

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f15357a);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        e();
        n nVar = this.f15360d;
        if (nVar != null) {
            nVar.destroy();
            this.f15360d = null;
        }
    }

    public void e() {
        a();
    }

    public void m() {
        IAlog.a("%s loading success for %s", i(), this.f15357a);
    }

    public static int a(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar == null) {
            return 3;
        }
        Integer numA = uVar.a("autoClickDelay");
        int iIntValue = numA != null ? numA.intValue() : 3;
        if (iIntValue < 0 || iIntValue > 10) {
            return 3;
        }
        return iIntValue;
    }
}
