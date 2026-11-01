package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.exoplayer.video.DummySurface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F6 extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"6kuie4aYgPB75l0BZDCG97Ci8L2oTJru", "l6cPtwgabkjuGz5CGYDwVz25JELI4cH1", "ZWx6OKWQHSAUUpB5i", "EzrPiu1XHV7NearbxEmg0OLwBftw8IiR", "WDaMG3q3woavC04Kn8C74ndkvxFOsuJP", "mphQp1xRvmcoCppqdKDkA9aBwN9eJkVD", "Bip3dWfDJBluF0z6EYAQ2tUBnuWGs1iH", "Qe"};
    public Handler A00;
    public RunnableC09443e A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A06;
            if (strArr[6].charAt(1) == strArr[4].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "ZYchz1gCfuPSGZN7lZw97cRKorp74rZl";
            strArr2[4] = "DndbQji8K3ZDCB5sBvfJw1HHxvL19lCS";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{13, 60, 36, 36, 48, 26, 60, 59, 47, 40, ExifInterface.START_CODE, 44, 58, 29, 21, 16, 25, 24, 92, 8, 19, 92, 21, 18, 21, 8, 21, 29, 16, 21, 6, 25, 92, 24, 9, 17, 17, 5, 92, 15, 9, 14, 26, 29, 31, 25, 94, 121, 113, 116, 125, 124, 56, 108, 119, 56, 106, 125, 116, 125, 121, 107, 125, 56, 124, 109, 117, 117, 97, 56, 107, 109, 106, 126, 121, 123, 125, 49, 32, 56, 56, 44, 6, 32, 39, 51, 52, 54, 48};
    }

    static {
        A02();
    }

    public F6() {
        super(A00(77, 12, 62));
    }

    private void A01() {
        C3M.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i10) {
        C3M.A01(this.A01);
        this.A01.A09(i10);
        this.A02 = new DummySurface(this, this.A01.A07(), i10 != 0);
    }

    public final DummySurface A04(int i10) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new RunnableC09443e(this.A00);
        boolean z10 = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i10, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) C3M.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        C3M.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                            break;
                        }
                    } catch (Error e10) {
                        AnonymousClass44.A08(A00(0, 12, 34), A00(12, 34, 23), e10);
                        this.A03 = e10;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e11) {
                        AnonymousClass44.A08(A00(0, 12, 34), A00(12, 34, 23), e11);
                        this.A04 = e11;
                        synchronized (this) {
                            notify();
                            break;
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                        break;
                    } catch (Throwable th2) {
                        try {
                            AnonymousClass44.A08(A00(0, 12, 34), A00(46, 31, 115), th2);
                        } finally {
                            quit();
                        }
                        break;
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
        synchronized (this) {
            notify();
            throw th3;
        }
    }
}
