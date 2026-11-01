package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.aj;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.kc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final Map<String, String> f14;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final ISAdQualityDeviceIdType f15;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final boolean f16;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final String f17;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final boolean f18;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final ISAdQualityLogLevel f19;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f20;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f21;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final boolean f22;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f23;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f24;

    public static class Builder {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f35 = null;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f31 = false;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f34 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f32 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityLogLevel f33 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f29 = new HashSet();

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private String f27 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f30 = false;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f28 = false;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f26 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private final Map<String, String> f25 = new HashMap();

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i10 = 0; i10 < jSONObject.names().length(); i10++) {
                    try {
                        String string = jSONObject.names().getString(i10);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(string);
                            sb2.append(" , ");
                            sb2.append(objOpt);
                            sb2.append(" ) value must be a string");
                            k.m2814("ISAdQualityConfig", sb2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f29.add(iSAdQualityInitListener);
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f35, this.f31, this.f34, this.f32, this.f33, this.f29, this.f27, this.f30, this.f28, this.f26, this.f25, (byte) 0);
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f29.remove(iSAdQualityInitListener);
            return this;
        }

        public Builder setCoppa(boolean z10) {
            this.f30 = z10;
            this.f28 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f26 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (kc.m2862(str, 20)) {
                this.f27 = str;
            } else {
                StringBuilder sb2 = new StringBuilder("setInitializationSource( ");
                sb2.append(str);
                sb2.append(" ) init source must have length of 1-20");
                k.m2814("ISAdQualityConfig", sb2.toString());
            }
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f33 = iSAdQualityLogLevel;
            return this;
        }

        public Builder setTestMode(boolean z10) {
            this.f34 = z10;
            this.f32 = true;
            return this;
        }

        public Builder setUserId(String str) {
            this.f35 = str;
            this.f31 = true;
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return this;
                }
                if (!aj.m422(str)) {
                    if (aj.m425(this.f25, str)) {
                        StringBuilder sb2 = new StringBuilder("setMetaData( ");
                        sb2.append(str);
                        sb2.append(" , ");
                        sb2.append(str2);
                        sb2.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                        k.m2814("ISAdQualityConfig", sb2.toString());
                        return this;
                    }
                    if (!aj.m423(str, str2)) {
                        StringBuilder sb3 = new StringBuilder("setMetaData( ");
                        sb3.append(str);
                        sb3.append(" , ");
                        sb3.append(str2);
                        sb3.append(" ) the length of both the key and the value should be between 1 and 64");
                        sb3.append(" characters.");
                        k.m2814("ISAdQualityConfig", sb3.toString());
                        return this;
                    }
                }
                this.f25.put(str, str2);
                return this;
            } catch (Exception unused) {
            }
        }
    }

    public /* synthetic */ ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b10) {
        this(str, z10, z11, z12, iSAdQualityLogLevel, set, str2, z13, z14, iSAdQualityDeviceIdType, map);
    }

    private ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f20 = str;
        this.f22 = z10;
        this.f24 = z11;
        this.f23 = z12;
        this.f19 = iSAdQualityLogLevel;
        this.f21 = set;
        this.f17 = str2;
        this.f16 = z13;
        this.f18 = z14;
        this.f15 = iSAdQualityDeviceIdType;
        this.f14 = map;
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f22) {
            builder.setUserId(iSAdQualityConfig.f20);
        } else if (iSAdQualityConfig2.f22) {
            builder.setUserId(iSAdQualityConfig2.f20);
        }
        if (iSAdQualityConfig.f23) {
            builder.setTestMode(iSAdQualityConfig.f24);
        } else if (iSAdQualityConfig2.f23) {
            builder.setTestMode(iSAdQualityConfig2.f24);
        }
        if (iSAdQualityConfig.f18) {
            builder.setCoppa(iSAdQualityConfig.f16);
        } else if (iSAdQualityConfig2.f18) {
            builder.setCoppa(iSAdQualityConfig2.f16);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f19;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f19;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f21.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f21.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f17;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f17;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f15;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f15;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f14);
        map.putAll(iSAdQualityConfig.f14);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f21;
    }

    public boolean getCoppa() {
        return this.f16;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f15;
    }

    public String getInitializationSource() {
        return this.f17;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f19;
    }

    public Map<String, String> getMetaData() {
        return this.f14;
    }

    public String getUserId() {
        return this.f20;
    }

    public boolean isTestMode() {
        return this.f24;
    }

    public boolean isUserIdSet() {
        return this.f22;
    }
}
