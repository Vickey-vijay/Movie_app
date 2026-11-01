package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.AppMetrica;
import java.util.concurrent.TimeUnit;
import yads.wg;

/* JADX INFO: loaded from: classes11.dex */
public final class wg implements dh {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f84191g = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug f84192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh f84193b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84196e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f84194c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg f84195d = new rg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f84197f = new Object();

    public final void a() {
        boolean z10 = ad1.f75480a;
        ug ugVar = this.f84192a;
        synchronized (ugVar.f83460a) {
            ugVar.f83461b.clear();
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void b() {
        final vg vgVar = new vg(this);
        this.f84194c.postDelayed(new Runnable() { // from class: cp.sb
            @Override // java.lang.Runnable
            public final void run() {
                wg.a(vgVar);
            }
        }, f84191g);
    }

    public final void c() {
        synchronized (this.f84197f) {
            this.f84194c.removeCallbacksAndMessages(null);
            this.f84196e = false;
            mj.r rVar = mj.r.f64562a;
        }
    }

    public wg(ug ugVar, fh fhVar) {
        this.f84192a = ugVar;
        this.f84193b = fhVar;
    }

    public static final void a(bk.a aVar) {
        aVar.invoke();
    }

    public final void a(Context context) {
        boolean z10;
        synchronized (this.f84197f) {
            z10 = true;
            if (this.f84196e) {
                z10 = false;
            } else {
                this.f84196e = true;
            }
            mj.r rVar = mj.r.f64562a;
        }
        if (z10) {
            boolean z11 = ad1.f75480a;
            b();
            this.f84193b.getClass();
            try {
                AppMetrica.requestStartupParams(context, new hh(this), ih.f78655a);
            } catch (Throwable unused) {
                boolean z12 = ad1.f75480a;
                ch chVar = ch.f76278b;
                c();
                this.f84195d.f82253a.getClass();
                String str = (String) sg.f82629a.get(chVar);
                if (str == null) {
                    str = "Unknown";
                }
                rg.a(str);
                a();
            }
        }
    }
}
