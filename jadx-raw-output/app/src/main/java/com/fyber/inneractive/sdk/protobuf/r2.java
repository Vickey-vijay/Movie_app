package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes10.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f18269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f18271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18272d;

    public r2(d2 d2Var, String str, Object[] objArr) {
        char cCharAt;
        this.f18269a = d2Var;
        this.f18270b = str;
        this.f18271c = objArr;
        int i10 = 1;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        cCharAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e10) {
                        e = e10;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                e = e11;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e12) {
                e = e12;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (cCharAt < 55296) {
            this.f18272d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 >= 55296) {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i10 = i13;
            } else {
                this.f18272d = (cCharAt2 << i12) | i11;
                return;
            }
        }
    }
}
