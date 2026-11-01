package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ge0 implements xm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe0 f77779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o30 f77780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ae0 f77781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f77783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f77784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f77785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f77786h;

    @Override // yads.xm1
    public final mo a(fm1 fm1Var) {
        Uri uri;
        String str;
        String str2;
        Object obj;
        List list;
        p51 p51Var;
        am1 am1Var;
        fm1 fm1Var2 = fm1Var;
        fm1Var2.f77444c.getClass();
        String scheme = fm1Var2.f77444c.f85472a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        am1 am1Var2 = fm1Var2.f77444c;
        int iA = ib3.a(am1Var2.f85472a, am1Var2.f85473b);
        fe0 fe0Var = this.f77779a;
        xm1 xm1Var = (xm1) fe0Var.f77366d.get(Integer.valueOf(iA));
        if (xm1Var == null) {
            y43 y43VarA = fe0Var.a(iA);
            if (y43VarA == null) {
                xm1Var = null;
            } else {
                xm1Var = (xm1) y43VarA.get();
                hd0 hd0Var = fe0Var.f77368f;
                if (hd0Var != null) {
                    xm1Var.a(hd0Var);
                }
                ae0 ae0Var = fe0Var.f77369g;
                if (ae0Var != null) {
                    xm1Var.a(ae0Var);
                }
                fe0Var.f77366d.put(Integer.valueOf(iA), xm1Var);
            }
        }
        ni.a(xm1Var, "No suitable media source factory found for content type: " + iA);
        yl1 yl1Var = fm1Var2.f77445d;
        yl1Var.getClass();
        long j10 = yl1Var.f85039b;
        long j11 = yl1Var.f85040c;
        long j12 = yl1Var.f85041d;
        float f10 = yl1Var.f85042e;
        float f11 = yl1Var.f85043f;
        yl1 yl1Var2 = fm1Var2.f77445d;
        if (yl1Var2.f85039b == -9223372036854775807L) {
            j10 = this.f77782d;
        }
        long j13 = j10;
        if (yl1Var2.f85042e == -3.4028235E38f) {
            f10 = this.f77785g;
        }
        float f12 = f10;
        if (yl1Var2.f85043f == -3.4028235E38f) {
            f11 = this.f77786h;
        }
        float f13 = f11;
        if (yl1Var2.f85040c == -9223372036854775807L) {
            j11 = this.f77783e;
        }
        long j14 = j11;
        if (yl1Var2.f85041d == -9223372036854775807L) {
            j12 = this.f77784f;
        }
        yl1 yl1Var3 = new yl1(j13, j14, j12, f12, f13);
        if (!yl1Var3.equals(fm1Var2.f77445d)) {
            vl1 vl1Var = new vl1();
            List listEmptyList = Collections.emptyList();
            sm2 sm2VarG = p51.g();
            cm1 cm1Var = cm1.f76322d;
            ul1 ul1Var = fm1Var2.f77447f;
            ul1Var.getClass();
            sl1 sl1Var = new sl1(ul1Var);
            String str3 = fm1Var2.f77443b;
            jm1 jm1Var = fm1Var2.f77446e;
            fm1Var2.f77445d.getClass();
            cm1 cm1Var2 = fm1Var2.f77448g;
            am1 am1Var3 = fm1Var2.f77444c;
            if (am1Var3 != null) {
                str2 = am1Var3.f85476e;
                String str4 = am1Var3.f85473b;
                Uri uri2 = am1Var3.f85472a;
                list = am1Var3.f85475d;
                p51Var = am1Var3.f85477f;
                obj = am1Var3.f85478g;
                wl1 wl1Var = am1Var3.f85474c;
                vl1Var = wl1Var != null ? new vl1(wl1Var) : new vl1();
                str = str4;
                uri = uri2;
            } else {
                uri = null;
                str = null;
                str2 = null;
                obj = null;
                list = listEmptyList;
                p51Var = sm2VarG;
            }
            long j15 = yl1Var3.f85039b;
            vl1 vl1Var2 = vl1Var;
            long j16 = yl1Var3.f85040c;
            long j17 = yl1Var3.f85041d;
            float f14 = yl1Var3.f85042e;
            float f15 = yl1Var3.f85043f;
            if (vl1Var2.f83946b != null && vl1Var2.f83945a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                am1Var = new am1(uri, str, vl1Var2.f83945a != null ? new wl1(vl1Var2) : null, list, str2, p51Var, obj);
            } else {
                am1Var = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            fm1Var2 = new fm1(str3, new ul1(sl1Var), am1Var, new yl1(j15, j16, j17, f14, f15), jm1Var != null ? jm1Var : jm1.H, cm1Var2);
        }
        mo moVarA = xm1Var.a(fm1Var2);
        p51 p51Var2 = fm1Var2.f77444c.f85477f;
        if (!p51Var2.isEmpty()) {
            mo[] moVarArr = new mo[p51Var2.size() + 1];
            moVarArr[0] = moVarA;
            int i10 = 0;
            while (i10 < p51Var2.size()) {
                o30 o30Var = this.f77780b;
                o30Var.getClass();
                ae0 ae0Var2 = new ae0(0);
                ae0 ae0Var3 = this.f77781c;
                if (ae0Var3 != null) {
                    ae0Var2 = ae0Var3;
                }
                int i11 = i10 + 1;
                moVarArr[i11] = new uz2((dm1) p51Var2.get(i10), o30Var, ae0Var2, true);
                i10 = i11;
            }
            moVarA = new qs1(moVarArr, 0);
        }
        mo wvVar = moVarA;
        ul1 ul1Var2 = fm1Var2.f77447f;
        long j18 = ul1Var2.f83079b;
        if (j18 != 0 || ul1Var2.f83080c != Long.MIN_VALUE || ul1Var2.f83082e) {
            long jA = ib3.a(j18);
            long jA2 = ib3.a(fm1Var2.f77447f.f83080c);
            ul1 ul1Var3 = fm1Var2.f77447f;
            wvVar = new wv(wvVar, jA, jA2, !ul1Var3.f83083f, ul1Var3.f83081d, ul1Var3.f83082e);
        }
        fm1Var2.f77444c.getClass();
        fm1Var2.f77444c.getClass();
        return wvVar;
    }

    public ge0(o30 o30Var, od0 od0Var) {
        this.f77780b = o30Var;
        fe0 fe0Var = new fe0(od0Var);
        this.f77779a = fe0Var;
        fe0Var.b(o30Var);
        this.f77782d = -9223372036854775807L;
        this.f77783e = -9223372036854775807L;
        this.f77784f = -9223372036854775807L;
        this.f77785g = -3.4028235E38f;
        this.f77786h = -3.4028235E38f;
    }

    public static xm1 a(Class cls, o30 o30Var) {
        try {
            return (xm1) cls.getConstructor(o30.class).newInstance(o30Var);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // yads.xm1
    public final xm1 a(hd0 hd0Var) {
        fe0 fe0Var = this.f77779a;
        if (hd0Var != null) {
            fe0Var.f77368f = hd0Var;
            Iterator it = fe0Var.f77366d.values().iterator();
            while (it.hasNext()) {
                ((xm1) it.next()).a(hd0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.xm1
    public final xm1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.f77781c = ae0Var;
            fe0 fe0Var = this.f77779a;
            fe0Var.f77369g = ae0Var;
            Iterator it = fe0Var.f77366d.values().iterator();
            while (it.hasNext()) {
                ((xm1) it.next()).a(ae0Var);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
