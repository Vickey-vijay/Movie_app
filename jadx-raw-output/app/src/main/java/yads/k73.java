package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class k73 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c92 f79325a;

    public final boolean a() {
        return hasMessages(2);
    }

    public final void b() {
        removeMessages(2);
        removeMessages(1);
    }

    public final void a(c83 c83Var, tw1 tw1Var, rb3 rb3Var) {
        long jElapsedRealtime;
        Long l10 = c83Var.f76213e;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            c83Var.f76213e = Long.valueOf(jElapsedRealtime);
        }
        if (SystemClock.elapsedRealtime() - jElapsedRealtime >= c83Var.f76210b) {
            sendMessage(Message.obtain(this, 1, new j73(new WeakReference(tw1Var), c83Var, rb3Var)));
        }
        if (!tw1Var.f83226k) {
            tw1Var.f83226k = true;
            d61 d61Var = tw1Var.f83225j;
            if (d61Var != null) {
                d61Var.c();
            }
        }
        this.f79325a.a(c83Var.f76212d, rb3Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            Object obj = message.obj;
            ck.p.h(obj, "null cannot be cast to non-null type com.monetization.ads.base.impression.tracking.handler.TrackHandler.TrackNoticeObject");
            j73 j73Var = (j73) obj;
            tw1 tw1Var = (tw1) j73Var.f78930a.get();
            if (tw1Var != null) {
                boolean z10 = ad1.f75480a;
                c83 c83Var = j73Var.f78931b;
                za.a(tw1Var.f83221f, c83Var.f76209a, k83.f79336h);
                tw1Var.f83228m.remove(c83Var);
                if (!tw1Var.f83227l && tw1Var.f83228m.isEmpty()) {
                    tw1Var.f83227l = true;
                    d61 d61Var = tw1Var.f83225j;
                    if (d61Var != null) {
                        d61Var.g();
                    }
                }
                c92 c92Var = this.f79325a;
                qy2 qy2Var = j73Var.f78931b.f76212d;
                List listO0 = nj.b0.O0(tw1Var.f83228m);
                ArrayList arrayList = new ArrayList(nj.t.v(listO0, 10));
                Iterator it = listO0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c83) it.next()).f76212d);
                }
                c92Var.a(qy2Var, arrayList, j73Var.f78932c);
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        Object obj2 = message.obj;
        ck.p.h(obj2, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
        tw1 tw1Var2 = (tw1) ((WeakReference) obj2).get();
        if (tw1Var2 != null) {
            List<c83> listO1 = nj.b0.O0(tw1Var2.f83228m);
            listO1.size();
            boolean z11 = ad1.f75480a;
            int i11 = Integer.MIN_VALUE;
            for (c83 c83Var2 : listO1) {
                if (c83Var2.f76211c > i11) {
                    tb3 tb3VarB = tw1Var2.b(c83Var2);
                    if (tb3VarB instanceof rb3) {
                        i11 = c83Var2.f76211c;
                        a(c83Var2, tw1Var2, (rb3) tb3VarB);
                    } else if (tb3VarB instanceof qb3) {
                        c83Var2.f76213e = null;
                        this.f79325a.a(c83Var2.f76212d, (qb3) tb3VarB);
                    }
                } else {
                    a(c83Var2, tw1Var2, new rb3(nj.s.k()));
                }
            }
            if (!listO1.isEmpty()) {
                sendMessageDelayed(Message.obtain(this, 2, new WeakReference(tw1Var2)), 200L);
            }
        }
    }

    public k73(c92 c92Var, Looper looper) {
        super(looper);
        this.f79325a = c92Var;
    }

    public final void a(f92 f92Var) {
        sendMessage(Message.obtain(this, 2, new WeakReference(f92Var)));
    }
}
