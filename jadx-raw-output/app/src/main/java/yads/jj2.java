package yads;

import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class jj2 implements w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kw f79069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f79071c;

    @Override // yads.w63
    public final void a(long j10, long j11) {
        ProgressBar progressBar = (ProgressBar) this.f79071c.get();
        if (progressBar != null) {
            kw kwVar = this.f79069a;
            long j12 = this.f79070b;
            kwVar.f79603a.getClass();
            ff.a(progressBar, j12, j12 - j10);
        }
    }

    public jj2(ProgressBar progressBar, kw kwVar, long j10) {
        this.f79069a = kwVar;
        this.f79070b = j10;
        this.f79071c = new WeakReference(progressBar);
    }
}
