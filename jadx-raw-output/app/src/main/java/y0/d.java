package y0;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f75189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1.b f75190b;

    public void a(String str) {
        g(3, str);
    }

    public void b(String str) {
        g(6, str);
    }

    public void c(String str, Throwable th2) {
        h(6, str, th2);
    }

    public void d(String str, Object... objArr) {
        i(6, str, objArr);
    }

    public void f(String str) {
        g(4, str);
    }

    public void k(String str) {
        g(5, str);
    }

    public final String e(String str, Object... objArr) {
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i10]);
        }
        return sb2.toString();
    }

    public void g(int i10, String str) {
        if (i10 < this.f75189a.f75154a) {
            return;
        }
        j(i10, str);
    }

    public final void h(int i10, String str, Throwable th2) {
        String str2;
        if (i10 < this.f75189a.f75154a) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null || str.length() == 0) {
            str2 = "";
        } else {
            str2 = str + j1.c.f61690a;
        }
        sb2.append(str2);
        sb2.append(this.f75189a.f75163j.a(th2));
        j(i10, sb2.toString());
    }

    public final void i(int i10, String str, Object... objArr) {
        if (i10 < this.f75189a.f75154a) {
            return;
        }
        j(i10, e(str, objArr));
    }

    public final void j(int i10, String str) {
        String strA;
        String string;
        a aVar = this.f75189a;
        String str2 = aVar.f75155b;
        String strA2 = aVar.f75156c ? aVar.f75164k.a(Thread.currentThread()) : null;
        a aVar2 = this.f75189a;
        if (aVar2.f75157d) {
            g1.b bVar = aVar2.f75165l;
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            a aVar3 = this.f75189a;
            strA = bVar.a(k1.a.b(stackTrace, aVar3.f75158e, aVar3.f75159f));
        } else {
            strA = null;
        }
        if (this.f75189a.f75168o != null) {
            b bVar2 = new b(i10, str2, strA2, strA, str);
            for (i1.a aVar4 : this.f75189a.f75168o) {
                bVar2 = aVar4.a(bVar2);
                if (bVar2 == null) {
                    return;
                }
                if (bVar2.f75185b == null || bVar2.f75186c == null) {
                    throw new IllegalStateException("Interceptor " + aVar4 + " should not remove the tag or message of a log, if you don't want to print this log, just return a null when intercept.");
                }
            }
            i10 = bVar2.f75184a;
            str2 = bVar2.f75185b;
            strA2 = bVar2.f75187d;
            strA = bVar2.f75188e;
            str = bVar2.f75186c;
        }
        l1.b bVar3 = this.f75190b;
        a aVar5 = this.f75189a;
        if (aVar5.f75160g) {
            string = aVar5.f75166m.a(new String[]{strA2, strA, str});
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strA2 != null ? strA2 + j1.c.f61690a : "");
            sb2.append(strA != null ? strA + j1.c.f61690a : "");
            sb2.append(str);
            string = sb2.toString();
        }
        bVar3.a(i10, str2, string);
    }

    public d(a aVar, l1.b bVar) {
        this.f75189a = aVar;
        this.f75190b = bVar;
    }
}
