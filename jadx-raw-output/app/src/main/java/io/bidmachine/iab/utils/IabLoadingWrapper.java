package io.bidmachine.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class IabLoadingWrapper extends IabElementWrapper<CircularProgressBar> {
    public IabLoadingWrapper(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        return Assets.DEF_LOADING_STYLE;
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CircularProgressBar b(Context context, IabElementStyle iabElementStyle) {
        return new CircularProgressBar(context);
    }
}
