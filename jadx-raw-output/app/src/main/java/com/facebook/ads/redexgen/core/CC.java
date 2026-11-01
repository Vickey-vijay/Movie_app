package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CC extends AsyncTask<AbstractC2068ep, Void, InterfaceC2055ec> implements InterfaceC2065em {
    public static byte[] A04;
    public static String[] A05 = {"QrFR9YxtZmjHUVEKV6oKE4DdGtsrpc8H", "TwcoDq13NGDzrd27uf1NctQWIs88CxA5", "DEQUIzHs8EHMaJWbR5cSGVZv3Gss2W35", "Ai8rFQMQjE1asV4GIWZxLQq3VKhMcnMa", "Q3dsJQvnRhhndIZBGw2JIf13CD9aK", "FSoxIZL2zci1XZCD3aOfhtBMx8TI21HW", "XwCxwzkF49MOW0uOTgxgRHHne1dL58CR", "45IZuxFnerodSJSRUIhMDhHmCeiAV"};
    public InterfaceC2057ee A00;
    public C8 A01;
    public Exception A02;
    public Executor A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final InterfaceC2055ec A00(AbstractC2068ep... abstractC2068epArr) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return null;
        }
        String[] strArr = A05;
        if (strArr[5].charAt(28) != strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        A05[6] = "rZqzIjYv4aJ5FL2pEqspRVXwv6AN0NL2";
        try {
            if (abstractC2068epArr != null) {
                try {
                    if (abstractC2068epArr.length > 0) {
                        InterfaceC2055ec interfaceC2055ecA0J = this.A01.A0J(abstractC2068epArr[0]);
                        if (this.A01.A0K().A04() && interfaceC2055ecA0J != null) {
                            String.format(Locale.US, A01(108, 21, 5), Integer.valueOf(interfaceC2055ecA0J.A94()), interfaceC2055ecA0J.getUrl(), interfaceC2055ecA0J.A6v());
                        }
                        if (interfaceC2055ecA0J != null) {
                            return interfaceC2055ecA0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 59));
                    }
                } catch (Exception e10) {
                    this.A02 = e10;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 95), e10.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 49));
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A05[0].charAt(24) != 'G') {
                throw new RuntimeException();
            }
            A05[0] = "mnFvayeDWU8YlLMMxELrFm0bGTjKFJH1";
            bArrCopyOfRange[i13] = (byte) (i14 - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-119, -76, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -103, -90, -72, -80, 101, -71, -90, -80, -86, -72, 101, -86, -67, -90, -88, -71, -79, -66, 101, -76, -77, -86, 101, -90, -73, -84, -70, -78, -86, -77, -71, 101, -76, -85, 101, -71, -66, -75, -86, 101, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -69, -57, -57, -61, -109, -27, -40, -28, -24, -40, -26, -25, -109, ExifInterface.MARKER_EOI, -44, -36, -33, -40, -41, -83, -109, -104, -26, -105, -61, -61, -65, 111, -63, -76, -62, -65, -66, -67, -62, -76, 111, -72, -62, 111, -67, -60, -69, -69, 107, 126, -116, -119, -120, -121, -116, 126, 83, 57, 62, 125, 57, 65, 62, -116, 66, 83, 35, 62, -116};
    }

    static {
        A02();
    }

    public CC(C8 c10, InterfaceC2057ee interfaceC2057ee, Executor executor) {
        this.A01 = c10;
        this.A00 = interfaceC2057ee;
        this.A03 = executor;
    }

    private final void A03(InterfaceC2055ec result) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A00.ACo(result);
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }

    public final void A04(AbstractC2068ep abstractC2068ep) {
        super.executeOnExecutor(this.A03, abstractC2068ep);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC2055ec doInBackground(AbstractC2068ep[] abstractC2068epArr) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC2068epArr);
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.ADC(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC2055ec interfaceC2055ec) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            A03(interfaceC2055ec);
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
