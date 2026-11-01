package com.yk.e.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import b.f0;
import b.h;
import b.l;
import b.q;
import b.w;
import com.safedk.android.utils.Logger;
import com.yk.e.object.SendLoader;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes7.dex */
public class WebActivity extends BaseActivity {
    public ProgressBar I1I;
    public WebView IL1Iii;
    public TextView ILil;
    public String Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public SendLoader f3320IL;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public String f3321lLi1LL = "";

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
                IL1Iii(this.f3321lLi1LL);
            } else {
                Toast.makeText(this, "请允许拨号权限后再试", 0).show();
            }
        }
    }

    @Override // com.yk.e.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusViewNoHeight();
        setContentView("main_view_web");
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        LogUtil.i("zhazha", "web url = " + stringExtra);
        this.ILil = (TextView) findViewById("main_txt_title");
        this.I1I = (ProgressBar) findViewById("main_progress_bar_web");
        WebView webView = (WebView) findViewById("main_webView");
        this.IL1Iii = webView;
        webView.setWebChromeClient(new q(this));
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
        this.IL1Iii.setWebViewClient(new f0(this));
        this.IL1Iii.loadUrl(stringExtra);
        this.IL1Iii.setOnKeyListener(new h(this));
        ((ImageView) findViewById("main_img_cancel")).setOnClickListener(new l(this));
        ((ImageView) findViewById("main_img_refresh")).setOnClickListener(new w(this));
        String stringExtra2 = intent.getStringExtra(VastAttributes.AD_ID);
        this.Ilil = stringExtra2;
        SendLoader sendLoader = Constant.appDetailAdMap.get(stringExtra2);
        this.f3320IL = sendLoader;
        if (sendLoader != null) {
            Constant.appDetailAdMap.remove(this.Ilil);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }
}
