package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;
import androidx.annotation.AttrRes;

/* JADX INFO: loaded from: classes10.dex */
public class wl2 extends RatingBar implements tl2 {
    public wl2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public wl2(Context context, AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.RatingBar
    public final float getRating() {
        return super.getRating();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isClickable() && motionEvent.getAction() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.RatingBar, yads.tl2
    public void setRating(float f10) {
        super.setRating(f10);
    }
}
