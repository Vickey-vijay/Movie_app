package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes10.dex */
public final class gx3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f77969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f77970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3 f77971d;

    public gx3(ix3 ix3Var, WebView webView, String str) {
        this.f77971d = ix3Var;
        this.f77969b = webView;
        this.f77970c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ix3 ix3Var = this.f77971d;
        WebView webView = this.f77969b;
        String str = this.f77970c;
        ix3Var.getClass();
        ix3.a(webView, str);
    }
}
