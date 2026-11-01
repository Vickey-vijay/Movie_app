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
import com.mgs.carparking.widgets.rv.HorizontalItemFourDecoration;
import em.o;
import em.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x9.f0;

/* JADX INFO: compiled from: VideoDetailLandTvAndComicSetNumPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f42624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TvAndComicLandAdapter f42626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoBean> f42627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<VideoBean> f42628e;

    /* JADX INFO: compiled from: VideoDetailLandTvAndComicSetNumPop.java */
    public class a implements TvAndComicLandAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42629a;

        public a(List list) {
            this.f42629a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.TvAndComicLandAdapter.c
        public void a(int i10) {
            d.this.dismiss();
            if (o.b(((VideoBean) d.this.f42628e.get(i10)).getVod_url())) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f42629a.size(); i12++) {
                if (((VideoBean) d.this.f42628e.get(i10)).getCollection() == ((VideoBean) this.f42629a.get(i12)).getCollection()) {
                    i11 = i12;
                }
            }
            d dVar = d.this;
            dVar.f42626c.h(dVar.f42628e, i10);
            tl.a.a().b(new f0(i11));
        }
    }

    /* JADX INFO: compiled from: VideoDetailLandTvAndComicSetNumPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (d.this.f42625b.isEnabled()) {
                d.this.f42625b.setEnabled(false);
                d.this.f42625b.setText(r.a().getResources().getString(R.string.str_order));
            } else {
                d.this.f42625b.setEnabled(true);
                d.this.f42625b.setText(r.a().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(d.this.f42628e);
            d.this.f42626c.notifyDataSetChanged();
            d.this.f42624a.scrollToPosition(0);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public d(Context context, List<VideoBean> list, int i10) {
        super(context);
        this.f42627d = new ArrayList();
        this.f42628e = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_land_tv_set_num, (ViewGroup) null);
        this.f42624a = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42625b = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f42624a.setLayoutManager(new GridLayoutManager(context, 4));
        this.f42624a.addItemDecoration(new HorizontalItemFourDecoration((int) context.getResources().getDimension(R.dimen.dp_2), context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        this.f42628e.addAll(list);
        TvAndComicLandAdapter tvAndComicLandAdapter = new TvAndComicLandAdapter(context, this.f42627d);
        this.f42626c = tvAndComicLandAdapter;
        this.f42624a.setAdapter(tvAndComicLandAdapter);
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
        this.f42626c.h(this.f42628e, i10);
        this.f42624a.scrollToPosition(i10);
        this.f42626c.g(new a(list));
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new b());
    }
}
