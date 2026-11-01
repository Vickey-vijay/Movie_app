package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15900d;

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length != 3) {
            return arrayList;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        String[] strArrSplit2 = strArrSplit[2].split("\\.");
        String str4 = strArrSplit2[0];
        String str5 = strArrSplit2.length > 1 ? strArrSplit2[1] : "000";
        try {
            arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str4)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str5)));
            return arrayList;
        } catch (NumberFormatException e10) {
            IAlog.f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    public e(String str, String str2) {
        int i10;
        String str3;
        ArrayList arrayListA;
        int i11;
        this.f15897a = str;
        this.f15898b = str2;
        int iIntValue = -1;
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("-")) {
            if (str2.endsWith("%") && str2.endsWith("%")) {
                try {
                    if (TextUtils.isEmpty(str2)) {
                        i11 = -1;
                    } else {
                        i11 = Integer.parseInt(str2.substring(0, str2.length() - 1));
                    }
                    if (i11 >= 0 && i11 <= 100) {
                        i10 = 1;
                    } else if (str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                        arrayListA = a(str2);
                        if (arrayListA.isEmpty()) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                    } else {
                        i10 = 0;
                    }
                } catch (NumberFormatException e10) {
                    IAlog.f("ProgressTrackingEvent: failed isPercentageOffsetValid with %s", e10.getMessage());
                }
            } else if (str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                arrayListA = a(str2);
                if (arrayListA.isEmpty() && ((Integer) arrayListA.get(0)).intValue() >= 0 && ((Integer) arrayListA.get(1)).intValue() >= 0 && ((Integer) arrayListA.get(2)).intValue() >= 0 && ((Integer) arrayListA.get(3)).intValue() >= 0) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        this.f15900d = i10;
        if (i10 == 2 && (str3 = this.f15898b) != null) {
            ArrayList arrayListA2 = a(str3);
            iIntValue = ((Integer) arrayListA2.get(3)).intValue() + ((((Integer) arrayListA2.get(2)).intValue() + (((Integer) arrayListA2.get(1)).intValue() * 60) + (((Integer) arrayListA2.get(0)).intValue() * 3600)) * 1000);
        }
        this.f15899c = iIntValue;
    }
}
