package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes11.dex */
public final class ko {
    public vpp fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13475lh;
    public long ouw;
    public String vt;
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh yu;

    public static class ouw {
        public int bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public int f13476cf;
        public boolean fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw f13477jg;
        public int pno;
        public int ryl;
        public int tlj;
        public boolean yu;
        public long ouw = 0;
        public long vt = 0;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public long f13479lh = 0;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public long f13478le = 0;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public boolean f13480ra = false;
        public boolean mwh = false;

        private void vt() {
            long j10 = this.f13479lh;
            if (j10 > 0) {
                long j11 = this.ouw;
                if (j11 > j10) {
                    long j12 = j11 % j10;
                    this.ouw = j12;
                    if (j12 == 0) {
                        this.ouw = j10;
                    }
                }
            }
        }

        public final void ouw(long j10) {
            this.ouw = j10;
            vt();
        }

        public final int ouw() {
            long j10 = this.f13479lh;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.ouw * 100) / j10), 100);
        }

        public final void vt(long j10) {
            this.f13479lh = j10;
            vt();
        }
    }

    public ko(long j10, String str, int i10, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, vpp vppVar) {
        this.ouw = j10;
        this.vt = str;
        this.f13475lh = i10;
        this.yu = lhVar;
        this.fkw = vppVar;
    }
}
