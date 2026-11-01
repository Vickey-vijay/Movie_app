package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.widgets.dialog.cling.DeviceAdapter;
import sa.v;
import x.o;

/* JADX INFO: compiled from: ClingDeviceHorizalPop.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoPlayDetailActivity f42580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DeviceAdapter f42581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f42582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f42583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f42584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f42585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f42586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ClingDeviceDialog.b f42587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f9.a f42588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x.l f42589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public un.a<?, ?, ?> f42590m;

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClingDeviceHorizalPop.java */
    public class C0425a implements DeviceAdapter.a {

        /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ClingDeviceHorizalPop.java */
        public class C0426a implements o {
            public C0426a() {
            }

            @Override // x.o
            public void a(@NonNull un.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onDisconnected");
                a.this.f();
            }

            @Override // x.o
            public void b(@NonNull un.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onConnected");
                a aVar2 = a.this;
                ClingDeviceDialog.b bVar = aVar2.f42587j;
                if (bVar != null) {
                    bVar.a(aVar2.f42589l, aVar);
                }
            }

            @Override // x.o
            public void c(@NonNull ho.b<?> bVar) {
                Log.e("DLNACastManager", "onEventChanged");
            }
        }

        public C0425a() {
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void a(@NonNull un.a<?, ?, ?> aVar) {
            a.this.f42590m = aVar;
            w.a aVar2 = w.a.f73245b;
            if (aVar2.o(aVar)) {
                aVar2.j(aVar);
            }
            a.this.f42589l = aVar2.i(aVar, new C0426a());
            a.this.dismiss();
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void b() {
            Log.e("onDeviceAdded", "onItemAdd ");
            a.this.f42582e.setVisibility(0);
            a.this.f42583f.setVisibility(0);
            a.this.f42585h.setVisibility(8);
            a.this.f42584g.setVisibility(8);
        }
    }

    public void e(ClingDeviceDialog.b bVar) {
        this.f42587j = bVar;
    }

    public void f() {
        try {
            w.a.f73245b.j(this.f42590m);
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public a(VideoPlayDetailActivity videoPlayDetailActivity, Context context, f9.a aVar) {
        super(context);
        this.f42580c = videoPlayDetailActivity;
        this.f42579b = context;
        this.f42588k = aVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_cling_device_horizal, (ViewGroup) null);
        this.f42582e = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42584g = (LinearLayout) viewInflate.findViewById(R.id.llEmpty);
        this.f42583f = (TextView) viewInflate.findViewById(R.id.tv_tig);
        this.f42585h = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_loading);
        this.f42586i = imageView;
        ib.d.b(context, R.drawable.ic_video_lelink_loading, imageView, true);
        this.f42582e.setLayoutManager(new LinearLayoutManager(context, 1, false));
        DeviceAdapter deviceAdapter = new DeviceAdapter(context, new C0425a());
        this.f42581d = deviceAdapter;
        w.a.f73245b.p(deviceAdapter);
        if (e9.c.e().d().size() > 0) {
            this.f42582e.setVisibility(0);
            this.f42583f.setVisibility(0);
            this.f42585h.setVisibility(8);
            this.f42584g.setVisibility(8);
        }
        this.f42582e.setAdapter(this.f42581d);
        if (v.a(context) == -1 || v.a(context) == 1) {
            this.f42585h.setVisibility(8);
            this.f42584g.setVisibility(0);
        }
        if (g9.a.c().f() != null) {
            g9.a.c().d().w(aVar);
        }
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }
}
