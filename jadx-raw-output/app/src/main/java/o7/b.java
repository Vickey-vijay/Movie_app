package o7;

import android.util.SparseArray;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NoDatabaseImpl.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements o7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<FileDownloadModel> f65113a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<List<t7.a>> f65114b = new SparseArray<>();

    /* JADX INFO: compiled from: NoDatabaseImpl.java */
    public class a implements o7.a.InterfaceC0597a {
        @Override // o7.a.InterfaceC0597a
        public void a(FileDownloadModel fileDownloadModel) {
        }

        @Override // o7.a.InterfaceC0597a
        public void b(FileDownloadModel fileDownloadModel) {
        }

        @Override // o7.a.InterfaceC0597a
        public void d(int i10, FileDownloadModel fileDownloadModel) {
        }

        @Override // o7.a.InterfaceC0597a
        public void k() {
        }

        public a() {
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            return b.this.new C0598b();
        }
    }

    /* JADX INFO: renamed from: o7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NoDatabaseImpl.java */
    public class C0598b implements Iterator<FileDownloadModel> {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel next() {
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        public C0598b() {
        }
    }

    @Override // o7.a
    public void a(int i10, Throwable th2) {
    }

    @Override // o7.a
    public void b(int i10, String str, long j10, long j11, int i11) {
    }

    @Override // o7.a
    public void f(int i10) {
    }

    @Override // o7.a
    public void i(int i10) {
    }

    @Override // o7.a
    public void j(int i10, Throwable th2, long j10) {
    }

    @Override // o7.a
    public void k(int i10, long j10) {
    }

    @Override // o7.a
    public void l(int i10, long j10, String str, String str2) {
    }

    @Override // o7.a
    public void o(int i10, int i11) {
    }

    @Override // o7.a
    public void p(int i10, long j10) {
    }

    @Override // o7.a
    public void c(int i10, int i11, long j10) {
        synchronized (this.f65114b) {
            List<t7.a> list = this.f65114b.get(i10);
            if (list == null) {
                return;
            }
            for (t7.a aVar : list) {
                if (aVar.d() == i11) {
                    aVar.g(j10);
                    return;
                }
            }
        }
    }

    @Override // o7.a
    public void clear() {
        synchronized (this.f65113a) {
            this.f65113a.clear();
        }
    }

    @Override // o7.a
    public void d(int i10) {
        synchronized (this.f65114b) {
            this.f65114b.remove(i10);
        }
    }

    @Override // o7.a
    public o7.a.InterfaceC0597a g() {
        return new a();
    }

    @Override // o7.a
    public void insert(FileDownloadModel fileDownloadModel) {
        synchronized (this.f65113a) {
            this.f65113a.put(fileDownloadModel.g(), fileDownloadModel);
        }
    }

    @Override // o7.a
    public List<t7.a> m(int i10) {
        List<t7.a> list;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f65114b) {
            list = this.f65114b.get(i10);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // o7.a
    public FileDownloadModel n(int i10) {
        FileDownloadModel fileDownloadModel;
        synchronized (this.f65113a) {
            fileDownloadModel = this.f65113a.get(i10);
        }
        return fileDownloadModel;
    }

    @Override // o7.a
    public boolean remove(int i10) {
        synchronized (this.f65113a) {
            this.f65113a.remove(i10);
        }
        return true;
    }

    @Override // o7.a
    public void update(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            w7.d.i(this, "update but model == null!", new Object[0]);
            return;
        }
        if (n(fileDownloadModel.g()) == null) {
            insert(fileDownloadModel);
            return;
        }
        synchronized (this.f65113a) {
            this.f65113a.remove(fileDownloadModel.g());
            this.f65113a.put(fileDownloadModel.g(), fileDownloadModel);
        }
    }

    @Override // o7.a
    public void e(t7.a aVar) {
        int iC = aVar.c();
        synchronized (this.f65114b) {
            List<t7.a> arrayList = this.f65114b.get(iC);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f65114b.put(iC, arrayList);
            }
            arrayList.add(aVar);
        }
    }

    @Override // o7.a
    public void h(int i10, long j10) {
        remove(i10);
    }
}
