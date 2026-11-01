package io.bidmachine.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.view.CircleCountdownView;

/* JADX INFO: loaded from: classes2.dex */
public class IabCloseWrapper extends IabElementWrapper<CircleCountdownView> {
    public IabCloseWrapper(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        return Assets.resolveDefCloseStyle(context, iabElementStyle);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CircleCountdownView b(Context context, IabElementStyle iabElementStyle) {
        return new CircleCountdownView(context);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public void a(Context context, CircleCountdownView circleCountdownView, IabElementStyle iabElementStyle) {
        super.a(context, (View) circleCountdownView, iabElementStyle);
        circleCountdownView.setImage(Assets.getBitmapFromBase64(("skip".equals(iabElementStyle.getStyle()) || "skipfill".equals(iabElementStyle.getStyle())) ? Assets.SKIP : Assets.CLOSE));
    }
}
