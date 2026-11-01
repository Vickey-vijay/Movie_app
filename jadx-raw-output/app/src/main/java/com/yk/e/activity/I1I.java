package com.yk.e.activity;

import android.view.View;
import android.widget.Toast;
import com.yk.e.MainSDK;
import com.yk.e.util.AppUtil;
import com.yk.e.util.Constant;
import com.yk.e.util.FileLoader;
import com.yk.e.util.StringUtil;
import i.d;

/* JADX INFO: loaded from: classes4.dex */
public final class I1I implements View.OnClickListener {
    public final /* synthetic */ RewardWebActivity IL1Iii;

    public I1I(RewardWebActivity rewardWebActivity) {
        this.IL1Iii = rewardWebActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RewardWebActivity rewardWebActivity = this.IL1Iii;
        int i10 = rewardWebActivity.f3314iILLL1;
        if (i10 == 0) {
            RewardWebActivity.IL1Iii(rewardWebActivity, rewardWebActivity.ILL.clickUrl);
        } else if (i10 != 1) {
            if (i10 == 2) {
                if (StringUtil.gotoProtocol(rewardWebActivity, rewardWebActivity.ILL.clickUrl)) {
                    RewardWebActivity rewardWebActivity2 = this.IL1Iii;
                    rewardWebActivity2.getClass();
                    d dVar = new d();
                    dVar.f54020a = rewardWebActivity2.f3319il.adPlcID;
                    dVar.f54021b = 3;
                    dVar.f54022c = rewardWebActivity2.Ilil;
                    dVar.f54025f = 7;
                    MainSDK.getInstance().statAd(dVar);
                } else {
                    RewardWebActivity rewardWebActivity3 = this.IL1Iii;
                    RewardWebActivity.IL1Iii(rewardWebActivity3, rewardWebActivity3.ILL.webUrl);
                }
            }
        } else if (StringUtil.isAppInstalled(rewardWebActivity, rewardWebActivity.f3311IiL)) {
            RewardWebActivity rewardWebActivity4 = this.IL1Iii;
            StringUtil.openApp(rewardWebActivity4, rewardWebActivity4.f3311IiL);
        } else {
            RewardWebActivity rewardWebActivity5 = this.IL1Iii;
            if (FileLoader.isApkVaild(rewardWebActivity5, rewardWebActivity5.ILL.clickUrl)) {
                RewardWebActivity rewardWebActivity6 = this.IL1Iii;
                AppUtil.installApk(this.IL1Iii, FileLoader.getPathByUrl(rewardWebActivity6, rewardWebActivity6.ILL.clickUrl));
            } else {
                if (Constant.fileLoadRunning(this.IL1Iii.ILL.clickUrl)) {
                    RewardWebActivity rewardWebActivity7 = this.IL1Iii;
                    Toast.makeText(rewardWebActivity7, rewardWebActivity7.getString("main_has_start_downLoad"), 1).show();
                    return;
                }
                this.IL1Iii.getClass();
            }
        }
        this.IL1Iii.f3312Ll1.onAdClick();
    }
}
