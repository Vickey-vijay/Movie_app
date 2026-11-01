package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class fb extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2026 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2027 = 6127450403300908907L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2028 = {61316};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2029 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f2030;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2180(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2028[i10 + i12]) ^ (((long) i12) * f2027)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2180(KeyEvent.normalizeMetaState(0), (char) (TextUtils.getOffsetBefore("", 0) + 61349), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        sb2.append(this.f2030);
        String string = sb2.toString();
        int i10 = f2026 + 33;
        f2029 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        int i11 = 36 / 0;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2113(du duVar, cq cqVar) {
        return new dr(Boolean.valueOf(!this.f2030.m2146(duVar, cqVar).m2091()));
    }

    public fb(ed edVar, dm dmVar) {
        super(dmVar);
        this.f2030 = edVar;
    }
}
