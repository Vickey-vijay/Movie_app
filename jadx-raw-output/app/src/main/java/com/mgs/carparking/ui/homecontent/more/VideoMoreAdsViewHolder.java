package com.mgs.carparking.ui.homecontent.more;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import da.a;
import sa.b;
import t9.d;

/* JADX INFO: loaded from: classes9.dex */
public class VideoMoreAdsViewHolder extends RecyclerView.ViewHolder implements d<a, Object, Integer>, View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f41837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f41838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f41839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FrameLayout f41840o;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // t9.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(a aVar, Object obj, Integer num) {
        this.f41838m = aVar;
        this.f41839n = num;
        c(aVar, obj);
    }

    public void c(a aVar, Object obj) {
        if (AppApplication.adInfoEntry.getAd_position_17() == null || AppApplication.adInfoEntry.getAd_position_17().size() <= 0 || AppApplication.adInfoEntry.getAd_position_17() == null || AppApplication.adInfoEntry.getAd_position_17().size() <= 0) {
            return;
        }
        b.p((Activity) this.f41837l.getContext(), this.f41840o, AppApplication.adInfoEntry.getAd_position_17());
    }

    public VideoMoreAdsViewHolder(View view) {
        super(view);
        this.f41837l = view;
        this.f41840o = (FrameLayout) view.findViewById(R.id.layout_adView);
        this.f41837l.setOnClickListener(this);
    }
}
