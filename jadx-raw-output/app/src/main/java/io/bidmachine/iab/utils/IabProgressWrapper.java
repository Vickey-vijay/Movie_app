package io.bidmachine.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.view.CircleCountdownView;
import io.bidmachine.iab.vast.view.LinearCountdownView;
import io.bidmachine.iab.vast.view.TextCountdownView;

/* JADX INFO: loaded from: classes2.dex */
public class IabProgressWrapper extends IabElementWrapper<View> {
    public IabProgressWrapper(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public View b(Context context, IabElementStyle iabElementStyle) {
        if ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) {
            return new TextCountdownView(context);
        }
        return ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) ? new CircleCountdownView(context) : new LinearCountdownView(context);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        if (iabElementStyle != null) {
            if ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.DEF_TEXT_PROGRESS_STYLE;
            }
            if ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.DEF_COUNT_DOWN_PROGRESS_STYLE;
            }
        }
        return Assets.DEF_LINEAR_PROGRESS_STYLE;
    }

    public void changePercentage(float f10, int i10, int i11) {
        IabElementStyle iabElementStyle = this.f59384c;
        if (iabElementStyle == null) {
            return;
        }
        boolean z10 = iabElementStyle.getStyle() != null && this.f59384c.getStyle().endsWith("reverse");
        View view = this.f59383b;
        if (view instanceof TextCountdownView) {
            TextCountdownView textCountdownView = (TextCountdownView) view;
            if (i11 == 0) {
                textCountdownView.setText("");
                return;
            }
            if (z10) {
                i10 = i11 - i10;
            }
            textCountdownView.setRemaining(Math.max(1, i10));
            return;
        }
        if (view instanceof CircleCountdownView) {
            CircleCountdownView circleCountdownView = (CircleCountdownView) view;
            if (z10) {
                circleCountdownView.changePercentage(f10, i11 != 0 ? Math.max(1, i11 - i10) : 0);
                return;
            } else {
                circleCountdownView.changePercentage(100.0f - f10, i10);
                return;
            }
        }
        if (view instanceof LinearCountdownView) {
            LinearCountdownView linearCountdownView = (LinearCountdownView) view;
            if (z10) {
                f10 = 100.0f - f10;
            }
            linearCountdownView.changePercentage(f10);
        }
    }
}
