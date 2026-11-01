package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public final class l33 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f79695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf f79696c;

    @Override // java.lang.Runnable
    public final void run() {
        this.f79696c.a(this.f79695b);
    }

    public l33(TextView textView, gf gfVar) {
        this.f79695b = textView;
        this.f79696c = gfVar;
    }
}
