package yads;

import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes11.dex */
public final class ff {
    public static void a(ProgressBar progressBar, long j10, long j11) {
        progressBar.clearAnimation();
        if (j10 > 0) {
            progressBar.setMax((int) j10);
            ej2 ej2Var = new ej2(progressBar, progressBar.getProgress(), (int) j11);
            ej2Var.setDuration(200L);
            progressBar.startAnimation(ej2Var);
        }
    }
}
