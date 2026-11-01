package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.widgets.dialog.cling.DeviceAdapter;
import sa.v;
import x.o;

/* JADX INFO: loaded from: classes11.dex */
public class ClingDeviceDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f42412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VideoPlayDetailActivity f42413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceAdapter f42414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f42415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f42416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f42417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f42418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f42419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f42420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f9.a f42421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x.l f42422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public un.a<?, ?, ?> f42423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f42424o;

    public class a implements DeviceAdapter.a {

        /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.ClingDeviceDialog$a$a, reason: collision with other inner class name */
        public class C0424a implements o {
            public C0424a() {
            }

            @Override // x.o
            public void a(@NonNull un.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onDisconnected");
                ClingDeviceDialog.this.i();
            }

            @Override // x.o
            public void b(@NonNull un.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onConnected");
                ClingDeviceDialog clingDeviceDialog = ClingDeviceDialog.this;
                b bVar = clingDeviceDialog.f42424o;
                if (bVar != null) {
                    bVar.a(clingDeviceDialog.f42422m, aVar);
                }
            }

            @Override // x.o
            public void c(@NonNull ho.b<?> bVar) {
                Log.e("DLNACastManager", "onEventChanged");
            }
        }

        public a() {
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void a(@NonNull un.a<?, ?, ?> aVar) {
            ClingDeviceDialog.this.f42423n = aVar;
            w.a aVar2 = w.a.f73245b;
            if (aVar2.o(aVar)) {
                aVar2.j(aVar);
            }
            ClingDeviceDialog.this.f42422m = aVar2.i(aVar, new C0424a());
            ClingDeviceDialog.this.dismiss();
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void b() {
            Log.e("onDeviceAdded", "onItemAdd ");
            ClingDeviceDialog.this.f42412c.setVisibility(0);
            ClingDeviceDialog.this.f42415f.setVisibility(0);
            ClingDeviceDialog.this.f42419j.setVisibility(8);
            ClingDeviceDialog.this.f42416g.setVisibility(8);
        }
    }

    public interface b {
        void a(x.l lVar, un.a<?, ?, ?> aVar);
    }

    public void g(b bVar) {
        this.f42424o = bVar;
    }

    public void i() {
        try {
            w.a.f73245b.j(this.f42423n);
        } catch (Exception unused) {
        }
    }

    public ClingDeviceDialog(Context context, VideoPlayDetailActivity videoPlayDetailActivity, f9.a aVar) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f42411b = context;
        this.f42413d = videoPlayDetailActivity;
        this.f42421l = aVar;
    }

    public final void f(View view) {
        this.f42412c = (RecyclerView) view.findViewById(R.id.rv_list);
        this.f42416g = (LinearLayout) view.findViewById(R.id.llEmpty);
        this.f42415f = (TextView) view.findViewById(R.id.tv_tig);
        this.f42417h = (TextView) view.findViewById(R.id.tv_Cancel);
        this.f42418i = (TextView) view.findViewById(R.id.tv_help);
        this.f42419j = (LinearLayout) view.findViewById(R.id.ll_loading);
        this.f42420k = (ImageView) view.findViewById(R.id.iv_loading);
        this.f42417h.setOnClickListener(this);
        this.f42418i.setOnClickListener(this);
        ib.d.b(this.f42411b, R.drawable.ic_video_lelink_loading, this.f42420k, true);
        this.f42412c.setLayoutManager(new LinearLayoutManager(this.f42411b, 1, false));
        DeviceAdapter deviceAdapter = new DeviceAdapter(this.f42411b, new a());
        this.f42414e = deviceAdapter;
        w.a.f73245b.p(deviceAdapter);
        if (e9.c.e().d().size() > 0) {
            this.f42412c.setVisibility(0);
            this.f42415f.setVisibility(0);
            this.f42419j.setVisibility(8);
            this.f42416g.setVisibility(8);
        }
        this.f42412c.setAdapter(this.f42414e);
    }

    public final void h() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_Cancel) {
            if (g9.a.c().f() != null) {
                g9.a.c().d().a(this.f42421l);
            }
            dismiss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f42411b, R.layout.dialog_cling_device, null);
        f(viewGroup);
        setContentView(viewGroup);
        h();
        if (v.a(this.f42411b) == -1 || v.a(this.f42411b) == 1) {
            this.f42419j.setVisibility(8);
            this.f42416g.setVisibility(0);
        }
    }
}
