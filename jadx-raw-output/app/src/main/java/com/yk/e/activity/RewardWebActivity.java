package com.yk.e.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b.b0;
import b.j0;
import b.k0;
import b.x;
import com.safedk.android.utils.Logger;
import com.yk.e.callBack.MainVideoAdCallBack;
import com.yk.e.object.MainParams;
import com.yk.e.object.SendLoader;
import com.yk.e.util.AdLog;
import com.yk.e.util.AppUtil;
import com.yk.e.util.Constant;
import com.yk.e.util.FileLoader;
import com.yk.e.util.LogUtil;
import com.yk.e.util.StringUtil;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.util.Timer;

/* JADX INFO: loaded from: classes9.dex */
public class RewardWebActivity extends BaseActivity {
    public TextView I1I;
    public WebView IL1Iii;
    public MainParams ILL;
    public ImageView ILil;
    public String Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public TextView f3310IL;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public String f3311IiL;
    public int LlLI1;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public MainVideoAdCallBack f3312Ll1;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public Timer f3313L11I;
    public final Handler iIi1;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public int f3314iILLL1;

    /* JADX INFO: renamed from: ll丨L1ii, reason: contains not printable characters */
    public ProgressBar f3317llL1ii;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public String f3318lLi1LL;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public SendLoader f3319il;

    /* JADX INFO: renamed from: lIi丨I, reason: contains not printable characters */
    public boolean f3315lIiI = false;

    /* JADX INFO: renamed from: IL丨丨l, reason: contains not printable characters */
    public boolean f3309ILl = false;

    /* JADX INFO: renamed from: Lil, reason: collision with root package name */
    public boolean f51169Lil = false;

    /* JADX INFO: renamed from: lI丨lii, reason: contains not printable characters */
    public final I1I f3316lIlii = new I1I(this);

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public RewardWebActivity() {
        new Handler(Looper.getMainLooper(), new IL(this));
        this.iIi1 = new Handler(Looper.getMainLooper(), new x(this));
    }

    public static void IL1Iii(RewardWebActivity rewardWebActivity, String str) {
        rewardWebActivity.getClass();
        try {
            Intent intent = new Intent(rewardWebActivity, (Class<?>) WebActivity.class);
            Constant.appDetailAdMap.put(rewardWebActivity.Ilil, rewardWebActivity.f3319il);
            intent.putExtra(VastAttributes.AD_ID, rewardWebActivity.Ilil);
            intent.putExtra("url", str);
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(rewardWebActivity, intent);
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
    }

    @Override // com.yk.e.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView("main_activity_reward_web");
        Intent intent = getIntent();
        this.Ilil = intent.getStringExtra(VastAttributes.AD_ID);
        this.f3318lLi1LL = intent.getStringExtra("videoWebUrl");
        SendLoader sendLoader = Constant.rewardVideoAdMap.get(this.Ilil);
        this.f3319il = sendLoader;
        if (sendLoader == null) {
            finish();
            AdLog.e("mainSendLoader is empty, adID" + this.Ilil);
            return;
        }
        Constant.rewardVideoAdMap.remove(this.Ilil);
        SendLoader sendLoader2 = this.f3319il;
        MainParams mainParams = sendLoader2.mainParams;
        this.ILL = mainParams;
        this.f3312Ll1 = (MainVideoAdCallBack) sendLoader2.mainAdCallBack;
        int i10 = mainParams.countDownTime;
        this.LlLI1 = i10;
        if (i10 == 0) {
            this.LlLI1 = 30;
        }
        this.f3314iILLL1 = mainParams.type;
        this.f3311IiL = mainParams.packageName;
        LogUtil.i("zhazha", "web url = " + this.f3318lLi1LL);
        this.I1I = (TextView) findViewById("main_txt_title");
        this.f3317llL1ii = (ProgressBar) findViewById("main_progress_bar_web");
        WebView webView = (WebView) findViewById("main_webView");
        this.IL1Iii = webView;
        webView.setWebChromeClient(new WebChromeClient());
        this.IL1Iii.clearCache(true);
        WebSettings settings = this.IL1Iii.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setPluginState(WebSettings.PluginState.ON_DEMAND);
        settings.setCacheMode(-1);
        this.IL1Iii.setWebViewClient(new k0(this));
        this.IL1Iii.loadUrl(this.f3318lLi1LL);
        ImageView imageView = (ImageView) findViewById("main_img_close");
        this.ILil = imageView;
        imageView.setOnClickListener(new j0(this));
        TextView textView = (TextView) findViewById("main_btn_download");
        this.f3310IL = textView;
        textView.setOnClickListener(this.f3316lIlii);
        Timer timer = this.f3313L11I;
        if (timer != null) {
            timer.cancel();
        }
        this.I1I.setText(this.LlLI1 + "秒之后获得奖励");
        this.f3313L11I = new Timer();
        this.f3313L11I.schedule(new b0(this), 1000L, 1000L);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f3315lIiI = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f3315lIiI = false;
        int i10 = this.f3314iILLL1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            } else {
                String pathByUrl = FileLoader.getPathByUrl(this, this.ILL.clickUrl);
                if (TextUtils.isEmpty(this.f3311IiL) && new File(pathByUrl).exists()) {
                    this.f3311IiL = AppUtil.getPackageName(this, pathByUrl);
                }
                if (StringUtil.isAppInstalled(this, this.f3311IiL)) {
                    this.f3310IL.setText(getString("main_open"));
                    return;
                } else if (FileLoader.isApkVaild(this, this.ILL.clickUrl)) {
                    this.f3310IL.setText(getString("main_install"));
                    return;
                } else {
                    this.f3310IL.setText(getString("main_downLoad"));
                    return;
                }
            }
        }
        this.f3310IL.setText(getString("main_open"));
    }
}
