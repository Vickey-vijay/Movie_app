package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class ow3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f81170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qw3 f81171c;

    public ow3(qw3 qw3Var, float f10) {
        this.f81171c = qw3Var;
        this.f81170b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        jx3 jx3Var = this.f81171c.f82015b.f84035e;
        float f10 = this.f81170b;
        jx3Var.f79232a = f10;
        if (jx3Var.f79236e == null) {
            jx3Var.f79236e = nw3.f80846c;
        }
        Iterator it = Collections.unmodifiableCollection(jx3Var.f79236e.f80848b).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f84355e;
            ix3.f78850a.a((WebView) kaVar.f79343b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f79342a);
        }
    }
}
