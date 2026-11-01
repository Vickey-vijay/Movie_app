package com.bytedance.sdk.openadsdk.core.ryl;

import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class le {
    public final Set<Pair<View, FriendlyObstructionPurpose>> ouw = new HashSet();
    public ra vt;

    public final void ouw(WebView webView) {
        try {
            if (this.vt == null) {
                this.vt = pno.ouw(webView);
            }
        } catch (Throwable th2) {
            qbp.yu("createWebViewSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put("message", th2.getMessage());
            fkw.ouw(map);
        }
    }

    public final void vt(boolean z10, float f10) {
        if (this.vt != null) {
            try {
                ouw((View) null, (FriendlyObstructionPurpose) null);
                this.vt.ouw(z10, f10);
            } catch (Throwable unused) {
            }
        }
    }

    public final void fkw() {
        ra raVar = this.vt;
        if (raVar != null) {
            try {
                raVar.lh();
            } catch (Throwable unused) {
            }
        }
    }

    public final void lh() {
        ra raVar = this.vt;
        if (raVar != null) {
            try {
                raVar.yu();
            } catch (Throwable unused) {
            }
        }
    }

    public le() {
        fkw.ouw(zih.ouw());
    }

    @UiThread
    public final void yu() {
        if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            fkw();
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.7
                @Override // java.lang.Runnable
                public final void run() {
                    le.this.fkw();
                }
            });
        }
    }

    @UiThread
    public final void vt() {
        if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            lh();
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.6
                @Override // java.lang.Runnable
                public final void run() {
                    le.this.lh();
                }
            });
        }
    }

    public final void ouw(final View view, final vpp vppVar) {
        if (this.vt != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = vppVar.sd();
        final Set<tlj> set = yuVarSd != null ? yuVarSd.vt : null;
        if (view != null && set != null) {
            if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
                ouw(view, set, vppVar);
                return;
            } else {
                com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        le.this.ouw(view, set, vppVar);
                    }
                });
                return;
            }
        }
        ko.lh("video view or view ability Vendors is null");
    }

    public final void vt(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        ra raVar = this.vt;
        try {
            if (raVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.ouw.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                raVar.ouw(view, friendlyObstructionPurpose);
            }
            if (this.ouw.size() > 0) {
                raVar.ouw(this.ouw);
                this.ouw.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public final void vt(boolean z10) {
        ra raVar = this.vt;
        if (raVar != null) {
            try {
                raVar.ouw(z10);
            } catch (Throwable unused) {
            }
        }
    }

    public final void ouw(View view, Set<tlj> set, vpp vppVar) {
        try {
            if (this.vt == null) {
                this.vt = pno.ouw(view, set);
                if (vppVar.cd()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, vppVar.vt(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th2) {
            qbp.yu("createVideoSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put("message", th2.getMessage());
            fkw.ouw(map);
        }
    }

    public final void vt(int i10) {
        ra raVar = this.vt;
        if (raVar != null) {
            try {
                raVar.vt(i10);
            } catch (Throwable unused) {
            }
        }
    }

    public final void ouw() {
        if (this.vt != null) {
            try {
                ouw((View) null, (FriendlyObstructionPurpose) null);
                this.vt.vt();
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public final void ouw(final boolean z10, final float f10) {
        if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            vt(z10, f10);
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.5
                @Override // java.lang.Runnable
                public final void run() {
                    le.this.vt(z10, f10);
                }
            });
        }
    }

    @UiThread
    public final void ouw(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            vt(view, friendlyObstructionPurpose);
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.8
                @Override // java.lang.Runnable
                public final void run() {
                    le.this.vt(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    public final void ouw(long j10, boolean z10) {
        ra raVar = this.vt;
        if (raVar != null) {
            try {
                raVar.ouw(j10 / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public final void ouw(final boolean z10) {
        if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            vt(z10);
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.10
                @Override // java.lang.Runnable
                public final void run() {
                    le.this.vt(z10);
                }
            });
        }
    }

    @UiThread
    public final void ouw(final int i10) {
        if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            vt(i10);
        } else {
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.2
                @Override // java.lang.Runnable
                public final void run() {
                    le.this.vt(i10);
                }
            });
        }
    }
}
