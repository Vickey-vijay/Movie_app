package com.mgs.carparking.widgets.dialog.downloadcomplete;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import java.util.List;
import x9.f0;

/* JADX INFO: compiled from: VideoDetailLandDownloadVarietySetNumPop.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f42657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VarietyCompleteLandAdapter f42658b;

    /* JADX INFO: compiled from: VideoDetailLandDownloadVarietySetNumPop.java */
    public class a implements VarietyCompleteLandAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42659a;

        public a(List list) {
            this.f42659a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.downloadcomplete.VarietyCompleteLandAdapter.c
        public void a(int i10) {
            b.this.f42658b.g(this.f42659a, i10);
            tl.a.a().b(new f0(i10));
            b.this.dismiss();
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public b(Context context, List<VideoDownloadEntity> list, int i10) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_variety_land_set_num, (ViewGroup) null);
        viewInflate.findViewById(R.id.ll_sort).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42657a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        VarietyCompleteLandAdapter varietyCompleteLandAdapter = new VarietyCompleteLandAdapter(context, list);
        this.f42658b = varietyCompleteLandAdapter;
        this.f42657a.setAdapter(varietyCompleteLandAdapter);
        this.f42657a.scrollToPosition(i10);
        this.f42658b.f(new a(list));
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }
}
