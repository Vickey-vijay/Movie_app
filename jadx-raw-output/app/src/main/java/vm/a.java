package vm;

import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import lj.h;

/* JADX INFO: compiled from: AbstractSession.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c.InterfaceC0769c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final zm.c f73193o = g.f73239u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f73194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f73197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f73198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f73199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f73200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f73201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f73202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f73203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f73204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f73205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f73207n;

    public a(c cVar, lj.a aVar) {
        this.f73197d = new HashMap();
        this.f73194a = cVar;
        this.f73206m = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f73199f = jCurrentTimeMillis;
        String strN = cVar.f73218p.n(aVar, jCurrentTimeMillis);
        this.f73195b = strN;
        String strE = cVar.f73218p.E(strN, aVar);
        this.f73196c = strE;
        this.f73201h = jCurrentTimeMillis;
        this.f73202i = jCurrentTimeMillis;
        this.f73207n = 1;
        int i10 = cVar.f73215m;
        this.f73205l = i10 > 0 ? ((long) i10) * 1000 : -1L;
        zm.c cVar2 = f73193o;
        if (cVar2.f()) {
            cVar2.i("new session & id " + strE + Z7.f27998r + strN, new Object[0]);
        }
    }

    public void B() {
        synchronized (this) {
            HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
            for (Object obj : this.f73197d.values()) {
                if (obj instanceof lj.f) {
                    ((lj.f) obj).sessionWillPassivate(httpSessionEvent);
                }
            }
        }
    }

    @Override // lj.e
    public void a(String str, Object obj) {
        Object objL;
        synchronized (this) {
            e();
            objL = l(str, obj);
        }
        if (obj == null || !obj.equals(objL)) {
            if (objL != null) {
                A(str, objL);
            }
            if (obj != null) {
                d(str, obj);
            }
            this.f73194a.o0(this, str, objL, obj);
        }
    }

    @Override // lj.e
    public Enumeration<String> b() {
        Enumeration<String> enumeration;
        synchronized (this) {
            e();
            enumeration = Collections.enumeration(this.f73197d == null ? Collections.EMPTY_LIST : new ArrayList(this.f73197d.keySet()));
        }
        return enumeration;
    }

    public boolean c(long j10) {
        synchronized (this) {
            if (this.f73203j) {
                return false;
            }
            this.f73206m = false;
            long j11 = this.f73201h;
            this.f73202i = j11;
            this.f73201h = j10;
            long j12 = this.f73205l;
            if (j12 <= 0 || j11 <= 0 || j11 + j12 >= j10) {
                this.f73207n++;
                return true;
            }
            invalidate();
            return false;
        }
    }

    public void g() {
        synchronized (this) {
            int i10 = this.f73207n - 1;
            this.f73207n = i10;
            if (this.f73204k && i10 <= 0) {
                k();
            }
        }
    }

    @Override // lj.e
    public Object getAttribute(String str) {
        Object obj;
        synchronized (this) {
            e();
            obj = this.f73197d.get(str);
        }
        return obj;
    }

    @Override // vm.c.InterfaceC0769c
    public a getSession() {
        return this;
    }

    public void h() {
        synchronized (this) {
            this.f73200g = this.f73201h;
        }
    }

    public void i() {
        synchronized (this) {
            HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
            for (Object obj : this.f73197d.values()) {
                if (obj instanceof lj.f) {
                    ((lj.f) obj).sessionDidActivate(httpSessionEvent);
                }
            }
        }
    }

    public void k() throws IllegalStateException {
        try {
            f73193o.i("invalidate {}", this.f73195b);
            if (v()) {
                f();
            }
            synchronized (this) {
                this.f73203j = true;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f73203j = true;
                throw th2;
            }
        }
    }

    public long m() {
        long j10;
        synchronized (this) {
            j10 = this.f73201h;
        }
        return j10;
    }

    public int n() {
        int size;
        synchronized (this) {
            e();
            size = this.f73197d.size();
        }
        return size;
    }

    @Override // lj.e
    public void removeAttribute(String str) {
        a(str, null);
    }

    public int t() {
        int i10;
        synchronized (this) {
            i10 = this.f73207n;
        }
        return i10;
    }

    public void x(int i10) {
        this.f73205l = ((long) i10) * 1000;
    }

    public void y(int i10) {
        synchronized (this) {
            this.f73207n = i10;
        }
    }

    public void A(String str, Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return;
        }
        ((h) obj).valueUnbound(new HttpSessionBindingEvent(this, str));
    }

    public void d(String str, Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return;
        }
        ((h) obj).valueBound(new HttpSessionBindingEvent(this, str));
    }

    public void e() throws IllegalStateException {
        if (this.f73203j) {
            throw new IllegalStateException();
        }
    }

    public void f() {
        ArrayList<String> arrayList;
        Object objL;
        while (true) {
            Map<String, Object> map = this.f73197d;
            if (map == null || map.size() <= 0) {
                break;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.f73197d.keySet());
            }
            for (String str : arrayList) {
                synchronized (this) {
                    objL = l(str, null);
                }
                A(str, objL);
                this.f73194a.o0(this, str, objL, null);
            }
        }
        Map<String, Object> map2 = this.f73197d;
        if (map2 != null) {
            map2.clear();
        }
    }

    @Override // lj.e
    public String getId() throws IllegalStateException {
        return this.f73194a.D ? this.f73196c : this.f73195b;
    }

    @Override // lj.e
    public void invalidate() throws IllegalStateException {
        this.f73194a.w0(this, true);
        k();
    }

    public Object j(String str) {
        return this.f73197d.get(str);
    }

    public Object l(String str, Object obj) {
        return obj == null ? this.f73197d.remove(str) : this.f73197d.put(str, obj);
    }

    public String o() {
        return this.f73195b;
    }

    public long p() {
        return this.f73200g;
    }

    public long q() throws IllegalStateException {
        return this.f73199f;
    }

    public int r() {
        return (int) (this.f73205l / 1000);
    }

    public String s() {
        return this.f73196c;
    }

    public String toString() {
        return getClass().getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + getId() + "@" + hashCode();
    }

    public boolean u() {
        return this.f73198e;
    }

    public boolean v() {
        return !this.f73203j;
    }

    public void w(boolean z10) {
        this.f73198e = z10;
    }

    public void z() throws IllegalStateException {
        boolean z10 = true;
        this.f73194a.w0(this, true);
        synchronized (this) {
            if (this.f73203j) {
                z10 = false;
            } else if (this.f73207n > 0) {
                this.f73204k = true;
                z10 = false;
            }
        }
        if (z10) {
            k();
        }
    }

    public a(c cVar, long j10, long j11, String str) {
        this.f73197d = new HashMap();
        this.f73194a = cVar;
        this.f73199f = j10;
        this.f73195b = str;
        String strE = cVar.f73218p.E(str, null);
        this.f73196c = strE;
        this.f73201h = j11;
        this.f73202i = j11;
        this.f73207n = 1;
        int i10 = cVar.f73215m;
        this.f73205l = i10 > 0 ? ((long) i10) * 1000 : -1L;
        zm.c cVar2 = f73193o;
        if (cVar2.f()) {
            cVar2.i("new session " + strE + Z7.f27998r + str, new Object[0]);
        }
    }
}
