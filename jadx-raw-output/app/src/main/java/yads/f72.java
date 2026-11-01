package yads;

import android.view.TextureView;

/* JADX INFO: loaded from: classes7.dex */
public final class f72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p52 f77319a;

    public final void a(e72 e72Var) {
        TextureView textureView = e72Var.f76955b;
        this.f77319a.a(textureView);
        textureView.setVisibility(0);
        e72Var.f76956c.setVisibility(0);
        e72Var.f76954a.setVisibility(0);
    }

    public final void b(e72 e72Var) {
        TextureView textureView = e72Var.f76955b;
        this.f77319a.a((TextureView) null);
        textureView.setVisibility(8);
        e72Var.f76956c.setVisibility(8);
        e72Var.f76954a.setVisibility(8);
    }

    public f72(p52 p52Var) {
        this.f77319a = p52Var;
    }
}
