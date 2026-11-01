package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.mgs.carparking.model.DOWNLOADVIDEOPLAYVIEWMODEL;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ActivityDownloadVideoPlayBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final VideoPlayerView f39778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public DOWNLOADVIDEOPLAYVIEWMODEL f39779c;

    public ActivityDownloadVideoPlayBinding(Object obj, View view, int i10, VideoPlayerView videoPlayerView) {
        super(obj, view, i10);
        this.f39778b = videoPlayerView;
    }
}
