package com.bytedance.sdk.openadsdk.th.ouw;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.pno;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ouw {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.th.ouw.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0151ouw {
        void ouw();

        void ouw(vt vtVar);

        void vt();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.th.ouw ouwVar, final InterfaceC0151ouw interfaceC0151ouw, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, vpp vppVar) {
        tlj tljVarOuw = yu.ouw.ouw(yu.ouw.vt.ouw(ouwVar.ouw).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).ouw(ouwVar.vt).ouw(i10).vt(i11).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).vt(str).ouw(scaleType).ouw(!TextUtils.isEmpty(str));
        if (i12 <= 0 || Build.VERSION.SDK_INT < 26) {
            tljVarOuw.lh(1);
        } else {
            tljVarOuw.lh(2).ouw(new pno() { // from class: com.bytedance.sdk.openadsdk.th.ouw.ouw.1
                @Override // com.bytedance.sdk.component.fkw.pno
                public final Bitmap ouw(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(zih.ouw(), bitmap, i12);
                }
            });
        }
        tljVarOuw.vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, ouwVar.ouw, new rn() { // from class: com.bytedance.sdk.openadsdk.th.ouw.ouw.2
            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(cf cfVar) {
                ouw.this.ouw(cfVar, interfaceC0151ouw);
            }

            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(int i13, String str2, Throwable th2) {
                InterfaceC0151ouw interfaceC0151ouw2 = interfaceC0151ouw;
                if (interfaceC0151ouw2 != null) {
                    interfaceC0151ouw2.ouw();
                }
            }
        }));
    }

    public void ouw(cf cfVar, InterfaceC0151ouw interfaceC0151ouw) {
        Object obj;
        if (interfaceC0151ouw != null) {
            Object objVt = cfVar.vt();
            Map<String, String> mapYu = cfVar.yu();
            int iIntValue = (mapYu == null || (obj = mapYu.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) ? 0 : ((Integer) obj).intValue();
            if (objVt instanceof Drawable) {
                cfVar.ouw();
                interfaceC0151ouw.ouw(new vt((Drawable) objVt, iIntValue));
            } else if (objVt instanceof byte[]) {
                cfVar.ouw();
                interfaceC0151ouw.ouw(new vt((byte[]) objVt, iIntValue));
            } else if (objVt instanceof Bitmap) {
                Bitmap bitmap = cfVar.lh() instanceof Bitmap ? (Bitmap) cfVar.lh() : null;
                cfVar.ouw();
                interfaceC0151ouw.ouw(new vt((Bitmap) objVt, bitmap, iIntValue));
            } else {
                interfaceC0151ouw.ouw();
            }
        }
        if (interfaceC0151ouw != null) {
            interfaceC0151ouw.vt();
        }
    }
}
