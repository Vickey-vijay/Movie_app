package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X6 extends Writer {
    public static String[] A03 = {"sr30eG8QqeA9PTnBv5Bt4hnZqAQxDLuJ", "ps2O52LB4Fk5tPEI", "b0E7ZBCk8ZgliqiBFiLr9fpcu", "ecf9I9JqHAeutuSgOmpZliCU4Q5JYn9j", "xrLrW173V2mkM", "oulCgqQ5su5pKYGJ0eYJOoBckMcEv73q", "45k95lrmWFpsS3hCtOsWilPKXmnWWUvV", "gCGLfpIuPcjj9nzv"};
    public int A00;
    public char[] A01 = new char[1024];
    public final X5 A02;

    public X6(X5 x10) {
        this.A02 = x10;
    }

    private void A00() {
        this.A02.AGO(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i10;
        while (true) {
            int i13 = i10 + i11;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int length = str.length();
            int i14 = str2.length();
            if (length == i14) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "vRRDkAC7ww5dnR4MiguJ90FB5";
            strArr2[4] = "BIleT5EfDSeSU";
            if (i12 < i13) {
                if (cArr[i12] != '\n') {
                    int i15 = this.A00;
                    int i16 = this.A01.length;
                    if (i15 == i16) {
                        A00();
                    } else {
                        this.A01[this.A00] = cArr[i12];
                        int i17 = this.A00;
                        this.A00 = i17 + 1;
                    }
                } else {
                    A00();
                }
                i12++;
            } else {
                return;
            }
        }
    }
}
