package com.bytedance.sdk.openadsdk.yu;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ra {
    private long fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private long f13574lh;
    public long ouw;
    private long vt;
    private long yu;

    private void ouw(long j10) {
        if (this.ouw <= 0) {
            this.ouw = j10;
        }
    }

    private void fkw(long j10) {
        if (this.fkw <= 0) {
            this.fkw = j10;
        }
    }

    private void lh(long j10) {
        if (this.f13574lh <= 0) {
            this.f13574lh = j10;
        }
    }

    private void vt(long j10) {
        if (this.vt <= 0) {
            this.vt = j10;
        }
    }

    private void yu(long j10) {
        if (this.yu <= 0) {
            this.yu = j10;
        }
    }

    public final void ouw(long j10, float f10) {
        if (f10 > 0.0f) {
            ouw(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            ouw(j10);
            vt(j10);
        }
        if (d10 >= 0.5d) {
            ouw(j10);
            vt(j10);
            lh(j10);
        }
        if (d10 >= 0.75d) {
            ouw(j10);
            vt(j10);
            lh(j10);
            yu(j10);
        }
        if (f10 >= 1.0f) {
            ouw(j10);
            vt(j10);
            lh(j10);
            yu(j10);
            fkw(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public final JSONObject ouw(JSONObject jSONObject) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j10 = this.ouw;
                if (j10 > 0) {
                    jSONObject.put("show_start", j10);
                    j11 = this.vt;
                    if (j11 > 0) {
                        jSONObject.put("show_firstQuartile", j11);
                        j12 = this.f13574lh;
                        if (j12 > 0) {
                            jSONObject.put("show_mid", j12);
                            j13 = this.yu;
                            if (j13 > 0) {
                                jSONObject.put("show_thirdQuartile", j13);
                                j14 = this.fkw;
                                if (j14 > 0) {
                                    jSONObject.put("show_full", j14);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            j10 = this.ouw;
            if (j10 > 0) {
                jSONObject.put("show_start", j10);
                j11 = this.vt;
                if (j11 > 0) {
                    jSONObject.put("show_firstQuartile", j11);
                    j12 = this.f13574lh;
                    if (j12 > 0) {
                        jSONObject.put("show_mid", j12);
                        j13 = this.yu;
                        if (j13 > 0) {
                            jSONObject.put("show_thirdQuartile", j13);
                            j14 = this.fkw;
                            if (j14 > 0) {
                                jSONObject.put("show_full", j14);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
