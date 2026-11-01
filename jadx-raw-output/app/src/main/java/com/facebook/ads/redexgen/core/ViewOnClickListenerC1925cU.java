package com.facebook.ads.redexgen.core;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1925cU implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4H A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, ExifInterface.START_CODE, 46, 43, ExifInterface.START_CODE, 61};
    }

    public ViewOnClickListenerC1925cU(C4H c4h) {
        this.A00 = c4h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00 != null) {
                this.A00.A00.A1A(A00(0, 6, 53));
            }
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
