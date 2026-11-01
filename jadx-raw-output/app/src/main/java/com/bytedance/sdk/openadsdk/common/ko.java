package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes10.dex */
public final class ko {
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public zih f12209le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Runnable f12210lh;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.common.ouw.InterfaceC0106ouw f12211ra;
    public final String vt;
    public final com.bytedance.sdk.openadsdk.common.ouw.vt yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final Runnable f12213lh;
        public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
        public final String vt;
        public final com.bytedance.sdk.openadsdk.common.ouw.vt yu;
        public boolean fkw = false;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public zih f12212le = null;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.common.ouw.InterfaceC0106ouw f12214ra = null;

        public final ko ouw() {
            if (this.ouw == null) {
                throw new IllegalArgumentException("RewardFullContext cannot be null");
            }
            if (this.f12213lh == null) {
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            if (this.yu != null) {
                return new ko(this, (byte) 0);
            }
            throw new IllegalArgumentException("SkipResultHandler cannot be null");
        }

        public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, String str, Runnable runnable, com.bytedance.sdk.openadsdk.common.ouw.vt vtVar) {
            this.ouw = ouwVar;
            this.vt = str;
            this.f12213lh = runnable;
            this.yu = vtVar;
        }
    }

    public /* synthetic */ ko(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    private ko(ouw ouwVar) {
        this.ouw = ouwVar.ouw;
        this.vt = ouwVar.vt;
        this.f12210lh = ouwVar.f12213lh;
        this.yu = ouwVar.yu;
        this.fkw = ouwVar.fkw;
        this.f12209le = ouwVar.f12212le;
        this.f12211ra = ouwVar.f12214ra;
    }
}
