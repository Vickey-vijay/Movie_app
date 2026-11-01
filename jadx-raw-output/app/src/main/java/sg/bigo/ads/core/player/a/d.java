package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServerSocket f71763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71764c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f71767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f71768g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f71765d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.common.n.e f71762a = new sg.bigo.ads.common.n.e("Play", 3, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, e> f71766e = new ConcurrentHashMap();

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Socket f71770b;

        public a(Socket socket) {
            this.f71770b = socket;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 20, insn: 0x022e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:92:0x022e */
        /* JADX WARN: Not initialized variable reg: 20, insn: 0x0235: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:96:0x0235 */
        /* JADX WARN: Not initialized variable reg: 20, insn: 0x0238: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:97:0x0238 */
        /* JADX WARN: Type inference failed for: r1v0, types: [sg.bigo.ads.core.player.a.d$a] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v19 */
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            String str;
            String str2;
            Object obj;
            String str3;
            String str4;
            e eVar;
            long j10;
            String str5;
            String strA;
            String str6 = this;
            String str7 = "Opened connections: ";
            d dVar = d.this;
            Socket socket = str6.f71770b;
            try {
                try {
                    try {
                        sg.bigo.ads.core.player.a.b bVarA = sg.bigo.ads.core.player.a.b.a(socket.getInputStream());
                        if (bVarA == null) {
                            d.a(socket);
                            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
                            return;
                        }
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Request to cache proxy:request=".concat(String.valueOf(bVarA)));
                        String strF = q.f(bVarA.f71758a);
                        if (!"ping".equals(strF)) {
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    final e eVarA = dVar.a(strF);
                                    try {
                                        if (eVarA.a()) {
                                            try {
                                                if (SystemClock.elapsedRealtime() - eVarA.f71777e > 300000) {
                                                    int andSet = eVarA.f71778f.getAndSet(0);
                                                    eVarA.f71777e = SystemClock.elapsedRealtime();
                                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "reset resetRetryCount=".concat(String.valueOf(andSet)));
                                                }
                                                eVarA.f71773a.incrementAndGet();
                                                if (eVarA.f71775c != null) {
                                                    if (!(eVarA.f71775c.f69668j == 1) && !eVarA.f71775c.b() && SystemClock.elapsedRealtime() - eVarA.f71776d > 15000 && eVarA.f71778f.getAndIncrement() < 3) {
                                                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "keepDownloadTaskAlive retryCount=" + eVarA.f71778f.get());
                                                        eVarA.f71776d = SystemClock.elapsedRealtime();
                                                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.e.1
                                                            public AnonymousClass1() {
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                sg.bigo.ads.core.player.b.a().f71803g.a(e.this.f71775c, true);
                                                            }
                                                        });
                                                    }
                                                }
                                                c cVar = eVarA.f71774b;
                                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                                                String strF2 = q.f(bVarA.f71758a);
                                                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(strF2);
                                                String mimeTypeFromExtension = TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                                                boolean z10 = !TextUtils.isEmpty(mimeTypeFromExtension);
                                                long jA = cVar.f71761a.c() ? cVar.f71761a.a() : cVar.f71761a.f71754b.f69667i;
                                                boolean z11 = jA >= 0;
                                                boolean z12 = bVarA.f71760c;
                                                if (z12) {
                                                    eVar = eVarA;
                                                    try {
                                                        j10 = jA - bVarA.f71759b;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        eVar.b();
                                                        throw th;
                                                    }
                                                } else {
                                                    eVar = eVarA;
                                                    j10 = jA;
                                                }
                                                boolean z13 = z11 && z12;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(bVarA.f71760c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                                                sb2.append("Accept-Ranges: bytes\n");
                                                if (z11) {
                                                    str5 = "";
                                                    try {
                                                        strA = c.a("Content-Length: %d\n", Long.valueOf(j10));
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        eVar.b();
                                                        throw th;
                                                    }
                                                } else {
                                                    str5 = "";
                                                    strA = str5;
                                                }
                                                sb2.append(strA);
                                                sb2.append(z13 ? c.a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(bVarA.f71759b), Long.valueOf(jA - 1), Long.valueOf(jA)) : str5);
                                                sb2.append(z10 ? c.a("Content-Type: %s\n", mimeTypeFromExtension) : str5);
                                                sb2.append("\n");
                                                String string = sb2.toString();
                                                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "newResponseHeaders =".concat(String.valueOf(string)));
                                                bufferedOutputStream.write(string.getBytes("UTF-8"));
                                                cVar.a(bufferedOutputStream, bVarA.f71759b);
                                                eVar.b();
                                            } catch (Throwable th4) {
                                                th = th4;
                                                eVar = eVarA;
                                            }
                                        } else {
                                            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "startProcessRequest failed");
                                            eVarA.b();
                                        }
                                    } catch (SocketException unused) {
                                        str2 = str4;
                                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Closing socket… Socket is closed by client.");
                                        d.a(socket);
                                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str2 + dVar.b());
                                        return;
                                    } catch (IOException e10) {
                                        e = e10;
                                        str = str3;
                                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                        d.a(socket);
                                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar.b());
                                    } catch (j e11) {
                                        e = e11;
                                        str = str3;
                                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                        d.a(socket);
                                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar.b());
                                    } catch (Throwable th5) {
                                        th = th5;
                                        str6 = obj;
                                        d.a(socket);
                                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str6 + dVar.b());
                                        throw th;
                                    }
                                } catch (SocketException unused2) {
                                    str2 = "Opened connections: ";
                                } catch (IOException e12) {
                                    e = e12;
                                    str = "Opened connections: ";
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar.b());
                                } catch (j e13) {
                                    e = e13;
                                    str = "Opened connections: ";
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                    d.a(socket);
                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar.b());
                                } catch (Throwable th6) {
                                    th = th6;
                                    str6 = "Opened connections: ";
                                }
                            }
                            d.a(socket);
                            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str7 + dVar.b());
                        }
                        try {
                            OutputStream outputStream = socket.getOutputStream();
                            outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
                            outputStream.write("ping ok".getBytes());
                        } catch (IOException e14) {
                            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Pinger#responseToPing, error message is : " + e14.toString());
                        }
                        str7 = "Opened connections: ";
                        dVar = dVar;
                        d.a(socket);
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str7 + dVar.b());
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (SocketException unused3) {
                    str2 = "Opened connections: ";
                } catch (IOException e15) {
                    e = e15;
                    str = "Opened connections: ";
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                    d.a(socket);
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar.b());
                }
            } catch (j e16) {
                e = e16;
                str = "Opened connections: ";
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                d.a(socket);
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", str + dVar.b());
            } catch (Throwable th8) {
                th = th8;
                str6 = "Opened connections: ";
            }
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f71772b;

        public b(CountDownLatch countDownLatch) {
            this.f71772b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f71772b.countDown();
            d dVar = d.this;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket socketAccept = dVar.f71763b.accept();
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Accept new socket socket=".concat(String.valueOf(socketAccept)));
                    dVar.f71762a.submit(dVar.new a(socketAccept));
                } catch (Throwable th2) {
                    sg.bigo.ads.core.d.b.a(3005, 10111, th2.toString());
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error during waiting connection, error message is : " + th2.toString());
                    return;
                }
            }
        }
    }

    public d() {
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f71763b = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f71764c = localPort;
            f.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new b(countDownLatch));
            this.f71767f = thread;
            thread.setName("BGAd-Conn");
            this.f71767f.start();
            countDownLatch.await();
            this.f71768g = new h("127.0.0.1", this.f71764c);
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Proxy cache server started. Is it alive? " + a());
        } catch (IOException | InterruptedException e10) {
            this.f71762a.shutdown();
            sg.bigo.ads.core.d.b.a(3005, 10110, "Error starting local proxy server, error message is : " + e10.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error starting local proxy server, error message is : " + e10.toString());
        }
    }

    public static void a(Socket socket) {
        String str;
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException unused) {
            str = "Releasing input stream… Socket is closed by client.";
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        } catch (IOException e10) {
            str = "Error closing socket input stream, error message is " + e10.getMessage();
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        }
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e11) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Failed to close socket on proxy side: {}. It seems client have already closed connection." + e11.getMessage());
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e12) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing socket" + e12.getMessage());
        }
    }

    public final e a(String str) {
        e eVar;
        synchronized (this.f71765d) {
            eVar = this.f71766e.get(str);
            if (eVar == null) {
                eVar = new e(str);
                this.f71766e.put(str, eVar);
            }
        }
        return eVar;
    }

    public final boolean a() {
        h hVar = this.f71768g;
        return hVar != null && hVar.a();
    }

    public final int b() {
        int i10;
        synchronized (this.f71765d) {
            i10 = 0;
            Iterator<e> it = this.f71766e.values().iterator();
            while (it.hasNext()) {
                i10 += it.next().f71773a.get();
            }
        }
        return i10;
    }
}
