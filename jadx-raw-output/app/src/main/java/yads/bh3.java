package yads;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes8.dex */
public final class bh3 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e72 f75831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b20 f75832b;

    @Override // yads.fv
    public final void a(if1 if1Var, hv hvVar) {
        ou ouVar = new ou(this.f75831a.getContext(), new ah3(if1Var, hvVar, this.f75832b));
        e72 e72Var = this.f75831a;
        e72Var.setOnTouchListener(ouVar);
        e72Var.setOnClickListener(ouVar);
        ImageView imageView = this.f75831a.f76954a.f77089b;
        if (imageView != null) {
            imageView.setOnTouchListener(ouVar);
            imageView.setOnClickListener(ouVar);
        }
    }

    public bh3(e72 e72Var, b20 b20Var) {
        this.f75831a = e72Var;
        this.f75832b = b20Var;
    }
}
