package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class zv3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f85620b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f85620b.destroy();
    }

    public zv3(dw3 dw3Var) {
        this.f85620b = dw3Var.f76830g;
    }
}
