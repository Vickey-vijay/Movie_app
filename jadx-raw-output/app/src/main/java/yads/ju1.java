package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ju1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ju1 f79192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f79193c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj.i f79194a = new nj.i();

    public final void a() {
        synchronized (f79193c) {
            this.f79194a.clear();
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final List b() {
        List listO0;
        synchronized (f79193c) {
            listO0 = nj.b0.O0(this.f79194a);
        }
        return listO0;
    }
}
