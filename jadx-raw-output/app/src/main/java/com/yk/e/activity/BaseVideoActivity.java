package com.yk.e.activity;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c;
import b.d;
import b.e;
import b.e0;
import b.f;
import b.g0;
import b.i;
import b.j;
import b.p;
import b.r;
import b.v;
import com.yk.e.callBack.MainVideoAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.object.SendLoader;
import com.yk.e.pl.OktVideoView;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.AppUtil;
import com.yk.e.util.FileLoader;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageLoader;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import gl.h;
import java.io.File;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: loaded from: classes7.dex */
public class BaseVideoActivity extends BaseActivity {
    public int I11L;
    public MainVideoAdCallBack I1I;
    public TextView IL1Iii;
    public TextView ILL;
    public SendLoader ILil;

    /* JADX INFO: renamed from: IL丨丨l, reason: contains not printable characters */
    public TextView f3265ILl;
    public RelativeLayout Ilil;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public TextView f3268IiL;

    /* JADX INFO: renamed from: LI丨丨l丨l, reason: contains not printable characters */
    public final i f3270LIll;

    /* JADX INFO: renamed from: Lil, reason: collision with root package name */
    public TextView f51167Lil;
    public ImageView LlLI1;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public RelativeLayout f3271Ll1;

    /* JADX INFO: renamed from: L丨1l, reason: contains not printable characters */
    public WebView f3272L1l;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public TextView f3273L11I;
    public AdPlayer baseAdPlayer;
    public String iIi1;
    public String iIlLiL;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public ImageView f3275iILLL1;

    /* JADX INFO: renamed from: l1IIi1丨, reason: contains not printable characters */
    public ProgressBar f3276l1IIi1;

    /* JADX INFO: renamed from: lIi丨I, reason: contains not printable characters */
    public ImageView f3277lIiI;

    /* JADX INFO: renamed from: lI丨II, reason: contains not printable characters */
    public TextView f3278lIII;

    /* JADX INFO: renamed from: lI丨lii, reason: contains not printable characters */
    public LinearLayout f3279lIlii;
    public RelativeLayout llI;
    public ImageView llliI;

    /* JADX INFO: renamed from: ll丨L1ii, reason: contains not printable characters */
    public TextView f3280llL1ii;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public RelativeLayout f3281lLi1LL;

    /* JADX INFO: renamed from: 丨iI丨丨LLl, reason: contains not printable characters */
    public ImageView f3282iILLl;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public ImageView f3283il;

    /* JADX INFO: renamed from: 丨lL, reason: contains not printable characters */
    public MainParams f3284lL;

    /* JADX INFO: renamed from: 丨l丨, reason: contains not printable characters */
    public int f3285l;

    /* JADX INFO: renamed from: 丨丨, reason: contains not printable characters */
    public LinearLayout f3286;

    /* JADX INFO: renamed from: 丨丨LLlI1, reason: contains not printable characters */
    public VideoView f3287LLlI1;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public boolean f3267IL = true;
    public boolean I11li1 = false;

    /* JADX INFO: renamed from: 丨丨丨1丨, reason: contains not printable characters */
    public boolean f32881 = false;

    /* JADX INFO: renamed from: L丨lLLL, reason: contains not printable characters */
    public int f3274LlLLL = 0;
    public boolean LL1IL = false;

    /* JADX INFO: renamed from: L11丨丨丨1, reason: contains not printable characters */
    public boolean f3269L111 = false;

    /* JADX INFO: renamed from: I丨Ii, reason: contains not printable characters */
    public boolean f3266IIi = false;

    public void IL1Iii() {
    }

