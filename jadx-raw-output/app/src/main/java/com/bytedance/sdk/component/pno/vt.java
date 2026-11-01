package com.bytedance.sdk.component.pno;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: classes11.dex */
final class vt implements Comparable, Runnable {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private long f11901lh;
    private pno ouw;
    private ouw vt;
    private Thread yu = null;

    private static void ouw(String str, String str2, long j10) {
        ko.fkw("DelegateRunnable", "pool is " + str + "  name is " + str2 + "is timeout,cost " + j10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof vt) {
            return this.ouw.compareTo(((vt) obj).ouw);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        pno pnoVar;
        return (obj instanceof vt) && (pnoVar = this.ouw) != null && pnoVar.equals(((vt) obj).ouw);
    }

    public final int hashCode() {
        return this.ouw.hashCode();
    }

    public vt(pno pnoVar, ouw ouwVar) {
        this.f11901lh = 0L;
        this.ouw = pnoVar;
        this.vt = ouwVar;
        this.f11901lh = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String name;
        String str2;
        String str3;
        String str4;
        String str5;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = jUptimeMillis - this.f11901lh;
        this.yu = Thread.currentThread();
        pno pnoVar = this.ouw;
        if (pnoVar != null) {
            pnoVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.vt != null) {
            yu.ouw();
        }
        if (ko.ouw()) {
            Object[] objArr = new Object[8];
            byte b10 = 0;
            objArr[0] = "run: pool  = ";
            ouw ouwVar = this.vt;
            String name2 = "null";
            if (ouwVar == null) {
                str = "null";
            } else {
                str = ouwVar.ouw;
            }
            objArr[1] = str;
            objArr[2] = " waitTime =";
            objArr[3] = Long.valueOf(j10);
            objArr[4] = " taskCost = ";
            objArr[5] = Long.valueOf(jUptimeMillis2);
            objArr[6] = " name=";
            pno pnoVar2 = this.ouw;
            if (pnoVar2 == null) {
                name = "null";
            } else {
                name = pnoVar2.getName();
            }
            objArr[7] = name;
            ko.vt("DelegateRunnable", objArr);
            String str6 = this.vt.ouw;
            str6.hashCode();
            switch (str6.hashCode()) {
                case 3107:
                    if (!str6.equals("ad")) {
                        b10 = -1;
                    }
                    break;
                case 3366:
                    b10 = !str6.equals("io") ? (byte) -1 : (byte) 1;
                    break;
                case 107332:
                    b10 = !str6.equals(CreativeInfo.f44317an) ? (byte) -1 : (byte) 2;
                    break;
                case 3237136:
                    b10 = !str6.equals(C3426d4.a.f28413f) ? (byte) -1 : (byte) 3;
                    break;
                case 212371911:
                    b10 = !str6.equals("computation") ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        ouw ouwVar2 = this.vt;
                        if (ouwVar2 == null) {
                            str2 = "null";
                        } else {
                            str2 = ouwVar2.ouw;
                        }
                        pno pnoVar3 = this.ouw;
                        if (pnoVar3 != null) {
                            name2 = pnoVar3.getName();
                        }
                        ouw(str2, name2, jUptimeMillis2);
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        ouw ouwVar3 = this.vt;
                        if (ouwVar3 == null) {
                            str3 = "null";
                        } else {
                            str3 = ouwVar3.ouw;
                        }
                        pno pnoVar4 = this.ouw;
                        if (pnoVar4 != null) {
                            name2 = pnoVar4.getName();
                        }
                        ouw(str3, name2, jUptimeMillis2);
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > 3000) {
                        ouw ouwVar4 = this.vt;
                        if (ouwVar4 == null) {
                            str4 = "null";
                        } else {
                            str4 = ouwVar4.ouw;
                        }
                        pno pnoVar5 = this.ouw;
                        if (pnoVar5 != null) {
                            name2 = pnoVar5.getName();
                        }
                        ouw(str4, name2, jUptimeMillis2);
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        ouw ouwVar5 = this.vt;
                        if (ouwVar5 == null) {
                            str5 = "null";
                        } else {
                            str5 = ouwVar5.ouw;
                        }
                        pno pnoVar6 = this.ouw;
                        if (pnoVar6 != null) {
                            name2 = pnoVar6.getName();
                        }
                        ouw(str5, name2, jUptimeMillis2);
                    }
                    break;
            }
        }
    }
}
