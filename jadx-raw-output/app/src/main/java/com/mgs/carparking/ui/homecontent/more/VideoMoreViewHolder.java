package com.mgs.carparking.ui.homecontent.more;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import da.a;
import em.o;
import em.r;
import sa.e;
import t9.d;

/* JADX INFO: loaded from: classes3.dex */
public class VideoMoreViewHolder extends RecyclerView.ViewHolder implements d<a, RecommandVideosEntity, Integer>, View.OnClickListener {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f41854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f41855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f41856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f41857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f41858p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f41859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f41860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f41861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f41862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f41863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f41864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f41865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RoundedImageView f41866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RecommandVideosEntity f41867y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f41868z;

    @Override // t9.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(a aVar, RecommandVideosEntity recommandVideosEntity, Integer num) {
        this.f41855m = aVar;
        this.f41856n = num;
        this.f41867y = recommandVideosEntity;
        if (recommandVideosEntity != null) {
            c(aVar, recommandVideosEntity);
        }
    }

    public void c(a aVar, RecommandVideosEntity recommandVideosEntity) {
        if (recommandVideosEntity == null) {
            return;
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f41868z = ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f41868z = ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f41857o.setText(e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f41864v.setText(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f41864v.setText(recommandVideosEntity.getVod_total() + r.a().getResources().getString(R.string.text_colections));
        } else {
            this.f41864v.setText(r.a().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (o.b(recommandVideosEntity.getVod_director())) {
            this.A = r.a().getResources().getString(R.string.text_director) + "：" + r.a().getResources().getString(R.string.text_unknow);
        } else {
            this.A = r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director();
        }
        if (o.b(recommandVideosEntity.getVod_actor())) {
            this.B = r.a().getResources().getString(R.string.text_actor) + "：" + r.a().getResources().getString(R.string.text_unknow);
        } else {
            this.B = r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor();
        }
        if (o.b(recommandVideosEntity.getVod_year())) {
            this.D = r.a().getResources().getString(R.string.text_unknow);
        } else {
            this.D = recommandVideosEntity.getVod_year();
        }
        if (o.b(recommandVideosEntity.getVod_tag())) {
            this.E = r.a().getResources().getString(R.string.text_unknow);
        } else {
            this.E = recommandVideosEntity.getVod_tag();
        }
        Glide.with(this.itemView.getContext()).load(recommandVideosEntity.getVod_pic()).into(this.f41866x);
        this.f41865w.setVisibility(recommandVideosEntity.getIcon_type() == 0 ? 8 : 0);
        this.f41865w.setBackground(this.f41868z);
        this.f41858p.setText(recommandVideosEntity.getVod_name());
        this.f41862t.setText(this.E);
        this.f41863u.setText(this.B);
        this.f41861s.setText(this.C);
        this.f41860r.setText(this.D);
        this.f41864v.setVisibility(recommandVideosEntity.getType_pid() != 1 ? 0 : 8);
        this.f41857o.setVisibility(recommandVideosEntity.getType_pid() != 1 ? 8 : 0);
        this.f41859q.setText(this.A);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f41855m;
        if (aVar != null) {
            aVar.onClick(this.f41867y);
        }
    }

    public VideoMoreViewHolder(View view) {
        super(view);
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.f41854l = view;
        this.f41865w = (ImageView) view.findViewById(R.id.iv_cover);
        this.f41866x = (RoundedImageView) view.findViewById(R.id.item_img);
        this.f41857o = (TextView) view.findViewById(R.id.tv_score);
        this.f41858p = (TextView) view.findViewById(R.id.tv_vod_name);
        this.f41860r = (TextView) view.findViewById(R.id.tv_year);
        this.f41861s = (TextView) view.findViewById(R.id.tv_area);
        this.f41863u = (TextView) view.findViewById(R.id.tv_actor);
        this.f41864v = (TextView) view.findViewById(R.id.tv_num);
        this.f41862t = (TextView) view.findViewById(R.id.tv_tag);
        this.f41859q = (TextView) view.findViewById(R.id.tv_director);
        this.f41854l.setOnClickListener(this);
    }
}
