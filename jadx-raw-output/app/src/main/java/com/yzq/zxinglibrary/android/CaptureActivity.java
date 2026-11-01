package com.yzq.zxinglibrary.android;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import com.ironsource.C3426d4;
import com.safedk.android.utils.Logger;
import com.yzq.zxinglibrary.R$drawable;
import com.yzq.zxinglibrary.R$id;
import com.yzq.zxinglibrary.R$layout;
import com.yzq.zxinglibrary.R$string;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import com.yzq.zxinglibrary.view.ViewfinderView;
import java.io.IOException;
import se.b;
import se.c;
import ue.d;
import ue.e;
import ue.g;
import y5.i;

/* JADX INFO: loaded from: classes10.dex */
public class CaptureActivity extends AppCompatActivity implements SurfaceHolder.Callback, View.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f51177q = CaptureActivity.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceView f51178c;
    public ZxingConfig config;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewfinderView f51179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatImageView f51180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f51181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppCompatImageView f51182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayoutCompat f51183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayoutCompat f51184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayoutCompat f51185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f51187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public se.a f51188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public te.c f51189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CaptureActivityHandler f51190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SurfaceHolder f51191p;

    public class a implements d {
        public a() {
        }

        @Override // ue.d
        public void a() {
            Toast.makeText(CaptureActivity.this, R$string.scan_failed_tip, 0).show();
        }

        @Override // ue.d
        public void b(i iVar) {
            CaptureActivity.this.handleDecode(iVar);
        }
    }

    public static boolean isSupportCameraLedFlash(PackageManager packageManager) {
        FeatureInfo[] systemAvailableFeatures;
        if (packageManager != null && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo != null && "android.hardware.camera.flash".equals(featureInfo.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f51186k = false;
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public void drawViewfinder() {
        this.f51179d.g();
    }

    public te.c getCameraManager() {
        return this.f51189n;
    }

    public Handler getHandler() {
        return this.f51190o;
    }

    public ViewfinderView getViewfinderView() {
        return this.f51179d;
    }

    public void handleDecode(i iVar) {
        this.f51187l.e();
        this.f51188m.d();
        Intent intent = getIntent();
        intent.putExtra("codedContent", iVar.f());
        setResult(-1, intent);
        finish();
    }

    public final void k() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("扫一扫");
        builder.setMessage(getString(R$string.msg_camera_framework_bug));
        builder.setPositiveButton(R$string.button_ok, new b(this));
        builder.setOnCancelListener(new b(this));
        builder.show();
    }

    public final void l(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.f51189n.e()) {
            return;
        }
        try {
            this.f51189n.f(surfaceHolder);
            if (this.f51190o == null) {
                this.f51190o = new CaptureActivityHandler(this, this.f51189n);
            }
        } catch (IOException e10) {
            Log.w(f51177q, e10);
            k();
        } catch (RuntimeException e11) {
            Log.w(f51177q, "Unexpected error initializing camera", e11);
            k();
        }
    }

    public final void m() {
        SurfaceView surfaceView = (SurfaceView) findViewById(R$id.preview_view);
        this.f51178c = surfaceView;
        surfaceView.setOnClickListener(this);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R$id.viewfinder_view);
        this.f51179d = viewfinderView;
        viewfinderView.setZxingConfig(this.config);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R$id.backIv);
        this.f51182g = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        this.f51180e = (AppCompatImageView) findViewById(R$id.flashLightIv);
        this.f51181f = (TextView) findViewById(R$id.flashLightTv);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) findViewById(R$id.flashLightLayout);
        this.f51183h = linearLayoutCompat;
        linearLayoutCompat.setOnClickListener(this);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) findViewById(R$id.albumLayout);
        this.f51184i = linearLayoutCompat2;
        linearLayoutCompat2.setOnClickListener(this);
        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) findViewById(R$id.bottomLayout);
        this.f51185j = linearLayoutCompat3;
        n(linearLayoutCompat3, this.config.isShowbottomLayout());
        n(this.f51183h, this.config.isShowFlashLight());
        n(this.f51184i, this.config.isShowAlbum());
        if (isSupportCameraLedFlash(getPackageManager())) {
            this.f51183h.setVisibility(0);
        } else {
            this.f51183h.setVisibility(8);
        }
    }

    public final void n(View view, boolean z10) {
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f51187l.h();
        this.f51179d.j();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Log.i("CaptureActivity", C3426d4.i.f28567t0);
        CaptureActivityHandler captureActivityHandler = this.f51190o;
        if (captureActivityHandler != null) {
            captureActivityHandler.a();
            this.f51190o = null;
        }
        this.f51187l.f();
        this.f51188m.close();
        this.f51189n.b();
        if (!this.f51186k) {
            this.f51191p.removeCallback(this);
        }
        super.onPause();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f51186k) {
            return;
        }
        this.f51186k = true;
        l(surfaceHolder);
    }

    public void switchFlashImg(int i10) {
        if (i10 == 8) {
            this.f51180e.setImageResource(R$drawable.ic_open);
            this.f51181f.setText(R$string.close_flash);
        } else {
            this.f51180e.setImageResource(R$drawable.ic_close);
            this.f51181f.setText(R$string.open_flash);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10 && i11 == -1) {
            new e(g.b(this, intent.getData()), new a()).run();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.flashLightLayout) {
            this.f51189n.k(this.f51190o);
            return;
        }
        if (id2 == R$id.albumLayout) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.PICK");
            intent.setType("image/*");
            safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent, 10);
            return;
        }
        if (id2 == R$id.backIv) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(128);
        window.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        try {
            this.config = (ZxingConfig) getIntent().getExtras().get("zxingConfig");
        } catch (Exception e10) {
            Log.i("config", e10.toString());
        }
        if (this.config == null) {
            this.config = new ZxingConfig();
        }
        setContentView(R$layout.activity_capture);
        m();
        this.f51186k = false;
        this.f51187l = new c(this);
        se.a aVar = new se.a(this);
        this.f51188m = aVar;
        aVar.e(this.config.isPlayBeep());
        this.f51188m.f(this.config.isShake());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        te.c cVar = new te.c(getApplication(), this.config);
        this.f51189n = cVar;
        this.f51179d.setCameraManager(cVar);
        this.f51190o = null;
        SurfaceHolder holder = this.f51178c.getHolder();
        this.f51191p = holder;
        if (this.f51186k) {
            l(holder);
        } else {
            holder.addCallback(this);
        }
        this.f51188m.h();
        this.f51187l.g();
    }
}
