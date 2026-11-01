package com.bytedance.sdk.openadsdk.core.tlj;

import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class vt {
    public static com.bytedance.sdk.openadsdk.core.tlj.ouw ouw;
    private String vt;

    public static class ouw {
        private static final vt ouw = new vt(0);
    }

    public /* synthetic */ vt(byte b10) {
        this();
    }

    public static void ouw(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.tlj.ouw ouwVar = ouw;
        if (ouwVar != null) {
            ouwVar.ouw(map);
        }
    }

    private vt() {
        this.vt = null;
        ouw = new com.bytedance.sdk.openadsdk.core.tlj.ouw();
    }

    public static long vt() {
        com.bytedance.sdk.openadsdk.core.tlj.ouw ouwVar = ouw;
        if (ouwVar != null && ouwVar.ouw()) {
            ouwVar.vt();
            PglSSManager pglSSManager = ouwVar.ouw;
            if (pglSSManager != null) {
                return pglSSManager.getECForBidding();
            }
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public static String ouw() {
        String token;
        com.bytedance.sdk.openadsdk.core.tlj.ouw ouwVar = ouw;
        if (ouwVar != null) {
            if (ouwVar.ouw()) {
                ouwVar.vt();
                PglSSManager pglSSManager = ouwVar.ouw;
                if (pglSSManager != null) {
                    token = pglSSManager.getToken();
                } else {
                    token = "";
                }
            } else {
                token = "";
            }
            if (token != null) {
                return token;
            }
        }
        return "";
    }

    public static Map<String, String> ouw(String str, byte[] bArr) {
        Map<String, String> featureHash;
        com.bytedance.sdk.openadsdk.core.tlj.ouw ouwVar = ouw;
        if (ouwVar != null) {
            return (!ouwVar.ouw() || (featureHash = ouwVar.ouw.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
        }
        return new HashMap();
    }
}
