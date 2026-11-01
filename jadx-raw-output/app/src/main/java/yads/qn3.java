package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class qn3 implements gl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y12 f81909a;

    @Override // yads.gl1
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // yads.gl1
    public final CheckBox getMuteControl() {
        lm2 lm2Var = this.f81909a.f84793c;
        jk.k kVar = y12.f84790g[2];
        return (CheckBox) lm2Var.f79854a.get();
    }

    @Override // yads.gl1
    public final ProgressBar getVideoProgress() {
        lm2 lm2Var = this.f81909a.f84794d;
        jk.k kVar = y12.f84790g[3];
        return (ProgressBar) lm2Var.f79854a.get();
    }

    public qn3(y12 y12Var) {
        this.f81909a = y12Var;
    }
}
