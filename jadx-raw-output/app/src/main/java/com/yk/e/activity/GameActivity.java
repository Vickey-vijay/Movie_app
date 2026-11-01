package com.yk.e.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import b.a0;
import b.d0;
import b.g;
import b.n;
import b.o;
import b.t;
import b.u;
import b.y;
import com.safedk.android.utils.Logger;
import com.yk.e.custom.StatusView;
import com.yk.e.object.SendLoader;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import com.yk.e.util.ScreenUtil;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes11.dex */
public class GameActivity extends BaseActivity {
    public LinearLayout I1I;
    public StatusView IL1Iii;
    public WebView ILil;
    public SendLoader Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public ProgressBar f3289IL;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public ImageView f3290IiL;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public int f3291Ll1;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public float f3292L11I;

    /* JADX INFO: renamed from: lIi丨I, reason: contains not printable characters */
    public int f3294lIiI;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public String f3295lLi1LL;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public float f3296il;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public String f3293iILLL1 = "";
    public float ILL = 0.0f;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final void IL1Iii(String str) {
        if (checkSelfPermission("android.permission.CALL_PHONE") == 0) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, new Intent("android.intent.action.CALL", Uri.parse(str)));
        } else {
            requestPermissions(new String[]{"android.permission.CALL_PHONE"}, 1001);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1001) {
            if (strArr.length == 0 || iArr[0] == 0) {
                IL1Iii(this.f3293iILLL1);
            } else {
                Toast.makeText(this, "请允许拨号权限后再试", 0).show();
            }
        }
    }

    @Override // com.yk.e.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        showFullTheme();
        setStatusViewNoHeight();
        setContentView("main_game_web");
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        LogUtil.i("zhazha", "web url = " + stringExtra);
        this.f3289IL = (ProgressBar) findViewById("main_progress_bar_web");
        WebView webView = (WebView) findViewById("main_webView");
        this.ILil = webView;
        webView.setWebChromeClient(new y(this));
        this.ILil.clearCache(true);
        WebSettings settings = this.ILil.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
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
        this.ILil.setWebViewClient(new g(this));
        this.ILil.loadUrl(stringExtra);
        this.ILil.setOnKeyListener(new n(this));
        this.I1I = (LinearLayout) findViewById("main_layout_bottom");
        ((ImageView) findViewById("main_img_left")).setOnClickListener(new o(this));
        ((ImageView) findViewById("main_img_home")).setOnClickListener(new d0(this));
        ((ImageView) findViewById("main_img_refresh")).setOnClickListener(new a0(this));
        ((ImageView) findViewById("main_img_fullscreen")).setOnClickListener(new t(this));
        ImageView imageView = (ImageView) findViewById("main_img_no_full");
        this.f3290IiL = imageView;
        imageView.setOnTouchListener(new u(this));
        this.IL1Iii = (StatusView) findViewById("main_statusview");
        this.f3291Ll1 = ScreenUtil.getScreenWidth(this);
        this.f3294lIiI = ScreenUtil.getScreenHeight(this);
        String stringExtra2 = intent.getStringExtra(VastAttributes.AD_ID);
        this.f3295lLi1LL = stringExtra2;
        SendLoader sendLoader = Constant.appDetailAdMap.get(stringExtra2);
        this.Ilil = sendLoader;
        if (sendLoader != null) {
            Constant.appDetailAdMap.remove(this.f3295lLi1LL);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    public static void IL1Iii(GameActivity gameActivity, boolean z10) {
        if (z10) {
            gameActivity.getWindow().setFlags(1024, 1024);
            gameActivity.showFullTheme();
            gameActivity.f3294lIiI = ScreenUtil.getNavigationBarHeight(gameActivity) + ScreenUtil.getStatusBarHeight(gameActivity) + gameActivity.f3294lIiI;
            gameActivity.IL1Iii.setVisibility(8);
            gameActivity.f3290IiL.setVisibility(0);
            gameActivity.I1I.setVisibility(8);
            return;
        }
        gameActivity.getClass();
        gameActivity.f3294lIiI = ScreenUtil.getScreenHeight(gameActivity);
        gameActivity.getWindow().clearFlags(1024);
        gameActivity.setStatusViewNoHeight();
        gameActivity.IL1Iii.setVisibility(0);
        gameActivity.f3290IiL.setVisibility(8);
        gameActivity.I1I.setVisibility(0);
    }
}
