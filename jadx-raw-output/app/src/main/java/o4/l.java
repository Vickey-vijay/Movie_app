package o4;

import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Locale;

/* JADX INFO: compiled from: UrlTemplate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f65066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f65067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f65068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65069d;

    public static l b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new l(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    public static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = "";
        int length = 0;
        int i10 = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i10] = strArr[i10] + str.substring(length);
                length = str.length();
            } else if (iIndexOf != length) {
                strArr[i10] = strArr[i10] + str.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                strArr[i10] = strArr[i10] + "$";
                length += 2;
            } else {
                int i11 = length + 1;
                int iIndexOf2 = str.indexOf("$", i11);
                String strSubstring2 = str.substring(i11, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i10] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith(VastAttributes.HORIZONTAL_POSITION)) {
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i10] = 2;
                            break;
                        case "Time":
                            iArr[i10] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i10] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i10] = strSubstring;
                }
                i10++;
                strArr[i10] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i10;
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f65069d;
            if (i11 >= i12) {
                sb2.append(this.f65066a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f65066a[i11]);
            int i13 = this.f65067b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, this.f65068c[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, this.f65068c[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, this.f65068c[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }

    public l(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f65066a = strArr;
        this.f65067b = iArr;
        this.f65068c = strArr2;
        this.f65069d = i10;
    }
}
