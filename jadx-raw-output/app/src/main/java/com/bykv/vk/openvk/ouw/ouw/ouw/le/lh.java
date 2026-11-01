package com.bykv.vk.openvk.ouw.ouw.ouw.le;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class lh extends fkw implements SurfaceHolder.Callback, vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final ArrayList<le> f10439lh = new ArrayList<>();
    private WeakReference<ouw> ouw;
    private le vt;
    private vt.ouw yu;

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.vt
    public final View getView() {
        return this;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.vt
    public final void ouw(ouw ouwVar) {
        this.ouw = new WeakReference<>(ouwVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<le> it = f10439lh.iterator();
        while (it.hasNext()) {
            le next = it.next();
            if (next != null && next.ouw.get() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.vt);
    }

    public final void setWindowVisibilityChangedListener(vt.ouw ouwVar) {
        this.yu = ouwVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_SurfaceView", "surfaceChanged: ");
        WeakReference<ouw> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().vt(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<ouw> weakReference = this.ouw;
        if (weakReference != null && weakReference.get() != null) {
            this.ouw.get().ouw(surfaceHolder);
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_SurfaceView", "surfaceCreated: ");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_SurfaceView", "surfaceDestroyed: ");
        WeakReference<ouw> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().lh(surfaceHolder);
    }

    public lh(Context context) {
        super(context);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_SurfaceView", "SSRenderSurfaceView: ");
        le leVar = new le(this);
        this.vt = leVar;
        f10439lh.add(leVar);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.le.vt
    public final void ouw(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
