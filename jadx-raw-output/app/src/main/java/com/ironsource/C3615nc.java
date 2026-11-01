package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3615nc {

    /* JADX INFO: renamed from: com.ironsource.nc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30305a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f30306b = "SDKPluginType";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f30307c = "sessionid";

        private a() {
        }
    }

    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.f30306b, pluginType);
        }
        String strD = IronSourceUtils.d();
        if (strD != null) {
            linkedHashMap.put("sessionid", strD);
        }
        return linkedHashMap;
    }
}
