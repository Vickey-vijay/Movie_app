package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3O {
    public static byte[] A02;
    public static String[] A03 = {"xt7OJkzoRAU9F21vTA99nWdYHEgU1aqe", "agkrpda7Xp", "R", "5vNqnHOJCumqZOnLm9qFfz6JcwPphcfm", "ZSdlC9FQn5pQkXbUirih3rU8AE2dOqgO", "058ZJGrrLXJjuDHx9oXjnYONx8ueRFml", "p8wyR2SRaX4jfTsJEE0Ho6ErxYgTWBLm", "ZJmK2n287z"};
    public final File A00;
    public final File A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-69, 15, 10, -69, -3, -4, -2, 6, 16, 11, -69, 1, 4, 7, 0, -69, -43, 9, 8, 18, -64, -13, -18, -20, -24, -30, -59, -24, -21, -28, 6, 50, 56, 47, 39, 49, -22, 55, -29, 38, 53, 40, 36, 55, 40, -29, -13, 31, 37, 28, 20, 30, -41, 36, -48, 34, 21, 30, 17, 29, 21, -48, 22, 25, 28, 21, -48};
    }

    static {
        A02();
    }

    public C3O(File file) {
        this.A01 = file;
        this.A00 = new File(file.getPath() + A00(16, 4, 88));
    }

    private void A01() {
        if (this.A00.exists()) {
            this.A01.delete();
            this.A00.renameTo(this.A01);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3N] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.ads.redexgen.X.3N] */
    public final C3N A03() throws IOException {
        if (this.A01.exists()) {
            File file = this.A00;
            String[] strArr = A03;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A03[3] = "WaNlpEO0EesrYpEsZIaqNMFL0IgmF9T8";
            if (!file.exists()) {
                boolean zRenameTo = this.A01.renameTo(this.A00);
                String[] strArr2 = A03;
                if (strArr2[0].charAt(5) != strArr2[4].charAt(5)) {
                    String[] strArr3 = A03;
                    strArr3[0] = "Kt2izesvv7R2DCfklGYX0jErBdo4LMwT";
                    strArr3[4] = "3ZhItr65AZc3uqV8hBhNNn4gHqhWY2uE";
                    if (!zRenameTo) {
                        AnonymousClass44.A07(A00(20, 10, 48), A00(46, 21, 97) + this.A01 + A00(0, 16, 76) + this.A00);
                    }
                } else {
                    A03[2] = "qsL8i3rJfSd1ZoM6";
                    if (!zRenameTo) {
                        AnonymousClass44.A07(A00(20, 10, 48), A00(46, 21, 97) + this.A01 + A00(0, 16, 76) + this.A00);
                    }
                }
            } else {
                this.A01.delete();
            }
        }
        try {
            final File file2 = this.A01;
            return new OutputStream(file2) { // from class: com.facebook.ads.redexgen.X.3N
                public static byte[] A02;
                public boolean A00 = false;
                public final FileOutputStream A01;

                static {
                    A01();
                }

                public static String A00(int i10, int i11, int i12) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                    for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                        bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A02 = new byte[]{-25, 26, 21, 19, 15, 9, -20, 15, 18, 11, 36, 63, 71, 74, 67, 66, -2, 82, 77, -2, 81, 87, 76, 65, -2, 68, 71, 74, 67, -2, 66, 67, 81, 65, 80, 71, 78, 82, 77, 80, 24};
                }

                {
                    this.A01 = new FileOutputStream(file2);
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    if (this.A00) {
                        return;
                    }
                    this.A00 = true;
                    flush();
                    try {
                        this.A01.getFD().sync();
                    } catch (IOException e10) {
                        AnonymousClass44.A0A(A00(0, 10, 70), A00(10, 31, 126), e10);
                    }
                    this.A01.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public final void flush() throws IOException {
                    this.A01.flush();
                }

                @Override // java.io.OutputStream
                public final void write(int i10) throws IOException {
                    this.A01.write(i10);
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr) throws IOException {
                    this.A01.write(bArr);
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr, int i10, int i11) throws IOException {
                    this.A01.write(bArr, i10, i11);
                }
            };
        } catch (FileNotFoundException e10) {
            File parentFile = this.A01.getParentFile();
            String strA00 = A00(30, 16, 116);
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    final File parent = this.A01;
                    return new OutputStream(parent) { // from class: com.facebook.ads.redexgen.X.3N
                        public static byte[] A02;
                        public boolean A00 = false;
                        public final FileOutputStream A01;

                        static {
                            A01();
                        }

                        public static String A00(int i10, int i11, int i12) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{-25, 26, 21, 19, 15, 9, -20, 15, 18, 11, 36, 63, 71, 74, 67, 66, -2, 82, 77, -2, 81, 87, 76, 65, -2, 68, 71, 74, 67, -2, 66, 67, 81, 65, 80, 71, 78, 82, 77, 80, 24};
                        }

                        {
                            this.A01 = new FileOutputStream(parent);
                        }

                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() throws IOException {
                            if (this.A00) {
                                return;
                            }
                            this.A00 = true;
                            flush();
                            try {
                                this.A01.getFD().sync();
                            } catch (IOException e11) {
                                AnonymousClass44.A0A(A00(0, 10, 70), A00(10, 31, 126), e11);
                            }
                            this.A01.close();
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public final void flush() throws IOException {
                            this.A01.flush();
                        }

                        @Override // java.io.OutputStream
                        public final void write(int i10) throws IOException {
                            this.A01.write(i10);
                        }

                        @Override // java.io.OutputStream
                        public final void write(byte[] bArr) throws IOException {
                            this.A01.write(bArr);
                        }

                        @Override // java.io.OutputStream
                        public final void write(byte[] bArr, int i10, int i11) throws IOException {
                            this.A01.write(bArr, i10, i11);
                        }
                    };
                } catch (FileNotFoundException e11) {
                    throw new IOException(strA00 + this.A01, e11);
                }
            }
            throw new IOException(strA00 + this.A01, e10);
        }
    }

    public final InputStream A04() throws FileNotFoundException {
        A01();
        return new FileInputStream(this.A01);
    }

    public final void A05() {
        this.A01.delete();
        this.A00.delete();
    }

    public final void A06(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.A00.delete();
    }

    public final boolean A07() {
        return this.A01.exists() || this.A00.exists();
    }
}
