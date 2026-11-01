package yads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class uh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv0 f83469a = new kv0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh3 f83470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th3 f83471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f83473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f83474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f83475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f83476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f83477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f83478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f83479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f83480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f83481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f83482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f83483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f83484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f83485q;

    public static qh3 a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        sh3 sh3VarA = ib3.f78556a >= 17 ? sh3.a(applicationContext) : null;
        if (sh3VarA != null) {
            return sh3VarA;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new rh3(windowManager);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    public final void b() {
        float f10;
        float f11;
        if (ib3.f78556a < 30 || this.f83473e == null) {
            return;
        }
        if (this.f83469a.f79575a.a()) {
            kv0 kv0Var = this.f83469a;
            if (kv0Var.f79575a.a()) {
                jv0 jv0Var = kv0Var.f79575a;
                long j10 = jv0Var.f79202e;
                f10 = (float) (1.0E9d / (j10 != 0 ? jv0Var.f79203f / j10 : 0L));
            } else {
                f10 = -1.0f;
            }
        } else {
            f10 = this.f83474f;
        }
        float f12 = this.f83475g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (this.f83469a.f79575a.a()) {
                kv0 kv0Var2 = this.f83469a;
                if ((kv0Var2.f79575a.a() ? kv0Var2.f79575a.f79203f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f10 - this.f83475g) < f11) {
                return;
            }
        } else if (f10 == -1.0f && this.f83469a.f79579e < 30) {
            return;
        }
        this.f83475g = f10;
        a(false);
    }

    public uh3(Context context) {
        th3 th3VarA;
        qh3 qh3VarA = a(context);
        this.f83470b = qh3VarA;
        if (qh3VarA != null) {
            th3VarA = th3.a();
        } else {
            th3VarA = null;
        }
        this.f83471c = th3VarA;
        this.f83479k = -9223372036854775807L;
        this.f83480l = -9223372036854775807L;
        this.f83474f = -1.0f;
        this.f83477i = 1.0f;
        this.f83478j = 0;
    }

    public final void a() {
        this.f83472d = true;
        this.f83481m = 0L;
        this.f83484p = -1L;
        this.f83482n = -1L;
        if (this.f83470b != null) {
            th3 th3Var = this.f83471c;
            th3Var.getClass();
            th3Var.f83055c.sendEmptyMessage(1);
            this.f83470b.a(new ph3() { // from class: cp.va
                @Override // yads.ph3
                public final void a(Display display) {
                    this.f51645a.a(display);
                }
            });
        }
        a(false);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f83479k = refreshRate;
            this.f83480l = (refreshRate * 80) / 100;
        } else {
            ih1.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f83479k = -9223372036854775807L;
            this.f83480l = -9223372036854775807L;
        }
    }

    public final void a(boolean z10) {
        Surface surface;
        if (ib3.f78556a < 30 || (surface = this.f83473e) == null || this.f83478j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f83472d) {
            float f11 = this.f83475g;
            if (f11 != -1.0f) {
                f10 = this.f83477i * f11;
            }
        }
        if (z10 || this.f83476h != f10) {
            this.f83476h = f10;
            oh3.a(surface, f10);
        }
    }
}
