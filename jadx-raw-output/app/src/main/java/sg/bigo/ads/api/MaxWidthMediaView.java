package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class MaxWidthMediaView extends MediaView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f69300a;

    public MaxWidthMediaView(@NonNull Context context) {
        super(context);
    }

    public MaxWidthMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxWidthMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f69300a;
        if (i12 > 0 && size > i12) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f69300a, View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxWidth(int i10) {
        this.f69300a = i10;
    }
}
