package com.bytedance.sdk.openadsdk.core.pno;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile long f12977lh;
    private static volatile ouw ouw;
    private static volatile boolean vt;
    private Handler fkw;
    private final Queue<C0132ouw> yu = new LinkedList();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final cf f12978le = zih.yu();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.pno.ouw$ouw, reason: collision with other inner class name */
    public static class C0132ouw {
        public final long ouw;
        public final String vt;

        public /* synthetic */ C0132ouw(long j10, String str, byte b10) {
            this(j10, str);
        }

        private C0132ouw(long j10, String str) {
            this.ouw = j10;
            this.vt = str;
        }
    }

    private synchronized boolean vt(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOuw = this.f12978le.pno.ouw("max", 50);
        long jOuw = this.f12978le.pno.ouw("duration", 10000L);
        byte b10 = 0;
        if (this.yu.size() <= 0 || this.yu.size() < iOuw) {
            this.yu.offer(new C0132ouw(jCurrentTimeMillis, str, b10));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.yu.peek().ouw);
            if (jAbs <= jOuw) {
                vt(jOuw - jAbs);
                return true;
            }
            this.yu.poll();
            this.yu.offer(new C0132ouw(jCurrentTimeMillis, str, b10));
        }
        return false;
    }

    public final synchronized String lh() {
        String str;
        HashMap map = new HashMap();
        for (C0132ouw c0132ouw : this.yu) {
            if (map.containsKey(c0132ouw.vt)) {
                String str2 = c0132ouw.vt;
                map.put(str2, Integer.valueOf(((Integer) map.get(str2)).intValue() + 1));
            } else {
                map.put(c0132ouw.vt, 1);
            }
        }
        int i10 = Integer.MIN_VALUE;
        str = "";
        for (String str3 : map.keySet()) {
            int iIntValue = ((Integer) map.get(str3)).intValue();
            if (i10 < iIntValue) {
                str = str3;
                i10 = iIntValue;
            }
        }
        return str;
    }

    public static ouw ouw() {
        if (ouw == null) {
            synchronized (ouw.class) {
                if (ouw == null) {
                    ouw = new ouw();
                }
            }
        }
        return ouw;
    }

    private ouw() {
    }

    public final synchronized boolean ouw(String str) {
        if (vt(str)) {
            ouw(true);
            ouw(f12977lh);
        } else {
            ouw(false);
        }
        return vt;
    }

    private synchronized void ouw(long j10) {
        if (this.fkw == null) {
            this.fkw = new Handler(Looper.getMainLooper());
        }
        this.fkw.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.pno.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                ouw.this.ouw(false);
            }
        }, j10);
    }

    public final synchronized boolean vt() {
        return vt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(boolean z10) {
        vt = z10;
    }

    private synchronized void vt(long j10) {
        f12977lh = j10;
    }
}
