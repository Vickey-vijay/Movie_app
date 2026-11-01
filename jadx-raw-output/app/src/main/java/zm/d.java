package zm;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.Z7;
import java.io.PrintStream;
import java.security.AccessControlException;
import java.util.Properties;
import xm.i;

/* JADX INFO: compiled from: StdErrLog.java */
/* JADX INFO: loaded from: classes11.dex */
public class d extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f86483i = System.getProperty("line.separator");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static i f86484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Properties f86485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f86486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f86487m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PrintStream f86490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f86493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f86494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86495h;

    public d() {
        this(null);
    }

    public static int t(String str, String str2) {
        if (str2 == null) {
            return -1;
        }
        String strTrim = str2.trim();
        if ("ALL".equalsIgnoreCase(strTrim)) {
            return 0;
        }
        if ("DEBUG".equalsIgnoreCase(strTrim)) {
            return 1;
        }
        if ("INFO".equalsIgnoreCase(strTrim)) {
            return 2;
        }
        if ("WARN".equalsIgnoreCase(strTrim)) {
            return 3;
        }
        System.err.println("Unknown StdErrLog level [" + str + "]=[" + strTrim + "], expecting only [ALL, DEBUG, INFO, WARN] as values.");
        return -1;
    }

    public final void o(StringBuilder sb2, String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isISOControl(cCharAt)) {
                sb2.append(cCharAt);
            } else if (cCharAt == '\n') {
                sb2.append('|');
            } else if (cCharAt == '\r') {
                sb2.append('<');
            } else {
                sb2.append('?');
            }
        }
    }

    public final void p(StringBuilder sb2, String str, String str2, Throwable th2) {
        q(sb2, str, str2, new Object[0]);
        if (v()) {
            r(sb2, String.valueOf(th2), new Object[0]);
        } else {
            s(sb2, th2);
        }
    }

    public final void r(StringBuilder sb2, String str, Object... objArr) {
        if (str == null) {
            str = "";
            for (int i10 = 0; i10 < objArr.length; i10++) {
                str = str + "{} ";
            }
        }
        int length = 0;
        for (Object obj : objArr) {
            int iIndexOf = str.indexOf(JsonUtils.EMPTY_JSON, length);
            if (iIndexOf < 0) {
                o(sb2, str.substring(length));
                sb2.append(Z7.f27998r);
                sb2.append(obj);
                length = str.length();
            } else {
                o(sb2, str.substring(length, iIndexOf));
                sb2.append(String.valueOf(obj));
                length = iIndexOf + 2;
            }
        }
        o(sb2, str.substring(length));
    }

    public final void y(StringBuilder sb2, String str, int i10, String str2) {
        sb2.setLength(0);
        sb2.append(str);
        if (i10 > 99) {
            sb2.append('.');
        } else if (i10 > 9) {
            sb2.append(".0");
        } else {
            sb2.append(".00");
        }
        sb2.append(i10);
        sb2.append(str2);
        if (this.f86492e) {
            sb2.append(this.f86493f);
        } else {
            sb2.append(this.f86494g);
        }
        sb2.append(':');
        if (this.f86491d) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (!className.equals(d.class.getName()) && !className.equals(b.class.getName())) {
                    if (this.f86492e || !className.startsWith("org.eclipse.jetty.")) {
                        sb2.append(className);
                    } else {
                        sb2.append(n(className));
                    }
                    sb2.append('#');
                    sb2.append(stackTraceElement.getMethodName());
                    if (stackTraceElement.getFileName() != null) {
                        sb2.append('(');
                        sb2.append(stackTraceElement.getFileName());
                        sb2.append(':');
                        sb2.append(stackTraceElement.getLineNumber());
                        sb2.append(')');
                    }
                    sb2.append(':');
                    return;
                }
            }
        }
    }

    static {
        Properties properties = new Properties();
        f86485k = properties;
        Properties properties2 = b.f86477a;
        f86486l = Boolean.parseBoolean(properties2.getProperty("org.eclipse.jetty.util.log.SOURCE", properties2.getProperty("org.eclipse.jetty.util.log.stderr.SOURCE", com.ironsource.mediationsdk.metadata.a.f29886h)));
        f86487m = Boolean.parseBoolean(b.f86477a.getProperty("org.eclipse.jetty.util.log.stderr.LONG", com.ironsource.mediationsdk.metadata.a.f29886h));
        properties.putAll(b.f86477a);
        String[] strArr = {"DEBUG", "org.eclipse.jetty.util.log.DEBUG", "org.eclipse.jetty.util.log.stderr.DEBUG"};
        for (int i10 = 0; i10 < 3; i10++) {
            String str = strArr[i10];
            if (System.getProperty(str) != null) {
                System.err.printf("System Property [%s] has been deprecated! (Use org.eclipse.jetty.LEVEL=DEBUG instead)%n", str);
            }
        }
        try {
            f86484j = new i("yyyy-MM-dd HH:mm:ss");
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
        }
    }

    public d(String str) {
        this(str, f86485k);
    }

    public static String n(String str) {
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArrSplit.length - 1; i10++) {
            sb2.append(strArrSplit[i10].charAt(0));
        }
        if (sb2.length() > 0) {
            sb2.append('.');
        }
        sb2.append(strArrSplit[strArrSplit.length - 1]);
        return sb2.toString();
    }

    public static int u(Properties properties, String str) {
        while (str != null && str.length() > 0) {
            int iT = t(str + ".LEVEL", properties.getProperty(str + ".LEVEL"));
            if (iT != -1) {
                return iT;
            }
            int iLastIndexOf = str.lastIndexOf(46);
            str = iLastIndexOf >= 0 ? str.substring(0, iLastIndexOf) : null;
        }
        return t("log.LEVEL", properties.getProperty("log.LEVEL", "INFO"));
    }

    @Override // zm.c
    public void a(Throwable th2) {
        d("", th2);
    }

    @Override // zm.c
    public void b(String str, Throwable th2) {
        if (this.f86488a <= 2) {
            StringBuilder sb2 = new StringBuilder(64);
            p(sb2, ":INFO:", str, th2);
            PrintStream printStream = this.f86490c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // zm.c
    public void c(String str, Throwable th2) {
        if (this.f86488a <= 3) {
            StringBuilder sb2 = new StringBuilder(64);
            p(sb2, ":WARN:", str, th2);
            PrintStream printStream = this.f86490c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // zm.c
    public void d(String str, Throwable th2) {
        if (this.f86488a <= 1) {
            StringBuilder sb2 = new StringBuilder(64);
            p(sb2, ":DBUG:", str, th2);
            PrintStream printStream = this.f86490c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // zm.c
    public void e(Throwable th2) {
        c("", th2);
    }

    @Override // zm.c
    public boolean f() {
        return this.f86488a <= 1;
    }

    @Override // zm.c
    public void g(String str, Object... objArr) {
        if (this.f86488a <= 3) {
            StringBuilder sb2 = new StringBuilder(64);
            q(sb2, ":WARN:", str, objArr);
            PrintStream printStream = this.f86490c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // zm.c
    public String getName() {
        return this.f86493f;
    }

    @Override // zm.c
    public void h(Throwable th2) {
        if (this.f86488a <= 0) {
            StringBuilder sb2 = new StringBuilder(64);
            p(sb2, ":IGNORED:", "", th2);
            PrintStream printStream = this.f86490c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // zm.c
    public void i(String str, Object... objArr) {
        if (this.f86488a <= 1) {
            StringBuilder sb2 = new StringBuilder(64);
            q(sb2, ":DBUG:", str, objArr);
            PrintStream printStream = this.f86490c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // zm.c
    public void k(String str, Object... objArr) {
        if (this.f86488a <= 2) {
            StringBuilder sb2 = new StringBuilder(64);
            q(sb2, ":INFO:", str, objArr);
            PrintStream printStream = this.f86490c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // zm.a
    public c m(String str) {
        d dVar = new d(str);
        dVar.w(this.f86492e);
        dVar.x(this.f86491d);
        dVar.f86490c = this.f86490c;
        int i10 = this.f86488a;
        if (i10 != this.f86489b) {
            dVar.f86488a = i10;
        }
        return dVar;
    }

    public final void q(StringBuilder sb2, String str, String str2, Object... objArr) {
        y(sb2, f86484j.c(), f86484j.b(), str);
        r(sb2, str2, objArr);
    }

    public final void s(StringBuilder sb2, Throwable th2) {
        if (th2 == null) {
            sb2.append("null");
            return;
        }
        sb2.append(f86483i);
        r(sb2, th2.toString(), new Object[0]);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        for (int i10 = 0; stackTrace != null && i10 < stackTrace.length; i10++) {
            sb2.append(f86483i);
            sb2.append("\tat ");
            r(sb2, stackTrace[i10].toString(), new Object[0]);
        }
        Throwable cause = th2.getCause();
        if (cause == null || cause == th2) {
            return;
        }
        sb2.append(f86483i);
        sb2.append("Caused by: ");
        s(sb2, cause);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StdErrLog:");
        sb2.append(this.f86493f);
        sb2.append(":LEVEL=");
        int i10 = this.f86488a;
        if (i10 == 0) {
            sb2.append("ALL");
        } else if (i10 == 1) {
            sb2.append("DEBUG");
        } else if (i10 == 2) {
            sb2.append("INFO");
        } else if (i10 != 3) {
            sb2.append("?");
        } else {
            sb2.append("WARN");
        }
        return sb2.toString();
    }

    public boolean v() {
        return this.f86495h;
    }

    public void w(boolean z10) {
        this.f86492e = z10;
    }

    public void x(boolean z10) {
        this.f86491d = z10;
    }

    public d(String str, Properties properties) {
        Properties properties2;
        this.f86488a = 2;
        this.f86490c = null;
        this.f86491d = f86486l;
        this.f86492e = f86487m;
        this.f86495h = false;
        if (properties != null && properties != (properties2 = f86485k)) {
            properties2.putAll(properties);
        }
        str = str == null ? "" : str;
        this.f86493f = str;
        this.f86494g = n(str);
        int iU = u(properties, str);
        this.f86488a = iU;
        this.f86489b = iU;
        try {
            this.f86491d = Boolean.parseBoolean(properties.getProperty(str + ".SOURCE", Boolean.toString(this.f86491d)));
        } catch (AccessControlException unused) {
            this.f86491d = f86486l;
        }
    }
}
