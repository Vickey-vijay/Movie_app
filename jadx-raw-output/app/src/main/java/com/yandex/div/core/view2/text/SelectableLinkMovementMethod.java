package com.yandex.div.core.view2.text;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: compiled from: SelectableLinkMovementMethod.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SelectableLinkMovementMethod extends ArrowKeyMovementMethod {
    public static final SelectableLinkMovementMethod INSTANCE = new SelectableLinkMovementMethod();

    private SelectableLinkMovementMethod() {
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            int x10 = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y10 = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y10), x10);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                super.onTouchEvent(textView, spannable, motionEvent);
                if (action == 1) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        clickableSpan.onClick(textView);
                    }
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
