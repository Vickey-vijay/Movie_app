package s7;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: MessageSnapshotThreadPool.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f67042a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.b f67043b;

    /* JADX INFO: compiled from: MessageSnapshotThreadPool.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Integer> f67044a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f67045b;

        /* JADX INFO: renamed from: s7.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MessageSnapshotThreadPool.java */
        public class RunnableC0638a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessageSnapshot f67047b;

            public RunnableC0638a(MessageSnapshot messageSnapshot) {
                this.f67047b = messageSnapshot;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f67043b.i(this.f67047b);
                a.this.f67044a.remove(Integer.valueOf(this.f67047b.g()));
            }
        }

        public a(int i10) {
            this.f67045b = w7.b.a(1, "Flow-" + i10);
        }

        public void b(int i10) {
            this.f67044a.add(Integer.valueOf(i10));
        }

        public void c(MessageSnapshot messageSnapshot) {
            this.f67045b.execute(new RunnableC0638a(messageSnapshot));
        }
    }

    public void b(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.f67042a) {
                int iG = messageSnapshot.g();
                for (a aVar2 : this.f67042a) {
                    if (aVar2.f67044a.contains(Integer.valueOf(iG))) {
                        aVar = aVar2;
                        break;
                    }
                }
                if (aVar == null) {
                    int size = 0;
                    for (a aVar3 : this.f67042a) {
                        if (aVar3.f67044a.size() <= 0) {
                            aVar = aVar3;
                            break;
                        } else if (size == 0 || aVar3.f67044a.size() < size) {
                            size = aVar3.f67044a.size();
                            aVar = aVar3;
                        }
                    }
                }
                aVar.b(iG);
            }
            aVar.c(messageSnapshot);
        } catch (Throwable th2) {
            aVar.c(messageSnapshot);
            throw th2;
        }
    }

    public d(int i10, c.b bVar) {
        this.f67043b = bVar;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f67042a.add(new a(i11));
        }
    }
}
