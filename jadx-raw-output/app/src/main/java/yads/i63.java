package yads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f78505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc2 f78506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hg2 f78507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j63 f78508d;

    public /* synthetic */ i63(Set set) {
        this(set, new dc2(), new hg2(), new j63());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    public final xc3 a(String str) {
        Long lValueOf;
        Integer numValueOf;
        Float fP;
        if (this.f78505a.contains(g63.f77645d) && ck.p.e("start", str)) {
            return new xc3(wc3.f84168b, 0.0f);
        }
        if (this.f78505a.contains(g63.f77646e) && ck.p.e("end", str)) {
            return new xc3(wc3.f84169c, 100.0f);
        }
        if (this.f78505a.contains(g63.f77644c) && lk.x.D(str, "%", false, 2, null)) {
            this.f78506b.getClass();
            try {
                String strSubstring = str.substring(0, lk.a0.f0(str));
                ck.p.i(strSubstring, "substring(...)");
                fP = lk.v.p(strSubstring);
                if (fP != null) {
                    float fFloatValue = fP.floatValue();
                    if (0.0f > fFloatValue || fFloatValue > 100.0f) {
                        fP = null;
                    }
                } else {
                    fP = null;
                }
            } catch (Throwable unused) {
            }
            if (fP != null) {
                return new xc3(wc3.f84169c, fP.floatValue());
            }
            return null;
        }
        if (this.f78505a.contains(g63.f77647f) && lk.x.R(str, "#", false, 2, null)) {
            this.f78507c.getClass();
            try {
                String strSubstring2 = str.substring(1);
                ck.p.i(strSubstring2, "substring(...)");
                int i10 = Integer.parseInt(strSubstring2);
                numValueOf = i10 >= 1 ? Integer.valueOf(i10) : null;
            } catch (Exception unused2) {
            }
            if (numValueOf != null) {
                return new xc3(wc3.f84170d, numValueOf.intValue());
            }
            return null;
        }
        if (!this.f78505a.contains(g63.f77643b)) {
            return null;
        }
        this.f78508d.getClass();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
            lValueOf = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
        } catch (ParseException unused3) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return new xc3(wc3.f84168b, lValueOf.longValue());
        }
        return null;
    }

    public i63(Set set, dc2 dc2Var, hg2 hg2Var, j63 j63Var) {
        this.f78505a = set;
        this.f78506b = dc2Var;
        this.f78507c = hg2Var;
        this.f78508d = j63Var;
    }
}
