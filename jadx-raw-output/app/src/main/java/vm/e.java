package vm;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import xm.j;

/* JADX INFO: compiled from: HashSessionManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends vm.c {
    public static final zm.c Z = g.f73239u;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static int f73231a0;
    public Timer O;
    public TimerTask Q;
    public TimerTask U;
    public File V;
    public final ConcurrentMap<String, f> N = new ConcurrentHashMap();
    public boolean P = false;
    public long R = 30000;
    public long S = 0;
    public long T = 0;
    public boolean W = false;
    public volatile boolean X = false;
    public boolean Y = false;

    /* JADX INFO: compiled from: HashSessionManager.java */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                e.this.I0(true);
            } catch (Exception e10) {
                e.Z.e(e10);
            }
        }
    }

    /* JADX INFO: compiled from: HashSessionManager.java */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            e.this.J0();
        }
    }

    /* JADX INFO: compiled from: HashSessionManager.java */
    public class c extends ObjectInputStream {
        public c(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            try {
                return Class.forName(objectStreamClass.getName(), false, Thread.currentThread().getContextClassLoader());
            } catch (ClassNotFoundException unused) {
                return super.resolveClass(objectStreamClass);
            }
        }
    }

    public synchronized f G0(String str) {
        FileInputStream fileInputStream;
        File file = new File(this.V, str);
        FileInputStream fileInputStream2 = null;
        try {
            if (!file.exists()) {
                file.delete();
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                f fVarF0 = F0(fileInputStream, null);
                n0(fVarF0, false);
                fVarF0.i();
                j.a(fileInputStream);
                file.delete();
                return fVarF0;
            } catch (Exception e10) {
                e = e10;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    j.a(fileInputStream2);
                }
                file.delete();
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (fileInputStream != null) {
            j.a(fileInputStream);
        }
        if (D0() && file.exists() && file.getParentFile().equals(this.V)) {
            file.delete();
            Z.c("Deleting file for unrestorable session " + str, e);
        } else {
            Z.c("Problem restoring session " + str, e);
        }
        return null;
    }

    public void H0() throws Exception {
        this.X = true;
        File file = this.V;
        if (file == null || !file.exists()) {
            return;
        }
        if (this.V.canRead()) {
            String[] list = this.V.list();
            for (int i10 = 0; list != null && i10 < list.length; i10++) {
                G0(list[i10]);
            }
            return;
        }
        Z.g("Unable to restore Sessions: Cannot read from Session storage directory " + this.V.getAbsolutePath(), new Object[0]);
    }

    public void K0(int i10) {
        long j10 = ((long) i10) * 1000;
        if (j10 < 0) {
            j10 = 0;
        }
        this.S = j10;
        if (this.O != null) {
            synchronized (this) {
                TimerTask timerTask = this.U;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                if (this.S > 0 && this.V != null) {
                    a aVar = new a();
                    this.U = aVar;
                    Timer timer = this.O;
                    long j11 = this.S;
                    timer.schedule(aVar, j11, j11);
                }
            }
        }
    }

    @Override // vm.c, ym.a
    public void e0() throws Exception {
        synchronized (this) {
            TimerTask timerTask = this.U;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.U = null;
            TimerTask timerTask2 = this.Q;
            if (timerTask2 != null) {
                timerTask2.cancel();
            }
            this.Q = null;
            Timer timer = this.O;
            if (timer != null && this.P) {
                timer.cancel();
            }
            this.O = null;
        }
        super.e0();
        this.N.clear();
    }

    public int B0() {
        long j10 = this.S;
        if (j10 <= 0) {
            return 0;
        }
        return (int) (j10 / 1000);
    }

    public int C0() {
        return (int) (this.R / 1000);
    }

    public boolean D0() {
        return this.Y;
    }

    public vm.a E0(long j10, long j11, String str) {
        return new f(this, j10, j11, str);
    }

    public f F0(InputStream inputStream, f fVar) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            String utf = dataInputStream.readUTF();
            dataInputStream.readUTF();
            long j10 = dataInputStream.readLong();
            long j11 = dataInputStream.readLong();
            int i10 = dataInputStream.readInt();
            if (fVar == null) {
                fVar = (f) E0(j10, j11, utf);
            }
            fVar.y(i10);
            int i11 = dataInputStream.readInt();
            if (i11 > 0) {
                c cVar = new c(dataInputStream);
                for (int i12 = 0; i12 < i11; i12++) {
                    try {
                        fVar.a(cVar.readUTF(), cVar.readObject());
                    } catch (Throwable th2) {
                        j.a(cVar);
                        throw th2;
                    }
                }
                j.a(cVar);
            }
            j.a(dataInputStream);
            return fVar;
        } catch (Throwable th3) {
            j.a(dataInputStream);
            throw th3;
        }
    }

    public void I0(boolean z10) throws Exception {
        File file = this.V;
        if (file == null || !file.exists()) {
            return;
        }
        if (this.V.canWrite()) {
            Iterator<f> it = this.N.values().iterator();
            while (it.hasNext()) {
                it.next().G(true);
            }
        } else {
            Z.g("Unable to save Sessions: Session persistence storage directory " + this.V.getAbsolutePath() + " is not writeable", new Object[0]);
        }
    }

    public void L0(int i10) {
        if (i10 == 0) {
            i10 = 60;
        }
        long j10 = this.R;
        long j11 = ((long) i10) * 1000;
        if (j11 > 60000) {
            j11 = 60000;
        }
        long j12 = j11 >= 1000 ? j11 : 1000L;
        this.R = j12;
        if (this.O != null) {
            if (j12 != j10 || this.Q == null) {
                synchronized (this) {
                    TimerTask timerTask = this.Q;
                    if (timerTask != null) {
                        timerTask.cancel();
                    }
                    b bVar = new b();
                    this.Q = bVar;
                    Timer timer = this.O;
                    long j13 = this.R;
                    timer.schedule(bVar, j13, j13);
                }
            }
        }
    }

    @Override // vm.c
    public vm.a q0(String str) {
        if (this.W && !this.X) {
            try {
                H0();
            } catch (Exception e10) {
                Z.e(e10);
            }
        }
        ConcurrentMap<String, f> concurrentMap = this.N;
        if (concurrentMap == null) {
            return null;
        }
        f fVarG0 = concurrentMap.get(str);
        if (fVarG0 == null && this.W) {
            fVarG0 = G0(str);
        }
        if (fVarG0 == null) {
            return null;
        }
        if (this.T != 0) {
            fVarG0.C();
        }
        return fVarG0;
    }

    @Override // vm.c
    public void t0() throws Exception {
        File file;
        ArrayList<f> arrayList = new ArrayList(this.N.values());
        int i10 = 100;
        while (arrayList.size() > 0) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            if (s() && (file = this.V) != null && file.exists() && this.V.canWrite()) {
                for (f fVar : arrayList) {
                    fVar.G(false);
                    w0(fVar, false);
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).invalidate();
                }
            }
            arrayList = new ArrayList(this.N.values());
            i10 = i11;
        }
    }

    @Override // vm.c
    public vm.a v0(lj.a aVar) {
        return new f(this, aVar);
    }

    @Override // vm.c
    public boolean x0(String str) {
        return this.N.remove(str) != null;
    }

    public void J0() {
        if (!s() && !isStopped()) {
            Thread threadCurrentThread = Thread.currentThread();
            ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
            try {
                ClassLoader classLoader = this.f73223u;
                if (classLoader != null) {
                    threadCurrentThread.setContextClassLoader(classLoader);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (f fVar : this.N.values()) {
                    long jR = ((long) fVar.r()) * 1000;
                    if (jR > 0 && fVar.m() + jR < jCurrentTimeMillis) {
                        try {
                            fVar.z();
                        } catch (Exception e10) {
                            Z.c("Problem scavenging sessions", e10);
                        }
                    } else if (this.T > 0 && fVar.m() + this.T < jCurrentTimeMillis) {
                        try {
                            fVar.D();
                        } catch (Exception e11) {
                            Z.c("Problem idling session " + fVar.getId(), e11);
                        }
                    }
                }
                threadCurrentThread.setContextClassLoader(contextClassLoader);
            } catch (Throwable th2) {
                threadCurrentThread.setContextClassLoader(contextClassLoader);
                throw th2;
            }
        }
    }

    @Override // vm.c, ym.a
    public void d0() throws Exception {
        super.d0();
        this.P = false;
        tm.c.d dVarV0 = tm.c.V0();
        if (dVarV0 != null) {
            this.O = (Timer) dVarV0.getAttribute("org.eclipse.jetty.server.session.timer");
        }
        if (this.O == null) {
            this.P = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("HashSessionScavenger-");
            int i10 = f73231a0;
            f73231a0 = i10 + 1;
            sb2.append(i10);
            this.O = new Timer(sb2.toString(), true);
        }
        L0(C0());
        File file = this.V;
        if (file != null) {
            if (!file.exists()) {
                this.V.mkdirs();
            }
            if (!this.W) {
                H0();
            }
        }
        K0(B0());
    }

    @Override // vm.c
    public void m0(vm.a aVar) {
        if (isRunning()) {
            this.N.put(aVar.o(), (f) aVar);
        }
    }
}
