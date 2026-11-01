package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public final class yk3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f85022a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f85022a;
        if (view2 != null) {
            view2.performClick();
        }
    }

    public yk3(TextView textView) {
        this.f85022a = textView;
    }
}
