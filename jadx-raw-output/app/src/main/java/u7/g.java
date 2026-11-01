package u7;

import android.text.TextUtils;
import com.liulishuo.filedownloader.download.DownloadLaunchRunnable;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Iterator;
import java.util.List;
import m7.c0;
import m7.z;

/* JADX INFO: compiled from: FileDownloadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.a f72764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f72765b;

    @Override // m7.z
    public boolean a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            return false;
        }
        boolean zG = this.f72765b.g(fileDownloadModel.g());
        if (t7.b.e(fileDownloadModel.j())) {
            if (!zG) {
                return false;
            }
        } else if (!zG) {
            w7.d.b(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(fileDownloadModel.g()), Byte.valueOf(fileDownloadModel.j()));
            return false;
        }
        return true;
    }

    public boolean d(int i10) {
        if (i10 == 0) {
            w7.d.i(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i10));
            return false;
        }
        if (h(i10)) {
            w7.d.i(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i10));
            return false;
        }
        this.f72764a.remove(i10);
        this.f72764a.d(i10);
        return true;
    }

    public synchronized boolean m(int i10) {
        return this.f72765b.h(i10);
    }

    @Override // m7.z
    public int b(String str, int i10) {
        return this.f72765b.e(str, i10);
    }

    public void c() {
        this.f72764a.clear();
    }

    public long e(int i10) {
        FileDownloadModel fileDownloadModelN = this.f72764a.n(i10);
        if (fileDownloadModelN == null) {
            return 0L;
        }
        int iC = fileDownloadModelN.c();
        if (iC <= 1) {
            return fileDownloadModelN.i();
        }
        List<t7.a> listM = this.f72764a.m(i10);
        if (listM == null || listM.size() != iC) {
            return 0L;
        }
        return t7.a.f(listM);
    }

    public byte f(int i10) {
        FileDownloadModel fileDownloadModelN = this.f72764a.n(i10);
        if (fileDownloadModelN == null) {
            return (byte) 0;
        }
        return fileDownloadModelN.j();
    }

    public long g(int i10) {
        FileDownloadModel fileDownloadModelN = this.f72764a.n(i10);
        if (fileDownloadModelN == null) {
            return 0L;
        }
        return fileDownloadModelN.m();
    }

    public boolean h(int i10) {
        return a(this.f72764a.n(i10));
    }

    public boolean j() {
        return this.f72765b.b() <= 0;
    }

    public boolean k(int i10) {
        if (w7.d.f73535a) {
            w7.d.a(this, "request pause the task %d", Integer.valueOf(i10));
        }
        FileDownloadModel fileDownloadModelN = this.f72764a.n(i10);
        if (fileDownloadModelN == null) {
            return false;
        }
        fileDownloadModelN.A((byte) -2);
        this.f72765b.a(i10);
        return true;
    }

    public void l() {
        List<Integer> listF = this.f72765b.f();
        if (w7.d.f73535a) {
            w7.d.a(this, "pause all tasks %d", Integer.valueOf(listF.size()));
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            k(it.next().intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0186 A[Catch: all -> 0x01d1, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0022, B:10:0x0034, B:12:0x0044, B:14:0x004e, B:16:0x0052, B:17:0x0066, B:21:0x0073, B:23:0x0079, B:25:0x007d, B:29:0x008e, B:31:0x0097, B:33:0x00a0, B:35:0x00a4, B:40:0x00b7, B:43:0x00c0, B:45:0x00c9, B:47:0x00d8, B:49:0x00dc, B:51:0x00ee, B:55:0x00fc, B:57:0x0103, B:59:0x010a, B:61:0x0110, B:63:0x0117, B:65:0x011d, B:67:0x0123, B:69:0x013d, B:70:0x0141, B:72:0x0147, B:81:0x0186, B:82:0x018b, B:73:0x0156, B:75:0x0160, B:77:0x0166, B:78:0x016c, B:44:0x00c5, B:30:0x0093), top: B:88:0x0009 }] */
    public synchronized void n(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        FileDownloadModel fileDownloadModel;
        List<t7.a> listM;
        boolean z13 = false;
        if (w7.d.f73535a) {
            w7.d.a(this, "request start the task with url(%s) path(%s) isDirectory(%B)", str, str2, Boolean.valueOf(z10));
        }
        c0.a();
        int iS = w7.f.s(str, str2, z10);
        FileDownloadModel fileDownloadModelN = this.f72764a.n(iS);
        if (z10 || fileDownloadModelN != null) {
            fileDownloadModel = fileDownloadModelN;
            listM = null;
        } else {
            int iS2 = w7.f.s(str, w7.f.A(str2), true);
            FileDownloadModel fileDownloadModelN2 = this.f72764a.n(iS2);
            if (fileDownloadModelN2 == null || !str2.equals(fileDownloadModelN2.k())) {
                listM = null;
            } else {
                if (w7.d.f73535a) {
                    w7.d.a(this, "task[%d] find model by dirCaseId[%d]", Integer.valueOf(iS), Integer.valueOf(iS2));
                }
                listM = this.f72764a.m(iS2);
            }
            fileDownloadModel = fileDownloadModelN2;
        }
        if (w7.c.e(iS, fileDownloadModel, this, true)) {
            if (w7.d.f73535a) {
                w7.d.a(this, "has already started download %d", Integer.valueOf(iS));
            }
            return;
        }
        String strK = fileDownloadModel != null ? fileDownloadModel.k() : w7.f.B(str2, z10, null);
        if (w7.c.d(iS, strK, z11, true)) {
            if (w7.d.f73535a) {
                w7.d.a(this, "has already completed downloading %d", Integer.valueOf(iS));
            }
            return;
        }
        if (w7.c.c(iS, fileDownloadModel != null ? fileDownloadModel.i() : 0L, fileDownloadModel != null ? fileDownloadModel.l() : w7.f.C(strK), strK, this)) {
            if (w7.d.f73535a) {
                w7.d.a(this, "there is an another task with the same target-file-path %d %s", Integer.valueOf(iS), strK);
            }
            if (fileDownloadModel != null) {
                this.f72764a.remove(iS);
                this.f72764a.d(iS);
            }
            return;
        }
        if (fileDownloadModel == null || !(fileDownloadModel.j() == -2 || fileDownloadModel.j() == -1 || fileDownloadModel.j() == 1 || fileDownloadModel.j() == 6 || fileDownloadModel.j() == 2)) {
            if (fileDownloadModel == null) {
                fileDownloadModel = new FileDownloadModel();
            }
            fileDownloadModel.C(str);
            fileDownloadModel.y(str2, z10);
            fileDownloadModel.x(iS);
            fileDownloadModel.z(0L);
            fileDownloadModel.B(0L);
            fileDownloadModel.A((byte) 1);
            fileDownloadModel.t(1);
        } else {
            if (fileDownloadModel.g() == iS) {
                if (!TextUtils.equals(str, fileDownloadModel.n())) {
                    fileDownloadModel.C(str);
                }
                if (z13) {
                    this.f72764a.update(fileDownloadModel);
                }
                this.f72765b.c(new DownloadLaunchRunnable.b().g(fileDownloadModel).d(fileDownloadHeader).h(this).f(Integer.valueOf(i11)).b(Integer.valueOf(i10)).c(Boolean.valueOf(z11)).i(Boolean.valueOf(z12)).e(Integer.valueOf(i12)).a());
            }
            this.f72764a.remove(fileDownloadModel.g());
            this.f72764a.d(fileDownloadModel.g());
            fileDownloadModel.x(iS);
            fileDownloadModel.y(str2, z10);
            if (listM != null) {
                for (t7.a aVar : listM) {
                    aVar.i(iS);
                    this.f72764a.e(aVar);
                }
            }
        }
        z13 = true;
        if (z13) {
            this.f72764a.update(fileDownloadModel);
        }
        this.f72765b.c(new DownloadLaunchRunnable.b().g(fileDownloadModel).d(fileDownloadHeader).h(this).f(Integer.valueOf(i11)).b(Integer.valueOf(i10)).c(Boolean.valueOf(z11)).i(Boolean.valueOf(z12)).e(Integer.valueOf(i12)).a());
    }

    public g() {
        p7.a aVarJ = p7.a.j();
        this.f72764a = aVarJ.f();
        this.f72765b = new h(aVarJ.k());
    }

    public boolean i(String str, String str2) {
        return h(w7.f.r(str, str2));
    }
}
