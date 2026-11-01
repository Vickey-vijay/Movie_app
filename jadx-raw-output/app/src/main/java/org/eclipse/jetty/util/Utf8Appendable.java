package org.eclipse.jetty.util;

import java.io.IOException;
import xm.p;
import zm.b;
import zm.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Utf8Appendable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f65740d = b.a(Utf8Appendable.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f65741e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f65742f = {0, 12, 24, 36, 60, 96, 84, 12, 12, 12, 48, 72, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 12, 12, 12, 12, 12, 0, 12, 0, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f65743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65744b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65745c;

    public static class NotUtf8Exception extends IllegalArgumentException {
        public NotUtf8Exception(String str) {
            super("Not valid UTF8! " + str);
        }
    }

    public void b(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            try {
                c(bArr[i10]);
                i10++;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void f() {
        this.f65744b = 0;
    }

    public void c(byte b10) throws IOException {
        if (b10 > 0 && this.f65744b == 0) {
            this.f65743a.append((char) (b10 & 255));
            return;
        }
        int i10 = b10 & 255;
        byte b11 = f65741e[i10];
        int i11 = this.f65744b;
        int i12 = i11 == 0 ? (255 >> b11) & i10 : (i10 & 63) | (this.f65745c << 6);
        this.f65745c = i12;
        byte b12 = f65742f[i11 + b11];
        if (b12 == 0) {
            this.f65744b = b12;
            if (i12 < 55296) {
                this.f65743a.append((char) i12);
                return;
            }
            for (char c10 : Character.toChars(i12)) {
                this.f65743a.append(c10);
            }
            return;
        }
        if (b12 != 12) {
            this.f65744b = b12;
            return;
        }
        String str = "byte " + p.h(b10) + " in state " + (this.f65744b / 12);
        this.f65745c = 0;
        this.f65744b = 0;
        this.f65743a.append((char) 65533);
        throw new NotUtf8Exception(str);
    }

    public boolean e() {
        return this.f65744b == 0;
    }

    public Utf8Appendable(Appendable appendable) {
        this.f65743a = appendable;
    }

    public void a(byte b10) {
        try {
            c(b10);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void d() {
        if (e()) {
            return;
        }
        this.f65745c = 0;
        this.f65744b = 0;
        try {
            this.f65743a.append((char) 65533);
            throw new NotUtf8Exception("incomplete UTF8 sequence");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String g() {
        if (!e()) {
            this.f65745c = 0;
            this.f65744b = 0;
            try {
                this.f65743a.append((char) 65533);
                NotUtf8Exception notUtf8Exception = new NotUtf8Exception("incomplete UTF8 sequence");
                c cVar = f65740d;
                cVar.g(notUtf8Exception.toString(), new Object[0]);
                cVar.a(notUtf8Exception);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return this.f65743a.toString();
    }
}
