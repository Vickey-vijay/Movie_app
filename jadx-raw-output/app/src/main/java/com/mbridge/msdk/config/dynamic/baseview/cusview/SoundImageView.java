package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.i0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SoundImageView extends ComponentImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33758c;

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        boolean z10 = !this.f33758c;
        setSoundStatus(z10);
        HashMap map = new HashMap();
        map.put("soundStatus", z10 ? "0" : "1");
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), map);
    }

    public boolean getStatus() {
        return this.f33758c;
    }

    public void setSoundStatus(boolean z10) {
        this.f33758c = z10;
        if (z10) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView
    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33767b.a(view);
            }
        });
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33758c = true;
        setSoundStatus(true);
    }
}
