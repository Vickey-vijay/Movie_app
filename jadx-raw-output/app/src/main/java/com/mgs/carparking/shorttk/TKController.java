package com.mgs.carparking.shorttk;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xyz.doikki.videoplayer.controller.BaseVideoController;

/* JADX INFO: loaded from: classes10.dex */
public class TKController extends BaseVideoController {
    public TKController(@NonNull Context context) {
        super(context);
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public int getLayoutId() {
        return 0;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public boolean showNetWarning() {
        return false;
    }

    public TKController(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TKController(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
