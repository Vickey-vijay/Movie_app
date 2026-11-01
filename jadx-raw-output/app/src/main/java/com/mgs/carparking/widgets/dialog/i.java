package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VideoBean;
import em.o;
import em.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x9.f0;

/* JADX INFO: compiled from: VideoDetailTvAndComicSetNumPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class i extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f42749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TvAndComicAdapter f42751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoBean> f42752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<VideoBean> f42753e;

    /* JADX INFO: compiled from: VideoDetailTvAndComicSetNumPop.java */
    public class a implements TvAndComicAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42754a;

        public a(List list) {
            this.f42754a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.TvAndComicAdapter.c
        public void a(int i10) {
            i.this.dismiss();
            if (o.b(((VideoBean) i.this.f42753e.get(i10)).getVod_url())) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f42754a.size(); i12++) {
                if (((VideoBean) i.this.f42753e.get(i10)).getCollection() == ((VideoBean) this.f42754a.get(i12)).getCollection()) {
                    i11 = i12;
                }
            }
            i iVar = i.this;
            iVar.f42751c.g(iVar.f42753e, i10);
            tl.a.a().b(new f0(i11));
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicSetNumPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailTvAndComicSetNumPop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (i.this.f42750b.isEnabled()) {
                i.this.f42750b.setEnabled(false);
                i.this.f42750b.setText(r.a().getResources().getString(R.string.str_order));
            } else {
                i.this.f42750b.setEnabled(true);
                i.this.f42750b.setText(r.a().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(i.this.f42753e);
            i.this.f42751c.notifyDataSetChanged();
            i.this.f42749a.scrollToPosition(0);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public i(Context context, List<VideoBean> list, int i10) {
        super(context);
        this.f42752d = new ArrayList();
        this.f42753e = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_tv_set_num, (ViewGroup) null);
        this.f42749a = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42750b = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f42749a.setLayoutManager(new GridLayoutManager(context, 6));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        this.f42753e.addAll(list);
        TvAndComicAdapter tvAndComicAdapter = new TvAndComicAdapter(context, this.f42752d);
        this.f42751c = tvAndComicAdapter;
        this.f42749a.setAdapter(tvAndComicAdapter);
        this.f42751c.f(new a(list));
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new b());
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
        this.f42751c.g(this.f42753e, i10);
        this.f42749a.scrollToPosition(i10);
    }
}
