package com.unity3d.services.ads.adunit;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes2.dex */
public class AdUnitTransparentSoftwareActivity extends AdUnitTransparentActivity {
    @Override // com.unity3d.services.ads.adunit.AdUnitTransparentActivity, com.unity3d.services.ads.adunit.AdUnitActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.unity3d.ads", me2);
        return super.dispatchTouchEvent(me2);
    }
}
