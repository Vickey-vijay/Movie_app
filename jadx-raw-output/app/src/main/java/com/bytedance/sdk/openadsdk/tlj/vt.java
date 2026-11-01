package com.bytedance.sdk.openadsdk.tlj;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.Y1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class vt<T> implements rn<T> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final long f13363lh = SystemClock.elapsedRealtime();
    public final String ouw;
    public final vpp vt;
    private final rn<T> yu;

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(cf<T> cfVar) {
        rn<T> rnVar = this.yu;
        if (rnVar != null) {
            rnVar.ouw(cfVar);
        }
        if (this.vt != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13363lh;
            final int iRa = cfVar.ra() / 1024;
            final int i10 = cfVar.le() ? 1 : 0;
            com.bytedance.sdk.openadsdk.rn.lh.ouw("load_image_success", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.2
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                @Nullable
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", vt.this.ouw);
                    jSONObject.put("preload_size", iRa);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", vt.this.vt.ucs);
                    jSONObject.put("use_new_img", yu.ouw.ouw ? 1 : 0);
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "load_image_success";
                    yuVar.yu = vt.this.vt.lna;
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
            if (yu.ouw.ouw) {
                com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "load_img";
                        vpp vppVar = vt.this.vt;
                        if (vppVar != null) {
                            ouwVar.f13465ra = vppVar.yu(Y1.f27894f);
                            ouwVar.pno = uoy.lh(vt.this.vt.lna);
                        }
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                        return ouwVar;
                    }
                });
            }
        }
    }

    public vt(final vpp vppVar, String str, rn<T> rnVar) {
        this.yu = rnVar;
        this.vt = vppVar;
        this.ouw = str;
        if (yu.ouw.ouw) {
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.1
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f13464lh = "load_img";
                    vpp vppVar2 = vppVar;
                    if (vppVar2 != null) {
                        ouwVar.f13465ra = vppVar2.yu(Y1.f27894f);
                        ouwVar.pno = uoy.lh(vppVar.lna);
                    }
                    ouwVar.vt = BuildConfig.VERSION_NAME;
                    return ouwVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(final int i10, final String str, @Nullable final Throwable th2) {
        rn<T> rnVar = this.yu;
        if (rnVar != null) {
            rnVar.ouw(i10, str, th2);
        }
        vpp vppVar = this.vt;
        if (vppVar != null) {
            if (!TextUtils.isEmpty(uoy.ouw(vppVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13363lh;
                com.bytedance.sdk.openadsdk.rn.lh.ouw("load_image_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.4
                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                    @Nullable
                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", jElapsedRealtime);
                        jSONObject.put("url", vt.this.ouw);
                        jSONObject.put("error_code", i10);
                        Throwable th3 = th2;
                        if (th3 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th3);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", vt.this.vt.ucs);
                        jSONObject.put("use_new_img", yu.ouw.ouw ? 1 : 0);
                        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                        yuVar.ouw = "load_image_error";
                        yuVar.yu = vt.this.vt.lna;
                        yuVar.bly = jSONObject.toString();
                        return yuVar;
                    }
                });
            }
            if (yu.ouw.ouw) {
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.5
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f13464lh = "load_img";
                        vpp vppVar2 = vt.this.vt;
                        if (vppVar2 != null) {
                            ouwVar.f13465ra = vppVar2.yu(Y1.f27894f);
                            ouwVar.pno = uoy.lh(vt.this.vt.lna);
                        }
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                        return ouwVar;
                    }
                });
            }
        }
    }
}
