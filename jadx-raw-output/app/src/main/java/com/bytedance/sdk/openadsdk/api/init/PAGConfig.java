package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.ra.lh.lh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.utils.uoy;

/* JADX INFO: loaded from: classes2.dex */
public final class PAGConfig implements InitConfig {
    private static String bly;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12186le;
    private String ouw;
    private String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private String f12188ra;
    private String tlj;
    private boolean vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12187lh = -1;
    private int yu = -1;
    private int fkw = 0;

    public static class Builder {
        private String bly;
        private String ouw;
        private String pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        private String[] f12191ra;
        private boolean vt;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private int f12190lh = -1;
        private int yu = -1;
        private int fkw = 0;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        private boolean f12189le = false;
        private String tlj = "";

        @Deprecated
        public Builder appIcon(int i10) {
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }

        public Builder appId(String str) {
            this.ouw = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.ouw = this.ouw;
            pAGConfig.fkw = this.fkw;
            PAGConfig.ouw(pAGConfig, this.f12189le);
            PAGConfig.vt(pAGConfig, this.f12190lh);
            pAGConfig.yu = this.yu;
            pAGConfig.vt = this.vt;
            pAGConfig.f12188ra = this.pno;
            pAGConfig.pno = this.bly;
            pAGConfig.tlj = this.tlj;
            return pAGConfig;
        }

        public Builder debugLog(boolean z10) {
            this.vt = z10;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.f12191ra = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.tlj = str;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
            this.f12190lh = i10;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
            if (i10 == 0 || i10 == 1) {
                this.yu = i10;
            } else {
                this.yu = -2;
            }
            return this;
        }

        public Builder setPackageName(String str) {
            this.pno = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.bly = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            this.f12189le = z10;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.fkw = i10;
            return this;
        }
    }

    public static /* synthetic */ void vt(PAGConfig pAGConfig, int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        pAGConfig.f12187lh = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final boolean isUseTextureView() {
        return true;
    }

    public static int getGDPRConsent() {
        if (!uoy.ra("getGdpr")) {
            return -1;
        }
        int iVt = pd.ouw().vt();
        if (iVt == 1) {
            return 0;
        }
        if (iVt == 0) {
            return 1;
        }
        return iVt;
    }

    public static int getPAConsent() {
        if (uoy.ra("getPAConsent")) {
            return pd.ouw().fkw();
        }
        return -1;
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        uoy.ra("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        pd.ouw().vt(i10);
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i10) {
        if (uoy.ra("setPAConsent")) {
            if (i10 == 1 || i10 == 0) {
                pd.ouw().fkw(i10);
            } else {
                pd.ouw().fkw(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        bly = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getAdxId() {
        return this.tlj;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getAppId() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getData() {
        return this.pno;
    }

    public final boolean getDebugLog() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final int getGdpr() {
        return this.f12187lh;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final int getPA() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final String getPackageName() {
        return TextUtils.isEmpty(this.f12188ra) ? bly : this.f12188ra;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final int getTitleBarTheme() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public final boolean isSupportMultiProcess() {
        return this.f12186le;
    }

    public static void debugLog(boolean z10) {
        if (pd.ouw() != null) {
            if (z10) {
                pd.ouw().lh(1);
                pd.ouw().ouw();
                return;
            }
            pd.ouw().lh(0);
            lh.ouw(lh.ouw.OFF);
            ko.lh();
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt();
            qbp.vt();
        }
    }

    public static /* synthetic */ void ouw(PAGConfig pAGConfig, boolean z10) {
        pAGConfig.f12186le = z10;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(z10);
    }

    public static void setAppIconId(int i10) {
        if (pd.ouw() != null) {
            pd.ouw().yu(i10);
        }
    }

    public static void setUserData(String str) {
        if (pd.ouw() != null) {
            pd.ouw().vt(str);
        }
    }
}
