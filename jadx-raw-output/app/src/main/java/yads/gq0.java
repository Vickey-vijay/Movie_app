package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;

/* JADX INFO: loaded from: classes11.dex */
public class gq0 extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a53 f77906b;

    public gq0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final wd3 getAdUiElements() {
        return null;
    }

    public final void setAdUiElements(wd3 wd3Var) {
    }

    public gq0(Context context, AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
    }

    public final a53 getPlayerView() {
        return this.f77906b;
    }

    public final void setPlayerView(a53 a53Var) {
        this.f77906b = a53Var;
    }
}
