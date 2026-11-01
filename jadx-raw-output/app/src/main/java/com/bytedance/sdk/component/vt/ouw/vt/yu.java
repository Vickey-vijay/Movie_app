package com.bytedance.sdk.component.vt.ouw.vt;

import com.ironsource.C3426d4;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class yu implements Serializable, Comparable<yu> {
    public transient int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public transient String f11969le;
    public final byte[] yu;
    public static final char[] ouw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset vt = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final yu f11968lh = new yu((byte[]) new byte[0].clone());

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yu) {
            yu yuVar = (yu) obj;
            int iLh = yuVar.lh();
            byte[] bArr = this.yu;
            if (iLh == bArr.length && yuVar.ouw(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String ouw() {
        String str = this.f11969le;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.yu, vt);
        this.f11969le = str2;
        return str2;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(yu yuVar) {
        yu yuVar2 = yuVar;
        int iLh = lh();
        int iLh2 = yuVar2.lh();
        int iMin = Math.min(iLh, iLh2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iOuw = ouw(i10) & 255;
            int iOuw2 = yuVar2.ouw(i10) & 255;
            if (iOuw != iOuw2) {
                return iOuw < iOuw2 ? -1 : 1;
            }
        }
        if (iLh == iLh2) {
            return 0;
        }
        return iLh < iLh2 ? -1 : 1;
    }

    public int hashCode() {
        int i10 = this.fkw;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.yu);
        this.fkw = iHashCode;
        return iHashCode;
    }

    public int lh() {
        return this.yu.length;
    }

    public String toString() {
        if (this.yu.length == 0) {
            return "[size=0]";
        }
        String strOuw = ouw();
        int length = strOuw.length();
        int length2 = 0;
        int i10 = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strOuw.length();
                break;
            }
            if (i10 != 64) {
                int iCodePointAt = strOuw.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    length2 = -1;
                    break;
                }
                i10++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 == -1) {
            if (this.yu.length <= 64) {
                return "[hex=" + vt() + C3426d4.j.f28588e;
            }
            return "[size=" + this.yu.length + " hex=" + ouw(0, 64).vt() + "…]";
        }
        String strReplace = strOuw.substring(0, length2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (length2 >= strOuw.length()) {
            return "[text=" + strReplace + C3426d4.j.f28588e;
        }
        return "[size=" + this.yu.length + " text=" + strReplace + "…]";
    }

    public String vt() {
        byte[] bArr = this.yu;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = ouw;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] yu() {
        return (byte[]) this.yu.clone();
    }

    public yu(byte[] bArr) {
        this.yu = bArr;
    }

    public yu ouw(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.yu;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.yu.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new yu(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte ouw(int i10) {
        return this.yu[i10];
    }

    public boolean ouw(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.yu;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && bly.ouw(bArr2, i10, bArr, i11, i12);
    }
}
