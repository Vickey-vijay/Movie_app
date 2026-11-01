package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import yads.pf1;

/* JADX INFO: loaded from: classes11.dex */
public final class pf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv f81394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53 f81395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf1 f81396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f81397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f81398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f81399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81400g;

    public pf1(Looper looper, xv xvVar, nf1 nf1Var) {
        this(new CopyOnWriteArraySet(), looper, xvVar, nf1Var);
    }

    public final void a() {
        if (this.f81399f.isEmpty()) {
            return;
        }
        if (!this.f81395b.f78499a.hasMessages(0)) {
            i53 i53Var = this.f81395b;
            i53Var.getClass();
            h53 h53VarA = i53.a();
            Message messageObtainMessage = i53Var.f78499a.obtainMessage(0);
            h53VarA.f78073a = messageObtainMessage;
            Handler handler = i53Var.f78499a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            h53VarA.a();
        }
        boolean z10 = !this.f81398e.isEmpty();
        this.f81398e.addAll(this.f81399f);
        this.f81399f.clear();
        if (z10) {
            return;
        }
        while (!this.f81398e.isEmpty()) {
            ((Runnable) this.f81398e.peekFirst()).run();
            this.f81398e.removeFirst();
        }
    }

    public pf1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xv xvVar, nf1 nf1Var) {
        this.f81394a = xvVar;
        this.f81397d = copyOnWriteArraySet;
        this.f81396c = nf1Var;
        this.f81398e = new ArrayDeque();
        this.f81399f = new ArrayDeque();
        this.f81395b = ((f53) xvVar).a(looper, new Handler.Callback() { // from class: cp.e8
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f51308b.a(message);
            }
        });
    }

    public final boolean a(Message message) {
        for (of1 of1Var : this.f81397d) {
            nf1 nf1Var = this.f81396c;
            if (!of1Var.f81029d && of1Var.f81028c) {
                dw0 dw0VarA = of1Var.f81027b.a();
                of1Var.f81027b = new cw0();
                of1Var.f81028c = false;
                nf1Var.a(of1Var.f81026a, dw0VarA);
            }
            if (this.f81395b.f78499a.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, mf1 mf1Var) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            of1 of1Var = (of1) it.next();
            if (!of1Var.f81029d) {
                if (i10 != -1) {
                    of1Var.f81027b.a(i10);
                }
                of1Var.f81028c = true;
                mf1Var.invoke(of1Var.f81026a);
            }
        }
    }

    public final void a(final int i10, final mf1 mf1Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f81397d);
        this.f81399f.add(new Runnable() { // from class: cp.d8
            @Override // java.lang.Runnable
            public final void run() {
                pf1.a(copyOnWriteArraySet, i10, mf1Var);
            }
        });
    }
}
