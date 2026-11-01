package wm;

import java.io.IOException;
import javax.servlet.DispatcherType;
import org.eclipse.jetty.http.PathMap;
import xm.p;
import ym.e;

/* JADX INFO: compiled from: FilterMapping.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74153b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f74154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient org.eclipse.jetty.servlet.a f74155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f74156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f74157f;

    /* JADX INFO: renamed from: wm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FilterMapping.java */
    public static /* synthetic */ class C0784a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74158a;

        static {
            int[] iArr = new int[DispatcherType.values().length];
            f74158a = iArr;
            try {
                iArr[DispatcherType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74158a[DispatcherType.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74158a[DispatcherType.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74158a[DispatcherType.INCLUDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74158a[DispatcherType.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int c(DispatcherType dispatcherType) {
        int i10 = C0784a.f74158a[dispatcherType.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 16;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 != 4) {
                if (i10 == 5) {
                    return 8;
                }
                throw new IllegalArgumentException(dispatcherType.toString());
            }
        }
        return i11;
    }

    public boolean a(int i10) {
        int i11 = this.f74153b;
        if (i11 == 0) {
            return i10 == 1 || (i10 == 16 && this.f74155d.r0());
        }
        return (i10 & i11) != 0;
    }

    public org.eclipse.jetty.servlet.a d() {
        return this.f74155d;
    }

    public String e() {
        return this.f74154c;
    }

    public String[] f() {
        return this.f74156e;
    }

    public String[] g() {
        return this.f74157f;
    }

    public void h(org.eclipse.jetty.servlet.a aVar) {
        this.f74155d = aVar;
        i(aVar.getName());
    }

    public void i(String str) {
        this.f74154c = str;
    }

    public String toString() {
        return p.a(this.f74156e) + "/" + p.a(this.f74157f) + "==" + this.f74153b + "=>" + this.f74154c;
    }

    public boolean b(String str, int i10) {
        if (a(i10)) {
            int i11 = 0;
            while (true) {
                String[] strArr = this.f74156e;
                if (i11 >= strArr.length) {
                    break;
                }
                String str2 = strArr[i11];
                if (str2 != null && PathMap.match(str2, str, true)) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // ym.e
    public void z(Appendable appendable, String str) throws IOException {
        appendable.append(String.valueOf(this)).append("\n");
    }
}
