package com.fyber.inneractive.sdk.mraid;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends e {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        String str = (String) this.f15974b.get(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        if (TextUtils.isEmpty(str)) {
            this.f15975c.a(k.PLAY_VIDEO, "Video can't be played with null or empty URL");
            return;
        }
        j1 j1Var = ((IAmraidWebViewController) this.f15975c).f18687g;
        if (j1Var != null) {
            ((com.fyber.inneractive.sdk.web.b0) j1Var).a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.f15974b.get(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
    }

    public r(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
