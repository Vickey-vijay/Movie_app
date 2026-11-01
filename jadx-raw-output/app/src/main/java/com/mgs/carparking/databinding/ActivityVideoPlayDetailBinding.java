package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.ObservableScrollView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.ruffian.library.widget.RTextView;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ActivityVideoPlayDetailBinding extends ViewDataBinding {

    @NonNull
    public final RTextView A;

    @NonNull
    public final TextView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final TextView D;

    @NonNull
    public final TextView E;

    @NonNull
    public final TextView F;

    @NonNull
    public final TextView G;

    @NonNull
    public final ConstraintLayout H;

    @Bindable
    public VIDEOPLAYDETAILVIEWMODEL I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final VideoPlayerView f39993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f39994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f39995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f39996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f39997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f39998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CircularImageView f39999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f40000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f40001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f40002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f40003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f40004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f40005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f40006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f40007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f40008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f40009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f40010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f40011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40012u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f40013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40016y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final ObservableScrollView f40017z;

    public ActivityVideoPlayDetailBinding(Object obj, View view, int i10, VideoPlayerView videoPlayerView, FrameLayout frameLayout, WaterDropHeader waterDropHeader, ImageView imageView, ImageView imageView2, TextView textView, CircularImageView circularImageView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, ConstraintLayout constraintLayout3, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView5, FrameLayout frameLayout2, SmartRefreshLayout smartRefreshLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ObservableScrollView observableScrollView, RTextView rTextView, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, ConstraintLayout constraintLayout4) {
        super(obj, view, i10);
        this.f39993b = videoPlayerView;
        this.f39994c = frameLayout;
        this.f39995d = waterDropHeader;
        this.f39996e = imageView;
        this.f39997f = imageView2;
        this.f39998g = textView;
        this.f39999h = circularImageView;
        this.f40000i = textView2;
        this.f40001j = constraintLayout;
        this.f40002k = textView3;
        this.f40003l = constraintLayout2;
        this.f40004m = textView4;
        this.f40005n = constraintLayout3;
        this.f40006o = imageView3;
        this.f40007p = imageView4;
        this.f40008q = imageView5;
        this.f40009r = textView5;
        this.f40010s = frameLayout2;
        this.f40011t = smartRefreshLayout;
        this.f40012u = relativeLayout;
        this.f40013v = relativeLayout2;
        this.f40014w = recyclerView;
        this.f40015x = recyclerView2;
        this.f40016y = recyclerView3;
        this.f40017z = observableScrollView;
        this.A = rTextView;
        this.B = textView6;
        this.C = textView7;
        this.D = textView8;
        this.E = textView9;
        this.F = textView10;
        this.G = textView11;
        this.H = constraintLayout4;
    }
}
