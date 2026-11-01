package la;

import android.text.TextUtils;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import em.o;
import em.p;
import em.r;
import ii.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import sa.f0;
import w9.l;

/* JADX INFO: compiled from: CollectionImp.java */
/* JADX INFO: loaded from: classes8.dex */
public class c implements la.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public la.b f63499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63500b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63501c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63502d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<VideoCollectionBeanEntry> f63503e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f63504f = new ArrayList();

    /* JADX INFO: compiled from: CollectionImp.java */
    public class a implements u<BaseResponse<List<VideoCollectionBeanEntry>>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public a() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<VideoCollectionBeanEntry>> baseResponse) {
            if (baseResponse.isOk() && !h9.b.a(baseResponse.getResult())) {
                c.this.f63503e.addAll(baseResponse.getResult());
                if (c.this.f63499a != null) {
                    c.this.f63499a.showData(c.this.f63503e);
                }
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            p.b(r.a().getResources().getString(R.string.str_login_fail));
        }
    }

    /* JADX INFO: compiled from: CollectionImp.java */
    public class b implements u<BaseResponse<String>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public b() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                for (String str : c.this.f63504f) {
                    for (int i10 = 0; i10 < c.this.f63503e.size(); i10++) {
                        if (TextUtils.equals(str, String.valueOf(((VideoCollectionBeanEntry) c.this.f63503e.get(i10)).getId()))) {
                            VideoCollectionDao.getInstance().delete(((VideoCollectionBeanEntry) c.this.f63503e.get(i10)).getId());
                            c.this.f63503e.remove(c.this.f63503e.get(i10));
                        }
                    }
                }
                c.this.f63504f.clear();
                if (c.this.f63499a != null) {
                    c.this.f63499a.delete();
                }
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            p.b(r.a().getResources().getString(R.string.str_login_fail));
        }
    }

    @Override // la.a
    public void a() {
        this.f63501c = !this.f63501c;
        this.f63504f.clear();
        la.b bVar = this.f63499a;
        if (bVar != null) {
            bVar.setEdits(this.f63501c ? R.drawable.ic_edit_close : R.drawable.ic_edits);
        }
    }

    @Override // la.a
    public boolean b() {
        return this.f63501c;
    }

    @Override // la.a
    public void c() {
        if (this.f63504f.size() == this.f63503e.size()) {
            this.f63504f.clear();
            la.b bVar = this.f63499a;
            if (bVar != null) {
                bVar.whole(r.a().getResources().getString(R.string.text_all_select));
            }
        } else {
            this.f63504f.clear();
            Iterator<VideoCollectionBeanEntry> it = this.f63503e.iterator();
            while (it.hasNext()) {
                this.f63504f.add(String.valueOf(it.next().getId()));
            }
            la.b bVar2 = this.f63499a;
            if (bVar2 != null) {
                bVar2.whole(r.a().getResources().getString(R.string.text_unall_select));
            }
        }
        la.b bVar3 = this.f63499a;
        if (bVar3 != null) {
            bVar3.refresh(-1);
        }
    }

    @Override // la.a
    public void d() {
        i9.a.a().E(new HashMap()).k(new f0()).e(new l()).e(new w9.c()).b(new a());
    }

    @Override // la.a
    public void delete() {
        if (this.f63504f.size() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        String str = "";
        for (String str2 : this.f63504f) {
            str = o.c(str) ? str + str2 : str + StringUtils.COMMA + str2;
        }
        map.put("vod_ids", str);
        i9.a.a().H(map).k(new f0()).e(new l()).e(new w9.c()).b(new b());
    }

    @Override // la.a
    public void e(String str, int i10, int i11) {
        if (!this.f63501c) {
            la.b bVar = this.f63499a;
            if (bVar != null) {
                bVar.video(str, i10);
                return;
            }
            return;
        }
        if (this.f63504f.contains(str)) {
            this.f63504f.remove(str);
        } else {
            this.f63504f.add(str);
        }
        if (this.f63504f.size() == this.f63503e.size()) {
            la.b bVar2 = this.f63499a;
            if (bVar2 != null) {
                bVar2.whole(r.a().getResources().getString(R.string.text_unall_select));
            }
        } else {
            la.b bVar3 = this.f63499a;
            if (bVar3 != null) {
                bVar3.whole(r.a().getResources().getString(R.string.text_all_select));
            }
        }
        la.b bVar4 = this.f63499a;
        if (bVar4 != null) {
            bVar4.refresh(i11);
        }
    }

    @Override // la.a
    public void f(String str, int i10) {
        if (this.f63504f.contains(str)) {
            this.f63504f.remove(str);
        } else {
            this.f63504f.add(str);
        }
        if (this.f63504f.size() == this.f63503e.size()) {
            la.b bVar = this.f63499a;
            if (bVar != null) {
                bVar.whole(r.a().getResources().getString(R.string.text_unall_select));
            }
        } else {
            la.b bVar2 = this.f63499a;
            if (bVar2 != null) {
                bVar2.whole(r.a().getResources().getString(R.string.text_all_select));
            }
        }
        la.b bVar3 = this.f63499a;
        if (bVar3 != null) {
            bVar3.refresh(i10);
        }
    }

    @Override // la.a
    public boolean g(String str) {
        return this.f63504f.contains(str);
    }

    public c(la.b bVar) {
        this.f63499a = bVar;
    }
}
