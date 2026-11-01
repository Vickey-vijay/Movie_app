package yads;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes11.dex */
public final class xn0 implements nh3, at, af2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nh3 f84642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public at f84643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ps2 f84644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ps2 f84645e;

    @Override // yads.af2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.f84642b = (nh3) obj;
            return;
        }
        if (i10 == 8) {
            this.f84643c = (at) obj;
            return;
        }
        if (i10 != 10000) {
            return;
        }
        i23 i23Var = (i23) obj;
        if (i23Var == null) {
            this.f84644d = null;
            this.f84645e = null;
        } else {
            ps2 ps2Var = i23Var.f78469f;
            this.f84644d = ps2Var;
            this.f84645e = ps2Var;
        }
    }

    @Override // yads.nh3
    public final void a(long j10, long j11, mx0 mx0Var, MediaFormat mediaFormat) {
        ps2 ps2Var = this.f84644d;
        if (ps2Var != null) {
            ps2Var.a(j10, j11, mx0Var, mediaFormat);
        }
        nh3 nh3Var = this.f84642b;
        if (nh3Var != null) {
            nh3Var.a(j10, j11, mx0Var, mediaFormat);
        }
    }

    @Override // yads.at
    public final void onCameraMotion(long j10, float[] fArr) {
        ps2 ps2Var = this.f84645e;
        if (ps2Var != null) {
            ps2Var.onCameraMotion(j10, fArr);
        }
        at atVar = this.f84643c;
        if (atVar != null) {
            atVar.onCameraMotion(j10, fArr);
        }
    }

    @Override // yads.at
    public final void onCameraMotionReset() {
        ps2 ps2Var = this.f84645e;
        if (ps2Var != null) {
            ps2Var.onCameraMotionReset();
        }
        at atVar = this.f84643c;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }
}
