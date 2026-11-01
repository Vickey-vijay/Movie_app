package com.facebook.ads.redexgen.core;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2324jF implements L9 {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, 127, 110, 121, 121, 126, 123, 127, 110, 111, 33, 117, 110, 33, 102, 49, 47, 50, 46, 102, 41, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, 46, 52, 37, 46, 52, 109, 44, 37, 46, 39, 52, 40, 122, 96, 5, 20, 14, 77, 65, 64, 64, 75, 77, 90, 71, 65, 64, 14, 71, 93, 14, 79, 76, 93, 75, 64, 90, 15, 20, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, 37, 119, 55, 24, 47, 47, 50, 47, 125, 57, 52, 46, 62, 50, 51, 51, 56, 62, 41, 52, 51, 58, 125, 21, 41, 41, 45, 8, 47, 49, 30, 50, 51, 51, 56, 62, 41, 52, 50, 51, 21, 34, 34, 63, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, 63, 112, 54, 34, 63, 61, 112, 27, 44, 44, 49, 44, 126, 49, 46, 59, 48, 55, 48, 57, 126, 61, 49, 48, 48, 59, 61, ExifInterface.START_CODE, 55, 49, 48, 126, 56, 49, 44, 126, 35, 20, 20, 9, 20, 70, 20, 3, 7, 2, 15, 8, 1, 70, 2, 7, 18, 7, 70, 0, 20, 9, 11, 70, 92, 96, 96, 100, 65, 102, 120, 71, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, 51, 101, 70, 74, 72, 93, 64, 70, 71, 0, 63, ExifInterface.START_CODE, 33, 111, 44, 32, 33, 33, ExifInterface.START_CODE, 44, 59, 38, 32, 33, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, 31, 92, 80, 81, 75, 90, 81, 75, 31, 86, 81, 89, 80, 31, 89, 77, 80, 82, 31, 106, 93, 89, 92, 81, 86, 95, 24, 75, 87, 77, 74, 91, 93, 24, 33, 26, 26, 85, 24, 20, 27, 12, 85, 7, 16, 17, 28, 7, 16, 22, 1, 6, 79, 85, 92, 6, 28, 81, 85, 81, 89, 6, 28, 30, 5, 8, 25, 15, 65, 99};
    }

    static {
        A04();
        A07 = C2324jF.class.getSimpleName();
    }

    public C2324jF(String str) {
        this(str, L7.A01(str));
    }

    public C2324jF(String str, int i10) {
        this(str);
        this.A00 = i10;
    }

    public C2324jF(String str, String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) L8.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i10, int i11) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        if (i11 == 200) {
            return contentLength;
        }
        return i11 == 206 ? contentLength + i10 : this.A05;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    private HttpURLConnection A02(int i10, int i11) throws IOException, C2328jJ {
        HttpURLConnection httpURLConnection;
        boolean z10;
        int code = 0;
        String headerField = this.A03;
        do {
            String str = A01(234, 16, 75) + (i10 > 0 ? A01(19, 13, 66) + i10 : A01(0, 0, 127)) + A01(15, 4, 5) + headerField;
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            if (i10 > 0) {
                httpURLConnection.setRequestProperty(A01(250, 5, 3), A01(322, 6, 120) + i10 + A01(50, 1, 44));
            }
            if (i11 > 0) {
                httpURLConnection.setConnectTimeout(i11);
                if (A09[3].length() != 13) {
                    throw new RuntimeException();
                }
                A09[0] = "1Ss55MOjwkg";
                httpURLConnection.setReadTimeout(i11);
            }
            int responseCode = httpURLConnection.getResponseCode();
            this.A04 = responseCode;
            if (responseCode != 301) {
                String[] strArr = A09;
                String url = strArr[4];
                String str2 = strArr[6];
                int length = url.length();
                int redirectCount = str2.length();
                if (length == redirectCount) {
                    String[] strArr2 = A09;
                    strArr2[1] = "p6lJtanqIpTVtR8wvrkpKJ2zYO";
                    strArr2[5] = "gJMCNOhCywWTIArSLN7pAqKg27";
                    if (responseCode != 302) {
                        if (responseCode == 303) {
                            z10 = false;
                        }
                    }
                } else if (responseCode != 302) {
                    if (responseCode == 303) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else {
                z10 = true;
            }
            if (z10) {
                headerField = httpURLConnection.getHeaderField(A01(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 8, 45));
                code++;
                httpURLConnection.disconnect();
            }
            if (code > 5) {
                String url2 = A01(293, 20, 113) + code;
                throw new C2328jJ(url2);
            }
        } while (z10);
        return httpURLConnection;
    }

    private void A03() throws C2328jJ {
        String str = A01(255, 23, 59) + this.A03;
        HttpURLConnection httpURLConnectionA02 = null;
        InputStream inputStream = null;
        try {
            httpURLConnectionA02 = A02(0, 10000);
            this.A05 = httpURLConnectionA02.getContentLength();
            this.A06 = httpURLConnectionA02.getContentType();
            inputStream = httpURLConnectionA02.getInputStream();
            Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
        } catch (IOException e10) {
            Log.e(A07, A01(129, 25, 84) + this.A03, e10);
        } finally {
            L7.A05(inputStream);
            if (httpURLConnectionA02 != null) {
                httpURLConnectionA02.disconnect();
            }
        }
    }

    private final void A05(int i10, int i11) throws C2328jJ {
        try {
            this.A02 = A02(i10, i11);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i10, this.A02.getResponseCode());
        } catch (IOException e10) {
            throw new C2328jJ(A01(154, 29, 90) + this.A03 + A01(19, 13, 66) + i10, e10);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final void AFz(int i10) throws C2328jJ {
        A05(i10, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final void close() throws C2328jJ {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e10) {
                throw new C2328jJ(A01(92, 37, 89), e10);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final synchronized int length() throws C2328jJ {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final int read(byte[] bArr) throws C2328jJ {
        InputStream inputStream = this.A01;
        String strA01 = A01(183, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e10) {
                final String str = A01(278, 15, 60) + this.A03 + A01(0, 15, 15);
                throw new C2328jJ(str, e10) { // from class: com.facebook.ads.redexgen.X.7e
                };
            } catch (IOException e11) {
                throw new C2328jJ(strA01 + this.A03, e11);
            }
        }
        throw new C2328jJ(strA01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
