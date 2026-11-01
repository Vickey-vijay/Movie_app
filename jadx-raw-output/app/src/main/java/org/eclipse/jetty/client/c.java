package org.eclipse.jetty.client;

import im.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import javax.net.SocketFactory;
import mm.j;

/* JADX INFO: compiled from: SocketConnector.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends ym.a implements org.eclipse.jetty.client.a.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final zm.c f65529l = zm.b.a(c.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f65530k;

    /* JADX INFO: compiled from: SocketConnector.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ im.a f65531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HttpDestination f65532c;

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        j jVar = this.f65531b;
                        while (true) {
                            j jVarE = jVar.e();
                            if (jVarE == jVar) {
                                break;
                            } else {
                                jVar = jVarE;
                            }
                        }
                        this.f65532c.s(this.f65531b, true);
                    } catch (IOException e10) {
                        c.f65529l.a(e10);
                    }
                } catch (IOException e11) {
                    if (e11 instanceof InterruptedIOException) {
                        c.f65529l.h(e11);
                    } else {
                        c.f65529l.a(e11);
                        this.f65532c.p(e11);
                    }
                    this.f65532c.s(this.f65531b, true);
                }
            } catch (Throwable th2) {
                try {
                    this.f65532c.s(this.f65531b, true);
                } catch (IOException e12) {
                    c.f65529l.a(e12);
                }
                throw th2;
            }
        }

        public a(im.a aVar, HttpDestination httpDestination) {
            this.f65531b = aVar;
            this.f65532c = httpDestination;
        }
    }

    public c(org.eclipse.jetty.client.a aVar) {
        this.f65530k = aVar;
    }

    @Override // org.eclipse.jetty.client.a.b
    public void K(HttpDestination httpDestination) throws IOException {
        Socket socketCreateSocket;
        im.b bVarF;
        if (httpDestination.n()) {
            socketCreateSocket = httpDestination.l().z0();
        } else {
            socketCreateSocket = SocketFactory.getDefault().createSocket();
        }
        socketCreateSocket.setSoTimeout(0);
        socketCreateSocket.setTcpNoDelay(true);
        if (httpDestination.m()) {
            bVarF = httpDestination.j();
        } else {
            bVarF = httpDestination.f();
        }
        socketCreateSocket.connect(bVarF.c(), this.f65530k.A0());
        d dVar = new d(this.f65530k.N(), this.f65530k.W(), new nm.a(socketCreateSocket));
        dVar.s(httpDestination);
        httpDestination.q(dVar);
        this.f65530k.J0().Z(new a(dVar, httpDestination));
    }
}
