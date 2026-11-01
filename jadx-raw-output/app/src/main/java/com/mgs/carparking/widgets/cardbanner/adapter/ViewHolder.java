package com.mgs.carparking.widgets.cardbanner.adapter;

import android.view.View;
import android.widget.TextView;
import ck.p;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;

/* JADX INFO: compiled from: ViewHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewHolder extends BannerViewHolder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RoundedImageView f42358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f42359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f42360n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolder(View view) {
        super(view);
        p.j(view, "itemView");
        View viewFindViewById = view.findViewById(R.id.item_img);
        p.h(viewFindViewById, "null cannot be cast to non-null type com.mgs.carparking.widgets.cardbanner.view.RoundedImageView");
        this.f42358l = (RoundedImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.main_text);
        p.h(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f42359m = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle_text);
        p.h(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f42360n = (TextView) viewFindViewById3;
    }

    public final TextView b() {
        return this.f42359m;
    }

    public final RoundedImageView c() {
        return this.f42358l;
    }

    public final TextView d() {
        return this.f42360n;
    }
}
