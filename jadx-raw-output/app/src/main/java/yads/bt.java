package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class bt extends ro {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sa0 f75950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jb2 f75951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f75952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public at f75953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f75954r;

    public bt() {
        super(6);
        this.f75950n = new sa0(1);
        this.f75951o = new jb2();
    }

    @Override // yads.ro
    public final void a(long j10, boolean z10) {
        this.f75954r = Long.MIN_VALUE;
        at atVar = this.f75953q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro
    public final String d() {
        return "CameraMotionRenderer";
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        at atVar = this.f75953q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro, yads.af2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f75953q = (at) obj;
        }
    }

    @Override // yads.ro
    public final boolean f() {
        return e();
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        this.f75952p = j11;
    }

    @Override // yads.ro
    public final void a(long j10, long j11) {
        while (!e() && this.f75954r < 100000 + j10) {
            this.f75950n.b();
            nx0 nx0Var = this.f82355c;
            float[] fArr = null;
            nx0Var.f80853a = null;
            nx0Var.f80854b = null;
            if (a(nx0Var, this.f75950n, 0) != -4 || this.f75950n.b(4)) {
                return;
            }
            sa0 sa0Var = this.f75950n;
            this.f75954r = sa0Var.f82570f;
            if (this.f75953q != null && !sa0Var.b(Integer.MIN_VALUE)) {
                this.f75950n.c();
                ByteBuffer byteBuffer = this.f75950n.f82568d;
                int i10 = ib3.f78556a;
                if (byteBuffer.remaining() == 16) {
                    jb2 jb2Var = this.f75951o;
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    jb2Var.f78966a = bArrArray;
                    jb2Var.f78968c = iLimit;
                    jb2Var.f78967b = 0;
                    this.f75951o.e(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr[i11] = Float.intBitsToFloat(this.f75951o.d());
                    }
                }
                if (fArr != null) {
                    this.f75953q.onCameraMotion(this.f75954r - this.f75952p, fArr);
                }
            }
        }
    }

    @Override // yads.ro
    public final int a(mx0 mx0Var) {
        if ("application/x-camera-motion".equals(mx0Var.f80429m)) {
            return ro.a(4, 0, 0);
        }
        return ro.a(0, 0, 0);
    }
}
