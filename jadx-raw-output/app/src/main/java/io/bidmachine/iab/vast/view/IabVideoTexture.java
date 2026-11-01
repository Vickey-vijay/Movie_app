package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes11.dex */
public class IabVideoTexture extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f59723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f59724b;

    public IabVideoTexture(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int defaultSize = View.getDefaultSize(this.f59723a, i10);
        int defaultSize2 = View.getDefaultSize(this.f59724b, i11);
        if (this.f59723a > 0 && this.f59724b > 0) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i13 = this.f59723a;
                int i14 = i13 * size2;
                int i15 = this.f59724b;
                int i16 = size * i15;
                if (i14 < i16) {
                    defaultSize = i14 / i15;
                } else {
                    if (i14 > i16) {
                        defaultSize2 = i16 / i13;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else if (mode == 1073741824) {
                int i17 = (this.f59724b * size) / this.f59723a;
                if (mode2 != Integer.MIN_VALUE || i17 <= size2) {
                    defaultSize2 = i17;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i12 = (this.f59723a * size2) / this.f59724b;
                    if (mode == Integer.MIN_VALUE && i12 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i18 = this.f59723a;
                    int i19 = this.f59724b;
                    if (mode2 != Integer.MIN_VALUE || i19 <= size2) {
                        i12 = i18;
                        size2 = i19;
                    } else {
                        i12 = (size2 * i18) / i19;
                    }
                    if (mode == Integer.MIN_VALUE && i12 > size) {
                        defaultSize2 = (i19 * size) / i18;
                        defaultSize = size;
                    }
                }
                defaultSize = i12;
                defaultSize2 = size2;
            }
        }
        Log.e("Size", defaultSize + "/" + defaultSize2);
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void setVideoSize(int i10, int i11) {
        this.f59723a = i10;
        this.f59724b = i11;
        requestLayout();
    }
}
