package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cm {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1360 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1363;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private dp f1364;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<cq> f1365 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private dh f1366;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private az f1367;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private db f1368;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Context f1369;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bd f1370;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1362 = {'n', 2941, 5708, 8509, 11270, 14313, 17130, 19894, 22665, 25496, 28543, 31313, 'E', 2898, 5753, 8470, 11324, 14281, 17132, 'D', 2901, 5739, 8469, 11314, 14272, 17133, 19840};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f1361 = -1433742800500225252L;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized List<cq> m1590() {
        int i10 = f1363 + 89;
        f1360 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f1365 != null) {
            return new ArrayList(this.f1365);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = f1360 + 57;
        f1363 = i12 % 128;
        if (i12 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m1591(cm cmVar) {
        int i10 = f1360 + 51;
        int i11 = i10 % 128;
        f1363 = i11;
        char c10 = i10 % 2 != 0 ? '8' : (char) 11;
        List<cq> list = cmVar.f1365;
        if (c10 != 11) {
            int i12 = 90 / 0;
        }
        int i13 = i11 + 61;
        f1360 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return list;
        }
        int i14 = 32 / 0;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hs m1592(dn dnVar) {
        int i10 = f1363 + 61;
        f1360 = i10 % 128;
        int i11 = i10 % 2;
        if (dnVar == null) {
            return null;
        }
        hs hsVar = new hs(dnVar, m1592(this.f1366.m1914().get(dnVar.m2020())));
        int i12 = f1360 + 5;
        f1363 = i12 % 128;
        if (i12 % 2 == 0) {
            return hsVar;
        }
        int i13 = 84 / 0;
        return hsVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m1597(dp dpVar) {
        int i10 = f1363;
        int i11 = i10 + 33;
        f1360 = i11 % 128;
        if ((i11 % 2 == 0 ? '$' : (char) 31) != 31) {
            throw null;
        }
        if (!(dpVar == null)) {
            this.f1364 = dpVar;
        }
        int i12 = i10 + 5;
        f1360 = i12 % 128;
        if ((i12 % 2 == 0 ? '0' : 'M') != 'M') {
            int i13 = 66 / 0;
            return;
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final synchronized boolean m1598() {
        boolean zMo811;
        int i10 = f1363 + 47;
        f1360 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 5 : (char) 15) != 15) {
            zMo811 = this.f1370.mo811();
            int i11 = 71 / 0;
        } else {
            zMo811 = this.f1370.mo811();
        }
        return zMo811;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final synchronized dp m1601() {
        dp dpVar;
        int i10 = f1360;
        int i11 = i10 + 77;
        f1363 = i11 % 128;
        int i12 = i11 % 2;
        dpVar = this.f1364;
        int i13 = i10 + 71;
        f1363 = i13 % 128;
        if ((i13 % 2 != 0 ? '1' : '0') == '1') {
            throw null;
        }
        return dpVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00be A[PHI: r3
  0x00be: PHI (r3v20 com.ironsource.adqualitysdk.sdk.i.dn) = (r3v16 com.ironsource.adqualitysdk.sdk.i.dn), (r3v25 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:32:0x00bc, B:27:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1609() {
        dn dnVar;
        dp dpVarM1916 = this.f1366.m1916();
        if (dpVarM1916 != null) {
            m1595(dpVarM1916);
            if (this.f1370.mo810()) {
                int i10 = f1363 + 53;
                f1360 = i10 % 128;
                int i11 = i10 % 2;
                jp.m2707(dpVarM1916);
            }
        }
        this.f1366.m1915().m2109(m1596(ExpandableListView.getPackedPositionType(0L), (char) ExpandableListView.getPackedPositionType(0L), 12 - Color.green(0)).intern(), this.f1370);
        Iterator<String> it = this.f1366.m1914().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i12 = f1363 + 49;
            f1360 = i12 % 128;
            if (i12 % 2 == 0) {
                dnVar = this.f1366.m1914().get(it.next());
                int i13 = 13 / 0;
                if (!dnVar.m2018()) {
                    m1593(new cq(this, this.f1368, this.f1370, m1592(dnVar), this.f1366.m1915()));
                }
            } else {
                dnVar = this.f1366.m1914().get(it.next());
                if (!dnVar.m2018()) {
                    m1593(new cq(this, this.f1368, this.f1370, m1592(dnVar), this.f1366.m1915()));
                }
            }
            int i14 = f1360 + 105;
            f1363 = i14 % 128;
            int i15 = i14 % 2;
        }
        m1594(this.f1366, this.f1370);
        int i16 = f1363 + 67;
        f1360 = i16 % 128;
        if (i16 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1611() {
        int i10 = f1363 + 49;
        f1360 = i10 % 128;
        int i11 = i10 % 2;
        String strM1922 = this.f1366.m1922();
        int i12 = f1363 + 55;
        f1360 = i12 % 128;
        int i13 = i12 % 2;
        return strM1922;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1596(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1362[i10 + i12]) ^ (((long) i12) * f1361)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final Context m1599() {
        int i10 = f1360 + 101;
        int i11 = i10 % 128;
        f1363 = i11;
        int i12 = i10 % 2;
        Context context = this.f1369;
        int i13 = i11 + 25;
        f1360 = i13 % 128;
        int i14 = i13 % 2;
        return context;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final az m1600() {
        int i10 = f1360;
        int i11 = i10 + 79;
        f1363 = i11 % 128;
        int i12 = i11 % 2;
        az azVar = this.f1367;
        int i13 = i10 + 3;
        f1363 = i13 % 128;
        if ((i13 % 2 != 0 ? ':' : '\f') == '\f') {
            return azVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m1602() {
        int i10 = f1360 + 27;
        f1363 = i10 % 128;
        int i11 = i10 % 2;
        String strMo819 = this.f1370.mo819();
        int i12 = f1363 + 89;
        f1360 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return strMo819;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m1603() {
        int i10 = f1360 + 125;
        f1363 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return this.f1370.m817();
        }
        int i11 = 14 / 0;
        return this.f1370.m817();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m1604() {
        int i10 = f1360 + 33;
        f1363 = i10 % 128;
        int i11 = i10 % 2;
        String strM1917 = this.f1366.m1917();
        int i12 = f1363 + 101;
        f1360 = i12 % 128;
        int i13 = i12 % 2;
        return strM1917;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1605() {
        int i10 = f1360 + 113;
        f1363 = i10 % 128;
        int i11 = i10 % 2;
        String strM1918 = this.f1366.m1918();
        int i12 = f1360 + 15;
        f1363 = i12 % 128;
        if ((i12 % 2 != 0 ? 'C' : '1') != 'C') {
            return strM1918;
        }
        int i13 = 57 / 0;
        return strM1918;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m1606() {
        int i10 = f1363 + 103;
        f1360 = i10 % 128;
        if (i10 % 2 == 0) {
            TextUtils.isEmpty(m1603());
            throw null;
        }
        String strM1603 = m1603();
        if (!TextUtils.isEmpty(strM1603)) {
            if ((!m1596((ViewConfiguration.getScrollBarSize() >> 8) + 12, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern().equals(strM1603) ? (char) 30 : 'F') == 30) {
                if (!(m1596((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, (char) Color.argb(0, 0, 0, 0), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern().equals(strM1603))) {
                    String strM1921 = this.f1366.m1921(m1603());
                    int i11 = f1360 + 97;
                    f1363 = i11 % 128;
                    int i12 = i11 % 2;
                    return strM1921;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1607() {
        int i10 = f1363 + 115;
        f1360 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            this.f1365.iterator();
            throw null;
        }
        Iterator<cq> it = this.f1365.iterator();
        while (true) {
            if (!it.hasNext()) {
                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cm.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        cm.m1591(cm.this).clear();
                    }
                });
                return;
            }
            int i11 = f1363 + 87;
            f1360 = i11 % 128;
            if (!(i11 % 2 != 0)) {
                it.next().m1681();
                throw null;
            }
            it.next().m1681();
        }
    }

    public cm(Context context, dh dhVar, az azVar, db dbVar, bd bdVar) {
        this.f1366 = dhVar;
        this.f1367 = azVar;
        this.f1368 = dbVar;
        this.f1370 = bdVar;
        this.f1369 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1608() {
        int i10 = f1360 + 111;
        f1363 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f1366.m1919();
            throw null;
        }
        String strM1919 = this.f1366.m1919();
        int i11 = f1363 + 57;
        f1360 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1919;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1593(cq cqVar) {
        int i10 = f1363 + 91;
        f1360 = i10 % 128;
        int i11 = i10 % 2;
        this.f1365.add(cqVar);
        int i12 = f1363 + 15;
        f1360 = i12 % 128;
        if ((i12 % 2 == 0 ? 'A' : (char) 19) == 19) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1612() {
        int i10 = f1360 + 121;
        f1363 = i10 % 128;
        int i11 = i10 % 2;
        String strM1920 = this.f1366.m1920();
        int i12 = f1363 + 119;
        f1360 = i12 % 128;
        int i13 = i12 % 2;
        return strM1920;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1595(dp dpVar) {
        int i10 = f1363 + 41;
        f1360 = i10 % 128;
        int i11 = i10 % 2;
        m1597(dpVar);
        int i12 = f1363 + 103;
        f1360 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 31 : '@') != 31) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m1594(dh dhVar, bd bdVar) {
        if (bdVar.mo811()) {
            int i10 = f1360 + 53;
            f1363 = i10 % 128;
            int i11 = i10 % 2;
            Iterator<cq> it = m1590().iterator();
            while (true) {
                if ((it.hasNext() ? '#' : (char) 5) != '#') {
                    break;
                }
                int i12 = f1360 + 111;
                f1363 = i12 % 128;
                int i13 = i12 % 2;
                cq next = it.next();
                dhVar.m1915().m2108().m2109(next.m1688().m2338(), next);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1610(String str, List<Object> list) {
        int i10 = f1363 + 23;
        f1360 = i10 % 128;
        int i11 = i10 % 2;
        Iterator<cq> it = m1590().iterator();
        while (true) {
            if ((it.hasNext() ? (char) 7 : (char) 4) == 4) {
                return;
            }
            int i12 = f1363 + 7;
            f1360 = i12 % 128;
            int i13 = i12 % 2;
            it.next().m1694(str, list);
        }
    }
}
