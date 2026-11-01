package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class qbp {
    public vt fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f13139le = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Context f13140lh;
    public View ouw;
    public ViewGroup pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt f13141ra;
    public TextView vt;
    public com.bytedance.sdk.openadsdk.core.mwh.vt.ouw yu;

    public enum ouw {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public interface vt {
        void mwh();

        boolean ryl();
    }

    public final boolean ouw() {
        View view = this.ouw;
        return view != null && view.getVisibility() == 0;
    }

    public final void ouw(boolean z10) {
        if (z10) {
            this.f13141ra = null;
        }
        vt();
    }

    public final void vt() {
        View view = this.ouw;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
