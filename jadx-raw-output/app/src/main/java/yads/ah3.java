package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ah3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final if1 f75521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv f75522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b20 f75523c;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if1 if1Var;
        b20 b20Var = this.f75523c;
        if (b20Var != null) {
            if1 if1Var2 = this.f75521a;
            if1Var = new if1(if1Var2.f78621a, if1Var2.f78622b, if1Var2.f78623c, b20Var.f75704f, if1Var2.f78625e);
        } else {
            if1Var = this.f75521a;
        }
        hv hvVar = this.f75522b;
        l12 l12Var = hvVar.f78388c;
        iv ivVar = l12Var.f79680a;
        oi oiVar = hvVar.f78386a;
        y3 y3Var = hvVar.f78387b;
        kn2 kn2Var = hvVar.f78389d;
        jx0 jx0Var = hvVar.f78390e;
        ivVar.getClass();
        new tz1(jx0Var, kn2Var, y3Var, l12Var, oiVar, if1Var).onClick(view);
    }

    public ah3(if1 if1Var, hv hvVar, b20 b20Var) {
        this.f75521a = if1Var;
        this.f75522b = hvVar;
        this.f75523c = b20Var;
    }
}
