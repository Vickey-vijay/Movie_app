package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class fvf implements uq {
    private static final Map<Integer, String> ouw = new HashMap<Integer, String>() { // from class: com.bytedance.sdk.openadsdk.core.fvf.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, Q6.V0);
            put(4, "apk-sign");
            put(5, "screen_scale");
            put(6, CommonUrlParts.APP_SET_ID_SCOPE);
            put(7, CommonUrlParts.APP_SET_ID);
            put(8, "installed_source");
            put(9, "app_running_time");
            put(10, "vendor");
            put(11, "model");
            put(12, "user_agent_device");
            put(13, "user_agent_webview");
            put(14, "sys_compiling_time");
            put(15, "sec_did");
            put(16, "url");
            put(17, "X-Argus");
            put(18, "X-Ladon");
            put(19, "X-Khronos");
            put(20, "X-Gorgon");
            put(21, "pangle_m");
            put(22, CommonUrlParts.SCREEN_HEIGHT);
            put(23, CommonUrlParts.SCREEN_WIDTH);
            put(24, "rom_version");
            put(25, "carrier_name");
            put(26, CommonUrlParts.OS_VERSION);
            put(27, "conn_type");
            put(28, "boot");
            put(29, "feature_data");
            put(30, "t_ver");
            put(31, CampaignEx.JSON_KEY_AAB);
            put(32, "w_ver");
            put(33, "is_fold");
            put(34, "abi");
            put(35, "is_multi");
        }
    };
    private int vt = 0;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.openadsdk.core.uq
    /* JADX INFO: renamed from: fkw, reason: merged with bridge method [inline-methods] */
    public fvf vt(String str) {
        bly.ouw().ouw(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.openadsdk.core.uq
    /* JADX INFO: renamed from: yu, reason: merged with bridge method [inline-methods] */
    public fvf ouw(String str) {
        mwh mwhVar;
        bly blyVarOuw = bly.ouw();
        if (TextUtils.isEmpty(str) && (mwhVar = bly.ouw) != null) {
            mwhVar.ouw("appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", "appid cannot be empty");
        blyVarOuw.vt = str;
        if (!TextUtils.isEmpty(str)) {
            bly.ouw("app_id", str);
            com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(7, false);
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq lh(int i10) {
        this.vt = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final String lh() {
        return BuildConfig.VERSION_NAME;
    }

    private static void le() {
        try {
            com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.fvf.4
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f13464lh = "bidding_token";
                    return ouwVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAdManagerImpl", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq fkw(int i10) {
        bly.ouw().f12503ra = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq lh(String str) {
        bly blyVarOuw = bly.ouw();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "adx_id", str);
        }
        blyVarOuw.pno = str;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq ouw(int i10) {
        bly blyVarOuw = bly.ouw();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        blyVarOuw.fkw = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq vt(int i10) {
        Integer num;
        bly blyVarOuw = bly.ouw();
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if ((i10 == 0 || i10 == 1 || i10 == -1) && ((num = blyVarOuw.f12501le) == null || num.intValue() != i10)) {
            blyVarOuw.f12501le = Integer.valueOf(i10);
            if (com.bytedance.sdk.openadsdk.utils.bs.le()) {
                jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.2
                    public final /* synthetic */ Integer ouw;
                    public final /* synthetic */ int vt;

                    public AnonymousClass2() {
                        num = num;
                        i = i10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bly.ouw(num, i);
                    }
                });
            } else {
                bly.ouw(num, i10);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final int fkw() {
        return bly.ouw().f12503ra;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq ouw() {
        com.bytedance.sdk.component.utils.ko.ouw("PangleSDK-7808");
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("PangleSDK-7808");
        com.bytedance.sdk.component.utils.qbp.ouw("PangleSDK-7808");
        com.bytedance.sdk.component.utils.ko.vt();
        com.bytedance.sdk.component.ra.lh.lh.ouw(com.bytedance.sdk.component.ra.lh.lh.ouw.DEBUG);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw();
        com.bytedance.sdk.component.utils.qbp.ouw();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final int vt() {
        return bly.ouw().tlj();
    }

    private static JSONObject vt(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final int yu() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final uq yu(int i10) {
        bly blyVarOuw = bly.ouw();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_icon_id", "icon_id", Integer.valueOf(i10));
        }
        blyVarOuw.yu = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.uq
    public final String ouw(PAGBiddingRequest pAGBiddingRequest) {
        Set set;
        boolean z10;
        int size;
        try {
            com.bytedance.sdk.openadsdk.utils.uoy.pno("getBiddingToken");
            com.bytedance.sdk.openadsdk.core.tlj.lh.ouw();
            try {
                com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.fvf.2
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "bidding_token";
                        return ouwVar;
                    }
                });
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("TTAdManagerImpl", th2.getMessage());
            }
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            int i10 = 1;
            if (TextUtils.equals(adxId, bly.ouw().vm())) {
                z10 = !(zih.yu().pno.ouw("token_enable", 0) == 1);
            } else {
                if ("TX".equals(com.bytedance.sdk.openadsdk.core.settings.cf.vt().zin()) || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.cf.vt().zin())) {
                    if (!((TextUtils.isEmpty(adxId) || (set = (Set) zih.yu().pno.ouw("token_adx_ids", Collections.emptySet(), com.bytedance.sdk.openadsdk.core.settings.fkw.vt)) == null || set.size() == 0) ? false : set.contains(adxId))) {
                    }
                }
            }
            if (z10) {
                le();
                return "";
            }
            if (bly.ouw().cf()) {
                le();
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_init", jg.fkw() ? 1 : 0);
            String strLe = zih.yu().le();
            String strMwh = zih.yu().mwh();
            if (strLe != null && strMwh != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", strLe);
                jSONObject2.put("param", strMwh);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("language", ryl.vt());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.uoy.ra());
            if (pAGBiddingRequest != null) {
                jSONObject.put("user_data", jqy.ouw(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
            }
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
            String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strVt.isEmpty()) {
                jSONObject.put("ipv6", strVt);
            } else {
                String strVt2 = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", "key_ipv4", "");
                if (!strVt2.isEmpty()) {
                    jSONObject.put("ipv4", strVt2);
                }
            }
            jSONObject.put("adx_id", adxId);
            String strLso = zih.yu().lso();
            jSONObject.put("target_region", strLso);
            if (jSONObject.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu = zih.yu();
                com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(jSONObject);
                if (pAGBiddingRequest != null) {
                    jSONObject.put("banner", vt(pAGBiddingRequest));
                }
                if (!cfVarYu.tc()) {
                    i10 = 0;
                }
                jSONObject.put("app_reg", i10);
                Context contextOuw = zih.ouw();
                jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.lh.vt());
                jSONObject.put("screen_scale", com.bytedance.sdk.openadsdk.utils.osn.ra(contextOuw));
                jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, com.bytedance.sdk.openadsdk.core.settings.yu.vt());
                jSONObject.put(CommonUrlParts.APP_SET_ID, com.bytedance.sdk.openadsdk.core.settings.yu.lh());
                jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.yu.yu());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - jg.ouw()) / 1000);
                jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.bly.ryl.vt());
                jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.bly.ryl.lh());
                jSONObject.put("gp_v_name", DeviceUtils.yu(contextOuw));
                jSONObject.put("gp_v_code", DeviceUtils.fkw(contextOuw));
                jSONObject.put("vendor", Build.MANUFACTURER);
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.uoy.lh());
                jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
                jSONObject.put("sys_compiling_time", ryl.vt(contextOuw));
                jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, com.bytedance.sdk.openadsdk.utils.osn.le(contextOuw));
                jSONObject.put(CommonUrlParts.SCREEN_WIDTH, com.bytedance.sdk.openadsdk.utils.osn.yu(contextOuw));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.tc.ouw());
                jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.jae.ouw());
                jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
                jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.uoy.yu(contextOuw));
                if (cfVarYu.zin("boot")) {
                    jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                com.bytedance.sdk.openadsdk.utils.uoy.ouw(jSONObject);
                com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(jSONObject);
                com.bytedance.sdk.openadsdk.utils.pno.ouw(jSONObject, contextOuw);
                jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.vt.lh());
                size = ouw.size();
            } else {
                size = 2;
            }
            while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(ouw.get(Integer.valueOf(size)));
                size--;
            }
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw(jSONObject);
            boolean zHun = com.bytedance.sdk.openadsdk.core.settings.cf.hun();
            JSONObject jSONObjectOuw = ouw(jSONObject, zHun);
            while (size > 0 && jSONObjectOuw.toString().getBytes().length > 4096) {
                jSONObject.remove(ouw.get(Integer.valueOf(size)));
                jSONObjectOuw = ouw(jSONObject, zHun);
                size--;
            }
            if (jSONObjectOuw.length() > 0) {
                jSONObjectOuw.put("target_region", strLso);
            }
            if (com.bytedance.sdk.component.utils.ko.yu()) {
                com.bytedance.sdk.component.utils.ko.lh("mssdk", "bidding token: " + jSONObjectOuw + "\nbidding token length: " + jSONObjectOuw.toString().getBytes().length);
            }
            com.bytedance.sdk.component.utils.ko.vt("TTAdManagerImpl", "bidding token: ".concat(String.valueOf(jSONObjectOuw)));
            try {
                com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.fvf.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "bidding_token";
                        return ouwVar;
                    }
                });
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.qbp.lh("TTAdManagerImpl", th3.getMessage());
            }
            return jSONObjectOuw.toString();
        } catch (Throwable unused) {
            le();
            return "";
        }
    }

    private static JSONObject ouw(JSONObject jSONObject, boolean z10) {
        JSONObject jSONObjectOuw;
        if (z10) {
            jSONObjectOuw = PangleEncryptManager.encryptType4(jSONObject, new ex(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            tc.ouw(jSONObjectOuw);
        } else {
            jSONObjectOuw = com.bytedance.sdk.component.utils.ouw.ouw(jSONObject);
        }
        return jSONObjectOuw != null ? jSONObjectOuw : new JSONObject();
    }
}
