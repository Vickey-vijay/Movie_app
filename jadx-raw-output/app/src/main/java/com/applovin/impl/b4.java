package com.applovin.impl;

import android.os.Process;
import androidx.core.util.Consumer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f7022a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7023b;

    public static class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue f7024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f7025b;

        private void a() {
            b((c) this.f7024a.take());
        }

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f7024a = blockingQueue;
            this.f7025b = kVar;
            setPriority(((Integer) kVar.a(x4.S)).intValue());
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0123 */
        /* JADX WARN: Code duplicated, block: B:100:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x00ec A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #8 {all -> 0x018d, blocks: (B:57:0x00d4, B:59:0x00ec, B:83:0x0129), top: B:105:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0158  */
        /* JADX WARN: Code duplicated, block: B:96:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(final com.applovin.impl.b4.c r20) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.b.b(com.applovin.impl.b4$c):void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f7032f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f7027a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f7028b);
            httpURLConnection.setConnectTimeout(cVar.f7031e);
            httpURLConnection.setReadTimeout(cVar.f7031e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f7029c.isEmpty()) {
                for (Map.Entry entry : cVar.f7029c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f7026i = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f7029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f7030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Consumer f7032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f7033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7034h;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f7035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f7036b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map f7037c = new HashMap();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private byte[] f7038d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f7039e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Consumer f7040f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f7041g;

            public a a(String str) {
                this.f7035a = str;
                return this;
            }

            public a b(String str) {
                this.f7036b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f7037c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f7037c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f7038d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f7039e = i10;
                return this;
            }

            public a a(Consumer consumer) {
                this.f7040f = consumer;
                return this;
            }

            public a a(Executor executor) {
                this.f7041g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        private c(a aVar) {
            this.f7027a = aVar.f7035a;
            this.f7028b = aVar.f7036b;
            this.f7029c = aVar.f7037c != null ? aVar.f7037c : Collections.emptyMap();
            this.f7030d = aVar.f7038d;
            this.f7031e = aVar.f7039e;
            this.f7032f = aVar.f7040f;
            this.f7033g = aVar.f7041g;
            this.f7034h = f7026i.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f7034h - cVar.f7034h;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f7043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f7044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f7045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f7046e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f7047a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f7048b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f7049c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f7050d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Throwable f7051e;

            public a a(int i10) {
                this.f7047a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f7049c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f7048b = bArr;
                return this;
            }

            public a a(Throwable th2) {
                this.f7051e = th2;
                return this;
            }

            public a a(long j10) {
                this.f7050d = j10;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            this.f7042a = aVar.f7047a;
            this.f7043b = aVar.f7048b;
            this.f7044c = aVar.f7049c;
            this.f7045d = aVar.f7050d;
            this.f7046e = aVar.f7051e;
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f7042a;
        }

        public int c() throws Throwable {
            Throwable th2 = this.f7046e;
            if (th2 == null) {
                return this.f7042a;
            }
            throw th2;
        }

        public byte[] d() throws Throwable {
            Throwable th2 = this.f7046e;
            if (th2 == null) {
                return this.f7043b;
            }
            throw th2;
        }

        public long e() {
            return this.f7045d;
        }

        public byte[] f() {
            return this.f7044c;
        }
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f7023b.a(x4.R)).intValue(); i10++) {
            new b(this.f7022a, i10, this.f7023b).start();
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f7023b = kVar;
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f7022a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
