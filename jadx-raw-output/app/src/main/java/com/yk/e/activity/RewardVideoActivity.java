package com.yk.e.activity;

import android.os.Bundle;
import android.view.View;
import com.yk.e.callBack.MainVideoAdCallBack;
import com.yk.e.object.SendLoader;
import com.yk.e.pl.OktVideoView;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.Constant;
import gl.c;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes11.dex */
public class RewardVideoActivity extends BaseVideoActivity {
    @Override // com.yk.e.activity.BaseVideoActivity
    public final void IL1Iii() {
        if (c.f53460b == null) {
            c.f53460b = new c();
        }
        c.f53460b.a(this, 3, this.f3284lL, this.ILil.adPlcID, true);
    }

    @Override // com.yk.e.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView("main_activity_reward_video");
        try {
            String stringExtra = getIntent().getStringExtra(VastAttributes.AD_ID);
            this.iIlLiL = stringExtra;
            SendLoader sendLoader = Constant.rewardVideoAdMap.get(stringExtra);
            this.ILil = sendLoader;
            if (sendLoader == null) {
                finish();
                AdLog.e("mainSendLoader is empty, adID" + this.iIlLiL);
                return;
            }
            Constant.rewardVideoAdMap.remove(this.iIlLiL);
            SendLoader sendLoader2 = this.ILil;
            this.f3284lL = sendLoader2.mainParams;
            this.I1I = (MainVideoAdCallBack) sendLoader2.mainAdCallBack;
            OktVideoView oktVideoView = sendLoader2.getOktVideoView();
            AdPlayer adPlayer = this.ILil.getAdPlayer();
            View rootView = this.ILil.getRootView();
            int i10 = this.ILil.orientation;
            this.I11L = i10;
            if (i10 == 1) {
                setRequestedOrientation(1);
            } else {
                setRequestedOrientation(0);
            }
            IL1Iii(adPlayer, rootView, oktVideoView);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
