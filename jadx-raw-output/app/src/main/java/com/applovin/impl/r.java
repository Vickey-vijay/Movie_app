package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes7.dex */
public class r extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f8887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f8888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f8889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f8890d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f8890d.removeView(this.f8887a);
        super.dismiss();
    }

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f8887a = viewGroup;
        this.f8888b = size;
        this.f8889c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f8889c, this.f8888b.getWidth()), AppLovinSdkUtils.dpToPx(this.f8889c, this.f8888b.getHeight()));
        layoutParams.addRule(13);
        this.f8887a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f8889c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f8889c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f8889c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.od
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8686b.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f8889c);
        this.f8890d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f8890d.setBackgroundColor(Integer.MIN_VALUE);
        this.f8890d.addView(imageButton);
        this.f8890d.addView(this.f8887a);
        this.f8890d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.pd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8762b.b(view);
            }
        });
        setContentView(this.f8890d);
    }
}
