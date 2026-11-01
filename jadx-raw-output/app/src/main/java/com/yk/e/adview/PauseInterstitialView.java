package com.yk.e.adview;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.d;
import com.yk.e.pl.OktVideoView;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.IDUtil;
import com.yk.e.util.LogUtil;
import com.yk.e.util.PixValue;
import d.e;
import d.h;
import d.m;
import dp.n;
import dp.q;
import gl.r0;

/* JADX INFO: loaded from: classes8.dex */
public class PauseInterstitialView extends LinearLayout {
    public boolean I1I;
    public final Activity IL1Iii;
    public AdPlayer ILL;
    public h ILil;
    public final ImageView Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public final ImageView f3336IL;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public final TextView f3337IiL;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public boolean f3338Ll1;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public boolean f3339L11I;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public final TextView f3340iILLL1;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public final RelativeLayout f3341lLi1LL;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public final OktVideoView f3342il;

    public static void IL1Iii(PauseInterstitialView pauseInterstitialView, int i10) {
        pauseInterstitialView.getClass();
        try {
            if (i10 < 0) {
                pauseInterstitialView.f3340iILLL1.setVisibility(8);
                pauseInterstitialView.Ilil.setVisibility(0);
            } else {
                new Handler().postDelayed(new m(pauseInterstitialView, i10), 1000L);
            }
        } catch (Exception e10) {
            d.a(e10, new StringBuilder("countdown error, msg = "), e10);
        }
    }

    public void setContentClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.f3341lLi1LL.setOnClickListener(onClickListener);
        }
    }

    public void setContentClickListener4VideoView(View.OnClickListener onClickListener) {
        AdPlayer adPlayer = this.ILL;
        if (adPlayer != null) {
            adPlayer.setViewOnClickListener(onClickListener);
        }
    }

    public void setMaterialAdCallBack(h hVar) {
        this.ILil = hVar;
    }

    public PauseInterstitialView(Activity activity) {
        super(activity);
        this.I1I = false;
        this.f3339L11I = false;
        this.f3338Ll1 = false;
        e eVar = new e(this);
        this.IL1Iii = activity;
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_pause_interstitial"), (ViewGroup) null, false);
        addView(viewInflate);
        this.f3341lLi1LL = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_content_material"));
        this.f3336IL = (ImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_img_gif_material"));
        this.f3342il = (OktVideoView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_material_player_view"));
        ImageView imageView = (ImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_img_close"));
        this.Ilil = imageView;
        this.f3340iILLL1 = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_txt_cd"));
        this.f3337IiL = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_adtv_material"));
        imageView.setOnClickListener(eVar);
        setVisibility(8);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        AdPlayer adPlayer;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            LogUtil.d("zhazha", "可见");
            if (!this.I1I) {
                this.I1I = true;
                n nVar = ((q) this.ILil).f52271a;
                nVar.F.onAdShow(r0.b(null, nVar.f61585f));
                if (this.f3339L11I && (adPlayer = this.ILL) != null) {
                    adPlayer.play4PreLoad();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4 || i10 == 8) {
            LogUtil.d("zhazha", "不可见");
        }
    }

    public static void IL1Iii(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        int i11 = (int) (((double) i10) / 18.18d);
        PixValue pixValue = PixValue.dip;
        float f10 = 18;
        int iValueOf = i11 < pixValue.valueOf(f10) ? pixValue.valueOf(f10) : i11;
        int iValueOf2 = i11 < pixValue.valueOf(f10) ? pixValue.valueOf(f10) : i11;
        if (view instanceof TextView) {
            ((TextView) view).setTextSize(2, Math.max((int) (((double) PixValue.pix.valueOf(iValueOf)) / 1.69d), 8));
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).width = iValueOf;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = iValueOf2;
        int i12 = (int) (((double) i11) / 2.2d);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i12;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i12;
        view.setLayoutParams(layoutParams);
    }
}
