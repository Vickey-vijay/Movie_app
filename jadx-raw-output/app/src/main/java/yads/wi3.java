package yads;

import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class wi3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f84215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff f84216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a20 f84217c;

    public /* synthetic */ wi3(dk3 dk3Var) {
        this(dk3Var, new ff(), new a20());
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        e72 e72Var = (e72) this.f84215a.b();
        if (e72Var != null) {
            gl1 gl1Var = e72Var.f76956c.f80564b;
            ProgressBar videoProgress = gl1Var != null ? gl1Var.getVideoProgress() : null;
            if (videoProgress != null) {
                this.f84216b.getClass();
                ff.a(videoProgress, j10, j11);
            }
            gl1 gl1Var2 = e72Var.f76956c.f80564b;
            TextView countDownProgress = gl1Var2 != null ? gl1Var2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                this.f84217c.f75369a.getClass();
                countDownProgress.setText(oj2.a(j10 - j11));
            }
        }
    }

    public wi3(dk3 dk3Var, ff ffVar, a20 a20Var) {
        this.f84215a = dk3Var;
        this.f84216b = ffVar;
        this.f84217c = a20Var;
    }
}
