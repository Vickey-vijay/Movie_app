package com.mgs.carparking.ui.mine.collection;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import em.r;
import la.a;
import t9.d;

/* JADX INFO: loaded from: classes8.dex */
public class CollectionViewHolder extends RecyclerView.ViewHolder implements d<a, VideoCollectionBeanEntry, Integer>, View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f42094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f42095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f42096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RoundedImageView f42097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f42098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f42099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public VideoCollectionBeanEntry f42100r;

    @Override // t9.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(a aVar, VideoCollectionBeanEntry videoCollectionBeanEntry, Integer num) {
        this.f42095m = aVar;
        this.f42096n = num;
        if (videoCollectionBeanEntry != null) {
            this.f42100r = videoCollectionBeanEntry;
            c(aVar, videoCollectionBeanEntry);
        }
    }

    public void c(a aVar, VideoCollectionBeanEntry videoCollectionBeanEntry) {
        if (videoCollectionBeanEntry == null) {
            return;
        }
        a aVar2 = this.f42095m;
        if (aVar2 != null) {
            this.f42098p.setVisibility(aVar2.b() ? 0 : 8);
        }
        this.f42098p.setImageDrawable(this.f42095m.g(String.valueOf(videoCollectionBeanEntry.getId())) ? ContextCompat.getDrawable(r.a(), R.drawable.ic_mine_history_selector) : ContextCompat.getDrawable(r.a(), R.drawable.ic_feedback_item_unselector));
        this.f42098p.setOnClickListener(this);
        Glide.with(this.f42094l.getContext()).load(videoCollectionBeanEntry.getVod_pic()).into(this.f42097o);
        this.f42097o.setOnClickListener(this);
        this.f42099q.setText(videoCollectionBeanEntry.getVod_name());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        a aVar2;
        if (view == this.f42097o && (aVar2 = this.f42095m) != null) {
            aVar2.e(String.valueOf(this.f42100r.getId()), this.f42100r.getType_pid(), this.f42096n.intValue());
        }
        if (view != this.f42098p || (aVar = this.f42095m) == null) {
            return;
        }
        aVar.f(String.valueOf(this.f42100r.getId()), this.f42096n.intValue());
    }

    public CollectionViewHolder(View view) {
        super(view);
        this.f42094l = view;
        this.f42097o = (RoundedImageView) view.findViewById(R.id.item_img);
        this.f42098p = (ImageView) view.findViewById(R.id.box_count);
        this.f42099q = (TextView) view.findViewById(R.id.tv_name);
    }
}
