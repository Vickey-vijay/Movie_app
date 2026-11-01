package b5;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import g5.k0;
import g5.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: CssParser.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4758c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f4759a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f4760b = new StringBuilder();

    public static String e(t tVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iC = tVar.c();
        int iD = tVar.d();
        while (iC < iD && !z10) {
            char c10 = (char) tVar.f53154a[iC];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iC++;
                sb2.append(c10);
            }
        }
        tVar.M(iC - tVar.c());
        return sb2.toString();
    }

    public static void m(t tVar) {
        while (true) {
            for (boolean z10 = true; tVar.a() > 0 && z10; z10 = false) {
                if (!c(tVar) && !b(tVar)) {
                }
            }
            return;
        }
    }

    @Nullable
    public static String g(t tVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iC = tVar.c();
            String strF = f(tVar, sb2);
            if (strF == null) {
                return null;
            }
            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strF) || ";".equals(strF)) {
                tVar.L(iC);
                z10 = true;
            } else {
                sb3.append(strF);
            }
        }
        return sb3.toString();
    }

    public static char j(t tVar, int i10) {
        return (char) tVar.f53154a[i10];
    }

    public final void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f4758c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.v(matcher.group(1));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrD0 = k0.D0(str, "\\.");
        String str2 = strArrD0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.u(str2.substring(0, iIndexOf2));
            dVar.t(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.u(str2);
        }
        if (strArrD0.length > 1) {
            dVar.s((String[]) k0.r0(strArrD0, 1, strArrD0.length));
        }
    }

    public List<d> d(t tVar) {
        this.f4760b.setLength(0);
        int iC = tVar.c();
        l(tVar);
        this.f4759a.J(tVar.f53154a, tVar.c());
        this.f4759a.L(iC);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strH = h(this.f4759a, this.f4760b);
            if (strH == null) {
                return arrayList;
            }
            if (!com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d.equals(f(this.f4759a, this.f4760b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, strH);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iC2 = this.f4759a.c();
                String strF = f(this.f4759a, this.f4760b);
                boolean z11 = strF == null || com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strF);
                if (!z11) {
                    this.f4759a.L(iC2);
                    i(this.f4759a, dVar, this.f4760b);
                }
                str = strF;
                z10 = z11;
            }
            if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(str)) {
                arrayList.add(dVar);
            }
        }
    }

    public static boolean b(t tVar) {
        int iC = tVar.c();
        int iD = tVar.d();
        byte[] bArr = tVar.f53154a;
        if (iC + 2 <= iD) {
            int i10 = iC + 1;
            if (bArr[iC] == 47) {
                int i11 = i10 + 1;
                if (bArr[i10] != 42) {
                    return false;
                }
                while (true) {
                    int i12 = i11 + 1;
                    if (i12 < iD) {
                        if (((char) bArr[i11]) == '*' && ((char) bArr[i12]) == '/') {
                            i11 = i12 + 1;
                            iD = i11;
                        } else {
                            i11 = i12;
                        }
                    } else {
                        tVar.M(iD - tVar.c());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean c(t tVar) {
        char cJ = j(tVar, tVar.c());
        if (cJ != '\t' && cJ != '\n' && cJ != '\f' && cJ != '\r' && cJ != ' ') {
            return false;
        }
        tVar.M(1);
        return true;
    }

    @Nullable
    public static String f(t tVar, StringBuilder sb2) {
        m(tVar);
        if (tVar.a() == 0) {
            return null;
        }
        String strE = e(tVar, sb2);
        if (!"".equals(strE)) {
            return strE;
        }
        return "" + ((char) tVar.y());
    }

    @Nullable
    public static String h(t tVar, StringBuilder sb2) {
        String strK;
        m(tVar);
        if (tVar.a() < 5 || !"::cue".equals(tVar.v(5))) {
            return null;
        }
        int iC = tVar.c();
        String strF = f(tVar, sb2);
        if (strF == null) {
            return null;
        }
        if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d.equals(strF)) {
            tVar.L(iC);
            return "";
        }
        if ("(".equals(strF)) {
            strK = k(tVar);
        } else {
            strK = null;
        }
        if (!")".equals(f(tVar, sb2))) {
            return null;
        }
        return strK;
    }

    public static void i(t tVar, d dVar, StringBuilder sb2) {
        m(tVar);
        String strE = e(tVar, sb2);
        if ("".equals(strE) || !StringUtils.PROCESS_POSTFIX_DELIMITER.equals(f(tVar, sb2))) {
            return;
        }
        m(tVar);
        String strG = g(tVar, sb2);
        if (strG != null && !"".equals(strG)) {
            int iC = tVar.c();
            String strF = f(tVar, sb2);
            if (!";".equals(strF)) {
                if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strF)) {
                    tVar.L(iC);
                } else {
                    return;
                }
            }
            if ("color".equals(strE)) {
                dVar.p(g5.e.c(strG));
                return;
            }
            if ("background-color".equals(strE)) {
                dVar.n(g5.e.c(strG));
                return;
            }
            if ("text-decoration".equals(strE)) {
                if ("underline".equals(strG)) {
                    dVar.w(true);
                }
            } else {
                if ("font-family".equals(strE)) {
                    dVar.q(strG);
                    return;
                }
                if ("font-weight".equals(strE)) {
                    if ("bold".equals(strG)) {
                        dVar.o(true);
                    }
                } else if ("font-style".equals(strE) && "italic".equals(strG)) {
                    dVar.r(true);
                }
            }
        }
    }

    public static String k(t tVar) {
        int iC = tVar.c();
        int iD = tVar.d();
        boolean z10 = false;
        while (iC < iD && !z10) {
            int i10 = iC + 1;
            if (((char) tVar.f53154a[iC]) == ')') {
                z10 = true;
            } else {
                z10 = false;
            }
            iC = i10;
        }
        return tVar.v((iC - 1) - tVar.c()).trim();
    }

    public static void l(t tVar) {
        while (!TextUtils.isEmpty(tVar.l())) {
        }
    }
}
