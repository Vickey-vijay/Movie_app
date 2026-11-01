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
import com.mgs.carparking.netbean.VideoSetSpeedEntry;
import em.p;
import em.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: VideoDetailSetSpeedPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class g extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f42695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoSetSpeedAdapter f42696b;

    /* JADX INFO: compiled from: VideoDetailSetSpeedPop.java */
    public class a implements VideoSetSpeedAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f42697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t.a f42698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f42699c;

        public a(List list, t.a aVar, TextView textView) {
            this.f42697a = list;
            this.f42698b = aVar;
            this.f42699c = textView;
        }

        @Override // com.mgs.carparking.widgets.dialog.VideoSetSpeedAdapter.c
        public void a(int i10) {
            g.this.f42696b.g(this.f42697a, i10);
            t.a aVar = this.f42698b;
            if (aVar != null) {
                if (i10 == 0) {
                    aVar.a0(0.5f, 1.0f);
                    this.f42699c.setText("0.5x");
                    p.b("0.5x");
                } else if (i10 == 1) {
                    aVar.a0(1.0f, 1.0f);
                    this.f42699c.setText(r.a().getResources().getString(R.string.str_speed));
                    p.b("1.0x");
                } else if (i10 == 2) {
                    aVar.a0(1.25f, 1.0f);
                    this.f42699c.setText("1.25x");
                    p.b("1.25x");
                } else if (i10 == 3) {
                    aVar.a0(1.5f, 1.0f);
                    this.f42699c.setText("1.5x");
                    p.b("1.5x");
                } else if (i10 == 4) {
                    aVar.a0(2.0f, 1.0f);
                    this.f42699c.setText("2.0x");
                    p.b("2.0x");
                }
                g.this.dismiss();
            }
        }
    }

    public List<VideoSetSpeedEntry> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoSetSpeedEntry(1, "0.5x", false));
        arrayList.add(new VideoSetSpeedEntry(2, "1.0x", true));
        arrayList.add(new VideoSetSpeedEntry(3, "1.25x", false));
        arrayList.add(new VideoSetSpeedEntry(4, "1.5x", false));
        arrayList.add(new VideoSetSpeedEntry(5, "2.0x", false));
        return arrayList;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public g(Context context, t.a aVar, TextView textView) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_set_speed, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42695a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        List<VideoSetSpeedEntry> listA = a();
        VideoSetSpeedAdapter videoSetSpeedAdapter = new VideoSetSpeedAdapter(context, listA);
        this.f42696b = videoSetSpeedAdapter;
        this.f42695a.setAdapter(videoSetSpeedAdapter);
        this.f42696b.f(new a(listA, aVar, textView));
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
    }
}
