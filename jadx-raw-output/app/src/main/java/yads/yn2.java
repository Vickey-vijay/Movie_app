package yads;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R$drawable;

/* JADX INFO: loaded from: classes10.dex */
public final class yn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f85074a;

    public /* synthetic */ yn2() {
        this(new og0());
    }

    public final Button a(Context context) {
        Button button = new Button(context);
        button.setBackground(ContextCompat.getDrawable(context, R$drawable.monetization_ads_video_ic_replay));
        this.f85074a.getClass();
        int iA = og0.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public yn2(og0 og0Var) {
        this.f85074a = og0Var;
    }
}
