package com.yk.e.activity;

import android.view.View;
import com.yk.e.util.AdPlayer;

/* JADX INFO: loaded from: classes11.dex */
public final class ILil implements View.OnClickListener {
    public final /* synthetic */ BaseVideoActivity IL1Iii;

    public ILil(RewardVideoActivity rewardVideoActivity) {
        this.IL1Iii = rewardVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseVideoActivity baseVideoActivity = this.IL1Iii;
        boolean z10 = !baseVideoActivity.f3267IL;
        baseVideoActivity.f3267IL = z10;
        if (z10) {
            baseVideoActivity.f3283il.setImageResource(baseVideoActivity.getDrawable("main_ico_voice"));
            AdPlayer adPlayer = this.IL1Iii.baseAdPlayer;
            if (adPlayer != null) {
                adPlayer.hasVoice();
                return;
            }
            return;
        }
        baseVideoActivity.f3283il.setImageResource(baseVideoActivity.getDrawable("main_ico_no_voice"));
        AdPlayer adPlayer2 = this.IL1Iii.baseAdPlayer;
        if (adPlayer2 != null) {
            adPlayer2.noVoice();
        }
    }
}
