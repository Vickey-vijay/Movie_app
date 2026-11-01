package yads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.Z7;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class po2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km3 f81488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f81490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f81492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tp2 f81493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f81494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cp2 f81495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f81500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qe0 f81501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lr f81502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f81503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public no2 f81504r;

    public im3 a(im3 im3Var) {
        return im3Var;
    }

    public abstract vp2 a(e82 e82Var);

    public void a() {
        synchronized (this.f81492f) {
            this.f81497k = true;
            this.f81493g = null;
        }
    }

    public abstract void a(Object obj);

    public byte[] b() {
        return null;
    }

    public final void c(String str) {
        cp2 cp2Var = this.f81495i;
        if (cp2Var != null) {
            synchronized (cp2Var.f76383b) {
                cp2Var.f76383b.remove(this);
            }
            synchronized (cp2Var.f76391j) {
                Iterator it = cp2Var.f76391j.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            cp2Var.a(this, 5);
        }
        if (km3.f79477c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new mo2(this, str, id2));
                return;
            }
            this.f81488b.a(str, id2);
            km3 km3Var = this.f81488b;
            toString();
            km3Var.a();
        }
    }

    public int f() {
        return 2;
    }

    public final void k() {
        this.f81496j = false;
    }

    public final void l() {
        this.f81500n = true;
    }

    public final void m() {
        this.f81499m = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        po2 po2Var = (po2) obj;
        int iF = f();
        int iF2 = po2Var.f();
        return iF == iF2 ? this.f81494h.intValue() - po2Var.f81494h.intValue() : hg0.a(iF2) - hg0.a(iF);
    }

    public final int e() {
        return this.f81489c;
    }

    public String g() {
        return this.f81490d;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f81492f) {
            z10 = this.f81498l;
        }
        return z10;
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f81492f) {
            z10 = this.f81497k;
        }
        return z10;
    }

    public final void j() {
        no2 no2Var;
        synchronized (this.f81492f) {
            no2Var = this.f81504r;
        }
        if (no2Var != null) {
            ((en3) no2Var).b(this);
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f81491e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i() ? "[X] " : "[ ] ");
        sb2.append(g());
        sb2.append(Z7.f27998r);
        sb2.append(str);
        sb2.append(Z7.f27998r);
        sb2.append(oo2.a(f()));
        sb2.append(Z7.f27998r);
        sb2.append(this.f81494h);
        return sb2.toString();
    }

    public po2(int i10, String str, tp2 tp2Var) {
        km3 km3Var;
        if (km3.f79477c) {
            km3Var = new km3();
        } else {
            km3Var = null;
        }
        this.f81488b = km3Var;
        this.f81492f = new Object();
        this.f81496j = true;
        this.f81497k = false;
        this.f81498l = false;
        this.f81499m = false;
        this.f81500n = false;
        this.f81502p = null;
        this.f81489c = i10;
        this.f81490d = str;
        this.f81493g = tp2Var;
        a(new qe0());
        this.f81491e = b(str);
    }

    public static int b(String str) {
        Uri uri;
        String host;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            return host.hashCode();
        }
        return 0;
    }

    public Map d() {
        return Collections.emptyMap();
    }

    public final void a(vp2 vp2Var) {
        no2 no2Var;
        synchronized (this.f81492f) {
            no2Var = this.f81504r;
        }
        if (no2Var != null) {
            ((en3) no2Var).a(this, vp2Var);
        }
    }

    public final void a(int i10) {
        cp2 cp2Var = this.f81495i;
        if (cp2Var != null) {
            cp2Var.a(this, i10);
        }
    }

    public final void a(no2 no2Var) {
        synchronized (this.f81492f) {
            this.f81504r = no2Var;
        }
    }

    public final void a(qe0 qe0Var) {
        this.f81501o = qe0Var;
    }

    public final void a(String str) {
        if (km3.f79477c) {
            this.f81488b.a(str, Thread.currentThread().getId());
        }
    }

    public final String c() {
        String strG = g();
        int i10 = this.f81489c;
        if (i10 == 0 || i10 == -1) {
            return strG;
        }
        return Integer.toString(i10) + '-' + strG;
    }
}
