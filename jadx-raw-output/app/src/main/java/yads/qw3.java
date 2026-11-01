package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class qw3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw3 f82015b;

    public qw3(vw3 vw3Var) {
        this.f82015b = vw3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vw3 vw3Var = this.f82015b;
        int streamVolume = vw3Var.f84033c.getStreamVolume(3);
        int streamMaxVolume = vw3Var.f84033c.getStreamMaxVolume(3);
        vw3Var.f84034d.getClass();
        float f10 = 1.0f;
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f10 = 0.0f;
        } else {
            float f11 = streamVolume / streamMaxVolume;
            if (f11 <= 1.0f) {
                f10 = f11;
            }
        }
        this.f82015b.f84037g.set(false);
        if (((Float) this.f82015b.f84036f.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
            this.f82015b.f84031a.post(new ow3(this, f10));
        }
    }
}
