package com.mbridge.msdk.config.activity;

import android.content.Intent;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: ActivityPresenter.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32948a = "ActivityPresenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.lifecycle.a f32949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f32950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32951d;

    public void a(String str) {
        if (this.f32949b == null) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "onDestroy":
                this.f32949b.f();
                break;
            case "onPause":
                this.f32949b.e();
                break;
            case "onStart":
                this.f32949b.onStart();
                break;
            case "onBackPressed":
                this.f32949b.c();
                break;
            case "onStop":
                this.f32949b.a();
                break;
            case "onCreate":
                this.f32949b.a(this.f32950c);
                break;
            case "onResume":
                this.f32949b.b();
                break;
        }
        q0.b("ActivityPresenter", "life " + str);
    }

    public a(MBRewardVideoActivity mBRewardVideoActivity, ViewGroup viewGroup) {
        this.f32950c = viewGroup;
        a(mBRewardVideoActivity);
        if (mBRewardVideoActivity != null && mBRewardVideoActivity.getIntent() != null) {
            this.f32949b = (com.mbridge.msdk.config.activity.lifecycle.a) mBRewardVideoActivity.getIntent().getSerializableExtra("lifecycleCallbackByActivity");
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("orientation", 1);
            this.f32951d = intExtra;
            mBRewardVideoActivity.setRequestedOrientation(intExtra);
        }
        a("onCreate");
    }

    private void a(MBRewardVideoActivity mBRewardVideoActivity) {
        int iA;
        int iA2;
        int iA3;
        if (mBRewardVideoActivity == null || mBRewardVideoActivity.isFinishing() || mBRewardVideoActivity.getIntent() == null) {
            return;
        }
        Intent intent = mBRewardVideoActivity.getIntent();
        if (intent.getIntExtra("modal", 0) != 1) {
            return;
        }
        try {
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("width", 0);
            int intExtra2 = mBRewardVideoActivity.getIntent().getIntExtra("height", 0);
            int iG = v0.g(mBRewardVideoActivity);
            int iF = v0.f(mBRewardVideoActivity);
            if (intent.getIntExtra("hide_status_bar", 0) == 0 && (iA3 = c.a(mBRewardVideoActivity)) > 0) {
                iF -= iA3;
            }
            if (intExtra <= 0 || intExtra2 <= 0) {
                iA = iG;
                iA2 = iF;
            } else {
                iA = v0.a(mBRewardVideoActivity, intExtra);
                iA2 = v0.a(mBRewardVideoActivity, intExtra2);
            }
            int iMin = Math.min(iA, iG);
            int iMin2 = Math.min(iA2, iF);
            ViewGroup.LayoutParams layoutParams = this.f32950c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iMin, iMin2);
            } else {
                layoutParams.width = iMin;
                layoutParams.height = iMin2;
            }
            this.f32950c.setLayoutParams(layoutParams);
            this.f32950c.setX((iG - iMin) / 2.0f);
            this.f32950c.setY((iF - iMin2) / 2.0f);
        } catch (Exception e10) {
            q0.b("ActivityPresenter", e10.getMessage());
        }
    }
}
