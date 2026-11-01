package io.bidmachine.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.view.CircleCountdownView;
import io.bidmachine.iab.vast.view.TextCountdownView;

/* JADX INFO: loaded from: classes.dex */
public class IabCountDownWrapper extends IabElementWrapper<View> {
    public IabCountDownWrapper(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public View b(Context context, IabElementStyle iabElementStyle) {
        return "text".equals(iabElementStyle.getStyle()) ? new TextCountdownView(context) : new CircleCountdownView(context);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        return (iabElementStyle == null || !"text".equals(iabElementStyle.getStyle())) ? Assets.DEF_COUNT_DOWN_STYLE : Assets.DEF_TEXT_COUNT_DOWN_STYLE;
    }

    public void changePercentage(int i10, int i11) {
        View view = this.f59383b;
        if (!(view instanceof TextCountdownView)) {
            if (view instanceof CircleCountdownView) {
                ((CircleCountdownView) view).changePercentage(i10, i11);
            }
        } else {
            TextCountdownView textCountdownView = (TextCountdownView) view;
            if (i11 == 0) {
                textCountdownView.setText("");
            } else {
                textCountdownView.setRemaining(i11);
            }
        }
    }
}
