package com.mgs.carparking.ui;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.androidupnp.service.ClingUpnpService;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityMainBinding;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.model.MAINVIEWMODEL;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.server.NetBroadcastReceiver;
import com.mgs.carparking.ui.MainActivity;
import com.mgs.carparking.ui.channelcontent.CategoryFragment;
import com.mgs.carparking.ui.homecontent.HomePageFragment;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.mine.MineFragment;
import com.mgs.carparking.ui.mine.languageswitching.SetLanguageDialog;
import com.mgs.carparking.ui.ranklist.RankNumberNewFragment;
import com.mgs.carparking.ui.spiel.SpielFragment;
import com.mgs.carparking.widgets.tab.TabLayout;
import com.pp.hls;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.wangxiong.sdk.WxSDK;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainPreloadAdCallback;
import em.o;
import em.p;
import em.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.goldze.mvvmhabit.base.BaseApplication;
import o8.l;
import okhttp3.Response;
import sa.g0;
import sa.j0;
import sa.o0;
import sa.x;
import x9.b0;
import x9.n;
import x9.t;
import x9.u;
import x9.y;
import x9.z;

/* JADX INFO: loaded from: classes5.dex */
public class MainActivity extends BaseActivity<ActivityMainBinding, MAINVIEWMODEL> implements TabLayout.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public jb.a f41733h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NetBroadcastReceiver f41737l;
    public BroadcastReceiver mTransportStateBroadcastReceiver;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ta.d f41742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f41732r = {"android.permission.READ_PHONE_STATE"};
    public static f9.a mBrowseRegistryListener = new f9.a();
    public static c9.a mClingPlayControl = null;
    public static g0 rxTimer = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f41734i = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41735j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41736k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<String> f41738m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41739n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f41740o = 0;
    public Handler mHandler = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ServiceConnection f41741p = new e();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MAINVIEWMODEL) MainActivity.this.f39698d).f41274h.set(Boolean.FALSE);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!o0.z() && AppApplication.adInfoEntry.getAd_position_9() != null && AppApplication.adInfoEntry.getAd_position_9().size() > 0) {
                sa.b.b(MainActivity.this, AppApplication.adInfoEntry.getAd_position_9());
            }
        }
    }

    public class c implements gb.f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gb.f f41745a;

        public c(gb.f fVar) {
            this.f41745a = fVar;
        }

        @Override // gb.f.c
        public void a(int i10) {
            this.f41745a.dismiss();
            Bundle bundle = new Bundle();
            bundle.putInt("id", i10);
            MainActivity.this.startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }

    public class d implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41748b;

        public d(String str, String str2) {
            this.f41747a = str;
            this.f41748b = str2;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                ((MAINVIEWMODEL) MainActivity.this.f39698d).o(this.f41747a, this.f41748b, response.body().string());
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.e("wangyi", "mUpnpServiceConnection onServiceConnected");
            ClingUpnpService clingUpnpServiceB = ((ClingUpnpService.a) iBinder).b();
            g9.a aVarC = g9.a.c();
            aVarC.i(clingUpnpServiceB);
            aVarC.h(new g9.b());
            aVarC.d().w(MainActivity.mBrowseRegistryListener);
            aVarC.g();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.e("wangyi", "mUpnpServiceConnection onServiceDisconnected");
            g9.a.c().i(null);
        }
    }

    public class f implements MainPreloadAdCallback {
        public f() {
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onFailed() {
            Log.i("wangyi", "预加载激励视频广告失败！");
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onSucceeded() {
            Log.i("wangyi", "预加载激励视频广告成功！");
        }
    }

    public class g implements MainPreloadAdCallback {
        public g() {
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onFailed() {
            Log.i("wangyi", "预加载插屏广告失败！");
        }

        @Override // com.yk.e.callBack.MainPreloadAdCallback
        public void onSucceeded() {
            Log.i("wangyi", "预加载插屏广告成功！");
        }
    }

    public static /* synthetic */ void J(u uVar) throws Exception {
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_main;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (System.currentTimeMillis() - this.f41740o > 2000) {
            p.b(r.a().getResources().getString(R.string.text_toast_outapp));
            this.f41740o = System.currentTimeMillis();
            return true;
        }
        destroy();
        finish();
        System.exit(0);
        return true;
    }

    public void onNetChange(int i10) {
    }

    public final class h extends Handler {
        public h() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 161:
                    Log.i("wangyi", "Execute PLAY_ACTION");
                    MainActivity.mClingPlayControl.a(1);
                    break;
                case 162:
                    Log.i("wangyi", "Execute PAUSE_ACTION");
                    MainActivity.mClingPlayControl.a(2);
                    break;
                case 163:
                    Log.i("wangyi", "Execute STOP_ACTION");
                    MainActivity.mClingPlayControl.a(3);
                    MainActivity.this.destroy();
                    break;
                case 164:
                    Log.i("wangyi", "Execute TRANSITIONING_ACTION");
                    break;
                case 165:
                    Log.e("wangyi", "Execute ERROR_ACTION");
                    break;
            }
        }
    }

    public class i extends BroadcastReceiver {
        public i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.e("wangyi", "Receive playback intent:" + action);
            if ("com.mgs.carparking.androidupnp.action.playing".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(161);
                return;
            }
            if ("com.mgs.carparking.androidupnp.action.paused_playback".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(162);
            } else if ("com.mgs.carparking.androidupnp.action.stopped".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(163);
            } else if ("com.mgs.carparking.androidupnp.action.transitioning".equals(action)) {
                MainActivity.this.mHandler.sendEmptyMessage(164);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(x9.h hVar) throws Exception {
        ((ActivityMainBinding) this.f39697c).f39886d.a(3).setUpData(new TabLayout.b(R.drawable.selector_tab_spiel, AppApplication.ex_tab_name, R.drawable.selector_tab_home_color, -1, SpielFragment.class, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(b0 b0Var) throws Exception {
        ((ActivityMainBinding) this.f39697c).f39886d.setCurrentTab(b0Var.a() - 101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(n nVar) throws Exception {
        ((MAINVIEWMODEL) this.f39698d).f41275i.set(Boolean.valueOf(nVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(t tVar) throws Exception {
        if (AppApplication.adInfoEntry.getAd_position_1() != null && AppApplication.adInfoEntry.getAd_position_1().size() > 0) {
            sa.b.B(this, AppApplication.adInfoEntry.getAd_position_1());
        }
        sa.c.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(z zVar) throws Exception {
        if (sa.e.v(this, "com.mgs.carparking.androidupnp.service.ClingUpnpService")) {
            return;
        }
        Log.i("wangyi", "初始化service");
        mClingPlayControl = new c9.a();
        bindServices();
        Q();
    }

    public final void Q() {
        this.mTransportStateBroadcastReceiver = new i();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.playing");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.paused_playback");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.stopped");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.transitioning");
        intentFilter.addAction("com.mgs.carparking.androidupnp.action.position_callback");
        if (Build.VERSION.SDK_INT >= 26) {
            registerReceiver(this.mTransportStateBroadcastReceiver, intentFilter, 4);
        }
    }

    public void appNotice() {
        if (AppApplication.adInfoEntry.getAd_position_7() == null || AppApplication.adInfoEntry.getAd_position_7().size() <= 0) {
            return;
        }
        AdInfoDetailEntry adInfoDetailEntry = AppApplication.adInfoEntry.getAd_position_7().get(0);
        if (adInfoDetailEntry.getAd_id() != o0.o()) {
            o0.t0(adInfoDetailEntry.getAd_id());
            o0.s0(0);
        }
        if (adInfoDetailEntry.getNum() == 0) {
            if (isFinishing()) {
                return;
            }
            new gb.e(this, adInfoDetailEntry).showAtLocation(((ActivityMainBinding) this.f39697c).f39886d, 0, 0, 0);
        } else {
            if (adInfoDetailEntry.getNum() <= o0.n() || isFinishing()) {
                return;
            }
            o0.s0(o0.n() + 1);
            new gb.e(this, adInfoDetailEntry).showAtLocation(((ActivityMainBinding) this.f39697c).f39886d, 0, 0, 0);
        }
    }

    public void bindServices() {
        bindService(new Intent(this, (Class<?>) ClingUpnpService.class), this.f41741p, 1);
    }

    public void destroy() {
        if (this.mTransportStateBroadcastReceiver != null) {
            unbindService(this.f41741p);
            unregisterReceiver(this.mTransportStateBroadcastReceiver);
            g9.a.c().a();
            e9.c.e().b();
            mClingPlayControl = null;
            this.mTransportStateBroadcastReceiver = null;
            ua.a.a();
            g0 g0Var = rxTimer;
            if (g0Var != null) {
                g0Var.b();
                rxTimer = null;
            }
        }
    }

    public void getPermissions() {
        k(new RxPermissions(this).request("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new oi.g() { // from class: z9.c
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86336b.D((Boolean) obj);
            }
        }));
    }

    public void getSign(String str) {
        if (AppApplication.port > 0) {
            String str2 = System.currentTimeMillis() + "";
            x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=verify&device_id=" + t9.a.a(r.a()) + str + "&ts=" + str2, new d(str, str2));
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ArrayList<TabLayout.b> arrayList = new ArrayList<>();
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_home, getString(R.string.main_tab_home), R.drawable.selector_tab_home_color, -1, HomePageFragment.class, 0));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_rank, getString(R.string.main_tab_rank), R.drawable.selector_tab_home_color, -1, RankNumberNewFragment.class, 1));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_channel, getString(R.string.main_tab_channel), R.drawable.selector_tab_home_color, -1, CategoryFragment.class, 2));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_spiel, AppApplication.ex_tab_name, R.drawable.selector_tab_home_color, -1, SpielFragment.class, 3));
        arrayList.add(new TabLayout.b(R.drawable.selector_tab_mine, getString(R.string.main_tab_mine), R.drawable.selector_tab_home_color, -1, MineFragment.class, 4));
        k(tl.a.a().d(x9.h.class).subscribe(new oi.g() { // from class: z9.a
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86334b.E((x9.h) obj);
            }
        }));
        ((ActivityMainBinding) this.f39697c).f39886d.b(arrayList, this);
        if (!this.f41735j) {
            ((ActivityMainBinding) this.f39697c).f39886d.setCurrentTab(getIntent().getIntExtra("id", 0));
            this.f41735j = true;
        }
        if (j0.f67168a.d(false)) {
            new SetLanguageDialog(this).show();
        } else {
            new ka.j0().H(this, this, false);
        }
        this.f41734i.postDelayed(new a(), 5000L);
        this.f41734i.postDelayed(new b(), 500L);
        P();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public MAINVIEWMODEL initViewModel() {
        return new MAINVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public void loadAdFloatViewAd() {
        if (AppApplication.adInfoEntry.getAd_position_18() == null || AppApplication.adInfoEntry.getAd_position_18().size() <= 0) {
            return;
        }
        List<AdInfoDetailEntry> ad_position_18 = AppApplication.adInfoEntry.getAd_position_18();
        int num = AdNumShowDao.getInstance().getNum(102);
        if (num >= ad_position_18.size() - 1) {
            loadAdFloatAdOnce(ad_position_18, 0);
        } else {
            loadAdFloatAdOnce(ad_position_18, num + 1);
        }
    }

    public void loadFloatAdWX(AdInfoDetailEntry adInfoDetailEntry) {
        ta.d dVar = this.f41742q;
        if (dVar != null) {
            dVar.d();
        }
        ta.d dVar2 = new ta.d(this);
        this.f41742q = dVar2;
        dVar2.c(adInfoDetailEntry);
        AdNumShowDao.getInstance().updateWxFloatAdNum(AdNumShowDao.getInstance().getNum(103) + 1);
    }

    public void loadP2pSdk() {
        if (AppApplication.port <= 0) {
            hls hlsVar = new hls();
            sa.e.x("BE2FB29B23E42031B1900D85E0756B75+com.fvvcl.flickverse+63");
            Log.i("wangyi", "googlep2p2sign为：" + sa.e.x("BE2FB29B23E42031B1900D85E0756B75+com.fvvcl.flickverse+63"));
            Log.i("wangyi", "localp2p2sign为：" + sa.e.x("A21635498FB7F1E13648270050E1346E+com.fvvcl.flickverse+63"));
            String absolutePath = getExternalFilesDir("").getAbsolutePath();
            if (Environment.getExternalStorageDirectory() != null) {
                absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            AppApplication.port = hlsVar.load("918ef3452da2728168006719d78815a6", "com.fvvcl.flickverse", "63", absolutePath, getExternalFilesDir("").getAbsolutePath(), o0.J(), "1");
            Log.i("wangyi", "端口号为：" + AppApplication.port);
            if (!o.b(AppApplication.clipStr)) {
                Matcher matcher = Pattern.compile("#yingshi#(.+)#@#").matcher(AppApplication.clipStr);
                if (matcher.find() && !o.b(matcher.group(1))) {
                    getSign(AppApplication.clipStr);
                }
            }
        }
        sa.e.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        sa.z.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Boolean bool) throws Exception {
        if (!bool.booleanValue() && !l.g()) {
            v9.a aVarC = v9.a.c(new DialogInterface.OnClickListener() { // from class: z9.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f86337b.C(dialogInterface, i10);
                }
            });
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.BDAlertDialog).setTitle(r.a().getResources().getString(R.string.str_tip)).setMessage(r.a().getResources().getString(R.string.str_stored_permissions_tip)).setPositiveButton(r.a().getResources().getString(R.string.text_mine_setting), aVarC).setCancelable(false).create();
            aVarC.b(alertDialogCreate);
            alertDialogCreate.show();
            return;
        }
        if (o0.g() == 0) {
            o0.k0(1);
            for (String str : f41732r) {
                if (ContextCompat.checkSelfPermission(this, str) != 0) {
                    this.f41738m.add(str);
                    if (!this.f41738m.isEmpty()) {
                        List<String> list = this.f41738m;
                        ActivityCompat.requestPermissions(this, (String[]) list.toArray(new String[list.size()]), 1);
                    }
                }
            }
        }
        if (!o.b(o0.J())) {
            loadP2pSdk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(x9.a aVar) throws Exception {
        if (aVar.getType().equals("0")) {
            Log.e("OKT_SDK", "---------------WxSDK_onInitSuccess----------------------");
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(y yVar) throws Exception {
        destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(RecommandVideosEntity recommandVideosEntity) {
        if (!isFinishing()) {
            o0.y0(1);
            gb.f fVar = new gb.f(this, recommandVideosEntity);
            fVar.showAtLocation(((ActivityMainBinding) this.f39697c).f39884b, 0, 0, 0);
            fVar.a(new c(fVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(x9.g gVar) throws Exception {
        appNotice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Void r10) {
        loadP2pSdk();
    }

    public final void P() {
        WxSDK.initAdCache(this);
        if (AppApplication.adInfoEntry.getAd_position_4() != null && AppApplication.adInfoEntry.getAd_position_4().size() > 0) {
            WxSDK.preloadRewardAd(new f());
        }
        if (AppApplication.adInfoEntry.getAd_position_9() != null && AppApplication.adInfoEntry.getAd_position_9().size() > 0) {
            for (int i10 = 0; i10 < AppApplication.adInfoEntry.getAd_position_9().size(); i10++) {
                WxSDK.preloadInterstitialAd(new g());
            }
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(tl.a.a().d(x9.a.class).subscribe(new oi.g() { // from class: z9.e
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86338b.F((x9.a) obj);
            }
        }));
        k(tl.a.a().d(b0.class).subscribe(new oi.g() { // from class: z9.f
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86339b.H((b0) obj);
            }
        }));
        k(tl.a.a().e(n.class).subscribe(new oi.g() { // from class: z9.g
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86340b.I((x9.n) obj);
            }
        }));
        k(tl.a.a().d(u.class).subscribe(new oi.g() { // from class: z9.h
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                MainActivity.J((u) obj);
            }
        }));
        ((MAINVIEWMODEL) this.f39698d).f41277k.observe(this, new Observer() { // from class: z9.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86341b.K((RecommandVideosEntity) obj);
            }
        });
        k(tl.a.a().d(x9.g.class).subscribe(new oi.g() { // from class: z9.j
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86342b.L((x9.g) obj);
            }
        }));
        k(tl.a.a().d(t.class).subscribe(new oi.g() { // from class: z9.k
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86343b.M((t) obj);
            }
        }));
        ((MAINVIEWMODEL) this.f39698d).f41279m.observe(this, new Observer() { // from class: z9.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86344b.N((Void) obj);
            }
        });
        k(tl.a.a().d(z.class).subscribe(new oi.g() { // from class: z9.m
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86345b.O((z) obj);
            }
        }));
        k(tl.a.a().d(y.class).subscribe(new oi.g() { // from class: z9.b
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f86335b.G((y) obj);
            }
        }));
    }

    public void loadAdFloatAdOnce(List<AdInfoDetailEntry> list, int i10) {
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() > 0) {
                if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(103)) {
                    AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
                    loadFloatAdWX(adInfoDetailEntry);
                    return;
                } else {
                    int i11 = i10 + 1;
                    if (i11 == list.size()) {
                        i11 = 0;
                    }
                    loadAdFloatAdOnce(list, i11);
                    return;
                }
            }
            AdNumShowDao.getInstance().updateFloatAdIndexNum(i10);
            loadFloatAdWX(adInfoDetailEntry);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        r.f(this);
        super.onCreate(bundle);
        em.n.a(this);
        this.f41737l = new NetBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f41737l, intentFilter);
        MainSDK.getInstance().initAdCache(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f41734i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f41734i = null;
        }
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        try {
            unregisterReceiver(this.f41737l);
            destroy();
        } catch (Exception unused) {
        }
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getPermissions();
    }

    @Override // com.mgs.carparking.widgets.tab.TabLayout.a
    public void onTabClick(TabLayout.b bVar) {
        try {
            jb.a aVarNewInstance = (jb.a) getSupportFragmentManager().findFragmentByTag(bVar.f42894f.getSimpleName());
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            if (aVarNewInstance == null) {
                aVarNewInstance = bVar.f42894f.newInstance();
                fragmentTransactionBeginTransaction.add(R.id.mFragmentContainerLayout, aVarNewInstance.getFragment(), bVar.f42894f.getSimpleName());
                jb.a aVar = this.f41733h;
                if (aVar != null) {
                    fragmentTransactionBeginTransaction.hide(aVar.getFragment());
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            } else {
                fragmentTransactionBeginTransaction.show(aVarNewInstance.getFragment());
                jb.a aVar2 = this.f41733h;
                if (aVar2 != null) {
                    fragmentTransactionBeginTransaction.hide(aVar2.getFragment());
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            }
            this.f41733h = aVarNewInstance;
            if (aVarNewInstance.getFragment().getClass().equals(HomePageFragment.class)) {
                ta.d dVar = this.f41742q;
                if (dVar != null) {
                    dVar.d();
                }
                loadAdFloatViewAd();
                return;
            }
            if (this.f41733h.getFragment().getClass().equals(CategoryFragment.class)) {
                ta.d dVar2 = this.f41742q;
                if (dVar2 != null) {
                    dVar2.d();
                }
                loadAdFloatViewAd();
                return;
            }
            if (this.f41733h.getFragment().getClass().equals(RankNumberNewFragment.class)) {
                ta.d dVar3 = this.f41742q;
                if (dVar3 != null) {
                    dVar3.d();
                }
                loadAdFloatViewAd();
                return;
            }
            ta.d dVar4 = this.f41742q;
            if (dVar4 != null) {
                dVar4.d();
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        }
    }
}
