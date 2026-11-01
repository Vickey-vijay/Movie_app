package com.mbridge.msdk.splash.request;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: BaseSplashV3Params.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static com.mbridge.msdk.foundation.same.net.wrapper.e a(Context context, MBridgeIds mBridgeIds, f fVar) {
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(mBridgeIds.getUnitId(), "splash");
        String strA2 = v0.a(context, mBridgeIds.getUnitId());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "app_id", strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, mBridgeIds.getUnitId());
        if (!TextUtils.isEmpty(mBridgeIds.getPlacementId())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, mBridgeIds.getPlacementId());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", fVar.d() + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f35062g, strA);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f35063h, strA2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f35064i, fVar.e());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", "297");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, TypedValues.CycleType.S_WAVE_OFFSET, fVar.c() + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, fVar.b() + VastAttributes.HORIZONTAL_POSITION + fVar.a());
        return eVar;
    }
}
