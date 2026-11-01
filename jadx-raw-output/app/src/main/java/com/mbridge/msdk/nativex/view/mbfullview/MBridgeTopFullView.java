package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName() + "WithResault";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f36280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f36281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f36282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public StarLevelLayoutView f36283m;

    @Override // com.mbridge.msdk.nativex.view.mbfullview.BaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.nativex.view.mbfullview.BaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f36282l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f36280j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f36281k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f36283m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f36268a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f36269b.setLayoutParams(layoutParams2);
    }

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f36276i);
        if (viewInflate != null) {
            this.f36280j = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f36281k = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f36282l = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f36283m = (StarLevelLayoutView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f36282l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }
}
