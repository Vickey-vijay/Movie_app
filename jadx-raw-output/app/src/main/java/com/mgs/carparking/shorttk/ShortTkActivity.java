package com.mgs.carparking.shorttk;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityMainBinding;
import com.mgs.carparking.netbean.TKBean;
import com.pp.hls;
import em.n;
import em.r;
import java.io.IOException;
import me.goldze.mvvmhabit.base.BaseApplication;
import okhttp3.Response;
import sa.o0;
import sa.x;

/* JADX INFO: loaded from: classes11.dex */
public class ShortTkActivity extends BaseActivity<ActivityMainBinding, SHORTTKVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TKBean f41589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41590i;

    public class a implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f41591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41592b;

        public a(int i10, String str) {
            this.f41591a = i10;
            this.f41592b = str;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                ((SHORTTKVIEWMODEL) ShortTkActivity.this.f39698d).m(this.f41591a, this.f41592b, response.body().string(), 0);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_short_tk;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(TKBean tKBean) {
        this.f41589h = tKBean;
        getSupportFragmentManager().beginTransaction().replace(R.id.main, TKFragment.newInstance(true, this.f41589h, 0)).commit();
    }

    public void getSign(int i10) {
        if (AppApplication.port > 0) {
            String str = System.currentTimeMillis() + "";
            x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=verify&device_id=" + t9.a.a(r.a()) + i10 + "&ts=" + str, new a(i10, str));
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SHORTTKVIEWMODEL initViewModel() {
        return new SHORTTKVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public void loadP2pSdk(int i10) {
        if (AppApplication.port <= 0) {
            hls hlsVar = new hls();
            String absolutePath = getExternalFilesDir("").getAbsolutePath();
            if (Environment.getExternalStorageDirectory() != null) {
                absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            AppApplication.port = hlsVar.load("918ef3452da2728168006719d78815a6", "com.fvvcl.flickverse", "63", absolutePath, getExternalFilesDir("").getAbsolutePath(), o0.J(), "1");
            Log.i("wangyi", "端口号为：" + AppApplication.port);
            getSign(i10);
        }
        getSign(i10);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        n.a(this);
        this.f41589h = (TKBean) getIntent().getSerializableExtra("netcineVarVideoBean");
        String stringExtra = getIntent().getStringExtra("netcineVarVideoId");
        this.f41590i = stringExtra;
        if (this.f41589h != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main, TKFragment.newInstance(true, this.f41589h, getIntent().getIntExtra("netcineVarVideoPos", -1))).commit();
            loadP2pSdk(this.f41589h.getNetCineVarListVod_id());
            return;
        }
        loadP2pSdk(Integer.parseInt(stringExtra));
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SHORTTKVIEWMODEL) this.f39698d).f41587f.observe(this, new Observer() { // from class: y9.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75327b.p((TKBean) obj);
            }
        });
    }
}
