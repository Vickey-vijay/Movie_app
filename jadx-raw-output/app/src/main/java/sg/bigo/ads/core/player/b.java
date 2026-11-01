package sg.bigo.ads.core.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements sg.bigo.ads.common.h.b.a, sg.bigo.ads.core.player.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f71797a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public Context f71799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<n> f71800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<n> f71801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, a> f71802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.common.h.b f71803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.core.player.a f71804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sg.bigo.ads.common.h.a.a f71805i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private sg.bigo.ads.core.player.a.d f71807k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f71798b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f71806j = 0;

    public interface a {
        void a();

        void a(int i10);

        void a(String str, sg.bigo.ads.common.h.a aVar);

        void b(int i10);
    }

    private b() {
    }

    private static sg.bigo.ads.api.a.d a(@NonNull n nVar) {
        h hVar;
        if (!nVar.aR() || nVar.aS() || (hVar = i.f69318a) == null || hVar.r() == null) {
            return null;
        }
        return hVar.r();
    }

    private static sg.bigo.ads.common.h.a a(Context context, String str, String str2, @NonNull n nVar, sg.bigo.ads.api.a.d dVar) {
        if (dVar == null) {
            return new sg.bigo.ads.common.h.a(str, nVar.a(context), str2, nVar.aR(), nVar.al(), nVar.aS(), null);
        }
        return new sg.bigo.ads.common.h.a(str, nVar.a(context), str2, nVar.aR(), nVar.al(), false, new sg.bigo.ads.common.h.c(dVar.a(nVar.v(), nVar.x()), dVar.c(nVar.x()), dVar.a(nVar.x()), dVar.b(nVar.x()), dVar.d(nVar.x())));
    }

    public static b a() {
        return f71797a;
    }

    private void a(File file) {
        sg.bigo.ads.common.h.b.a("filterAdFiles dir = " + file.getAbsolutePath(), (sg.bigo.ads.common.h.a) null);
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strD = o.d(this.f71799c);
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: sg.bigo.ads.core.player.b.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file2, File file3) {
                    long jLastModified = file2.lastModified() - file3.lastModified();
                    if (jLastModified > 0) {
                        return -1;
                    }
                    return jLastModified == 0 ? 0 : 1;
                }
            });
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                File file2 = fileArrListFiles[i10];
                sg.bigo.ads.common.h.a.a aVar = this.f71805i;
                long jLastModified = file2.lastModified();
                int iA = aVar.a();
                boolean z10 = true;
                if (!(aVar.f69683d + jLastModified < jCurrentTimeMillis) && i10 < iA) {
                    z10 = false;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DownloadConfig", "needDelete lastModifiedTs=" + jLastModified + ", numTmp=" + iA);
                if (z10) {
                    sg.bigo.ads.common.h.b.a("delete expired file name = " + file2.getName(), (sg.bigo.ads.common.h.a) null);
                    File file3 = new File(strD, file2.getName());
                    if (file3.exists()) {
                        sg.bigo.ads.common.h.b.a("delete expired cover name = " + file2.getName(), (sg.bigo.ads.common.h.a) null);
                        file3.delete();
                    }
                    file2.delete();
                }
            }
        }
    }

    private boolean a(n nVar, sg.bigo.ads.common.h.a aVar) {
        return TextUtils.equals(nVar.b(this.f71799c), aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, @NonNull n nVar, a aVar) {
        String strAP = nVar.aP();
        String strAQ = nVar.aQ();
        sg.bigo.ads.common.h.a aVarA = a(context, strAP, strAQ, nVar, a(nVar));
        if (aVarA.c()) {
            sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "info SupportFillTime: " + aVarA.toString());
            this.f71801e.add(nVar);
        }
        boolean z10 = i.f69318a.n().a(9) && URLUtil.isHttpUrl(strAP);
        if (z10) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) nVar, strAP, "Invalid http url", 0L, 0L, 2, "", false);
        }
        if (!z10 && !q.a((CharSequence) strAP) && !q.a((CharSequence) strAQ)) {
            this.f71800d.add(nVar);
            this.f71802f.put(nVar.aJ(), aVar);
            sg.bigo.ads.common.h.b.a("downloadMedia", aVarA);
            this.f71803g.a(aVarA, false);
            this.f71804h.a(aVarA);
            return;
        }
        nVar.i(5);
        if (!aVarA.c()) {
            aVar.b(z10 ? 10118 : 10103);
            return;
        }
        aVar.a();
        this.f71802f.put(nVar.aJ(), aVar);
        this.f71804h.c(aVarA);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.a(new File(o.b(bVar.f71799c)));
        bVar.a(new File(o.c(bVar.f71799c)));
    }

    private static sg.bigo.ads.core.player.a.d d() {
        sg.bigo.ads.common.h.b.a("start HttpProxyCacheServer ServerSocket", (sg.bigo.ads.common.h.a) null);
        return new sg.bigo.ads.core.player.a.d();
    }

    private void e() {
        if (System.currentTimeMillis() - this.f71806j > 3600000) {
            c();
        }
    }

    public final void a(final Context context, @NonNull final n nVar, final a aVar) {
        if (!this.f71798b.get()) {
            sg.bigo.ads.common.h.b.a("please execute initAdResource first", (sg.bigo.ads.common.h.a) null);
        } else if (sg.bigo.ads.common.n.d.a()) {
            b(context, nVar, aVar);
        } else {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(context, nVar, aVar);
                }
            });
        }
    }

    public final void a(String str) {
        if (this.f71802f == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f71802f.remove(str);
    }

    @Override // sg.bigo.ads.common.h.b.a
    public final void a(sg.bigo.ads.common.h.a aVar) {
        Iterator<n> it = this.f71800d.iterator();
        boolean z10 = !q.a((CharSequence) aVar.f69674p);
        while (z10 && it.hasNext()) {
            n next = it.next();
            if (a(next, aVar)) {
                next.c(aVar.f69674p);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x0219  */
    /* JADX WARN: Code duplicated, block: B:85:0x0225  */
    /* JADX WARN: Code duplicated, block: B:88:0x0233  */
    /* JADX WARN: Code duplicated, block: B:91:0x0256  */
    /* JADX WARN: Code duplicated, block: B:93:0x0261  */
    /* JADX WARN: Code duplicated, block: B:96:0x0270  */
    /* JADX WARN: Code duplicated, block: B:97:0x029b  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a5  */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x0270, please report this as an issue */
    @Override // sg.bigo.ads.common.h.b.a
    public final void a(sg.bigo.ads.common.h.a aVar, int i10, long j10) {
        String strExtractMetadata;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        m mVar;
        boolean z10;
        boolean z11;
        a aVarRemove;
        n.d dVarAB;
        sg.bigo.ads.core.player.a aVar2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z12;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i11;
        int i12 = i10;
        sg.bigo.ads.common.h.b.a("callback download completed source=".concat(String.valueOf(i10)), aVar);
        int i13 = 2;
        int i14 = 1;
        boolean z13 = i12 == 2;
        m mVar2 = new m();
        if (!o.a(this.f71799c, aVar.f69661c)) {
            strExtractMetadata = "";
        } else if ((aVar.f69663e == 1) && (!aVar.f69664f)) {
            File file = new File(o.d(this.f71799c), aVar.f69662d);
            if ((!file.exists() || file.length() < 0) && aVar.a() != null && !TextUtils.isEmpty(aVar.f69662d)) {
                String strA = aVar.a();
                if (z13) {
                    strA = f.d(strA);
                }
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strA, 1);
                if (bitmapCreateVideoThumbnail != null) {
                    String strD = o.d(this.f71799c);
                    f.a(strD + File.separator, aVar.f69662d);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(strD, aVar.f69662d));
                        bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception unused) {
                    }
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(z13 ? f.d(aVar.a()) : aVar.a());
                    mVar2.f69409a = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    mVar2.f69410b = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mVar2.f69411c = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(12);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    strExtractMetadata = "";
                }
            } catch (Exception unused4) {
                mediaMetadataRetriever.release();
                strExtractMetadata = "";
                str = strExtractMetadata;
                boolean zA = b().a();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                while (r19.hasNext()) {
                    if (a(nVar, aVar)) {
                        if (i12 != 0) {
                            if (i12 != i14) {
                                nVar.h(4);
                            } else if (i12 == i13) {
                                nVar.h(3);
                                nVar.i(3);
                            }
                            if (nVar.aO()) {
                                arrayList3 = arrayList;
                                arrayList4 = arrayList2;
                                String str3 = str;
                                m mVar3 = mVar2;
                                z12 = z13;
                                int i15 = i14;
                                if (z12) {
                                    arrayList5 = arrayList3;
                                    arrayList6 = arrayList4;
                                } else {
                                    arrayList3.add(nVar);
                                    arrayList4.add(nVar);
                                    arrayList6 = arrayList4;
                                    arrayList5 = arrayList3;
                                    sg.bigo.ads.core.d.b.a(nVar, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                                }
                                str = str3;
                                mVar2 = mVar3;
                                z13 = z12;
                                i14 = i15;
                                arrayList = arrayList5;
                                arrayList2 = arrayList6;
                            } else {
                                arrayList3 = arrayList;
                                arrayList4 = arrayList2;
                                String str4 = str;
                                m mVar4 = mVar2;
                                z12 = z13;
                                int i16 = i14;
                                if (z12) {
                                    arrayList3.add(nVar);
                                    arrayList4.add(nVar);
                                    arrayList6 = arrayList4;
                                    arrayList5 = arrayList3;
                                    sg.bigo.ads.core.d.b.a(nVar, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                                } else {
                                    arrayList5 = arrayList3;
                                    arrayList6 = arrayList4;
                                }
                                str = str4;
                                mVar2 = mVar4;
                                z13 = z12;
                                i14 = i16;
                                arrayList = arrayList5;
                                arrayList2 = arrayList6;
                            }
                            i13 = 2;
                            i12 = i10;
                        } else {
                            nVar.h(i14);
                        }
                        nVar.i(4);
                        if (nVar.aO()) {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            String str5 = str;
                            m mVar5 = mVar2;
                            z12 = z13;
                            int i17 = i14;
                            if (z12) {
                                arrayList3.add(nVar);
                                arrayList4.add(nVar);
                                arrayList6 = arrayList4;
                                arrayList5 = arrayList3;
                                sg.bigo.ads.core.d.b.a(nVar, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                            } else {
                                arrayList5 = arrayList3;
                                arrayList6 = arrayList4;
                            }
                            str = str5;
                            mVar2 = mVar5;
                            z13 = z12;
                            i14 = i17;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            String str6 = str;
                            m mVar6 = mVar2;
                            z12 = z13;
                            int i18 = i14;
                            if (z12) {
                                arrayList3.add(nVar);
                                arrayList4.add(nVar);
                                arrayList6 = arrayList4;
                                arrayList5 = arrayList3;
                                sg.bigo.ads.core.d.b.a(nVar, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                            } else {
                                arrayList5 = arrayList3;
                                arrayList6 = arrayList4;
                            }
                            str = str6;
                            mVar2 = mVar6;
                            z13 = z12;
                            i14 = i18;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                        }
                        i13 = 2;
                        i12 = i10;
                    } else {
                        sg.bigo.ads.common.h.b.a("not match addata=" + nVar.aK(), aVar);
                    }
                }
                ArrayList<n> arrayList7 = arrayList;
                str2 = str;
                mVar = mVar2;
                z10 = z13;
                this.f71800d.removeAll(arrayList2);
                z11 = !q.a((CharSequence) str2);
                if (z11) {
                    aVar.f69674p = str2;
                }
                for (n nVar : arrayList7) {
                    if (nVar.aW()) {
                        if (z11) {
                            nVar.c(str2);
                        }
                        mVar.f69412d = aVar.f69667i;
                        mVar.f69413e = aVar.h();
                        nVar.a(mVar);
                        aVarRemove = this.f71802f.remove(nVar.aJ());
                        this.f71801e.remove(nVar);
                        if (aVarRemove != null) {
                            sg.bigo.ads.common.h.b.a("listener is valid, execute AdProxy successful callback", aVar);
                            dVarAB = nVar.aB();
                            if (dVarAB != null) {
                                dVarAB.a(z10);
                            }
                            aVar2 = this.f71804h;
                            if (aVar2.f71745b.containsKey(aVar.f69659a)) {
                                sg.bigo.ads.common.n.d.a(aVar2.f71745b.get(aVar.f69659a));
                                aVar2.f71745b.remove(aVar.f69659a);
                                sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "stopFillTime: " + aVar.f69659a);
                            }
                            aVar2.b(aVar);
                            aVarRemove.a(i10);
                        } else {
                            sg.bigo.ads.common.h.b.a("Not found target listener.", aVar);
                        }
                        nVar.aX();
                    }
                }
                if (z10) {
                }
                e();
            } catch (Throwable th2) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused5) {
                }
                throw th2;
            }
        } else {
            strExtractMetadata = "";
        }
        str = strExtractMetadata;
        boolean zA2 = b().a();
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        for (n nVar2 : this.f71800d) {
            if (a(nVar2, aVar)) {
                sg.bigo.ads.common.h.b.a("not match addata=" + nVar2.aK(), aVar);
            } else {
                if (i12 != 0) {
                    if (i12 != i14) {
                        nVar2.h(4);
                    } else if (i12 == i13) {
                        nVar2.h(3);
                        nVar2.i(3);
                    }
                    if (nVar2.aO() || !z13) {
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        String str7 = str;
                        m mVar7 = mVar2;
                        z12 = z13;
                        int i19 = i14;
                        if (z12) {
                            arrayList3.add(nVar2);
                            arrayList4.add(nVar2);
                            arrayList6 = arrayList4;
                            arrayList5 = arrayList3;
                            sg.bigo.ads.core.d.b.a(nVar2, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                        } else {
                            arrayList5 = arrayList3;
                            arrayList6 = arrayList4;
                        }
                        str = str7;
                        mVar2 = mVar7;
                        z13 = z12;
                        i14 = i19;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                    } else {
                        long j11 = aVar.f69667i;
                        long j12 = j11 > 0 ? (aVar.f69665g * 100) / j11 : 0L;
                        if (zA2 && !nVar2.aW() && nVar2.c(j12)) {
                            sg.bigo.ads.common.h.b.a("Video partial download done, target callback.", aVar);
                            arrayList.add(nVar2);
                            i11 = 1;
                            sg.bigo.ads.core.d.b.a(nVar2, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                        } else {
                            i11 = 1;
                        }
                        str = str;
                        mVar2 = mVar2;
                        z13 = z13;
                        i14 = i11;
                        arrayList = arrayList;
                        arrayList2 = arrayList2;
                    }
                    i13 = 2;
                    i12 = i10;
                } else {
                    nVar2.h(i14);
                }
                nVar2.i(4);
                if (nVar2.aO()) {
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    String str8 = str;
                    m mVar8 = mVar2;
                    z12 = z13;
                    int i110 = i14;
                    if (z12) {
                        arrayList3.add(nVar2);
                        arrayList4.add(nVar2);
                        arrayList6 = arrayList4;
                        arrayList5 = arrayList3;
                        sg.bigo.ads.core.d.b.a(nVar2, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                    } else {
                        arrayList5 = arrayList3;
                        arrayList6 = arrayList4;
                    }
                    str = str8;
                    mVar2 = mVar8;
                    z13 = z12;
                    i14 = i110;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                } else {
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    String str9 = str;
                    m mVar9 = mVar2;
                    z12 = z13;
                    int i111 = i14;
                    if (z12) {
                        arrayList3.add(nVar2);
                        arrayList4.add(nVar2);
                        arrayList6 = arrayList4;
                        arrayList5 = arrayList3;
                        sg.bigo.ads.core.d.b.a(nVar2, aVar.f69660b, i10, j10, aVar.f69665g / 1024, aVar.f69669k, 2, "video", aVar.f69673o);
                    } else {
                        arrayList5 = arrayList3;
                        arrayList6 = arrayList4;
                    }
                    str = str9;
                    mVar2 = mVar9;
                    z13 = z12;
                    i14 = i111;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                }
                i13 = 2;
                i12 = i10;
            }
        }
        ArrayList<n> arrayList8 = arrayList;
        str2 = str;
        mVar = mVar2;
        z10 = z13;
        this.f71800d.removeAll(arrayList2);
        z11 = !q.a((CharSequence) str2);
        if (z11) {
            aVar.f69674p = str2;
        }
        while (r4.hasNext()) {
            if (nVar.aW()) {
                if (z11) {
                    nVar.c(str2);
                }
                mVar.f69412d = aVar.f69667i;
                mVar.f69413e = aVar.h();
                nVar.a(mVar);
                aVarRemove = this.f71802f.remove(nVar.aJ());
                this.f71801e.remove(nVar);
                if (aVarRemove != null) {
                    sg.bigo.ads.common.h.b.a("listener is valid, execute AdProxy successful callback", aVar);
                    dVarAB = nVar.aB();
                    if (dVarAB != null) {
                        dVarAB.a(z10);
                    }
                    aVar2 = this.f71804h;
                    if (aVar2.f71745b.containsKey(aVar.f69659a)) {
                        sg.bigo.ads.common.n.d.a(aVar2.f71745b.get(aVar.f69659a));
                        aVar2.f71745b.remove(aVar.f69659a);
                        sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "stopFillTime: " + aVar.f69659a);
                    }
                    aVar2.b(aVar);
                    aVarRemove.a(i10);
                } else {
                    sg.bigo.ads.common.h.b.a("Not found target listener.", aVar);
                }
                nVar.aX();
            }
        }
        if (z10) {
            e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    @Override // sg.bigo.ads.common.h.b.a
    public final void a(sg.bigo.ads.common.h.a aVar, String str, long j10, long j11) {
        String str2;
        n nVar;
        String str3;
        int i10;
        sg.bigo.ads.common.h.b.a("callback download failed error= ".concat(String.valueOf(str)), aVar);
        this.f71804h.b(aVar);
        Iterator<n> it = this.f71800d.iterator();
        int i11 = 1;
        boolean z10 = !q.a((CharSequence) aVar.f69674p);
        while (it.hasNext()) {
            n next = it.next();
            if (a(next, aVar)) {
                if (z10) {
                    next.c(aVar.f69674p);
                }
                if (next != null) {
                    if ("Unable to download media file.".equals(str) || "internal storage is not enough".equals(str)) {
                        i10 = 5;
                    } else {
                        i10 = j11 == 0 ? 0 : i11;
                    }
                    next.i(i10);
                }
                if (!aVar.c() || "internal storage is not enough".equalsIgnoreCase(str)) {
                    str2 = "internal storage is not enough";
                    nVar = next;
                    a aVarRemove = this.f71802f.remove(nVar.aJ());
                    if (aVarRemove != null) {
                        sg.bigo.ads.core.d.b.a(nVar, aVar.f69660b, str, j10, aVar.f69665g / 1024, 2, "video", aVar.f69673o);
                        sg.bigo.ads.common.h.b.a("listener is valid, execute AdProxy failure callback", aVar);
                        aVarRemove.b(q.a(str, -1));
                        this.f71802f.remove(nVar.aJ());
                    }
                    if (str2.equalsIgnoreCase(str)) {
                        this.f71801e.remove(nVar);
                    }
                    it.remove();
                } else {
                    a aVar2 = this.f71802f.get(next.aJ());
                    if (aVar2 != null) {
                        str2 = "internal storage is not enough";
                        nVar = next;
                        sg.bigo.ads.core.d.b.a(next, aVar.f69660b, str, j10, aVar.f69665g / 1024, 2, "video", aVar.f69673o);
                        if (nVar.bd() != 2) {
                            str3 = "video download failed when support fillStrategy, so download backupImg";
                        } else if (aVar.d()) {
                            str3 = "video download failed but filled success, so download backupImg";
                        } else {
                            sg.bigo.ads.common.h.b.a("video download failed and filled fail, so don't download backupImg", aVar);
                        }
                        sg.bigo.ads.common.h.b.a(str3, aVar);
                        aVar2.a();
                    } else {
                        str2 = "internal storage is not enough";
                        nVar = next;
                    }
                }
                if (str2.equalsIgnoreCase(str)) {
                    this.f71801e.remove(nVar);
                }
                it.remove();
            } else {
                z10 = z10;
            }
            z10 = z10;
            i11 = 1;
        }
        e();
    }

    public final sg.bigo.ads.core.player.a.d b() {
        sg.bigo.ads.core.player.a.d dVar = this.f71807k;
        if (dVar != null) {
            return dVar;
        }
        sg.bigo.ads.core.player.a.d dVarD = d();
        this.f71807k = dVarD;
        return dVarD;
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void b(sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.h.b.a("callback download fill time source=", aVar);
        sg.bigo.ads.common.h.b.a("callback download fill time", aVar);
        Iterator<n> it = this.f71801e.iterator();
        boolean z10 = !q.a((CharSequence) aVar.f69674p);
        while (it.hasNext()) {
            n next = it.next();
            if (a(next, aVar)) {
                if (z10) {
                    next.c(aVar.f69674p);
                }
                next.i(2);
                a aVar2 = this.f71802f.get(next.aJ());
                if (aVar2 != null) {
                    aVar2.a("", aVar);
                    if (aVar.f69660b == null) {
                        this.f71802f.remove(next.aJ());
                    }
                }
                it.remove();
            }
        }
        e();
    }

    public final void c() {
        this.f71806j = System.currentTimeMillis();
        sg.bigo.ads.common.h.b.a("start resource delete task", (sg.bigo.ads.common.h.a) null);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.b(b.this);
            }
        }, 30000L);
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void c(sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.h.b.a("callback download check Process source=", aVar);
        int iG = aVar.g();
        long j10 = aVar.f69667i;
        if (j10 > 0 && aVar.f69665g * 100 >= j10 * ((long) iG)) {
            sg.bigo.ads.common.h.b.a("video download process is enough. download percent: " + aVar.f69665g + ", total size:" + aVar.f69667i, aVar);
            return;
        }
        sg.bigo.ads.common.h.b.a("video download process is not enough. download size: " + aVar.f69665g + ", total size:" + aVar.f69667i + ", begin to download backup", aVar);
        boolean zA = q.a((CharSequence) aVar.f69674p) ^ true;
        for (n nVar : this.f71800d) {
            if (a(nVar, aVar)) {
                if (zA) {
                    nVar.c(aVar.f69674p);
                }
                a aVar2 = this.f71802f.get(nVar.aJ());
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        }
    }
}
