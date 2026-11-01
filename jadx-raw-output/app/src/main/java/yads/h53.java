package yads;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class h53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f78073a;

    public final void a() {
        this.f78073a = null;
        ArrayList arrayList = i53.f78498b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f78073a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
