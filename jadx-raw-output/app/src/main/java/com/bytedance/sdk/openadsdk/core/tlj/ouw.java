package com.bytedance.sdk.openadsdk.core.tlj;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.yu.yu;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class ouw {
    public PglSSManager ouw;
    public volatile boolean vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public volatile boolean f13088lh = true;
    private volatile boolean yu = false;

    private synchronized void lh() {
        if (!this.vt) {
            try {
                Context contextOuw = zih.ouw();
                String strYu = bly.ouw().yu();
                if (TextUtils.isEmpty(strYu)) {
                    strYu = bly.ouw("app_id", Long.MAX_VALUE);
                }
                if (TextUtils.isEmpty(strYu)) {
                    return;
                }
                String strOuw = ryl.ouw(contextOuw);
                String strVt = com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt();
                PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strYu).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                String strVt2 = yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strVt2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strVt2);
                }
                Set<String> setUx = cf.vt().ux();
                if (setUx != null && !setUx.isEmpty()) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setUx);
                }
                String strQbp = uoy.qbp();
                if (!TextUtils.isEmpty(strQbp)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strQbp);
                }
                map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, cf.vt().lso());
                String strOuw2 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                if (!TextUtils.isEmpty(strOuw2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strOuw2);
                }
                pglSSConfigBuild.setCustomInfo(map);
                ko.ouw("MSSdkImpl", "init sec sdk, custom info is:", map);
                pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.tlj.ouw.1
                    @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                    public final void reportSoftDecData(final String str, final String str2) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.tlj.ouw.1.1
                            @Override // com.bytedance.sdk.openadsdk.rn.vt
                            @Nullable
                            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                                yuVar.ouw = str;
                                yuVar.bly = str2;
                                return yuVar;
                            }
                        });
                    }
                });
                PglSSManager.init(contextOuw, pglSSConfigBuild, null, null, strOuw, strVt);
                vt();
                ko.lh("mssdk", "init: success");
                this.vt = true;
            } catch (Throwable th2) {
                ko.lh("mssdk", "init: fail");
                ko.vt("MSSdkImpl", "appid is empty, initialization failed! or without the mssdk module", th2);
                yu();
                this.vt = false;
            }
            try {
                if (this.f13088lh) {
                    final String loadError = PglSSManager.getLoadError();
                    if (!this.yu && !TextUtils.isEmpty(loadError)) {
                        zih.fkw().ouw(new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.tlj.ouw.4
                            @Override // com.bytedance.sdk.openadsdk.rn.vt
                            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                                yuVar.ouw = "secsdk_init_error";
                                yuVar.bly = loadError;
                                return yuVar;
                            }
                        }, false);
                        this.yu = true;
                    }
                }
            } catch (Throwable th3) {
                qbp.lh("mssdk", th3.getMessage());
            }
        }
    }

    public final boolean ouw() {
        if (!this.vt && this.f13088lh) {
            lh();
        }
        return this.vt;
    }

    private Class yu() {
        Class<PglSSManager> cls;
        try {
            cls = PglSSManager.class;
            String str = PglSSManager.REPORT_SCENE_ADSHOW;
            try {
                this.f13088lh = true;
                ko.lh("mssdk", "class found");
            } catch (Throwable unused) {
                ko.lh("mssdk", "class not found ");
                this.f13088lh = false;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
        return cls;
    }

    public final void vt() {
        if (this.ouw == null) {
            this.ouw = PglSSManager.getInstance();
        }
    }

    public ouw() {
        lh();
    }

    public final void ouw(final Map<String, Object> map) {
        if (ouw()) {
            vt();
            if (this.ouw != null) {
                jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tlj.ouw.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            ouw.this.ouw.setCustomInfo(map);
                            ko.ouw("MSSdkImpl", "map param custom info is: ", map);
                        } catch (Throwable th2) {
                            qbp.yu("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }
}
