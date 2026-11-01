package v;

import android.util.Log;
import ck.i;
import ck.p;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f73004f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f73000b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f73001c = "DLNA_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f73002d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f73003e = 30;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static InterfaceC0763b f73005g = new InterfaceC0763b() { // from class: v.a
        @Override // v.b.InterfaceC0763b
        public final void a(int i10, String str, CharSequence charSequence, Throwable th2) {
            b.g(i10, str, charSequence, th2);
        }
    };

    /* JADX INFO: renamed from: v.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Logger.kt */
    public interface InterfaceC0763b {
        void a(int i10, String str, CharSequence charSequence, Throwable th2);
    }

    /* JADX INFO: compiled from: Logger.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final b a(String str) {
            p.j(str, "tag");
            return new b(str);
        }
    }

    public static /* synthetic */ void c(b bVar, CharSequence charSequence, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        bVar.b(charSequence, th2);
    }

    public static /* synthetic */ void f(b bVar, CharSequence charSequence, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        bVar.e(charSequence, th2);
    }

    public static /* synthetic */ void i(b bVar, CharSequence charSequence, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        bVar.h(charSequence, th2);
    }

    public final void b(CharSequence charSequence, Throwable th2) {
        p.j(charSequence, "message");
        if (!f73002d || 50 < f73003e) {
            return;
        }
        f73005g.a(50, d(), charSequence, th2);
    }

    public final String d() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f73001c);
        sb2.append(this.f73006a);
        if (f73004f) {
            str = '[' + Thread.currentThread().getName() + ']';
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void e(CharSequence charSequence, Throwable th2) {
        p.j(charSequence, "message");
        if (!f73002d || 30 < f73003e) {
            return;
        }
        f73005g.a(30, d(), charSequence, th2);
    }

    public final void h(CharSequence charSequence, Throwable th2) {
        p.j(charSequence, "message");
        if (!f73002d || 40 < f73003e) {
            return;
        }
        f73005g.a(40, d(), charSequence, th2);
    }

    public b(String str) {
        p.j(str, "tag");
        this.f73006a = str;
    }

    public static final void g(int i10, String str, CharSequence charSequence, Throwable th2) {
        p.j(str, "tag");
        p.j(charSequence, "message");
        if (th2 != null) {
            if (i10 != 10) {
                if (i10 != 20) {
                    if (i10 != 30) {
                        if (i10 != 40) {
                            if (i10 == 50) {
                                Log.e(str, charSequence.toString(), th2);
                                return;
                            }
                            return;
                        }
                        Log.w(str, charSequence.toString(), th2);
                        return;
                    }
                    Log.i(str, charSequence.toString(), th2);
                    return;
                }
                Log.d(str, charSequence.toString(), th2);
                return;
            }
            Log.v(str, charSequence.toString(), th2);
            return;
        }
        if (i10 != 10) {
            if (i10 != 20) {
                if (i10 != 30) {
                    if (i10 != 40) {
                        if (i10 == 50) {
                            Log.e(str, charSequence.toString());
                            return;
                        }
                        return;
                    }
                    Log.w(str, charSequence.toString());
                    return;
                }
                Log.i(str, charSequence.toString());
                return;
            }
            Log.d(str, charSequence.toString());
            return;
        }
        Log.v(str, charSequence.toString());
    }
}
