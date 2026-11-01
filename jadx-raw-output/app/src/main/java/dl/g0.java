package dl;

import com.ironsource.C3426d4;
import com.ironsource.Q6;
import java.util.Arrays;

/* JADX INFO: compiled from: JsonPath.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f52147a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f52148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52149c;

    /* JADX INFO: compiled from: JsonPath.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52150a = new a();
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f52149c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f52147a[i11];
            if (obj instanceof kotlinx.serialization.descriptors.a) {
                kotlinx.serialization.descriptors.a aVar = (kotlinx.serialization.descriptors.a) obj;
                if (!ck.p.e(aVar.getKind(), kotlinx.serialization.descriptors.b.C0567b.f63247a)) {
                    int i12 = this.f52148b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(aVar.f(i12));
                    }
                } else if (this.f52148b[i11] != -1) {
                    sb2.append(C3426d4.j.f28586d);
                    sb2.append(this.f52148b[i11]);
                    sb2.append(C3426d4.j.f28588e);
                }
            } else if (obj != a.f52150a) {
                sb2.append(C3426d4.j.f28586d);
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append(C3426d4.j.f28588e);
            }
        }
        String string = sb2.toString();
        ck.p.i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void b() {
        int i10 = this.f52149c;
        int[] iArr = this.f52148b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f52149c = i10 - 1;
        }
        int i11 = this.f52149c;
        if (i11 != -1) {
            this.f52149c = i11 - 1;
        }
    }

    public final void c(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, Q6.f27488z0);
        int i10 = this.f52149c + 1;
        this.f52149c = i10;
        if (i10 == this.f52147a.length) {
            e();
        }
        this.f52147a[i10] = aVar;
    }

    public final void d() {
        int[] iArr = this.f52148b;
        int i10 = this.f52149c;
        if (iArr[i10] == -2) {
            this.f52147a[i10] = a.f52150a;
        }
    }

    public final void e() {
        int i10 = this.f52149c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f52147a, i10);
        ck.p.i(objArrCopyOf, "copyOf(this, newSize)");
        this.f52147a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f52148b, i10);
        ck.p.i(iArrCopyOf, "copyOf(this, newSize)");
        this.f52148b = iArrCopyOf;
    }

    public final void f(Object obj) {
        int[] iArr = this.f52148b;
        int i10 = this.f52149c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f52149c = i11;
            if (i11 == this.f52147a.length) {
                e();
            }
        }
        Object[] objArr = this.f52147a;
        int i12 = this.f52149c;
        objArr[i12] = obj;
        this.f52148b[i12] = -2;
    }

    public final void g(int i10) {
        this.f52148b[this.f52149c] = i10;
    }

    public g0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f52148b = iArr;
        this.f52149c = -1;
    }

    public String toString() {
        return a();
    }
}
