package com.yk.e.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.ironsource.Y5;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes6.dex */
public final class IL1Iii implements Handler.Callback {
    public final /* synthetic */ BaseVideoActivity IL1Iii;

    public IL1Iii(BaseVideoActivity baseVideoActivity) {
        this.IL1Iii = baseVideoActivity;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String stringExtra;
        Intent intent = (Intent) message.obj;
        if (intent != null) {
            try {
                if (intent.hasExtra(Y5.c.f27927a) && (stringExtra = intent.getStringExtra(Y5.c.f27927a)) != null && (stringExtra.equals(this.IL1Iii.f3284lL.clickUrl) || stringExtra.equals(this.IL1Iii.f3284lL.webUrl))) {
                    if (intent.hasExtra("progress")) {
                        if (Constant.fileLoadRunning(stringExtra)) {
                            int intExtra = intent.getIntExtra("progress", 0);
                            this.IL1Iii.ILL.setText(intExtra + "%");
                            this.IL1Iii.f3280llL1ii.setText(intExtra + "%");
                            if (intExtra == 100) {
                                BaseVideoActivity baseVideoActivity = this.IL1Iii;
                                baseVideoActivity.ILL.setText(baseVideoActivity.getString("main_install"));
                                BaseVideoActivity baseVideoActivity2 = this.IL1Iii;
                                baseVideoActivity2.f3280llL1ii.setText(baseVideoActivity2.getString("main_install_now"));
                            }
                        }
                    } else if (intent.hasExtra("downLoadFail")) {
                        BaseVideoActivity baseVideoActivity3 = this.IL1Iii;
                        baseVideoActivity3.ILL.setText(baseVideoActivity3.getString("main_downLoad"));
                        BaseVideoActivity baseVideoActivity4 = this.IL1Iii;
                        baseVideoActivity4.f3280llL1ii.setText(baseVideoActivity4.getString("main_downLoad_now"));
                    }
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
        return false;
    }
}
