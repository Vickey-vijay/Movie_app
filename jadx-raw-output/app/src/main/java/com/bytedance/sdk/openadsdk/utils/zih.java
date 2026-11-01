package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class zih {

    public interface ouw {
        void ouw();

        void ouw(com.bytedance.sdk.openadsdk.th.ouw.vt vtVar);

        void vt();
    }

    public static void ouw(com.bytedance.sdk.openadsdk.th.ouw ouwVar, int i10, int i11, final ouw ouwVar2, String str, int i12) {
        com.bytedance.sdk.component.utils.ko.fkw("splashLoadAd", " getImageBytes url ".concat(String.valueOf(ouwVar)));
        com.bytedance.sdk.openadsdk.th.vt.ouw().lh().ouw(ouwVar, new com.bytedance.sdk.openadsdk.th.ouw.ouw.InterfaceC0151ouw() { // from class: com.bytedance.sdk.openadsdk.utils.zih.1
            @Override // com.bytedance.sdk.openadsdk.th.ouw.ouw.InterfaceC0151ouw
            public final void ouw(com.bytedance.sdk.openadsdk.th.ouw.vt vtVar) {
                ouw ouwVar3;
                if (vtVar.vt() && (ouwVar3 = ouwVar2) != null) {
                    ouwVar3.ouw(vtVar);
                    return;
                }
                ouw ouwVar4 = ouwVar2;
                if (ouwVar4 != null) {
                    ouwVar4.ouw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.th.ouw.ouw.InterfaceC0151ouw
            public final void vt() {
                ouw ouwVar3 = ouwVar2;
                if (ouwVar3 != null) {
                    ouwVar3.vt();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.th.ouw.ouw.InterfaceC0151ouw
            public final void ouw() {
                ouw ouwVar3 = ouwVar2;
                if (ouwVar3 != null) {
                    ouwVar3.ouw();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable ouw(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
