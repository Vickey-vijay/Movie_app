package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class tc {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final AtomicInteger f13084lh;
    private static final AtomicInteger ouw;
    private static final AtomicInteger vt;
    private static final AtomicInteger yu;

    public static void ouw() {
        try {
            long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "upload_time_key", 0L);
            if (jOuw <= 0 || System.currentTimeMillis() - jOuw < SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                if (jOuw <= 0 || jOuw > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            AtomicInteger atomicInteger = ouw;
            final int i10 = atomicInteger.get();
            AtomicInteger atomicInteger2 = vt;
            final int i11 = atomicInteger2.get();
            AtomicInteger atomicInteger3 = f13084lh;
            final int i12 = atomicInteger3.get();
            AtomicInteger atomicInteger4 = yu;
            final int i13 = atomicInteger4.get();
            com.bytedance.sdk.openadsdk.rn.lh.ouw("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.tc.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                @Nullable
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("encrypt_success_count", i10);
                        jSONObject.put("encrypt_fail_count", i11);
                        jSONObject.put("decrypt_success_count", i12);
                        jSONObject.put("decrypt_fail_count", i13);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "crypt_v4_statistics";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
            synchronized (tc.class) {
                atomicInteger.set(0);
                atomicInteger2.set(0);
                atomicInteger3.set(0);
                atomicInteger4.set(0);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        ouw = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        vt = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        f13084lh = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        yu = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static synchronized void vt(boolean z10) {
        try {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(ouw.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(vt.incrementAndGet()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void ouw(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.tc.2
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            @Nullable
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.ouw = "crypt_v4_fail";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static synchronized void ouw(boolean z10) {
        try {
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(f13084lh.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(f13084lh.incrementAndGet()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void ouw(JSONObject jSONObject) {
        vt(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
