package com.bytedance.sdk.openadsdk.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.settings.ra;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.vm.lh;
import com.bytedance.sdk.openadsdk.vm.yu;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {
    public static boolean ouw(PAGLoadListener pAGLoadListener) {
        if (ra.ouw()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void ouw(final pno pnoVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!jg.fkw()) {
                    ko.fkw("AdLoadBaseManager", "please exec TTAdSdk.init before load ad");
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (bly.ouw().cf()) {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, com.bytedance.sdk.openadsdk.core.pno.ouw(10004));
                        return;
                    }
                    return;
                }
                lh.ouw(new yu() { // from class: com.bytedance.sdk.openadsdk.ouw.ouw.1.1
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = Constants.LOAD_AD;
                        ouwVar.f13465ra = adSlot.getCodeId();
                        ouwVar.pno = uoy.lh(adSlot.getDurationSlotType());
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                        ouwVar.mwh = uoy.ouw(adSlot).toString();
                        return ouwVar;
                    }
                });
                bs.yu(pnoVar);
            }
        };
        if (jg.fkw()) {
            runnable.run();
        } else {
            jg.vt().post(runnable);
        }
    }

    public static void ouw(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!jg.fkw() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey(CreativeInfo.f44321c) && extraInfo.get(CreativeInfo.f44321c) != null) {
            builder.setAdId(extraInfo.get(CreativeInfo.f44321c).toString());
        }
        if (extraInfo.containsKey("creative_id") && extraInfo.get("creative_id") != null) {
            builder.setCreativeId(extraInfo.get("creative_id").toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean ouw(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
