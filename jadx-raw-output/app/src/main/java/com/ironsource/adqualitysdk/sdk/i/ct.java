package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ct extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1522 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1523 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1524 = 25;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1784(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            char[] cArr2 = new char[i10];
            b.f704 = 0;
            while (true) {
                int i13 = b.f704;
                if (i13 >= i10) {
                    break;
                }
                b.f705 = cArr[i13];
                cArr2[b.f704] = (char) (b.f705 + i12);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f1524);
                b.f704 = i14 + 1;
            }
            if (i11 > 0) {
                b.f707 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f707;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f707;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i17 = b.f704;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f704 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1785(cq cqVar, List<Object> list) {
        boolean zBooleanValue;
        JSONObject jSONObject;
        boolean zBooleanValue2 = false;
        String str = (String) cz.m1851(list, 0, String.class);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cqVar.m1683());
        sb2.append(m1784("\u0000", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, Color.argb(0, 0, 0, 0) + 1, ((Process.getThreadPriority(0) + 20) >> 6) + 83).intern());
        sb2.append(Integer.toHexString(str.hashCode()));
        String string = sb2.toString();
        Throwable th2 = (Throwable) cz.m1851(list, 1, Throwable.class);
        if ((list.size() > 2 ? (char) 20 : 'O') != 20) {
            kd.m2875(cqVar.m1683(), str, string, th2, null, false);
        } else {
            if ((cz.m1850(list, 2, JSONObject.class) ? (char) 21 : ']') != ']') {
                int i10 = f1523 + 51;
                f1522 = i10 % 128;
                int i11 = i10 % 2;
                JSONObject jSONObject2 = (JSONObject) cz.m1851(list, 2, JSONObject.class);
                if (list.size() > 3) {
                    int i12 = f1522 + 113;
                    f1523 = i12 % 128;
                    int i13 = i12 % 2;
                    if (cz.m1850(list, 3, Boolean.class)) {
                        int i14 = f1523 + 107;
                        f1522 = i14 % 128;
                        zBooleanValue2 = ((Boolean) (i14 % 2 == 0 ? cz.m1851(list, 2, Boolean.class) : cz.m1851(list, 3, Boolean.class))).booleanValue();
                    }
                }
                zBooleanValue = zBooleanValue2;
                jSONObject = jSONObject2;
            } else {
                zBooleanValue = cz.m1850(list, 2, Boolean.class) ? false : true ? false : ((Boolean) cz.m1851(list, 2, Boolean.class)).booleanValue();
                jSONObject = null;
            }
            kd.m2875(cqVar.m1683(), str, string, th2, jSONObject, zBooleanValue);
        }
        return null;
    }
}
