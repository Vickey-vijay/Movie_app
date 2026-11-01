package po;

import po.k;

/* JADX INFO: compiled from: StreamClient.java */
/* JADX INFO: loaded from: classes11.dex */
public interface j<C extends k> {
    org.fourthline.cling.model.message.c a(org.fourthline.cling.model.message.b bVar) throws InterruptedException;

    C getConfiguration();

    void stop();
}
