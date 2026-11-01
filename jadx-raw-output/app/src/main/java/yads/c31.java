package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class c31 implements d31 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f76138h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh f76139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg f76140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wg f76141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f76142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tg f76143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e31 f76144f = e31.f76897b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f76145g;

    public final void a(tg tgVar) {
        synchronized (f76138h) {
            this.f76140b.getClass();
            String str = tgVar.f83019a;
            String str2 = tgVar.f83020b;
            String str3 = tgVar.f83021c;
            if (!(str3 == null || str3.length() == 0)) {
                if (!(str == null || str.length() == 0)) {
                    if (!(str2 == null || str2.length() == 0)) {
                        this.f76143e = tgVar;
                    }
                }
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public c31(Context context, fh fhVar, yg ygVar, wg wgVar, bj1 bj1Var) {
        this.f76139a = fhVar;
        this.f76140b = ygVar;
        this.f76141c = wgVar;
        this.f76142d = context.getApplicationContext();
        this.f76145g = bj1Var.a();
    }

    public final void a() {
        wg wgVar = this.f76141c;
        Context context = this.f76142d;
        ug ugVar = wgVar.f84192a;
        synchronized (ugVar.f83460a) {
            ugVar.f83461b.add(this);
        }
        try {
            wgVar.a(context);
        } catch (Throwable unused) {
            wgVar.c();
            boolean z10 = ad1.f75480a;
        }
    }
}
