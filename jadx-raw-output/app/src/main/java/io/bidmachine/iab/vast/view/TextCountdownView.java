package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.IabElementStyle;

/* JADX INFO: loaded from: classes10.dex */
public class TextCountdownView extends IabTextView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f59730e;

    public TextCountdownView(@NonNull Context context) {
        super(context);
        this.f59730e = "%1.0fs";
    }

    @Override // io.bidmachine.iab.vast.view.IabTextView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // io.bidmachine.iab.vast.view.IabTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setProgress(int i10) {
        setText(this.f59730e.replace("%1.0f", String.valueOf(i10)));
    }

    public void setRemaining(int i10) {
        setText(this.f59730e.replace("%1.0f", String.valueOf(i10)));
    }

    @Override // io.bidmachine.iab.vast.view.IabTextView, io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        super.setStyle(iabElementStyle);
        String content = iabElementStyle.getContent();
        if (content != null) {
            this.f59730e = content;
        }
    }

    public TextCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59730e = "%1.0fs";
    }

    public void setProgress(int i10, int i11) {
        setProgress(Math.round((i10 / i11) * 100.0f));
    }
}
