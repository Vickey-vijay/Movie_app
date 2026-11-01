package yads;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public final class ez1 implements cz1 {
    @Override // yads.cz1
    public final ProgressBar a(View view) {
        return (ProgressBar) view.findViewWithTag("close_progress_view");
    }

    @Override // yads.cz1
    public final View b(View view) {
        return view.findViewWithTag("skip_button");
    }

    @Override // yads.cz1
    public final View c(View view) {
        return view.findViewWithTag("close");
    }
}
