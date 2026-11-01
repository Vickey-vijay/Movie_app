package com.bytedance.sdk.component.ra;

import com.bytedance.sdk.component.ra.vt.yu;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.ouw.ouw.fkw;
import com.bytedance.sdk.component.vt.ouw.pno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {
    public static fkw ouw;
    public cf vt;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ra.ouw$ouw, reason: collision with other inner class name */
    public static final class C0097ouw {
        public final List<pno> yu = new ArrayList();
        public int ouw = 10000;
        public int vt = 10000;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f11906lh = 10000;

        public static int ouw(String str, long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j10 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }
    }

    public /* synthetic */ ouw(C0097ouw c0097ouw, byte b10) {
        this(c0097ouw);
    }

    private ouw(C0097ouw c0097ouw) {
        cf.ouw ouwVar = new cf.ouw();
        long j10 = c0097ouw.ouw;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cf.ouw ouwVarVt = ouwVar.ouw(j10, timeUnit).lh(c0097ouw.f11906lh, timeUnit).vt(c0097ouw.vt, timeUnit);
        List<pno> list = c0097ouw.yu;
        if (list != null && list.size() > 0) {
            Iterator<pno> it = c0097ouw.yu.iterator();
            while (it.hasNext()) {
                ouwVarVt.ouw.add(it.next());
            }
        }
        this.vt = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVarVt);
    }

    public static boolean yu() {
        fkw fkwVar = ouw;
        if (fkwVar == null) {
            return false;
        }
        return fkwVar.ouw();
    }

    public final cf fkw() {
        return this.vt;
    }

    public final com.bytedance.sdk.component.ra.vt.ouw lh() {
        return new com.bytedance.sdk.component.ra.vt.ouw(this.vt);
    }

    public final yu ouw() {
        return new yu(this.vt);
    }

    public final com.bytedance.sdk.component.ra.vt.vt vt() {
        return new com.bytedance.sdk.component.ra.vt.vt(this.vt);
    }
}
