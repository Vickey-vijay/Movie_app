package com.bytedance.adsdk.ouw.vt.vt.ouw;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class th implements com.bytedance.adsdk.ouw.vt.vt.vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.adsdk.ouw.vt.vt.ouw f10740lh;
    private com.bytedance.adsdk.ouw.vt.vt.ouw ouw;
    private com.bytedance.adsdk.ouw.vt.vt.ouw vt;

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw = this.ouw.ouw(map);
        if (objOuw == null) {
            return null;
        }
        return ((Boolean) objOuw).booleanValue() ? this.vt.ouw(map) : this.f10740lh.ouw(map);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.vt
    public final void vt(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.vt = ouwVar;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.vt
    public final void lh(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.f10740lh = ouwVar;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw.vt() + "?" + this.vt.vt() + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f10740lh.vt();
    }

    public final String toString() {
        return vt();
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.vt
    public final void ouw(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.ouw = ouwVar;
    }
}
