package gl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w1 f53604d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f53605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53606b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f53607c = new Handler(Looper.getMainLooper(), new w(this));

    public final void a(String str, r rVar) {
        if (rVar == null || this.f53606b) {
            return;
        }
        this.f53606b = true;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String str2 = str.equals("00000000-0000-0000-0000-000000000000") ? "" : str;
        Message messageObtainMessage = this.f53607c.obtainMessage();
        messageObtainMessage.obj = str2;
        messageObtainMessage.sendToTarget();
    }
}
