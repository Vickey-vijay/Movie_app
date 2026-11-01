package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ee extends ea {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1936 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1937 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1938 = -7159607425052080275L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1939;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed[] f1940;

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final boolean equals(Object obj) {
        if (this == obj) {
            int i10 = f1936 + 65;
            f1937 = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (obj == null || ee.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ee eeVar = (ee) obj;
        ed edVar = this.f1939;
        if (edVar == null ? eeVar.f1939 != null : !edVar.equals(eeVar.f1939)) {
            return false;
        }
        ed[] edVarArr = this.f1940;
        if (edVarArr == null) {
            if ((eeVar.f1940 == null ? '-' : (char) 30) != '-') {
                return false;
            }
            int i12 = f1936 + 13;
            f1937 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        int i14 = f1937 + 81;
        f1936 = i14 % 128;
        int i15 = i14 % 2;
        ed[] edVarArr2 = eeVar.f1940;
        if (i15 != 0) {
            return edVarArr.equals(edVarArr2);
        }
        edVarArr.equals(edVarArr2);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea, com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        Method methodM2843;
        List<Object> listM2137 = m2137(duVar, cqVar);
        ed edVar = this.f1939;
        if ((edVar instanceof ek) && ((ek) edVar).m2163().equals(m2150("蜞ï裳ჭ飃", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34807).intern())) {
            return cqVar.m1688().m2336().m2337(m2139()).m2097(duVar, cqVar, listM2137).m2092(false);
        }
        Object objM2089 = this.f1939.m2146(duVar, cqVar).m2089();
        if (objM2089 instanceof cl) {
            return new dr(((cl) objM2089).mo812(m2139(), listM2137, cqVar.m1684()));
        }
        if (objM2089 instanceof ci) {
            String strM2139 = m2139();
            cqVar.m1684();
            return new dr(((ci) objM2089).mo1545(cqVar, strM2139, listM2137, duVar));
        }
        if (objM2089 instanceof cq) {
            synchronized (objM2089) {
                cq cqVar2 = (cq) objM2089;
                ds dsVarM1687 = cqVar2.m1687(m2139());
                if (dsVarM1687 != null) {
                    return dsVarM1687.m2097(cqVar2.m1685(), cqVar2, listM2137).m2092(false);
                }
                String strM1683 = cqVar.m1683();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2150("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", 7411 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                sb2.append(m2139());
                co.m1623(strM1683, sb2.toString(), new NoSuchMethodException());
            }
        }
        try {
            ed[] edVarArr = this.f1940;
            if (edVarArr != null) {
                methodM2843 = kb.m2850(objM2089, m2139(), m2148(edVarArr, duVar, cqVar));
            } else {
                methodM2843 = kb.m2843(objM2089, m2139(), listM2137);
            }
            if (methodM2843 != null) {
                return new dr(methodM2843.invoke(objM2089, listM2137.toArray()));
            }
            listM2137.add(0, objM2089);
            db dbVarM1682 = cqVar.m1682();
            String strM21310 = m2139();
            cqVar.m1684();
            return new dr(dbVarM1682.mo1545(cqVar, strM21310, listM2137, duVar));
        } catch (IllegalAccessException e10) {
            String strM1684 = cqVar.m1683();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2150("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", TextUtils.lastIndexOf("", '0') + 7412).intern());
            sb3.append(this);
            co.m1623(strM1684, sb3.toString(), e10);
            return null;
        } catch (IllegalArgumentException e11) {
            String strM1685 = cqVar.m1683();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2150("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", 7412 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            sb4.append(this);
            co.m1623(strM1685, sb4.toString(), e11);
            return null;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Class> m2148(ed[] edVarArr, du duVar, cq cqVar) {
        ArrayList arrayList = new ArrayList();
        int length = edVarArr.length;
        int i10 = 0;
        while (true) {
            if ((i10 < length ? (char) 19 : '_') != 19) {
                int i11 = f1936 + 5;
                f1937 = i11 % 128;
                int i12 = i11 % 2;
                return arrayList;
            }
            int i13 = f1937 + 17;
            f1936 = i13 % 128;
            int i14 = i13 % 2;
            arrayList.add((Class) edVarArr[i10].m2146(duVar, cqVar).m2089());
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[PHI: r0
  0x002f: PHI (r0v12 int) = (r0v6 int), (r0v14 int) binds: [B:15:0x002d, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x003b A[PHI: r0
  0x003b: PHI (r0v7 int) = (r0v6 int), (r0v14 int) binds: [B:15:0x002d, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i10;
        int i11 = f1937 + 125;
        f1936 = i11 % 128;
        int iHashCode3 = 0;
        if ((i11 % 2 == 0 ? (char) 18 : 'L') != 'L') {
            iHashCode = super.hashCode() / 85;
            if (this.f1939 != null) {
                iHashCode2 = this.f1939.hashCode();
                int i12 = f1936 + 59;
                f1937 = i12 % 128;
                int i13 = i12 % 2;
            } else {
                int i14 = f1936 + 103;
                f1937 = i14 % 128;
                int i15 = i14 % 2;
                iHashCode2 = 0;
            }
        } else {
            iHashCode = super.hashCode() * 31;
            if (this.f1939 == null) {
                int i16 = f1936 + 103;
                f1937 = i16 % 128;
                int i17 = i16 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = this.f1939.hashCode();
                int i18 = f1936 + 59;
                f1937 = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        int i20 = (iHashCode + iHashCode2) * 31;
        ed[] edVarArr = this.f1940;
        if (edVarArr != null) {
            iHashCode3 = edVarArr.hashCode();
            i10 = f1937 + 77;
            f1936 = i10 % 128;
        } else {
            i10 = f1936 + 45;
            f1937 = i10 % 128;
        }
        int i21 = i10 % 2;
        return i20 + iHashCode3;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final String toString() {
        int i10 = f1936 + 89;
        f1937 = i10 % 128;
        int i11 = i10 % 2;
        String strMo2140 = mo2140(m2138());
        int i12 = f1937 + 47;
        f1936 = i12 % 128;
        if ((i12 % 2 == 0 ? 'C' : '2') != 'C') {
            return strMo2140;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2140(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1939);
        sb2.append(m2150("蝃", 26459 - (Process.myPid() >> 22)).intern());
        sb2.append(m2139());
        sb2.append(m2149());
        sb2.append(m2150("蝅", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32321).intern());
        sb2.append(ed.m2144(objArr));
        sb2.append(m2150("蝄", (-16727225) - Color.rgb(0, 0, 0)).intern());
        String string = sb2.toString();
        int i10 = f1937 + 49;
        f1936 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public ee(ed edVar, String str, List<ed> list, List<ed> list2, dm dmVar) {
        super(str, list2, dmVar);
        this.f1939 = edVar;
        if (list != null) {
            ed[] edVarArr = new ed[list.size()];
            this.f1940 = edVarArr;
            list.toArray(edVarArr);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2149() {
        int i10 = f1936 + 11;
        f1937 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        if (this.f1940 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2150("蝑", TextUtils.getOffsetBefore("", 0) + 63179).intern());
        sb2.append(ed.m2144(this.f1940));
        sb2.append(m2150("蝓", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30808).intern());
        String string = sb2.toString();
        int i11 = f1937 + 121;
        f1936 = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2150(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2018 = 0;
            while (true) {
                int i11 = f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f1938);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }
}
