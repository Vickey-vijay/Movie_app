package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes10.dex */
public class MaximumHeightMediaView extends MediaView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f67741a;

    public MaximumHeightMediaView(@NonNull Context context) {
        super(context);
    }

    public MaximumHeightMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaximumHeightMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f67741a;
        if (i12 > 0 && size > i12) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f67741a, View.MeasureSpec.getMode(i11));
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxHeight(int i10) {
        this.f67741a = i10;
    }
}
