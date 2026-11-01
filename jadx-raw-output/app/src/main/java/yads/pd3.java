package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class pd3 {
    public static od3 a(String str) {
        Integer numR;
        Object obj;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) == '-') {
                str = str.substring(0, i10);
                ck.p.i(str, "substring(...)");
                break;
            }
        }
        List listM0 = lk.a0.M0(str, new char[]{'.'}, false, 0, 6, null);
        String str2 = (String) nj.b0.i0(listM0, 0);
        if (str2 == null || (numR = lk.w.r(str2)) == null) {
            return null;
        }
        int iIntValue = numR.intValue();
        Object obj2 = "0";
        if (1 > nj.s.m(listM0)) {
            obj = "0";
        } else {
            obj = listM0.get(1);
        }
        Integer numR2 = lk.w.r((String) obj);
        if (numR2 == null) {
            return null;
        }
        int iIntValue2 = numR2.intValue();
        if (2 <= nj.s.m(listM0)) {
            obj2 = listM0.get(2);
        }
        Integer numR3 = lk.w.r((String) obj2);
        if (numR3 == null) {
            return null;
        }
        return new od3(iIntValue, iIntValue2, numR3.intValue());
    }
}
