package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.DOWNLOADVIDEOPLAYVIEWMODEL;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityDownloadVideoPlayBindingImpl extends ActivityDownloadVideoPlayBinding {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f39780f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f39781g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f39782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39783e;

    public ActivityDownloadVideoPlayBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f39780f, f39781g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f39783e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f39783e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f39783e = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        a((DOWNLOADVIDEOPLAYVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39781g = sparseIntArray;
        sparseIntArray.put(R.id.exo_play_context_id, 1);
    }

    public ActivityDownloadVideoPlayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (VideoPlayerView) objArr[1]);
        this.f39783e = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f39782d = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void a(@Nullable DOWNLOADVIDEOPLAYVIEWMODEL downloadvideoplayviewmodel) {
        this.f39779c = downloadvideoplayviewmodel;
    }
}
