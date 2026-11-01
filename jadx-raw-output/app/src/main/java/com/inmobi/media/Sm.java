package com.inmobi.media;

import androidx.media3.common.MediaLibraryInfo;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Sm {
    public static final void a(String str) {
        try {
            Class.forName("androidx.media3.exoplayer.ExoPlayerImpl");
            if (str == null || str.length() == 0) {
                return;
            }
            String str2 = null;
            try {
                String str3 = MediaLibraryInfo.TAG;
                Field declaredField = MediaLibraryInfo.class.getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str4 = obj instanceof String ? (String) obj : null;
                if (str4 != null && !lk.a0.n0(str4)) {
                    str2 = str4;
                }
            } catch (Throwable unused) {
            }
            if (str2 == null) {
                throw new C3159rg(8800);
            }
            Mi miB = b(str2);
            if (miB == null) {
                throw new C3159rg(8802);
            }
            Mi miB2 = b(str);
            if (miB2 == null) {
                throw new C3159rg(8803);
            }
            int i10 = miB.f23173a;
            int i11 = miB2.f23173a;
            if (i10 >= i11) {
                if (i10 != i11 || miB.f23174b > miB2.f23174b) {
                    throw new C3159rg(8804);
                }
            }
        } catch (ClassNotFoundException unused2) {
            throw new C3159rg(8800);
        }
    }

    public static final Mi b(String str) {
        List listN0 = lk.a0.N0(str, new String[]{"."}, false, 3, 2, null);
        if (listN0.size() < 2) {
            return null;
        }
        int iC = c((String) listN0.get(0));
        int iC2 = c((String) listN0.get(1));
        int iC3 = listN0.size() >= 3 ? c((String) listN0.get(2)) : 0;
        if (iC < 0 || iC2 < 0) {
            return null;
        }
        return new Mi(iC, iC2, iC3);
    }

    public static final int c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                str = str.substring(0, i10);
                ck.p.i(str, "substring(...)");
                break;
            }
        }
        Integer numR = lk.w.r(str);
        if (numR == null) {
            return 0;
        }
        return numR.intValue();
    }
}
