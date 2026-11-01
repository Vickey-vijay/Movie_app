package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class od {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static od f12973le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.ouw.lh.vt f12974lh;
    public com.bytedance.sdk.openadsdk.ouw.fkw.ouw vt;
    public com.bytedance.sdk.openadsdk.ouw.yu.vt yu;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final AtomicInteger f12975ra = new AtomicInteger(0);
    public Map<Integer, com.bytedance.sdk.openadsdk.core.model.ouw> ouw = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, ouw<?>> pno = new ConcurrentHashMap<>();
    public final Map<String, vt> fkw = new HashMap();

    public interface vt {
        void ouw();
    }

    public final <T> void ouw(String str, T t10) {
        if (TextUtils.isEmpty(str) || t10 == null) {
            return;
        }
        this.pno.put(str, new ouw<>(t10, str));
    }

    public final void vt() {
        this.vt = null;
        this.f12974lh = null;
        this.yu = null;
    }

    public static class ouw<T> {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final long f12976lh = System.currentTimeMillis();
        public final T ouw;
        public final String vt;

        public ouw(T t10, String str) {
            this.ouw = t10;
            this.vt = str;
        }
    }

    private od() {
    }

    public final <T> T ouw(String str, Class<T> cls) {
        ouw<?> ouwVar;
        if (TextUtils.isEmpty(str) || (ouwVar = this.pno.get(str)) == null || !cls.isInstance(ouwVar.ouw)) {
            return null;
        }
        return cls.cast(ouwVar.ouw);
    }

    public final void vt(int i10) {
        this.ouw.remove(Integer.valueOf(i10));
    }

    public static String vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        String strUx = vppVar.ux();
        return TextUtils.isEmpty(strUx) ? String.valueOf(vppVar.hashCode()) : strUx;
    }

    private ouw<?> ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.pno.remove(str);
    }

    @MainThread
    public static od ouw() {
        if (f12973le == null) {
            f12973le = new od();
        }
        return f12973le;
    }

    public final com.bytedance.sdk.openadsdk.core.model.vpp ouw(int i10) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVarRemove = this.ouw.remove(Integer.valueOf(i10));
        if (ouwVarRemove != null) {
            return ouwVarRemove.fkw;
        }
        return null;
    }

    public final int ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.model.ouw();
        ouwVar.fkw = vppVar;
        return ouw(ouwVar);
    }

    public final int ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        int iIncrementAndGet = this.f12975ra.incrementAndGet();
        this.ouw.put(Integer.valueOf(iIncrementAndGet), ouwVar);
        return iIncrementAndGet;
    }

    public static int ouw(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public final void ouw(String str, boolean z10, boolean z11) {
        boolean z12 = z10 || !z11;
        boolean zJg = bly.ouw().jg();
        if (zJg) {
            com.bytedance.sdk.component.utils.qbp.ouw("BVA", "cleanListener: isFinish = " + z10 + ",isConfigChange = " + z11);
        }
        if (z12) {
            ouw(str, zJg);
        } else if (z10 || !z11) {
            ouw(str, zJg);
        }
    }

    private void ouw(String str, boolean z10) {
        ouw<?> ouwVarOuw = ouw(str);
        if (z10) {
            if (ouwVarOuw != null) {
                com.bytedance.sdk.component.utils.qbp.ouw("BVA", "cleanListener: removeCallback success,listenerKey=" + str + ",callback=" + ouwVarOuw.ouw);
                return;
            }
            com.bytedance.sdk.component.utils.qbp.ouw("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
        }
    }
}
