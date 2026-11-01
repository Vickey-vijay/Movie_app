package com.bytedance.sdk.openadsdk.core.ryl.vt;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw extends lh implements Comparable<ouw> {
    public long ouw;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ryl.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0135ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private lh.EnumC0134lh f13038lh = lh.EnumC0134lh.TRACKING_URL;
        private final String ouw;
        private final long vt;

        public final ouw ouw() {
            return new ouw(this.vt, this.ouw, this.f13038lh, Boolean.FALSE);
        }

        public C0135ouw(String str, long j10) {
            this.ouw = str;
            this.vt = j10;
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ouw ouwVar) {
        ouw ouwVar2 = ouwVar;
        if (ouwVar2 == null) {
            return 1;
        }
        long j10 = this.ouw;
        long j11 = ouwVar2.ouw;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }

    public ouw(long j10, String str, lh.EnumC0134lh enumC0134lh, Boolean bool) {
        super(str, enumC0134lh, bool);
        this.ouw = j10;
    }

    public static int ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * 60 * 60 * 1000) + (Integer.parseInt(strArrSplit[1]) * 60 * 1000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public final String toString() {
        return super.toString();
    }
}
