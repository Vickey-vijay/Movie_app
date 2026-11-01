package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class jk3 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f79085a;

    @Override // yads.fv
    public final void a(if1 if1Var, hv hvVar) {
        Context context = this.f79085a.getContext();
        l12 l12Var = hvVar.f78388c;
        iv ivVar = l12Var.f79680a;
        oi oiVar = hvVar.f78386a;
        y3 y3Var = hvVar.f78387b;
        kn2 kn2Var = hvVar.f78389d;
        jx0 jx0Var = hvVar.f78390e;
        ivVar.getClass();
        ou ouVar = new ou(context, new tz1(jx0Var, kn2Var, y3Var, l12Var, oiVar, if1Var));
        Object obj = d02.f76497c;
        j12 j12Var = new j12(ouVar, c02.a());
        this.f79085a.setOnTouchListener(j12Var);
        this.f79085a.setOnClickListener(j12Var);
    }

    public jk3(View view) {
        this.f79085a = view;
    }
}
