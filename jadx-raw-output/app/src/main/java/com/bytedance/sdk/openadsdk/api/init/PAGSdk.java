package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ra.yu;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.common.le;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.pno.ouw;
import com.bytedance.sdk.openadsdk.rn.lh;
import com.bytedance.sdk.openadsdk.utils.bs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    public interface PAGInitCallback {
        void fail(int i10, String str);

        void success();
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (le.ouw()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            bs.le(new pno("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public final void run() {
                    zih.vt(context);
                    biddingTokenCallback.onBiddingTokenCollected(ouw.ouw(pAGBiddingRequest));
                    com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false);
                }
            });
        }
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && jg.yu() == 0) {
            ouw.ouw.add(pAGInitCallback);
        }
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && zih.yu().bly() && isInitSuccess()) {
            lh.ouw().ouw(jSONObject);
        }
    }

    static {
        ouw.ouw();
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.multipro.lh.ouw();
    }

    public static String getSDKVersion() {
        if (pd.ouw() != null) {
            return pd.ouw().lh();
        }
        return "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public final void run() {
                ouw.ouw(context, pAGConfig, pAGInitCallback);
            }
        });
        jg.pno();
    }

    public static boolean isInitSuccess() {
        if (jg.yu() == 1) {
            return true;
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (!TextUtils.isEmpty(str)) {
            vpp.ouw(str);
            yu.ouw(str);
        }
    }

    private static void setSdkDisable(boolean z10) {
        le.ouw(z10);
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (le.ouw()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            bs.le(new pno("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public final void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                    com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false);
                }
            });
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (le.ouw()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            bs.le(new pno("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                @Override // java.lang.Runnable
                public final void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                    com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false);
                }
            });
        }
    }

    public static String getBiddingToken(Context context) {
        if (le.ouw()) {
            return null;
        }
        zih.vt(context);
        return getBiddingToken();
    }

    public static String getBiddingToken(Context context, String str) {
        if (le.ouw()) {
            return null;
        }
        zih.vt(context);
        return getBiddingToken(str);
    }

    public static String getBiddingToken(String str) {
        if (le.ouw()) {
            return null;
        }
        if (zih.ouw() == null || pd.ouw() == null) {
            return "";
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setSlotId(str);
        return pd.ouw().ouw(pAGBiddingRequest);
    }

    public static String getBiddingToken() {
        if (le.ouw()) {
            return null;
        }
        return (zih.ouw() == null || pd.ouw() == null) ? "" : pd.ouw().ouw((PAGBiddingRequest) null);
    }
}
