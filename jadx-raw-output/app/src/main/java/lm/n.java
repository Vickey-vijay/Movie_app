package lm;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import xm.s;

/* JADX INFO: compiled from: HttpURI.java */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f63845p = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f63848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f63856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f63857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f63858m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63846a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f63847b = f63845p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f63859n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f63860o = new s(64);

    public n() {
    }

    public void a() {
        this.f63858m = 0;
        this.f63857l = 0;
        this.f63856k = 0;
        this.f63855j = 0;
        this.f63854i = 0;
        this.f63852g = 0;
        this.f63851f = 0;
        this.f63850e = 0;
        this.f63849d = 0;
        this.f63847b = f63845p;
        this.f63848c = "";
        this.f63859n = false;
    }

    public void p(byte[] bArr, int i10, int i11) {
        this.f63848c = null;
        q(bArr, i10, i11);
    }

    public void r(byte[] bArr, int i10, int i11) {
        this.f63848c = null;
        this.f63859n = false;
        this.f63847b = bArr;
        int i12 = i10 + i11;
        this.f63858m = i12;
        this.f63849d = i10;
        this.f63850e = i10;
        this.f63851f = i10;
        this.f63852g = i12;
        this.f63853h = -1;
        this.f63854i = i12;
        this.f63855j = i12;
        this.f63856k = i12;
        this.f63857l = i12;
        int i13 = i10;
        char c10 = 4;
        while (i13 < i12) {
            char c11 = (char) (this.f63847b[i13] & 255);
            int i14 = i13 + 1;
            if (c10 == 4) {
                if (c11 == ':') {
                    this.f63852g = i13;
                    break;
                } else if (c11 == '[') {
                    c10 = 5;
                }
            } else if (c10 != 5) {
                continue;
            } else {
                if (c11 == '/') {
                    throw new IllegalArgumentException("No closing ']' for " + xm.o.h(this.f63847b, i10, i11, xm.q.f75070b));
                }
                if (c11 == ']') {
                    c10 = 4;
                }
            }
            i13 = i14;
        }
        int i15 = this.f63852g;
        int i16 = this.f63854i;
        if (i15 >= i16) {
            throw new IllegalArgumentException("No port");
        }
        this.f63853h = xm.p.f(this.f63847b, i15 + 1, (i16 - i15) - 1, 10);
        this.f63854i = i10;
    }

    public void b(MultiMap multiMap) {
        if (this.f63856k == this.f63857l) {
            return;
        }
        this.f63860o.f();
        byte[] bArr = this.f63847b;
        int i10 = this.f63856k;
        UrlEncoded.decodeUtf8To(bArr, i10 + 1, (this.f63857l - i10) - 1, multiMap, this.f63860o);
    }

    public void c(MultiMap multiMap, String str) throws UnsupportedEncodingException {
        if (this.f63856k == this.f63857l) {
            return;
        }
        if (str == null || xm.o.d(str)) {
            byte[] bArr = this.f63847b;
            int i10 = this.f63856k;
            UrlEncoded.decodeUtf8To(bArr, i10 + 1, (this.f63857l - i10) - 1, multiMap);
        } else {
            byte[] bArr2 = this.f63847b;
            int i11 = this.f63856k;
            UrlEncoded.decodeTo(xm.o.h(bArr2, i11 + 1, (this.f63857l - i11) - 1, str), multiMap, str);
        }
    }

    public String d() {
        int i10 = this.f63854i;
        int i11 = this.f63858m;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public String e() {
        int i10 = this.f63854i;
        int i11 = this.f63855j;
        if (i10 == i11) {
            return null;
        }
        int i12 = i11 - i10;
        boolean z10 = false;
        while (i10 < this.f63855j) {
            byte b10 = this.f63847b[i10];
            if (b10 == 37) {
                if (!z10) {
                    this.f63860o.f();
                    s sVar = this.f63860o;
                    byte[] bArr = this.f63847b;
                    int i13 = this.f63854i;
                    sVar.b(bArr, i13, i10 - i13);
                    z10 = true;
                }
                int i14 = i10 + 2;
                int i15 = this.f63855j;
                if (i14 >= i15) {
                    throw new IllegalArgumentException("Bad % encoding: " + this);
                }
                byte[] bArr2 = this.f63847b;
                int i16 = i10 + 1;
                if (bArr2[i16] == 117) {
                    i10 += 5;
                    if (i10 >= i15) {
                        throw new IllegalArgumentException("Bad %u encoding: " + this);
                    }
                    try {
                        this.f63860o.h().append(new String(Character.toChars(xm.p.f(bArr2, i14, 4, 16))));
                    } catch (Exception e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    this.f63860o.a((byte) (xm.p.f(bArr2, i16, 2, 16) & 255));
                    i10 = i14;
                }
            } else if (z10) {
                this.f63860o.a(b10);
            }
            i10++;
        }
        return !z10 ? s(this.f63854i, i12) : this.f63860o.toString();
    }

    public String f(String str) {
        int i10 = this.f63854i;
        int i11 = this.f63855j;
        byte[] bArr = null;
        if (i10 == i11) {
            return null;
        }
        int i12 = i11 - i10;
        int length = 0;
        while (true) {
            int i13 = this.f63855j;
            if (i10 >= i13) {
                if (bArr != null) {
                    return xm.o.h(bArr, 0, length, str);
                }
                byte[] bArr2 = this.f63847b;
                int i14 = this.f63854i;
                return xm.o.h(bArr2, i14, i13 - i14, str);
            }
            byte[] bArr3 = this.f63847b;
            byte b10 = bArr3[i10];
            if (b10 == 37) {
                if (bArr == null) {
                    bArr = new byte[i12];
                    System.arraycopy(bArr3, this.f63854i, bArr, 0, length);
                }
                int i15 = i10 + 2;
                int i16 = this.f63855j;
                if (i15 >= i16) {
                    throw new IllegalArgumentException("Bad % encoding: " + this);
                }
                byte[] bArr4 = this.f63847b;
                int i17 = i10 + 1;
                if (bArr4[i17] == 117) {
                    i10 += 5;
                    if (i10 >= i16) {
                        throw new IllegalArgumentException("Bad %u encoding: " + this);
                    }
                    try {
                        byte[] bytes = new String(Character.toChars(xm.p.f(bArr4, i15, 4, 16))).getBytes(str);
                        System.arraycopy(bytes, 0, bArr, length, bytes.length);
                        length += bytes.length;
                    } catch (Exception e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    bArr[length] = (byte) (xm.p.f(bArr4, i17, 2, 16) & 255);
                    i10 = i15;
                    length++;
                }
            } else if (bArr == null) {
                length++;
            } else {
                bArr[length] = b10;
                length++;
            }
            i10++;
        }
    }

    public String g() {
        int i10 = this.f63851f;
        int i11 = this.f63852g;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public String h() {
        int i10 = this.f63854i;
        int i11 = this.f63855j;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public String i() {
        int i10 = this.f63854i;
        int i11 = this.f63856k;
        if (i10 == i11) {
            return null;
        }
        return s(i10, i11 - i10);
    }

    public int j() {
        return this.f63853h;
    }

    public String k() {
        int i10 = this.f63856k;
        int i11 = this.f63857l;
        if (i10 == i11) {
            return null;
        }
        return s(i10 + 1, (i11 - i10) - 1);
    }

    public String l(String str) {
        int i10 = this.f63856k;
        int i11 = this.f63857l;
        if (i10 == i11) {
            return null;
        }
        return xm.o.h(this.f63847b, i10 + 1, (i11 - i10) - 1, str);
    }

    public String m() {
        int i10 = this.f63849d;
        int i11 = this.f63850e;
        if (i10 == i11) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 == 5) {
            byte[] bArr = this.f63847b;
            if (bArr[i10] == 104 && bArr[i10 + 1] == 116 && bArr[i10 + 2] == 116 && bArr[i10 + 3] == 112) {
                return "http";
            }
        }
        if (i12 == 6) {
            byte[] bArr2 = this.f63847b;
            if (bArr2[i10] == 104 && bArr2[i10 + 1] == 116 && bArr2[i10 + 2] == 116 && bArr2[i10 + 3] == 112 && bArr2[i10 + 4] == 115) {
                return "https";
            }
        }
        return s(i10, (i11 - i10) - 1);
    }

    public boolean n() {
        return this.f63857l > this.f63856k;
    }

    public final void q(byte[] bArr, int i10, int i11) {
        char c10 = 0;
        this.f63859n = false;
        this.f63847b = bArr;
        int i12 = i10 + i11;
        this.f63858m = i12;
        this.f63849d = i10;
        this.f63850e = i10;
        this.f63851f = i10;
        this.f63852g = i10;
        this.f63853h = -1;
        this.f63854i = i10;
        this.f63855j = i12;
        this.f63856k = i12;
        this.f63857l = i12;
        boolean z10 = true;
        int i13 = i10;
        int i14 = i13;
        while (i13 < i12) {
            byte[] bArr2 = this.f63847b;
            char c11 = (char) (bArr2[i13] & 255);
            int i15 = i13 + 1;
            switch (c10) {
                case 0:
                    if (c11 != '#') {
                        if (c11 == '*') {
                            this.f63854i = i13;
                            i14 = i13;
                            i13 = i15;
                            c10 = '\n';
                        } else if (c11 == '/') {
                            i14 = i13;
                            i13 = i15;
                            c10 = 1;
                        } else if (c11 == ';') {
                            this.f63855j = i13;
                            i14 = i13;
                            i13 = i15;
                            c10 = '\b';
                        } else if (c11 != '?') {
                            c10 = 2;
                        } else {
                            this.f63855j = i13;
                            this.f63856k = i13;
                            i14 = i13;
                            i13 = i15;
                            c10 = '\t';
                        }
                        z10 = true;
                    } else {
                        this.f63855j = i13;
                        this.f63856k = i13;
                        this.f63857l = i13;
                    }
                    i14 = i13;
                    i13 = i15;
                    z10 = true;
                    break;
                case 1:
                    if ((this.f63846a || this.f63849d != this.f63850e) && c11 == '/') {
                        this.f63851f = i15;
                        int i16 = this.f63858m;
                        this.f63852g = i16;
                        this.f63854i = i16;
                        i13 = i15;
                        c10 = 4;
                    } else {
                        if (c11 == ';' || c11 == '?' || c11 == '#') {
                            i13 = i15 - 1;
                        } else {
                            this.f63851f = i14;
                            this.f63852g = i14;
                            i13 = i15;
                        }
                        c10 = 7;
                    }
                    z10 = true;
                    break;
                case 2:
                    if (i11 > 6 && c11 == 't') {
                        int i17 = i10 + 3;
                        if (bArr2[i17] == 58) {
                            i15 = i10 + 4;
                            c11 = ':';
                            i13 = i17;
                        } else {
                            int i18 = i10 + 4;
                            if (bArr2[i18] == 58) {
                                i15 = i10 + 5;
                            } else {
                                i18 = i10 + 5;
                                if (bArr2[i18] == 58) {
                                    i15 = i10 + 6;
                                }
                            }
                            c11 = ':';
                            i13 = i18;
                        }
                    }
                    if (c11 != '#') {
                        if (c11 == '/') {
                            i13 = i15;
                        } else if (c11 == '?') {
                            this.f63855j = i13;
                            this.f63856k = i13;
                            i13 = i15;
                            c10 = '\t';
                            z10 = true;
                        } else if (c11 != ':') {
                            if (c11 == ';') {
                                this.f63855j = i13;
                                i13 = i15;
                                c10 = '\b';
                            }
                            z10 = true;
                        } else {
                            int i19 = i15 + 1;
                            this.f63850e = i15;
                            this.f63854i = i15;
                            if (((char) (bArr2[i19] & 255)) == '/') {
                                i13 = i19;
                                i14 = i15;
                                c10 = 1;
                                z10 = true;
                            } else {
                                this.f63851f = i15;
                                this.f63852g = i15;
                                i13 = i19;
                                i14 = i15;
                            }
                        }
                        c10 = 7;
                        z10 = true;
                    } else {
                        this.f63855j = i13;
                        this.f63856k = i13;
                        this.f63857l = i13;
                    }
                    i13 = i15;
                    z10 = true;
                    break;
                case 3:
                default:
                    i13 = i15;
                    z10 = true;
                    break;
                case 4:
                    if (c11 == '/') {
                        this.f63854i = i13;
                        this.f63852g = i13;
                        i14 = i13;
                        c10 = 7;
                    } else if (c11 == ':') {
                        this.f63852g = i13;
                        c10 = 6;
                    } else if (c11 == '@') {
                        this.f63851f = i15;
                    } else if (c11 == '[') {
                        c10 = 5;
                    }
                    i13 = i15;
                    break;
                case 5:
                    if (c11 == '/') {
                        throw new IllegalArgumentException("No closing ']' for " + xm.o.h(this.f63847b, i10, i11, xm.q.f75070b));
                    }
                    if (c11 == ']') {
                        c10 = 4;
                    }
                    i13 = i15;
                    break;
                    break;
                case 6:
                    if (c11 == '/') {
                        this.f63854i = i13;
                        if (this.f63852g <= this.f63850e) {
                            this.f63852g = i13;
                        }
                        i14 = i13;
                        i13 = i15;
                        c10 = 7;
                    } else {
                        i13 = i15;
                        z10 = true;
                    }
                    break;
                case 7:
                    if (c11 == '#') {
                        this.f63855j = i13;
                        this.f63856k = i13;
                        this.f63857l = i13;
                        i13 = i15;
                        z10 = true;
                    } else {
                        if (c11 == '%') {
                            this.f63859n = z10;
                        } else if (c11 == ';') {
                            this.f63855j = i13;
                            c10 = '\b';
                        } else if (c11 == '?') {
                            this.f63855j = i13;
                            this.f63856k = i13;
                            c10 = '\t';
                        }
                        i13 = i15;
                    }
                    break;
                case '\b':
                    if (c11 == '#') {
                        this.f63856k = i13;
                        this.f63857l = i13;
                        i13 = i15;
                        z10 = true;
                    } else {
                        if (c11 == '?') {
                            this.f63856k = i13;
                            c10 = '\t';
                        }
                        i13 = i15;
                    }
                    break;
                case '\t':
                    if (c11 == '#') {
                        this.f63857l = i13;
                    }
                    i13 = i15;
                    z10 = true;
                    break;
                case '\n':
                    throw new IllegalArgumentException("only '*'");
            }
        }
        int i20 = this.f63852g;
        int i21 = this.f63854i;
        if (i20 < i21) {
            this.f63853h = xm.p.f(this.f63847b, i20 + 1, (i21 - i20) - 1, 10);
        }
    }

    public final String s(int i10, int i11) {
        this.f63860o.f();
        this.f63860o.b(this.f63847b, i10, i11);
        return this.f63860o.toString();
    }

    public String toString() {
        if (this.f63848c == null) {
            int i10 = this.f63849d;
            this.f63848c = s(i10, this.f63858m - i10);
        }
        return this.f63848c;
    }

    public void o(String str) {
        byte[] bytes = str.getBytes();
        q(bytes, 0, bytes.length);
        this.f63848c = str;
    }

    public n(String str) {
        this.f63848c = str;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            p(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public n(URI uri) {
        o(uri.toASCIIString());
    }
}
