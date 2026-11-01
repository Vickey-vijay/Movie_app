package com.mgs.carparking.app;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.support.multidex.MultiDex;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.os.LocaleListCompat;
import cc.f;
import com.facebook.appevents.AppEventsLogger;
import com.fvvcl.flickverse.R;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.jiagu.sdk.pp_hlsProtected;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.ApiconfEntry;
import com.pp.hls;
import com.safedk.android.internal.DexBridge;
import com.safedk.android.utils.Logger;
import com.scwang.smart.refresh.footer.BallPulseFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.wangxiong.sdk.WxSDK;
import com.wangxiong.sdk.callBack.InitSdkCallback;
import em.k;
import em.o;
import em.r;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.crash.CaocConfig;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import sa.g;
import sa.o0;
import sa.x;
import x9.q;
import x9.t;

/* JADX INFO: loaded from: classes5.dex */
public class AppApplication extends BaseApplication {
    public static int port;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39694c = System.currentTimeMillis();
    public static AdInfoEntry adInfoEntry = new AdInfoEntry();
    public static List<ApiconfEntry> apiList = new ArrayList();
    public static String ex_tab_name = "Promotion";
    public static int bannerIndex = 0;
    public static String clipStr = "";

    public class a implements xa.a.b {
        public a() {
        }

        @Override // xa.a.b
        public void a() {
            Log.i("wangyi", "应用处于前台");
            if (o0.a0() > 0) {
                if (System.currentTimeMillis() - AppApplication.this.f39694c > o0.a0() * 1000) {
                    tl.a.a().b(new t());
                }
            } else if (System.currentTimeMillis() - AppApplication.this.f39694c > 60000) {
                tl.a.a().b(new t());
            }
            if (g.a(o0.A())) {
                g.g();
                tl.a.a().b(new q());
            }
        }

        @Override // xa.a.b
        public void b() {
            Log.i("wangyi", "应用处于后台");
            AppApplication.this.f39694c = System.currentTimeMillis();
            g.g();
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            AppApplication.this.getGAID();
        }
    }

    public class c implements InitSdkCallback {
        @Override // com.yk.e.callBack.MainInitSdkCallback
        public void onInitFailed(int i10, String str) {
            Log.e("OKT_SDK", "-------------WxSDK_initonError" + str);
            tl.a.a().b(new x9.a(String.valueOf(i10)));
        }

        @Override // com.yk.e.callBack.MainInitSdkCallback
        public void onInitSuccess() {
            Log.e("OKT_SDK", "---------------WxSDK_onInitSuccess----------------------");
            tl.a.a().b(new x9.a("0"));
        }
    }

    public class d implements ec.c {
        @Override // ec.c
        public cc.d a(Context context, f fVar) {
            fVar.a(R.color.colorPrimary, android.R.color.white);
            return new ClassicsHeader(context);
        }
    }

    public class e implements ec.b {
        @Override // ec.b
        public cc.c a(Context context, f fVar) {
            return new BallPulseFooter(context).r(r.a().getResources().getColor(R.color.color_commen));
        }
    }

    public static void loadAdConf(String str, String str2, String str3) {
        loadAdConf(str, str2, str3, false);
    }

    @Override // me.goldze.mvvmhabit.base.BaseApplication, android.app.Application
    public void onCreate() {
        Logger.d("SafeDK|SafeDK: App> Lcom/mgs/carparking/app/AppApplication;->onCreate()V");
        DexBridge.appClassOnCreateBefore(this);
        safedk_AppApplication_onCreate_bbdf4c402a780e2be10909c2ace6b7a9(this);
    }

