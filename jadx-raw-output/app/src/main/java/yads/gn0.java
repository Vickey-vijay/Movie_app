package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
public final class gn0 implements bq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final en0 f77859a;

    public final void a(po2 po2Var, vp2 vp2Var, sr srVar) {
        synchronized (po2Var.f81492f) {
            po2Var.f81498l = true;
        }
        po2Var.a("post-response");
        en0 en0Var = this.f77859a;
        en0Var.f77137a.post(new fn0(po2Var, vp2Var, srVar));
    }

    public gn0(Handler handler) {
        this.f77859a = new en0(handler);
    }
}
