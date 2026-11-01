package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VideoBean;
import em.o;
import em.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x9.f0;

/* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class k extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f42806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VarietyAdapter f42808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoBean> f42809d;

    /* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
    public class a implements VarietyAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42810a;

        public a(List list) {
            this.f42810a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.VarietyAdapter.c
        public void a(int i10) {
            k.this.dismiss();
            if (o.b(((VideoBean) k.this.f42809d.get(i10)).getVod_url())) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f42810a.size(); i12++) {
                if (((VideoBean) k.this.f42809d.get(i10)).getCollection() == ((VideoBean) this.f42810a.get(i12)).getCollection()) {
                    i11 = i12;
                }
            }
            k kVar = k.this;
            kVar.f42808c.g(kVar.f42809d, i10);
            tl.a.a().b(new f0(i11));
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k.this.f42807b.isEnabled()) {
                k.this.f42807b.setEnabled(false);
                k.this.f42807b.setText(r.a().getResources().getString(R.string.str_order));
            } else {
                k.this.f42807b.setEnabled(true);
                k.this.f42807b.setText(r.a().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(k.this.f42809d);
            k.this.f42808c.notifyDataSetChanged();
            k.this.f42806a.scrollToPosition(0);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public k(Context context, List<VideoBean> list, String str, String str2, int i10) {
        super(context);
        this.f42809d = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_variety_set_num, (ViewGroup) null);
        this.f42806a = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42807b = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f42806a.setLayoutManager(new LinearLayoutManager(context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        this.f42809d.addAll(list);
        VarietyAdapter varietyAdapter = new VarietyAdapter(context, this.f42809d, str);
        this.f42808c = varietyAdapter;
        this.f42806a.setAdapter(varietyAdapter);
        this.f42806a.scrollToPosition(i10);
        this.f42808c.f(new a(list));
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
    }
}
