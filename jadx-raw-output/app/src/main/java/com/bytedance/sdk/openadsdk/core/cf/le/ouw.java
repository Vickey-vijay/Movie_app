package com.bytedance.sdk.openadsdk.core.cf.le;

import com.bytedance.adsdk.ugeno.core.vm;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ouw extends mwh {

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public vm f12608cd;
    public boolean fvf;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public JSONObject f12609od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public float f12610pd;
    public float uq;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.cf.le.ouw$ouw, reason: collision with other inner class name */
    public static class C0114ouw extends mwh.ouw {
        public vm ey;
        public boolean fqk;
        public float jvy;
        public JSONObject osn;
        public float rrs;

        @Override // com.bytedance.sdk.component.adexpress.vt.mwh.ouw
        public final /* synthetic */ mwh ouw() {
            return new ouw(this);
        }
    }

    public ouw(C0114ouw c0114ouw) {
        super(c0114ouw);
        this.f12609od = c0114ouw.osn;
        this.f12608cd = c0114ouw.ey;
        this.uq = c0114ouw.rrs;
        this.f12610pd = c0114ouw.jvy;
        this.fvf = c0114ouw.fqk;
    }
}
