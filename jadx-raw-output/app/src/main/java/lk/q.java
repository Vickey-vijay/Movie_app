package lk;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes10.dex */
public class q extends n {
    public static final String e(String str) {
        ck.p.j(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        ck.p.j(str2, "line");
        return str + str2;
    }

    public static final String h(String str, String str2) {
        String strInvoke;
        ck.p.j(str, "<this>");
        ck.p.j(str2, "newIndent");
        List<String> listU0 = a0.u0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU0) {
            if (!a0.n0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) nj.b0.u0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listU0.size());
        bk.l<String, String> lVarD = d(str2);
        int iM = nj.s.m(listU0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listU0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iM) && a0.n0(str3)) {
                str3 = null;
            } else {
                String strP1 = c0.p1(str3, iIntValue);
                if (strP1 != null && (strInvoke = lVarD.invoke(strP1)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) nj.b0.m0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String str2, String str3) {
        int i10;
        String strInvoke;
        ck.p.j(str, "<this>");
        ck.p.j(str2, "newIndent");
        ck.p.j(str3, "marginPrefix");
        if (!(!a0.n0(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listU0 = a0.u0(str);
        int length = str.length() + (str2.length() * listU0.size());
        bk.l<String, String> lVarD = d(str2);
        int iM = nj.s.m(listU0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listU0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                nj.s.u();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iM) && a0.n0(str4)) {
                str4 = null;
            } else {
                int length2 = str4.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!a.c(str4.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (x.Q(str4, str3, i10, false, 4, null)) {
                        int length3 = i14 + str3.length();
                        ck.p.h(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        ck.p.i(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarD.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i11 = i12;
        }
        return ((StringBuilder) nj.b0.m0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String j(String str) {
        ck.p.j(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String str2) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "marginPrefix");
        return i(str, "", str2);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = ImpressionLog.Q;
        }
        return k(str, str2);
    }

    public static final bk.l<String, String> d(final String str) {
        boolean z10;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new bk.l() { // from class: lk.o
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return q.e((String) obj);
                }
            };
        }
        return new bk.l() { // from class: lk.p
            @Override // bk.l
            public final Object invoke(Object obj) {
                return q.f(str, (String) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!(!a.c(str.charAt(i10)))) {
                i10++;
            } else {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }
}
