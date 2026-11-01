package com.mgs.carparking.widgets.dialog.downloadcomplete;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.widgets.rv.HorizontalItemFourDecoration;
import java.util.ArrayList;
import java.util.List;
import x9.f0;

/* JADX INFO: compiled from: VideoCompleteLandTvAndComicSetNumPop.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f42652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TvAndComicLandDownnloadAdapter f42653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<VideoDownloadEntity> f42654c;

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.downloadcomplete.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoCompleteLandTvAndComicSetNumPop.java */
    public class C0429a implements TvAndComicLandDownnloadAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42655a;

        public C0429a(List list) {
            this.f42655a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.downloadcomplete.TvAndComicLandDownnloadAdapter.c
        public void a(int i10) {
            a.this.f42653b.g(this.f42655a, i10);
            tl.a.a().b(new f0(i10));
            a.this.dismiss();
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public a(Context context, List<VideoDownloadEntity> list, int i10) {
        super(context);
        this.f42654c = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_land_tv_set_num, (ViewGroup) null);
        viewInflate.findViewById(R.id.ll_sort).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42652a = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        this.f42652a.addItemDecoration(new HorizontalItemFourDecoration((int) context.getResources().getDimension(R.dimen.dp_2), context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        TvAndComicLandDownnloadAdapter tvAndComicLandDownnloadAdapter = new TvAndComicLandDownnloadAdapter(context, this.f42654c);
        this.f42653b = tvAndComicLandDownnloadAdapter;
        this.f42652a.setAdapter(tvAndComicLandDownnloadAdapter);
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
        this.f42653b.g(list, i10);
        this.f42652a.scrollToPosition(i10);
        this.f42653b.f(new C0429a(list));
    }
}