    public final void IL1Iii(AdPlayer adPlayer, View view, OktVideoView oktVideoView) {
        getWindow().setFlags(128, 128);
        this.Ilil = (RelativeLayout) findViewById("main_layout_video");
        this.IL1Iii = (TextView) findViewById("main_txt_count_down_time");
        this.f3281lLi1LL = (RelativeLayout) findViewById("main_layout_bottom");
        this.f3275iILLL1 = (ImageView) findViewById("main_img_logo");
        this.f3268IiL = (TextView) findViewById("main_txt_name");
        this.f3273L11I = (TextView) findViewById("main_txt_summary");
        this.f3283il = (ImageView) findViewById("main_img_voice");
        this.ILL = (TextView) findViewById("main_btn_download");
        this.f3271Ll1 = (RelativeLayout) findViewById("main_layout_detail");
        this.f3277lIiI = (ImageView) findViewById("main_img_detail_logo");
        this.f3265ILl = (TextView) findViewById("main_txt_detail_name");
        this.f51167Lil = (TextView) findViewById("main_txt_detail_summary");
        this.LlLI1 = (ImageView) findViewById("main_img_detail_close");
        this.f3280llL1ii = (TextView) findViewById("main_btn_detail_download");
        this.f3279lIlii = (LinearLayout) findViewById("main_layout_content");
        this.llliI = (ImageView) findViewById("main_img_lager");
        this.f3286 = (LinearLayout) findViewById("main_reward_content_ly");
        this.llI = (RelativeLayout) findViewById("main_reward_web_ly");
        this.f3272L1l = (WebView) findViewById("main_reward_web_wv");
        this.f3276l1IIi1 = (ProgressBar) findViewById("main_reward_web_pb");
        this.f3282iILLl = (ImageView) findViewById("main_reward_web_close");
        this.f3287LLlI1 = oktVideoView;
        this.baseAdPlayer = adPlayer;
        this.f3286.removeAllViews();
        h.a(view);
        this.f3286.addView(view, new LinearLayout.LayoutParams(-1, -1));
        this.f3283il.setVisibility(8);
        this.IL1Iii.setVisibility(8);
        this.f3281lLi1LL.setVisibility(8);
        showDetail(false);
        try {
            this.f3283il.setVisibility(0);
            this.IL1Iii.setVisibility(0);
            this.f3281lLi1LL.setVisibility(0);
            int duration = this.baseAdPlayer.getDuration();
            this.IL1Iii.setVisibility(0);
            this.IL1Iii.setText(String.valueOf(duration));
            IL1Iii(duration);
            this.baseAdPlayer.addFragmentLife(this);
            this.baseAdPlayer.setIPlayerCallback(new r((RewardVideoActivity) this));
            this.baseAdPlayer.play4PreLoad();
            MainParams mainParams = this.f3284lL;
            IL1Iii(mainParams.videoWidth, mainParams.videoHeight);
            new ImageLoader().loadImg(this, this.f3284lL.logoUrl, new g0((RewardVideoActivity) this));
            this.f3268IiL.setText(this.f3284lL.name);
            this.f3265ILl.setText(this.f3284lL.name);
            if (TextUtils.isEmpty(this.f3284lL.name)) {
                this.f3265ILl.setVisibility(8);
            } else {
                this.f3265ILl.setVisibility(0);
            }
            this.f3273L11I.setText(this.f3284lL.summary);
            this.f51167Lil.setText(this.f3284lL.summary);
            if (TextUtils.isEmpty(this.f3284lL.summary)) {
                this.f51167Lil.setVisibility(8);
            } else {
                this.f51167Lil.setVisibility(0);
            }
            this.iIi1 = this.f3284lL.packageName;
            new ImageLoader().loadImg(this, this.f3284lL.imgUrl, new e((RewardVideoActivity) this));
            MainParams mainParams2 = this.f3284lL;
            this.f3285l = mainParams2.type;
            this.f3274LlLLL = mainParams2.skipTime;
            this.I1I.onAdShow(new AdInfo());
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            MainVideoAdCallBack mainVideoAdCallBack = this.I1I;
            int i10 = AdSdkStateCode.MAIN_LOGIC_ERROR;
            e10.getMessage();
            mainVideoAdCallBack.onAdFail(i10, "platform:wx, msg:" + IDUtil.getString(this, "main_ad_load_err"));
        }
        RewardVideoActivity rewardVideoActivity = (RewardVideoActivity) this;
        this.f3283il.setOnClickListener(new ILil(rewardVideoActivity));
        this.LlLI1.setOnClickListener(new v(rewardVideoActivity));
        j jVar = new j(rewardVideoActivity);
        this.f3271Ll1.setOnClickListener(jVar);
        this.f3281lLi1LL.setOnClickListener(jVar);
        TextView textView = (TextView) findViewById("main_txt_skip");
        this.f3278lIII = textView;
        textView.setOnClickListener(new f(rewardVideoActivity));
        boolean zEquals = this.f3284lL.playable.equals("1");
        AdLog.d("开启互动广告 " + zEquals);
        if (!zEquals) {
            AdLog.d("不开启互动广告");
            return;
        }
        WebSettings settings = this.f3272L1l.getSettings();
        this.f3272L1l.setVerticalScrollBarEnabled(false);
        settings.setSupportZoom(false);
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setBuiltInZoomControls(false);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        this.f3272L1l.getSettings().setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        this.f3282iILLl.setOnClickListener(new c(rewardVideoActivity));
        this.f3272L1l.setWebViewClient(this.f3270LIll);
        this.f3272L1l.addJavascriptInterface(new p(rewardVideoActivity), "OktH5Bridge");
        this.f3272L1l.loadUrl(this.f3284lL.playableUrl);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void showDetail(boolean z10) {
        if (!z10) {
            this.f3271Ll1.setVisibility(8);
            this.Ilil.setVisibility(0);
            return;
        }
        this.f3271Ll1.setVisibility(0);
        if (this.I11L == 0) {
            this.f3279lIlii.getLayoutParams().width = ScreenUtil.getScreenWidth(this) / 2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3279lIlii.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.addRule(11);
        }
        this.Ilil.setVisibility(8);
    }

    public final void ILil() {
        try {
            if (!this.f32881) {
                this.f32881 = true;
                this.I1I.onAdVideoComplete();
                if (this.f3284lL.playable.equals("1")) {
                    AdLog.d("playableUrlLoadFailed " + this.f3266IIi);
                    if (this.f3266IIi) {
                        IL1Iii();
                        this.I1I.onAdClick();
                        closeAd();
                    } else if (TextUtils.isEmpty(this.f3284lL.playableUrl)) {
                        AdLog.d("playableUrl is empty!");
                        IL1Iii();
                        this.I1I.onAdClick();
                        closeAd();
                    } else {
                        this.f3271Ll1.setVisibility(8);
                        this.Ilil.setVisibility(8);
                        this.llI.setVisibility(0);
                        this.f3272L1l.loadUrl(this.f3284lL.playableUrl);
                    }
                } else {
                    showDetail(true);
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public void closeAd() {
        this.I1I.onAdClose();
        finish();
    }

    public BaseVideoActivity() {
        new Handler(Looper.getMainLooper(), new IL1Iii(this));
        this.f3270LIll = new i(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AdPlayer adPlayer = this.baseAdPlayer;
        if (adPlayer != null) {
            adPlayer.release();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.I11li1 = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        AdPlayer adPlayer;
        super.onResume();
        if (this.I11li1 && (adPlayer = this.baseAdPlayer) != null) {
            IL1Iii(adPlayer.getRestTime());
        }
        this.I11li1 = false;
        int i10 = this.f3285l;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            } else {
                String pathByUrl = FileLoader.getPathByUrl(this, this.f3284lL.clickUrl);
                if (TextUtils.isEmpty(this.iIi1) && new File(pathByUrl).exists()) {
                    this.iIi1 = AppUtil.getPackageName(this, pathByUrl);
                }
                if (StringUtil.isAppInstalled(this, this.iIi1)) {
                    this.ILL.setText(getString("main_open"));
                    this.f3280llL1ii.setText(getString("main_open_now"));
                    return;
                } else if (FileLoader.isApkVaild(this, this.f3284lL.clickUrl)) {
                    this.ILL.setText(getString("main_install"));
                    this.f3280llL1ii.setText(getString("main_install_now"));
                    return;
                } else {
                    this.ILL.setText(getString("main_downLoad"));
                    this.f3280llL1ii.setText(getString("main_downLoad_now"));
                    return;
                }
            }
        }
        this.ILL.setText(getString("main_open"));
        this.f3280llL1ii.setText(getString("main_open_now"));
    }

    public final void IL1Iii(int i10) {
        try {
            if (this.f3269L111) {
                return;
            }
            if (i10 < 0) {
                AdPlayer adPlayer = this.baseAdPlayer;
                if (adPlayer != null) {
                    adPlayer.stop();
                }
                ILil();
                return;
            }
            new Handler().postDelayed(new e0(this, i10), 1000L);
        } catch (Exception e10) {
            d.a(e10, new StringBuilder("countdown error, msg = "), e10);
        }
    }

    public final void IL1Iii(int i10, int i11) {
        if (i10 > i11 && this.I11L == 1) {
            this.llliI.setVisibility(0);
            int screenWidth = ScreenUtil.getScreenWidth(this);
            int i12 = (i11 * screenWidth) / i10;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3287LLlI1.getLayoutParams();
            layoutParams.width = screenWidth;
            layoutParams.height = i12;
            this.f3287LLlI1.setLayoutParams(layoutParams);
            return;
        }
        if (i11 > i10 && this.I11L == 0) {
            this.llliI.setVisibility(0);
            int screenHeight = ScreenUtil.getScreenHeight(this);
            int i13 = (i10 * screenHeight) / i11;
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f3287LLlI1.getLayoutParams();
            layoutParams2.width = i13;
            layoutParams2.height = screenHeight;
            this.f3287LLlI1.setLayoutParams(layoutParams2);
            return;
        }
        this.llliI.setVisibility(8);
    }
}
