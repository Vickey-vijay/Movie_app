package com.bytedance.sdk.component.fkw.yu.lh.vt;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.utils.qbp;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fkw.yu.lh.vt.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0090ouw {
        void ouw();

        void ouw(Drawable drawable);

        void vt();
    }

    public static void ouw(byte[] bArr, InterfaceC0090ouw interfaceC0090ouw) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                interfaceC0090ouw.ouw(ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap)));
                return;
            } catch (Throwable th2) {
                qbp.lh("PAGGifDefaultDecoder", th2.getMessage());
                interfaceC0090ouw.ouw();
                return;
            }
        }
        interfaceC0090ouw.vt();
    }
}
