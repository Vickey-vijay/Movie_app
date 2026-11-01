package io.bidmachine.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.view.CircleCountdownView;

/* JADX INFO: loaded from: classes10.dex */
public class IabMuteWrapper extends IabElementWrapper<CircleCountdownView> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f59390g;

    public IabMuteWrapper(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
        this.f59390g = false;
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        if (iabElementStyle == null || !"speakerfill".equals(iabElementStyle.getStyle())) {
            return Assets.DEF_MUTE_STYLE;
        }
        IabElementStyle iabElementStyle2 = new IabElementStyle();
        iabElementStyle2.setOutlined(Boolean.TRUE);
        return Assets.DEF_MUTE_STYLE.copyWith(iabElementStyle2);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CircleCountdownView b(Context context, IabElementStyle iabElementStyle) {
        return new CircleCountdownView(context);
    }

    public void setMuted(boolean z10) {
        this.f59390g = z10;
        invalidate();
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    public void a(Context context, CircleCountdownView circleCountdownView, IabElementStyle iabElementStyle) {
        circleCountdownView.setImage(Assets.getBitmapFromBase64(this.f59390g ? Assets.UNMUTE : Assets.MUTE));
    }
}
