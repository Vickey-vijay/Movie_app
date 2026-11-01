package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RelativeLayout f36268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RelativeLayout f36269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f36270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f36271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f36272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f36273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f36274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f36275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f36276i;
    public a style;

    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f36270c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f36271d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f36273f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f36268a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f36269b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f36272e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f36274g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f36275h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f36276i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f36268a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f36269b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f36270c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f36271d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f36272e = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f36273f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f36274g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f36275h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
