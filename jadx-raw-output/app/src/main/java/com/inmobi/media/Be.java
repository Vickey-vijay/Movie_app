package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f22418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f22419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f22420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f22421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fe f22422e;

    public Be(ViewGroup viewGroup, ImageView imageView, MediaView mediaView, List list, Fe fe2) {
        ck.p.j(viewGroup, "parentView");
        ck.p.j(list, "friendlyViews");
        ck.p.j(fe2, "nativeVisibilitySpec");
        this.f22418a = viewGroup;
        this.f22419b = imageView;
        this.f22420c = mediaView;
        this.f22421d = list;
        this.f22422e = fe2;
    }
}