    static {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new d());
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new e());
    }

    public static void loadAdConf(String str, String str2, String str3, boolean z10) {
        if (o.b(str)) {
            str = "AA5086F1E0EFD90B";
        }
        if (o.b(str2)) {
            str2 = "1182";
        }
        if (o.b(str3)) {
            str3 = "8f317dfc21fbbb0c2c656de3cdc10b47";
        }
        if (o.a(str, o0.b()) && o.a(str2, o0.c()) && o.a(str3, o0.a()) && !z10) {
            return;
        }
        WxSDK.initSdk(BaseApplication.getInstance().getApplicationContext(), new c());
        WxSDK.setDebugFlag(true);
    }

    public final boolean c() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        String str = getApplicationInfo().processName;
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid && str.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static void loadP2pSdk() {
        String absolutePath = BaseApplication.getInstance().getExternalFilesDir("").getAbsolutePath();
        if (Environment.getExternalStorageDirectory() != null) {
            absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        port = new hls().load("918ef3452da2728168006719d78815a6", "com.fvvcl.flickverse", "63", absolutePath, BaseApplication.getInstance().getExternalFilesDir("").getAbsolutePath(), o0.J(), "1");
        Log.i("wangyi", "端口号为：" + port);
    }

    public static void safedk_AppApplication_onCreate_bbdf4c402a780e2be10909c2ace6b7a9(AppApplication p10) {
        r.d(p10);
        if (o0.O() == 0) {
            if (!o0.s().equalsIgnoreCase("none")) {
                String strS = o0.s();
                Objects.requireNonNull(strS);
                for (String str : strS.split(StringUtils.COMMA)) {
                    if (r.c().contains(str)) {
                        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(str));
                        o0.r0(str);
                    } else {
                        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags("en"));
                        o0.r0("en");
                    }
                }
            }
        } else {
            AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(o0.m()));
            o0.r0(o0.m());
        }
        super.onCreate();
        s.f.a(p10);
        if (!p10.c()) {
            return;
        }
        t9.a.c(p10);
        if (!o.b(o0.p())) {
            RetrofitUrlManager.getInstance().setGlobalDomain(o0.p());
        }
        new xa.a().b(p10, p10.new a());
        if (k.i(p10).g(AdInfoEntry.class) != null) {
            adInfoEntry = (AdInfoEntry) k.i(p10).g(AdInfoEntry.class);
        }
        if (k.i(p10).b("CACHE_DOMAIN_LIST", ApiconfEntry.class).size() > 0) {
            apiList = k.i(p10).b("CACHE_DOMAIN_LIST", ApiconfEntry.class);
        }
        sa.c.i(true, true);
        em.g.d(true);
        x.b();
        y6.a.e(p10);
        CaocConfig.a.c().b(0).d(false).g(true).h(true).i(true).f(2000).e(Integer.valueOf(R.mipmap.ic_launcher)).a();
        AppEventsLogger.a(p10);
        loadAdConf(o0.b(), o0.c(), o0.a(), true);
        p10.new b().start();
        AppMetrica.activate(p10, AppMetricaConfig.newConfigBuilder("5b6fae87-3d0c-44d0-8f06-afdb70f81029").build());
    }

    @Override // me.goldze.mvvmhabit.base.BaseApplication, androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        pp_hlsProtected.b(this);
        MultiDex.install(this);
    }

    public String getGAID() {
        AdvertisingIdClient.Info advertisingIdInfo;
        Log.e("getGAID", t9.a.e(this));
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this);
        } catch (GooglePlayServicesNotAvailableException unused) {
            Log.e("getGAID", "GooglePlayServicesNotAvailableException");
            advertisingIdInfo = null;
        } catch (IOException unused2) {
            Log.e("getGAID", "IOException");
            advertisingIdInfo = null;
        } catch (Exception e10) {
            Log.e("getGAID", "Exception:" + e10.toString());
            advertisingIdInfo = null;
        }
        if (advertisingIdInfo != null) {
            Log.e("getGAID", "gaid用户禁止获取:" + advertisingIdInfo.isLimitAdTrackingEnabled());
            String id2 = advertisingIdInfo.getId();
            if (!TextUtils.isEmpty(id2)) {
                k.i(getApplicationContext()).o("key_gaid", id2);
            }
            Log.e("getGAID", "gaid:" + id2);
            return id2;
        }
        return "";
    }
}
