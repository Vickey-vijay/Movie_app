package m7;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FileDownloadMessenger.java */
/* JADX INFO: loaded from: classes8.dex */
public class k implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.b f64229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.d f64230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Queue<MessageSnapshot> f64231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64232d = false;

    public String toString() {
        Object[] objArr = new Object[2];
        a.b bVar = this.f64229a;
        objArr[0] = Integer.valueOf(bVar == null ? -1 : bVar.getOrigin().getId());
        objArr[1] = super.toString();
        return w7.f.o("%d:%s", objArr);
    }

    @Override // m7.u
    public void a(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify pending %s", this.f64229a);
        }
        this.f64230b.g();
        q(messageSnapshot);
    }

    @Override // m7.u
    public void b(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify started %s", this.f64229a);
        }
        this.f64230b.g();
        q(messageSnapshot);
    }

    @Override // m7.u
    public void c(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify paused %s", this.f64229a);
        }
        this.f64230b.h();
        q(messageSnapshot);
    }

    @Override // m7.u
    public void d(MessageSnapshot messageSnapshot) {
        a origin = this.f64229a.getOrigin();
        if (w7.d.f73535a) {
            w7.d.a(this, "notify progress %s %d %d", origin, Long.valueOf(origin.p()), Long.valueOf(origin.r()));
        }
        if (origin.l() > 0) {
            this.f64230b.g();
            q(messageSnapshot);
        } else if (w7.d.f73535a) {
            w7.d.a(this, "notify progress but client not request notify %s", this.f64229a);
        }
    }

    @Override // m7.u
    public boolean e() {
        return this.f64231c.peek().getStatus() == 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.u
    public void f() {
        if (this.f64232d) {
            return;
        }
        MessageSnapshot messageSnapshotPoll = this.f64231c.poll();
        byte status = messageSnapshotPoll.getStatus();
        a.b bVar = this.f64229a;
        if (bVar == null) {
            throw new IllegalArgumentException(w7.f.o("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(status), Integer.valueOf(this.f64231c.size())));
        }
        a origin = bVar.getOrigin();
        i listener = origin.getListener();
        y.a aVarD = bVar.D();
        o(status);
        if (listener == null || listener.isInvalid()) {
            return;
        }
        if (status == 4) {
            try {
                listener.blockComplete(origin);
                p(((BlockCompleteMessage) messageSnapshotPoll).d());
                return;
            } catch (Throwable th2) {
                h(aVarD.e(th2));
                return;
            }
        }
        g gVar = listener instanceof g ? (g) listener : null;
        if (status == -4) {
            listener.warn(origin);
            return;
        }
        if (status == -3) {
            listener.completed(origin);
            return;
        }
        if (status == -2) {
            if (gVar != null) {
                gVar.b(origin, messageSnapshotPoll.h(), messageSnapshotPoll.i());
                return;
            } else {
                listener.paused(origin, messageSnapshotPoll.k(), messageSnapshotPoll.l());
                return;
            }
        }
        if (status == -1) {
            listener.error(origin, messageSnapshotPoll.m());
            return;
        }
        if (status == 1) {
            if (gVar != null) {
                gVar.c(origin, messageSnapshotPoll.h(), messageSnapshotPoll.i());
                return;
            } else {
                listener.pending(origin, messageSnapshotPoll.k(), messageSnapshotPoll.l());
                return;
            }
        }
        if (status == 2) {
            if (gVar != null) {
                gVar.a(origin, messageSnapshotPoll.e(), messageSnapshotPoll.o(), origin.p(), messageSnapshotPoll.i());
                return;
            } else {
                listener.connected(origin, messageSnapshotPoll.e(), messageSnapshotPoll.o(), origin.y(), messageSnapshotPoll.l());
                return;
            }
        }
        if (status == 3) {
            if (gVar != null) {
                gVar.d(origin, messageSnapshotPoll.h(), origin.r());
                return;
            } else {
                listener.progress(origin, messageSnapshotPoll.k(), origin.u());
                return;
            }
        }
        if (status != 5) {
            if (status != 6) {
                return;
            }
            listener.started(origin);
        } else if (gVar != null) {
            gVar.e(origin, messageSnapshotPoll.m(), messageSnapshotPoll.j(), messageSnapshotPoll.h());
        } else {
            listener.retry(origin, messageSnapshotPoll.m(), messageSnapshotPoll.j(), messageSnapshotPoll.k());
        }
    }

    @Override // m7.u
    public boolean g() {
        return this.f64229a.getOrigin().t();
    }

    @Override // m7.u
    public void h(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            a.b bVar = this.f64229a;
            w7.d.a(this, "notify error %s %s", bVar, bVar.getOrigin().a());
        }
        this.f64230b.h();
        q(messageSnapshot);
    }

    @Override // m7.u
    public void i(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            a origin = this.f64229a.getOrigin();
            w7.d.a(this, "notify retry %s %d %d %s", this.f64229a, Integer.valueOf(origin.j()), Integer.valueOf(origin.d()), origin.a());
        }
        this.f64230b.g();
        q(messageSnapshot);
    }

    @Override // m7.u
    public void j(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify connected %s", this.f64229a);
        }
        this.f64230b.g();
        q(messageSnapshot);
    }

    @Override // m7.u
    public boolean k() {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify begin %s", this.f64229a);
        }
        if (this.f64229a == null) {
            w7.d.i(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.f64231c.size()));
            return false;
        }
        this.f64230b.onBegin();
        return true;
    }

    @Override // m7.u
    public void l(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify warn %s", this.f64229a);
        }
        this.f64230b.h();
        q(messageSnapshot);
    }

    @Override // m7.u
    public void m(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify block completed %s %s", this.f64229a, Thread.currentThread().getName());
        }
        this.f64230b.g();
        q(messageSnapshot);
    }

    public final void n(a.b bVar, a.d dVar) {
        this.f64229a = bVar;
        this.f64230b = dVar;
        this.f64231c = new LinkedBlockingQueue();
    }

    public void p(MessageSnapshot messageSnapshot) {
        if (w7.d.f73535a) {
            w7.d.a(this, "notify completed %s", this.f64229a);
        }
        this.f64230b.h();
        q(messageSnapshot);
    }

    public final void q(MessageSnapshot messageSnapshot) {
        a.b bVar = this.f64229a;
        if (bVar == null) {
            if (w7.d.f73535a) {
                w7.d.a(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus()));
            }
        } else {
            if (!this.f64232d && bVar.getOrigin().getListener() != null) {
                this.f64231c.offer(messageSnapshot);
                j.d().i(this);
                return;
            }
            if ((l.b() || this.f64229a.I()) && messageSnapshot.getStatus() == 4) {
                this.f64230b.h();
            }
            o(messageSnapshot.getStatus());
        }
    }

    public k(a.b bVar, a.d dVar) {
        n(bVar, dVar);
    }

    public final void o(int i10) {
        if (t7.b.e(i10)) {
            if (!this.f64231c.isEmpty()) {
                MessageSnapshot messageSnapshotPeek = this.f64231c.peek();
                w7.d.i(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(messageSnapshotPeek.g()), Integer.valueOf(this.f64231c.size()), Byte.valueOf(messageSnapshotPeek.getStatus()));
            }
            this.f64229a = null;
        }
    }
}
