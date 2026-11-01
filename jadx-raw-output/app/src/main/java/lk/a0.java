package lk;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes3.dex */
public class a0 extends x {

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements kk.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f63589a;

        public a(CharSequence charSequence) {
            this.f63589a = charSequence;
        }

        @Override // kk.i
        public Iterator<String> iterator() {
            return new f(this.f63589a);
        }
    }

    public static final Pair<Integer, String> e0(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object next;
        String str;
        Object next2;
        String str2;
        if (!z10 && collection.size() == 1) {
            String str3 = (String) nj.b0.C0(collection);
            int iL0 = !z11 ? l0(charSequence, str3, i10, false, 4, null) : r0(charSequence, str3, i10, false, 4, null);
            if (iL0 < 0) {
                return null;
            }
            return mj.h.a(Integer.valueOf(iL0), str3);
        }
        ik.g iVar = !z11 ? new ik.i(ik.k.d(i10, 0), charSequence.length()) : ik.k.m(ik.k.g(i10, f0(charSequence)), 0);
        if (charSequence instanceof String) {
            int iE = iVar.e();
            int iF = iVar.f();
            int iG = iVar.g();
            if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str2 = (String) next2;
                    } while (!x.H(str2, 0, (String) charSequence, iE, str2.length(), z10));
                    String str4 = (String) next2;
                    if (str4 != null) {
                        return mj.h.a(Integer.valueOf(iE), str4);
                    }
                    if (iE != iF) {
                        iE += iG;
                    }
                }
            }
        } else {
            int iE2 = iVar.e();
            int iF2 = iVar.f();
            int iG2 = iVar.g();
            if ((iG2 > 0 && iE2 <= iF2) || (iG2 < 0 && iF2 <= iE2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str = (String) next;
                    } while (!D0(str, 0, charSequence, iE2, str.length(), z10));
                    String str5 = (String) next;
                    if (str5 != null) {
                        return mj.h.a(Integer.valueOf(iE2), str5);
                    }
                    if (iE2 != iF2) {
                        iE2 += iG2;
                    }
                }
            }
        }
        return null;
    }

    public static final int i0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        ik.g iVar = !z11 ? new ik.i(ik.k.d(i10, 0), ik.k.g(i11, charSequence.length())) : ik.k.m(ik.k.g(i10, f0(charSequence)), ik.k.d(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int iE = iVar.e();
            int iF = iVar.f();
            int iG = iVar.g();
            if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
                return -1;
            }
            while (!D0(charSequence2, 0, charSequence, iE, charSequence2.length(), z10)) {
                if (iE == iF) {
                    return -1;
                }
                iE += iG;
            }
            return iE;
        }
        int iE2 = iVar.e();
        int iF2 = iVar.f();
        int iG2 = iVar.g();
        if ((iG2 <= 0 || iE2 > iF2) && (iG2 >= 0 || iF2 > iE2)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (x.H(str, 0, (String) charSequence, iE2, str.length(), z10)) {
                return iE2;
            }
            if (iE2 == iF2) {
                return -1;
            }
            iE2 += iG2;
        }
    }

    public static /* synthetic */ kk.i A0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return y0(charSequence, strArr, i10, z10, i11);
    }

    public static final Pair B0(char[] cArr, boolean z10, CharSequence charSequence, int i10) {
        ck.p.j(charSequence, "$this$DelimitedRangesSequence");
        int iM0 = m0(charSequence, cArr, i10, z10);
        if (iM0 < 0) {
            return null;
        }
        return mj.h.a(Integer.valueOf(iM0), 1);
    }

    public static final Pair C0(List list, boolean z10, CharSequence charSequence, int i10) {
        ck.p.j(charSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairE0 = e0(charSequence, list, i10, z10, false);
        if (pairE0 != null) {
            return mj.h.a(pairE0.getFirst(), Integer.valueOf(pairE0.getSecond().length()));
        }
        return null;
    }

    public static final boolean D0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.h(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String E0(String str, CharSequence charSequence) {
        ck.p.j(str, "<this>");
        ck.p.j(charSequence, "prefix");
        if (!R0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String F0(String str, CharSequence charSequence) {
        ck.p.j(str, "<this>");
        ck.p.j(charSequence, "suffix");
        if (!d0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String G0(String str, CharSequence charSequence) {
        ck.p.j(str, "<this>");
        ck.p.j(charSequence, "delimiter");
        return H0(str, charSequence, charSequence);
    }

    public static final String H0(String str, CharSequence charSequence, CharSequence charSequence2) {
        ck.p.j(str, "<this>");
        ck.p.j(charSequence, "prefix");
        ck.p.j(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !R0(str, charSequence, false, 2, null) || !d0(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void I0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> J0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(cArr, "delimiters");
        if (cArr.length == 1) {
            return L0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable iterableV = SequencesKt___SequencesKt.v(z0(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(nj.t.v(iterableV, 10));
        Iterator it = iterableV.iterator();
        while (it.hasNext()) {
            arrayList.add(S0(charSequence, (ik.i) it.next()));
        }
        return arrayList;
    }

    public static final List<String> K0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return L0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableV = SequencesKt___SequencesKt.v(A0(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(nj.t.v(iterableV, 10));
        Iterator it = iterableV.iterator();
        while (it.hasNext()) {
            arrayList.add(S0(charSequence, (ik.i) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List M0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return J0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List N0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return K0(charSequence, strArr, z10, i10);
    }

    public static final boolean O0(CharSequence charSequence, char c10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        return charSequence.length() > 0 && b.h(charSequence.charAt(0), c10, z10);
    }

    public static final boolean P0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(charSequence2, "prefix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? x.R((String) charSequence, (String) charSequence2, false, 2, null) : D0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean Q0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean R0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return P0(charSequence, charSequence2, z10);
    }

    public static final String S0(CharSequence charSequence, ik.i iVar) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(iVar, "range");
        return charSequence.subSequence(iVar.getStart().intValue(), iVar.getEndInclusive().intValue() + 1).toString();
    }

    public static final String T0(String str, char c10, String str2) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "missingDelimiterValue");
        int iK0 = k0(str, c10, 0, false, 6, null);
        if (iK0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iK0 + 1, str.length());
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean U(CharSequence charSequence, char c10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        return k0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static final String U0(String str, String str2, String str3) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "delimiter");
        ck.p.j(str3, "missingDelimiterValue");
        int iL0 = l0(str, str2, 0, false, 6, null);
        if (iL0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iL0 + str2.length(), str.length());
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean V(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (l0(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (j0(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String V0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return T0(str, c10, str2);
    }

    public static /* synthetic */ boolean W(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return U(charSequence, c10, z10);
    }

    public static /* synthetic */ String W0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return U0(str, str2, str3);
    }

    public static /* synthetic */ boolean X(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return V(charSequence, charSequence2, z10);
    }

    public static final String X0(String str, char c10, String str2) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "missingDelimiterValue");
        int iQ0 = q0(str, c10, 0, false, 6, null);
        if (iQ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iQ0 + 1, str.length());
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean Y(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return x.E((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!b.h(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static final String Y0(String str, String str2, String str3) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "delimiter");
        ck.p.j(str3, "missingDelimiterValue");
        int iR0 = r0(str, str2, 0, false, 6, null);
        if (iR0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iR0 + str2.length(), str.length());
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean Z(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ck.p.e(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String Z0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return X0(str, c10, str2);
    }

    public static final boolean a0(CharSequence charSequence, char c10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        return charSequence.length() > 0 && b.h(charSequence.charAt(f0(charSequence)), c10, z10);
    }

    public static /* synthetic */ String a1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Y0(str, str2, str3);
    }

    public static final boolean b0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(charSequence2, "suffix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? x.D((String) charSequence, (String) charSequence2, false, 2, null) : D0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static final String b1(String str, char c10, String str2) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "missingDelimiterValue");
        int iK0 = k0(str, c10, 0, false, 6, null);
        if (iK0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iK0);
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean c0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a0(charSequence, c10, z10);
    }

    public static final String c1(String str, String str2, String str3) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "delimiter");
        ck.p.j(str3, "missingDelimiterValue");
        int iL0 = l0(str, str2, 0, false, 6, null);
        if (iL0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iL0);
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean d0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b0(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String d1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return b1(str, c10, str2);
    }

    public static /* synthetic */ String e1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return c1(str, str2, str3);
    }

    public static final int f0(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final String f1(String str, char c10, String str2) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "missingDelimiterValue");
        int iQ0 = q0(str, c10, 0, false, 6, null);
        if (iQ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iQ0);
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int g0(CharSequence charSequence, char c10, int i10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final String g1(String str, String str2, String str3) {
        ck.p.j(str, "<this>");
        ck.p.j(str2, "delimiter");
        ck.p.j(str3, "missingDelimiterValue");
        int iR0 = r0(str, str2, 0, false, 6, null);
        if (iR0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iR0);
        ck.p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int h0(CharSequence charSequence, String str, int i10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(str, TypedValues.Custom.S_STRING);
        return (z10 || !(charSequence instanceof String)) ? j0(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    public static /* synthetic */ String h1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return f1(str, c10, str2);
    }

    public static /* synthetic */ String i1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return g1(str, str2, str3);
    }

    public static /* synthetic */ int j0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return i0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static final Boolean j1(String str) {
        ck.p.j(str, "<this>");
        if (ck.p.e(str, "true")) {
            return Boolean.TRUE;
        }
        if (ck.p.e(str, com.ironsource.mediationsdk.metadata.a.f29886h)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int k0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return g0(charSequence, c10, i10, z10);
    }

    public static final CharSequence k1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = lk.a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int l0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return h0(charSequence, str, i10, z10);
    }

    public static final String l1(String str, char... cArr) {
        ck.p.j(str, "<this>");
        ck.p.j(cArr, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zA = nj.n.A(cArr, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zA) {
                    break;
                }
                length--;
            } else if (zA) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final int m0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        ck.p.j(charSequence, "<this>");
        ck.p.j(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(nj.n.g0(cArr), i10);
        }
        int iD = ik.k.d(i10, 0);
        int iF0 = f0(charSequence);
        if (iD > iF0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (b.h(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iD;
            }
            if (iD == iF0) {
                return -1;
            }
            iD++;
        }
    }

    public static final CharSequence m1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!lk.a.c(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return "";
    }

    public static final boolean n0(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!lk.a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final String n1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        ck.p.j(str, "<this>");
        ck.p.j(cArr, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!nj.n.A(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    public static final int o0(CharSequence charSequence, char c10, int i10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? s0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final CharSequence o1(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!lk.a.c(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final int p0(CharSequence charSequence, String str, int i10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(str, TypedValues.Custom.S_STRING);
        return (z10 || !(charSequence instanceof String)) ? i0(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int q0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = f0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return o0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int r0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = f0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return p0(charSequence, str, i10, z10);
    }

    public static final int s0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        ck.p.j(charSequence, "<this>");
        ck.p.j(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(nj.n.g0(cArr), i10);
        }
        for (int iG = ik.k.g(i10, f0(charSequence)); -1 < iG; iG--) {
            char cCharAt = charSequence.charAt(iG);
            boolean z11 = false;
            for (char c10 : cArr) {
                if (b.h(c10, cCharAt, z10)) {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                return iG;
            }
        }
        return -1;
    }

    public static final kk.i<String> t0(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List<String> u0(CharSequence charSequence) {
        ck.p.j(charSequence, "<this>");
        return SequencesKt___SequencesKt.T(t0(charSequence));
    }

    public static final CharSequence v0(CharSequence charSequence, int i10, char c10) {
        ck.p.j(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static final String w0(String str, int i10, char c10) {
        ck.p.j(str, "<this>");
        return v0(str, i10, c10).toString();
    }

    public static /* synthetic */ kk.i z0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return x0(charSequence, cArr, i10, z10, i11);
    }

    public static final List<String> L0(CharSequence charSequence, String str, boolean z10, int i10) {
        boolean z11;
        I0(i10);
        int length = 0;
        int iH0 = h0(charSequence, str, 0, z10);
        if (iH0 != -1 && i10 != 1) {
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int iG = 10;
            if (z11) {
                iG = ik.k.g(i10, 10);
            }
            ArrayList arrayList = new ArrayList(iG);
            do {
                arrayList.add(charSequence.subSequence(length, iH0).toString());
                length = str.length() + iH0;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                iH0 = h0(charSequence, str, length, z10);
            } while (iH0 != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        return nj.r.e(charSequence.toString());
    }

    public static final kk.i<ik.i> x0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        I0(i11);
        return new d(charSequence, i10, i11, new bk.p() { // from class: lk.y
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return a0.B0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static final kk.i<ik.i> y0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        I0(i11);
        final List listF = nj.l.f(strArr);
        return new d(charSequence, i10, i11, new bk.p() { // from class: lk.z
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return a0.C0(listF, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
