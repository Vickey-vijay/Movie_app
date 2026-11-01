package yads;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public final class hg extends gg {
    @Override // yads.gg, yads.ig
    public final void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // yads.ig
    public final boolean a(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
