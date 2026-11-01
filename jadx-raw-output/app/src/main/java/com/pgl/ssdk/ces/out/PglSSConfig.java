package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f43286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PglSSCallBack f43287f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43289b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f43290c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f43291d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f43288a)) {
                return null;
            }
            return new PglSSConfig(this.f43288a, this.f43289b, this.f43290c, this.f43291d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f43291d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f43288a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f43290c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f43289b = i10;
            return this;
        }
    }

    private PglSSConfig(String str, int i10, int i11, String str2) {
        this.f43282a = str;
        this.f43283b = i10;
        this.f43284c = i11;
        this.f43285d = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final String getAdSdkVersion() {
        return this.f43285d;
    }

    public final String getAppId() {
        return this.f43282a;
    }

    public final PglSSCallBack getCallBack() {
        return this.f43287f;
    }

    public final int getCollectMode() {
        return this.f43284c;
    }

    public final Map<String, Object> getCustomInfo() {
        return this.f43286e;
    }

    public final int getOVRegionType() {
        return this.f43283b;
    }

    public final void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f43287f = pglSSCallBack;
    }

    public final void setCustomInfo(Map<String, Object> map) {
        this.f43286e = map;
    }
}
