package m7;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.List;

/* JADX INFO: compiled from: MessageSnapshotGate.java */
/* JADX INFO: loaded from: classes2.dex */
public class b0 implements s7.c.b {
    public final boolean a(List<a.b> list, MessageSnapshot messageSnapshot) {
        boolean zI;
        if (list.size() > 1 && messageSnapshot.getStatus() == -3) {
            for (a.b bVar : list) {
                synchronized (bVar.k()) {
                    if (bVar.D().n(messageSnapshot)) {
                        w7.d.a(this, "updateMoreLikelyCompleted", new Object[0]);
                        return true;
                    }
                }
            }
        }
        for (a.b bVar2 : list) {
            synchronized (bVar2.k()) {
                if (bVar2.D().k(messageSnapshot)) {
                    w7.d.a(this, "updateKeepFlow", new Object[0]);
                    return true;
                }
            }
        }
        if (-4 == messageSnapshot.getStatus()) {
            for (a.b bVar3 : list) {
                synchronized (bVar3.k()) {
                    if (bVar3.D().l(messageSnapshot)) {
                        w7.d.a(this, "updateSampleFilePathTaskRunning", new Object[0]);
                        return true;
                    }
                }
            }
        }
        if (list.size() != 1) {
            return false;
        }
        a.b bVar4 = list.get(0);
        synchronized (bVar4.k()) {
            w7.d.a(this, "updateKeepAhead", new Object[0]);
            zI = bVar4.D().i(messageSnapshot);
        }
        return zI;
    }

    @Override // s7.c.b
    public void i(MessageSnapshot messageSnapshot) {
        synchronized (Integer.toString(messageSnapshot.g()).intern()) {
            List<a.b> listF = h.e().f(messageSnapshot.g());
            if (listF.size() > 0) {
                a origin = listF.get(0).getOrigin();
                if (w7.d.f73535a) {
                    w7.d.a(this, "~~~callback %s old[%s] new[%s] %d", Integer.valueOf(messageSnapshot.g()), Byte.valueOf(origin.getStatus()), Byte.valueOf(messageSnapshot.getStatus()), Integer.valueOf(listF.size()));
                }
                if (!a(listF, messageSnapshot)) {
                    StringBuilder sb2 = new StringBuilder("The event isn't consumed, id:" + messageSnapshot.g() + " status:" + ((int) messageSnapshot.getStatus()) + " task-count:" + listF.size());
                    for (a.b bVar : listF) {
                        sb2.append(" | ");
                        sb2.append((int) bVar.getOrigin().getStatus());
                    }
                    w7.d.e(this, sb2.toString(), new Object[0]);
                }
            } else {
                w7.d.e(this, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(messageSnapshot.getStatus()));
            }
        }
    }
}
