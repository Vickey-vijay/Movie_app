package zm;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import xm.j;
import xm.k;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f86478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f86479c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f86481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f86482f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap<String, c> f86480d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Properties f86477a = new Properties();

    /* JADX INFO: compiled from: Log.java */
    public static class a implements PrivilegedAction<Object> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
        @Override // java.security.PrivilegedAction
        public Object run() throws Throwable {
            InputStream inputStreamOpenStream;
            ?? r10 = 1;
            URL urlB = k.b(b.class, "jetty-logging.properties", true);
            ?? r11 = 0;
            try {
                if (urlB != null) {
                    try {
                        inputStreamOpenStream = urlB.openStream();
                        try {
                            b.f86477a.load(inputStreamOpenStream);
                            r10 = inputStreamOpenStream;
                        } catch (IOException e10) {
                            e = e10;
                            System.err.println("Unable to load " + urlB);
                            e.printStackTrace(System.err);
                            r10 = inputStreamOpenStream;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        inputStreamOpenStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        j.a(r11);
                        throw th;
                    }
                    j.a(r10);
                }
                Enumeration<?> enumerationPropertyNames = System.getProperties().propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    String property = System.getProperty(str);
                    if (property != null) {
                        b.f86477a.setProperty(str, property);
                    }
                }
                b.f86478b = b.f86477a.getProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.Slf4jLog");
                b.f86479c = Boolean.parseBoolean(b.f86477a.getProperty("org.eclipse.jetty.util.log.IGNORED", com.ironsource.mediationsdk.metadata.a.f29886h));
                return null;
            } catch (Throwable th3) {
                th = th3;
                r11 = r10;
            }
        }
    }

    static {
        AccessController.doPrivileged(new a());
    }

    public static Map<String, c> c() {
        return Collections.unmodifiableMap(f86480d);
    }

    public static ConcurrentMap<String, c> d() {
        return f86480d;
    }

    public static void f(Throwable th2) {
        if (th2 != null && f86479c) {
            th2.printStackTrace();
        }
        if (f86481e == null) {
            d dVar = new d();
            f86481e = dVar;
            dVar.i("Logging to {} via {}", dVar, d.class.getName());
        }
    }

    public static boolean g() {
        boolean z10 = true;
        if (f86481e != null) {
            return true;
        }
        synchronized (b.class) {
            if (f86482f) {
                if (f86481e == null) {
                    z10 = false;
                }
                return z10;
            }
            f86482f = true;
            try {
                Class clsC = k.c(b.class, f86478b);
                c cVar = f86481e;
                if (cVar == null || !cVar.getClass().equals(clsC)) {
                    c cVar2 = (c) clsC.newInstance();
                    f86481e = cVar2;
                    cVar2.i("Logging to {} via {}", cVar2, clsC.getName());
                }
            } catch (Throwable th2) {
                f(th2);
            }
            return f86481e != null;
        }
    }

    public static c a(Class<?> cls) {
        return b(cls.getName());
    }

    public static c b(String str) {
        if (!g()) {
            return null;
        }
        if (str == null) {
            return f86481e;
        }
        c cVar = f86480d.get(str);
        if (cVar == null) {
            return f86481e.j(str);
        }
        return cVar;
    }

    public static c e() {
        g();
        return f86481e;
    }
}
