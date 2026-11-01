package com.bytedance.sdk.openadsdk.yu.ouw;

/* JADX INFO: loaded from: classes2.dex */
final class le implements com.bytedance.sdk.component.le.ouw.fkw.yu {
    private final com.bytedance.sdk.component.ra.vt ouw;

    @Override // com.bytedance.sdk.component.le.ouw.fkw.yu
    public final String lh() {
        com.bytedance.sdk.component.ra.vt vtVar = this.ouw;
        return vtVar != null ? vtVar.vt : "";
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.yu
    public final boolean ouw() {
        com.bytedance.sdk.component.ra.vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.pno;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.yu
    public final int vt() {
        com.bytedance.sdk.component.ra.vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.ouw;
        }
        return -1;
    }

    public le(com.bytedance.sdk.component.ra.vt vtVar) {
        this.ouw = vtVar;
    }
}
