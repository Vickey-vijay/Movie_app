package yads;

import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f80239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f80240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80241d;

    public mk2(jk2 jk2Var) {
        this.f80238a = jk2Var.a();
        this.f80239b = sz0.a(jk2Var.f79083c);
        this.f80240c = sz0.a(jk2Var.f79084d);
        int i10 = jk2Var.f79082b;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f80241d = 4;
                return;
            } else {
                this.f80241d = 6;
                return;
            }
        }
        this.f80241d = 5;
    }
}
