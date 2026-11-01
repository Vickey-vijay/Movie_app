package org.eclipse.jetty.io.nio;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.Channel;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import mm.i;
import mm.j;
import mm.k;
import xm.p;
import ym.e;

/* JADX INFO: compiled from: SelectorManager.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends ym.a implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zm.c f65628s = zm.b.b("org.eclipse.jetty.io.nio");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f65629t = Integer.getInteger("org.eclipse.jetty.io.nio.MONITOR_PERIOD", 1000).intValue();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f65630u = Integer.getInteger("org.eclipse.jetty.io.nio.MAX_SELECTS", 100000).intValue();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f65631v = Integer.getInteger("org.eclipse.jetty.io.nio.BUSY_PAUSE", 50).intValue();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f65632w = Integer.getInteger("org.eclipse.jetty.io.nio.IDLE_TICK", 400).intValue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f65633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f65634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f65635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d[] f65636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f65637o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile int f65638p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f65639q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f65640r = 0;

    /* JADX INFO: compiled from: SelectorManager.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f65641b;

        public a(int i10) {
            this.f65641b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();
            try {
                d[] dVarArr = b.this.f65636n;
                if (dVarArr == null) {
                    b.f65628s.i("Stopped {} on {}", Thread.currentThread(), this);
                    Thread.currentThread().setName(name);
                    if (b.this.z0() != 0) {
                        Thread.currentThread().setPriority(priority);
                        return;
                    }
                    return;
                }
                d dVar = dVarArr[this.f65641b];
                Thread.currentThread().setName(name + " Selector" + this.f65641b);
                if (b.this.z0() != 0) {
                    Thread.currentThread().setPriority(Thread.currentThread().getPriority() + b.this.z0());
                }
                b.f65628s.i("Starting {} on {}", Thread.currentThread(), this);
                while (b.this.isRunning()) {
                    try {
                        dVar.h();
                    } catch (IOException e10) {
                        b.f65628s.h(e10);
                    } catch (Exception e11) {
                        b.f65628s.e(e11);
                    }
                }
                b.f65628s.i("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (b.this.z0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
            } catch (Throwable th2) {
                b.f65628s.i("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (b.this.z0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: org.eclipse.jetty.io.nio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SelectorManager.java */
    public interface InterfaceRunnableC0608b extends Runnable {
    }

    /* JADX INFO: compiled from: SelectorManager.java */
    public class d implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final en.e f65646c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile Selector f65648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Thread f65649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f65650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f65651h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f65652i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f65653j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Object> f65647d = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ConcurrentMap<SelectChannelEndPoint, Object> f65655l = new ConcurrentHashMap();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile long f65654k = System.currentTimeMillis();

        /* JADX INFO: compiled from: SelectorManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f65657b;

            public a(long j10) {
                this.f65657b = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = d.this.f65655l.keySet().iterator();
                while (it.hasNext()) {
                    ((SelectChannelEndPoint) it.next()).B(this.f65657b);
                }
            }

            public String toString() {
                return "Idle-" + super.toString();
            }
        }

        /* JADX INFO: renamed from: org.eclipse.jetty.io.nio.b$d$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SelectorManager.java */
        public class C0609b implements InterfaceRunnableC0608b {
            public C0609b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.m();
            }
        }

        /* JADX INFO: compiled from: SelectorManager.java */
        public class c implements InterfaceRunnableC0608b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArrayList f65660b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f65661c;

            public c(ArrayList arrayList, CountDownLatch countDownLatch) {
                this.f65660b = arrayList;
                this.f65661c = countDownLatch;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.i(this.f65660b);
                this.f65661c.countDown();
            }
        }

        /* JADX WARN: Code duplicated, block: B:215:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:228:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: all -> 0x02d3, CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, TryCatch #16 {CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:50:0x00a9, B:52:0x00b1, B:55:0x00be, B:58:0x00c3, B:53:0x00b7, B:60:0x00ca, B:62:0x00d2, B:64:0x00df, B:66:0x00e9, B:68:0x00ed, B:72:0x00fc, B:73:0x0100, B:75:0x0113, B:87:0x012c, B:89:0x013e, B:91:0x0145, B:93:0x0150, B:95:0x0156, B:71:0x00f7, B:96:0x0163, B:98:0x0167, B:101:0x016f, B:102:0x0177, B:104:0x017d, B:142:0x0209, B:144:0x0211, B:147:0x021e, B:152:0x022a, B:154:0x0232, B:156:0x0238, B:150:0x0223, B:145:0x0217, B:158:0x023e, B:159:0x0245, B:161:0x025d, B:163:0x0261, B:164:0x0268, B:165:0x026f, B:167:0x027c, B:169:0x0288, B:171:0x029b, B:173:0x02ad, B:174:0x02b7, B:176:0x02bd, B:178:0x02c3), top: B:207:0x0001, outer: #7 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x02d3, CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, TRY_LEAVE, TryCatch #16 {CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:50:0x00a9, B:52:0x00b1, B:55:0x00be, B:58:0x00c3, B:53:0x00b7, B:60:0x00ca, B:62:0x00d2, B:64:0x00df, B:66:0x00e9, B:68:0x00ed, B:72:0x00fc, B:73:0x0100, B:75:0x0113, B:87:0x012c, B:89:0x013e, B:91:0x0145, B:93:0x0150, B:95:0x0156, B:71:0x00f7, B:96:0x0163, B:98:0x0167, B:101:0x016f, B:102:0x0177, B:104:0x017d, B:142:0x0209, B:144:0x0211, B:147:0x021e, B:152:0x022a, B:154:0x0232, B:156:0x0238, B:150:0x0223, B:145:0x0217, B:158:0x023e, B:159:0x0245, B:161:0x025d, B:163:0x0261, B:164:0x0268, B:165:0x026f, B:167:0x027c, B:169:0x0288, B:171:0x029b, B:173:0x02ad, B:174:0x02b7, B:176:0x02bd, B:178:0x02c3), top: B:207:0x0001, outer: #7 }] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void h() throws IOException {
            SocketChannel socketChannel;
            Object objPoll;
            Channel channelT;
            try {
                try {
                    this.f65649f = Thread.currentThread();
                    Selector selector = this.f65648e;
                    if (selector == null) {
                        this.f65649f = null;
                        return;
                    }
                    int size = this.f65647d.size();
                    while (true) {
                        int i10 = size - 1;
                        if (size <= 0 || (objPoll = this.f65647d.poll()) == null) {
                            break;
                        }
                        try {
                            try {
                                if (objPoll instanceof k) {
                                    SelectChannelEndPoint selectChannelEndPoint = (SelectChannelEndPoint) objPoll;
                                    channelT = selectChannelEndPoint.t();
                                    try {
                                        selectChannelEndPoint.C();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (b.this.isRunning()) {
                                            b.f65628s.e(th);
                                        } else {
                                            b.f65628s.a(th);
                                        }
                                        if (channelT != null) {
                                            try {
                                                channelT.close();
                                            } catch (IOException e10) {
                                                b.f65628s.a(e10);
                                            }
                                        }
                                    }
                                } else if (objPoll instanceof c) {
                                    c cVar = (c) objPoll;
                                    SelectableChannel selectableChannel = cVar.f65643a;
                                    try {
                                        Object obj = cVar.f65644b;
                                        if ((selectableChannel instanceof SocketChannel) && ((SocketChannel) selectableChannel).isConnected()) {
                                            SelectionKey selectionKeyRegister = selectableChannel.register(selector, 1, obj);
                                            SelectChannelEndPoint selectChannelEndPointF = f((SocketChannel) selectableChannel, selectionKeyRegister);
                                            selectionKeyRegister.attach(selectChannelEndPointF);
                                            selectChannelEndPointF.I();
                                        } else if (selectableChannel.isOpen()) {
                                            selectableChannel.register(selector, 8, obj);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        channelT = selectableChannel;
                                        if (b.this.isRunning()) {
                                            b.f65628s.e(th);
                                        } else {
                                            b.f65628s.a(th);
                                        }
                                        if (channelT != null) {
                                            channelT.close();
                                        }
                                    }
                                } else if (objPoll instanceof SocketChannel) {
                                    SocketChannel socketChannel2 = (SocketChannel) objPoll;
                                    try {
                                        SelectionKey selectionKeyRegister2 = socketChannel2.register(selector, 1, null);
                                        SelectChannelEndPoint selectChannelEndPointF2 = f(socketChannel2, selectionKeyRegister2);
                                        selectionKeyRegister2.attach(selectChannelEndPointF2);
                                        selectChannelEndPointF2.I();
                                    } catch (Throwable th4) {
                                        channelT = socketChannel2;
                                        th = th4;
                                        if (b.this.isRunning()) {
                                            b.f65628s.e(th);
                                        } else {
                                            b.f65628s.a(th);
                                        }
                                        if (channelT != null) {
                                            channelT.close();
                                        }
                                    }
                                } else if (objPoll instanceof InterfaceRunnableC0608b) {
                                    ((Runnable) objPoll).run();
                                } else {
                                    if (!(objPoll instanceof Runnable)) {
                                        throw new IllegalArgumentException(objPoll.toString());
                                    }
                                    b.this.Z((Runnable) objPoll);
                                }
                            } catch (CancelledKeyException e11) {
                                b.f65628s.h(e11);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            channelT = null;
                        }
                        size = i10;
                    }
                    int iSelectNow = selector.selectNow();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (iSelectNow == 0 && selector.selectedKeys().isEmpty()) {
                        if (this.f65652i) {
                            try {
                                Thread.sleep(b.f65631v);
                            } catch (InterruptedException e12) {
                                b.f65628s.h(e12);
                            }
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        this.f65646c.k(jCurrentTimeMillis);
                        long jF = this.f65646c.f();
                        long j10 = this.f65647d.size() == 0 ? b.f65632w : 0L;
                        if (j10 <= 0 || jF < 0 || j10 <= jF) {
                            jF = j10;
                        }
                        if (jF > 0) {
                            selector.select(jF);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            this.f65646c.k(jCurrentTimeMillis2);
                            if (b.f65629t > 0 && jCurrentTimeMillis2 - jCurrentTimeMillis <= 1) {
                                int i11 = this.f65650g + 1;
                                this.f65650g = i11;
                                if (i11 > b.f65630u) {
                                    this.f65652i = true;
                                    if (!this.f65653j) {
                                        this.f65653j = true;
                                        b.f65628s.g("Selector {} is too busy, pausing!", this);
                                    }
                                }
                            }
                        }
                    }
                    if (this.f65648e != null && selector.isOpen()) {
                        for (SelectionKey selectionKey : selector.selectedKeys()) {
                            try {
                                try {
                                    if (selectionKey.isValid()) {
                                        Object objAttachment = selectionKey.attachment();
                                        if (objAttachment instanceof SelectChannelEndPoint) {
                                            if (selectionKey.isReadable() || selectionKey.isWritable()) {
                                                ((SelectChannelEndPoint) objAttachment).I();
                                            }
                                        } else if (selectionKey.isConnectable()) {
                                            socketChannel = (SocketChannel) selectionKey.channel();
                                            try {
                                                try {
                                                    if (socketChannel.finishConnect()) {
                                                        try {
                                                            selectionKey.interestOps(1);
                                                            SelectChannelEndPoint selectChannelEndPointF3 = f(socketChannel, selectionKey);
                                                            selectionKey.attach(selectChannelEndPointF3);
                                                            selectChannelEndPointF3.I();
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            if (b.this.isRunning()) {
                                                                b.f65628s.e(e);
                                                            } else {
                                                                b.f65628s.h(e);
                                                            }
                                                            if (socketChannel != null) {
                                                                try {
                                                                    socketChannel.close();
                                                                } catch (IOException e14) {
                                                                    b.f65628s.a(e14);
                                                                }
                                                            }
                                                            if (selectionKey != null && !(selectionKey.channel() instanceof ServerSocketChannel) && selectionKey.isValid()) {
                                                                selectionKey.cancel();
                                                            }
                                                        }
                                                    } else {
                                                        selectionKey.cancel();
                                                        socketChannel.close();
                                                    }
                                                } catch (Exception e15) {
                                                    b.this.u0(socketChannel, e15, objAttachment);
                                                    selectionKey.cancel();
                                                }
                                            } catch (Throwable th6) {
                                                selectionKey.cancel();
                                                socketChannel.close();
                                                throw th6;
                                            }
                                        } else {
                                            SelectChannelEndPoint selectChannelEndPointF4 = f((SocketChannel) selectionKey.channel(), selectionKey);
                                            selectionKey.attach(selectChannelEndPointF4);
                                            if (selectionKey.isReadable()) {
                                                selectChannelEndPointF4.I();
                                            }
                                        }
                                    } else {
                                        selectionKey.cancel();
                                        SelectChannelEndPoint selectChannelEndPoint2 = (SelectChannelEndPoint) selectionKey.attachment();
                                        if (selectChannelEndPoint2 != null) {
                                            selectChannelEndPoint2.C();
                                        }
                                    }
                                } catch (CancelledKeyException e16) {
                                    b.f65628s.h(e16);
                                }
                            } catch (Exception e17) {
                                e = e17;
                                socketChannel = null;
                            }
                        }
                        selector.selectedKeys().clear();
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        this.f65646c.k(jCurrentTimeMillis3);
                        Object objC = this.f65646c.c();
                        while (objC != null) {
                            if (objC instanceof Runnable) {
                                b.this.Z((Runnable) objC);
                            }
                            objC = this.f65646c.c();
                        }
                        if (jCurrentTimeMillis3 - this.f65654k > b.f65632w) {
                            this.f65654k = jCurrentTimeMillis3;
                            b.this.Z(new a((b.this.f65635m <= 0 || ((long) selector.keys().size()) <= b.this.f65635m) ? jCurrentTimeMillis3 : (((long) b.this.f65633k) + jCurrentTimeMillis3) - ((long) b.this.f65634l)));
                        }
                        if (b.f65629t > 0 && jCurrentTimeMillis3 > this.f65651h) {
                            this.f65650g = 0;
                            this.f65652i = false;
                            this.f65651h = jCurrentTimeMillis3 + ((long) b.f65629t);
                        }
                        this.f65649f = null;
                        return;
                    }
                    this.f65649f = null;
                } catch (Throwable th7) {
                    this.f65649f = null;
                    throw th7;
                }
            } catch (CancelledKeyException e18) {
                b.f65628s.h(e18);
            } catch (ClosedSelectorException e19) {
                if (b.this.isRunning()) {
                    b.f65628s.e(e19);
                } else {
                    b.f65628s.h(e19);
                }
            }
        }

        public final void m() {
            try {
                synchronized (this) {
                    Selector selector = this.f65648e;
                    if (selector == null) {
                        return;
                    }
                    Selector selectorOpen = Selector.open();
                    for (SelectionKey selectionKey : selector.keys()) {
                        if (selectionKey.isValid() && selectionKey.interestOps() != 0) {
                            SelectableChannel selectableChannelChannel = selectionKey.channel();
                            Object objAttachment = selectionKey.attachment();
                            if (objAttachment == null) {
                                c(selectableChannelChannel);
                            } else {
                                d(selectableChannelChannel, objAttachment);
                            }
                        }
                    }
                    this.f65648e.close();
                    this.f65648e = selectorOpen;
                }
            } catch (IOException e10) {
                throw new RuntimeException("recreating selector", e10);
            }
        }

        public void o() throws Exception {
            for (int i10 = 0; i10 < 100; i10++) {
                try {
                    if (this.f65649f == null) {
                        break;
                    }
                    p();
                    Thread.sleep(10L);
                } catch (Exception e10) {
                    b.f65628s.h(e10);
                }
            }
            synchronized (this) {
                for (SelectionKey selectionKey : this.f65648e.keys()) {
                    if (selectionKey != null) {
                        Object objAttachment = selectionKey.attachment();
                        if (objAttachment instanceof k) {
                            try {
                                ((k) objAttachment).close();
                            } catch (IOException e11) {
                                b.f65628s.h(e11);
                            }
                        }
                    }
                }
                this.f65646c.b();
                try {
                    Selector selector = this.f65648e;
                    if (selector != null) {
                        selector.close();
                    }
                } catch (IOException e12) {
                    b.f65628s.h(e12);
                }
                this.f65648e = null;
            }
        }

        public d(int i10) throws Exception {
            this.f65645b = i10;
            en.e eVar = new en.e(this);
            this.f65646c = eVar;
            eVar.i(0L);
            this.f65648e = Selector.open();
            this.f65651h = System.currentTimeMillis() + ((long) b.f65629t);
        }

        public void c(Object obj) {
            this.f65647d.add(obj);
        }

        public void d(SelectableChannel selectableChannel, Object obj) {
            if (obj == null) {
                c(selectableChannel);
            } else if (obj instanceof k) {
                c(obj);
            } else {
                c(new c(selectableChannel, obj));
            }
        }

        public final SelectChannelEndPoint f(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
            SelectChannelEndPoint selectChannelEndPointC0 = b.this.C0(socketChannel, this, selectionKey);
            b.f65628s.i("created {}", selectChannelEndPointC0);
            b.this.w0(selectChannelEndPointC0);
            this.f65655l.put(selectChannelEndPointC0, this);
            return selectChannelEndPointC0;
        }

        public void g(SelectChannelEndPoint selectChannelEndPoint) {
            b.f65628s.i("destroyEndPoint {}", selectChannelEndPoint);
            this.f65655l.remove(selectChannelEndPoint);
            b.this.v0(selectChannelEndPoint);
        }

        public void i(List<Object> list) {
            Selector selector = this.f65648e;
            Set<SelectionKey> setKeys = selector.keys();
            list.add(selector + " keys=" + setKeys.size());
            for (SelectionKey selectionKey : setKeys) {
                if (selectionKey.isValid()) {
                    list.add(selectionKey.attachment() + " iOps=" + selectionKey.interestOps() + " rOps=" + selectionKey.readyOps());
                } else {
                    list.add(selectionKey.attachment() + " iOps=-1 rOps=-1");
                }
            }
        }

        public b j() {
            return b.this;
        }

        public long k() {
            return this.f65646c.e();
        }

        public Selector l() {
            return this.f65648e;
        }

        public void n(en.e.a aVar, long j10) {
            if (!(aVar instanceof Runnable)) {
                throw new IllegalArgumentException("!Runnable");
            }
            this.f65646c.h(aVar, j10);
        }

        public void p() {
            try {
                Selector selector = this.f65648e;
                if (selector != null) {
                    selector.wakeup();
                }
            } catch (Exception unused) {
                c(new C0609b());
                m();
            }
        }

        public String toString() {
            Selector selector = this.f65648e;
            Object[] objArr = new Object[3];
            objArr[0] = super.toString();
            int size = -1;
            objArr[1] = Integer.valueOf((selector == null || !selector.isOpen()) ? -1 : selector.keys().size());
            if (selector != null && selector.isOpen()) {
                size = selector.selectedKeys().size();
            }
            objArr[2] = Integer.valueOf(size);
            return String.format("%s keys=%d selected=%d", objArr);
        }

        public void e(en.e.a aVar) {
            aVar.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.StackTraceElement] */
        @Override // ym.e
        public void z(Appendable appendable, String str) throws IOException {
            ?? stackTrace;
            ?? r10;
            appendable.append(String.valueOf(this)).append(" id=").append(String.valueOf(this.f65645b)).append("\n");
            Thread thread = this.f65649f;
            if (thread == null) {
                stackTrace = 0;
            } else {
                stackTrace = thread.getStackTrace();
            }
            if (stackTrace != 0) {
                int length = stackTrace.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        r10 = stackTrace[i10];
                        if (r10.getClassName().startsWith("org.eclipse.jetty.")) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        r10 = "not selecting";
                        break;
                    }
                }
            } else {
                r10 = "not selecting";
                break;
            }
            Selector selector = this.f65648e;
            if (selector != null) {
                ArrayList arrayList = new ArrayList(selector.keys().size() * 2);
                arrayList.add(r10);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                c(new c(arrayList, countDownLatch));
                try {
                    countDownLatch.await(5L, TimeUnit.SECONDS);
                } catch (InterruptedException e10) {
                    b.f65628s.h(e10);
                }
                ym.b.p0(appendable, str, arrayList);
            }
        }
    }

    public abstract om.a B0(SocketChannel socketChannel, mm.c cVar, Object obj);

    public abstract SelectChannelEndPoint C0(SocketChannel socketChannel, d dVar, SelectionKey selectionKey) throws IOException;

    public abstract boolean Z(Runnable runnable);

    public abstract void v0(SelectChannelEndPoint selectChannelEndPoint);

    public abstract void w0(SelectChannelEndPoint selectChannelEndPoint);

    public abstract void x0(i iVar, j jVar);

    /* JADX INFO: compiled from: SelectorManager.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectableChannel f65643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f65644b;

        public c(SelectableChannel selectableChannel, Object obj) {
            this.f65643a = selectableChannel;
            this.f65644b = obj;
        }
    }

    public boolean A0() {
        return this.f65639q;
    }

    public void D0(SocketChannel socketChannel, Object obj) {
        int i10 = this.f65638p;
        this.f65638p = i10 + 1;
        if (i10 < 0) {
            i10 = -i10;
        }
        int i11 = i10 % this.f65637o;
        d[] dVarArr = this.f65636n;
        if (dVarArr != null) {
            d dVar = dVarArr[i11];
            dVar.d(socketChannel, obj);
            dVar.p();
        }
    }

    @Override // ym.a
    public void d0() throws Exception {
        this.f65636n = new d[this.f65637o];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f65636n;
            if (i10 >= dVarArr.length) {
                break;
            }
            dVarArr[i10] = new d(i10);
            i10++;
        }
        super.d0();
        for (int i11 = 0; i11 < y0(); i11++) {
            if (!Z(new a(i11))) {
                throw new IllegalStateException("!Selecting");
            }
        }
    }

    @Override // ym.a
    public void e0() throws Exception {
        d[] dVarArr = this.f65636n;
        this.f65636n = null;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.o();
                }
            }
        }
        super.e0();
    }

    public void u0(SocketChannel socketChannel, Throwable th2, Object obj) {
        zm.c cVar = f65628s;
        cVar.g(th2 + StringUtils.COMMA + socketChannel + StringUtils.COMMA + obj, new Object[0]);
        cVar.a(th2);
    }

    public int y0() {
        return this.f65637o;
    }

    public int z0() {
        return this.f65640r;
    }

    @Override // ym.e
    public void z(Appendable appendable, String str) throws IOException {
        ym.b.q0(appendable, this);
        ym.b.p0(appendable, str, p.a(this.f65636n));
    }
}
