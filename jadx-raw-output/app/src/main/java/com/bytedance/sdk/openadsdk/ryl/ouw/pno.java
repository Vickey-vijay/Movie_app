package com.bytedance.sdk.openadsdk.ryl.ouw;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.bs;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class pno extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", C3426d4.i.f28556o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));
    private final bs fkw;

    @Override // com.bytedance.sdk.component.ouw.yu
    @Nullable
    public final /* synthetic */ Object ouw(String str, @NonNull Object obj) throws Exception {
        bs.vt vtVar = new bs.vt();
        vtVar.ouw = NotificationCompat.CATEGORY_CALL;
        vtVar.f12595lh = str;
        vtVar.yu = (JSONObject) obj;
        return this.fkw.ouw(vtVar, 3);
    }

    private pno(bs bsVar) {
        this.fkw = bsVar;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, bs bsVar) {
        koVar.ouw(yu, new pno(bsVar));
    }
}
