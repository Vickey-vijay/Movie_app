package ym;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: AggregateLifeCycle.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends ym.a implements d, e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final zm.c f85790m = zm.b.a(b.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<a> f85791k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85792l = false;

    /* JADX INFO: compiled from: AggregateLifeCycle.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f85793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f85794b = true;

        public a(Object obj) {
            this.f85793a = obj;
        }

        public String toString() {
            return h.f44171d + this.f85793a + StringUtils.COMMA + this.f85794b + h.f44172e;
        }
    }

    public static void p0(Appendable appendable, String str, Collection<?>... collectionArr) throws IOException {
        if (collectionArr.length == 0) {
            return;
        }
        int size = 0;
        for (Collection<?> collection : collectionArr) {
            size += collection.size();
        }
        if (size == 0) {
            return;
        }
        int i10 = 0;
        for (Collection<?> collection2 : collectionArr) {
            for (Object obj : collection2) {
                i10++;
                appendable.append(str).append(" +- ");
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i10 == size ? "    " : " |  ");
                    eVar.z(appendable, sb2.toString());
                } else {
                    q0(appendable, obj);
                }
            }
            if (i10 != size) {
                appendable.append(str).append(" |\n");
            }
        }
    }

    @Override // ym.a
    public void e0() throws Exception {
        this.f85792l = false;
        super.e0();
        ArrayList<a> arrayList = new ArrayList(this.f85791k);
        Collections.reverse(arrayList);
        for (a aVar : arrayList) {
            if (aVar.f85794b) {
                Object obj = aVar.f85793a;
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (fVar.isRunning()) {
                        fVar.stop();
                    }
                }
            }
        }
    }

    public static void q0(Appendable appendable, Object obj) throws IOException {
        try {
            if (obj instanceof f) {
                appendable.append(String.valueOf(obj)).append(" - ").append(ym.a.g0((f) obj)).append("\n");
            } else {
                appendable.append(String.valueOf(obj)).append("\n");
            }
        } catch (Throwable th2) {
            appendable.append(" => ").append(th2.toString()).append('\n');
        }
    }

    @Override // ym.a
    public void d0() throws Exception {
        for (a aVar : this.f85791k) {
            if (aVar.f85794b) {
                Object obj = aVar.f85793a;
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (!fVar.isRunning()) {
                        fVar.start();
                    }
                }
            }
        }
        this.f85792l = true;
        super.d0();
    }

    public void destroy() {
        ArrayList<a> arrayList = new ArrayList(this.f85791k);
        Collections.reverse(arrayList);
        for (a aVar : arrayList) {
            if ((aVar.f85793a instanceof d) && aVar.f85794b) {
                ((d) aVar.f85793a).destroy();
            }
        }
        this.f85791k.clear();
    }

    public boolean m0(Object obj) {
        return n0(obj, ((obj instanceof f) && ((f) obj).isStarted()) ? false : true);
    }

    public boolean o0(Object obj) {
        Iterator<a> it = this.f85791k.iterator();
        while (it.hasNext()) {
            if (it.next().f85793a == obj) {
                return true;
            }
        }
        return false;
    }

    public void r0() {
        try {
            z(System.err, "");
        } catch (IOException e10) {
            f85790m.e(e10);
        }
    }

    public <T> T t0(Class<T> cls) {
        for (a aVar : this.f85791k) {
            if (cls.isInstance(aVar.f85793a)) {
                return (T) aVar.f85793a;
            }
        }
        return null;
    }

    public Collection<Object> u0() {
        return v0(Object.class);
    }

    public <T> List<T> v0(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f85791k) {
            if (cls.isInstance(aVar.f85793a)) {
                arrayList.add(aVar.f85793a);
            }
        }
        return arrayList;
    }

    public boolean w0(Object obj) {
        for (a aVar : this.f85791k) {
            if (aVar.f85793a == obj) {
                this.f85791k.remove(aVar);
                return true;
            }
        }
        return false;
    }

    public boolean n0(Object obj, boolean z10) {
        if (o0(obj)) {
            return false;
        }
        a aVar = new a(obj);
        aVar.f85794b = z10;
        this.f85791k.add(aVar);
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (z10 && this.f85792l) {
                try {
                    fVar.start();
                    return true;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
            return true;
        }
        return true;
    }

    public void s0(Appendable appendable) throws IOException {
        appendable.append(String.valueOf(this)).append(" - ").append(f0()).append("\n");
    }

    public void z(Appendable appendable, String str) throws IOException {
        String str2;
        s0(appendable);
        int size = this.f85791k.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        for (a aVar : this.f85791k) {
            i10++;
            appendable.append(str).append(" +- ");
            if (aVar.f85794b) {
                Object obj = aVar.f85793a;
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    if (i10 == size) {
                        str2 = "    ";
                    } else {
                        str2 = " |  ";
                    }
                    sb2.append(str2);
                    eVar.z(appendable, sb2.toString());
                } else {
                    q0(appendable, obj);
                }
            } else {
                q0(appendable, aVar.f85793a);
            }
        }
        if (i10 != size) {
            appendable.append(str).append(" |\n");
        }
    }
}
