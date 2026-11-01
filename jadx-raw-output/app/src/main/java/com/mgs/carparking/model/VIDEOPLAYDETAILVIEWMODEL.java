package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.fvvcl.flickverse.R;
import com.ironsource.Z7;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.BarrageListEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.CommentListVideoEntry;
import com.mgs.carparking.netbean.DownloadAddSuccessEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.netbean.VideoComment1Entry;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import em.p;
import em.r;
import ii.u;
import io.bidmachine.ads.networks.gam.GAMConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.Response;
import sa.f0;
import sa.o0;
import sa.x;
import w9.a3;
import w9.c3;
import w9.e3;
import w9.s1;
import w9.u0;
import w9.y0;

/* JADX INFO: loaded from: classes7.dex */
public class VIDEOPLAYDETAILVIEWMODEL extends BaseViewModel<n9.a> {
    public ObservableField<Integer> A;
    public ObservableField<String> A0;
    public ObservableField<Drawable> B;
    public ObservableField<Boolean> B0;
    public ObservableField<Boolean> C;
    public ObservableField<Boolean> C0;
    public ObservableField<Boolean> D;
    public SingleLiveEvent<Integer> D0;
    public SingleLiveEvent<Void> E;
    public ul.b E0;
    public SingleLiveEvent<Integer> F;
    public ul.b F0;
    public SingleLiveEvent<Void> G;
    public ul.b G0;
    public SingleLiveEvent<Boolean> H;
    public ul.b H0;
    public SingleLiveEvent<Boolean> I;
    public ul.b I0;
    public SingleLiveEvent<Boolean> J;
    public ul.b J0;
    public ObservableField<Boolean> K;
    public ul.b K0;
    public ObservableField<Boolean> L;
    public ul.b L0;
    public SingleLiveEvent<Void> M;
    public ul.b M0;
    public SingleLiveEvent<Void> N;
    public ul.b N0;
    public SingleLiveEvent<Void> O;
    public ul.b O0;
    public SingleLiveEvent<Void> P;
    public ul.b P0;
    public SingleLiveEvent<Void> Q;
    public ul.b Q0;
    public SingleLiveEvent<View> R;
    public ul.b R0;
    public ObservableField<u0> S;
    public ul.b S0;
    public SingleLiveEvent<Void> T;
    public ul.b T0;
    public SingleLiveEvent<Void> U;
    public ul.b U0;
    public SingleLiveEvent<Void> V;
    public SingleLiveEvent<Boolean> V0;
    public SingleLiveEvent<Void> W;
    public ul.b W0;
    public SingleLiveEvent<Void> X;
    public ul.b X0;
    public SingleLiveEvent<Void> Y;
    public SingleLiveEvent<Boolean> Y0;
    public SingleLiveEvent<Void> Z;
    public SingleLiveEvent<Void> Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f41383a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ul.b f41384a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41385b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ul.b f41386b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public SingleLiveEvent<VideoShareDataEntry> f41387c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public ul.b f41388c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SingleLiveEvent<List<BarrageListEntry>> f41389d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public mi.b f41390d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SingleLiveEvent<String> f41391e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41392f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41393f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41394g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41395g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41396h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SingleLiveEvent<Void> f41397h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41398i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SingleLiveEvent<Void> f41399i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f41400j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ObservableList<s1> f41401j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<String> f41402k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public fm.c<s1> f41403k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f41404l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ObservableList<y0> f41405l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f41406m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public fm.c<y0> f41407m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41408n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ObservableList<c3> f41409n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f41410o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public fm.c<c3> f41411o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f41412p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ObservableList<e3> f41413p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f41414q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public fm.c<e3> f41415q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f41416r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public fm.c<a3> f41417r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f41418s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ObservableList<a3> f41419s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f41420t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ObservableField<String> f41421t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableField<String> f41422u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ObservableField<Boolean> f41423u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<Boolean> f41424v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ObservableField<Boolean> f41425v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ObservableField<Boolean> f41426w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public SingleLiveEvent<Integer> f41427w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ObservableField f41428x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ObservableField<Boolean> f41429x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ObservableField<Boolean> f41430y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ObservableField<Boolean> f41431y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ObservableField<Boolean> f41432z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ObservableField<String> f41433z0;

    public class a implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41434b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public a(String str) {
            this.f41434b = str;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                VIDEOPLAYDETAILVIEWMODEL.this.f41391e0.setValue(this.f41434b);
            }
        }
    }

    public class b implements u<BaseResponse<String>> {
        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public b() {
        }
    }

    public class c implements u<BaseResponse<CollectionVideoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoCollectionEntry f41437b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public c(VideoCollectionEntry videoCollectionEntry) {
            this.f41437b = videoCollectionEntry;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<CollectionVideoEntry> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                VideoCollectionDao.getInstance().insert(this.f41437b);
            }
        }
    }

    public class d implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VideoCollectionEntry f41439b;

        @Override // ii.u
        public void onError(Throwable th2) {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public d(VideoCollectionEntry videoCollectionEntry) {
            this.f41439b = videoCollectionEntry;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                VideoCollectionDao.getInstance().delete(this.f41439b.getId());
            }
        }
    }

    public class e implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f41441b;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public e(int i10) {
            this.f41441b = i10;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (this.f41441b == 1) {
                p.b(r.a().getResources().getString(R.string.str_success));
            }
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            if (this.f41441b == 1) {
                p.b(r.a().getResources().getString(R.string.str_fail));
            }
        }
    }

    public class f implements u<BaseResponse<String>> {
        public f() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
            VIDEOPLAYDETAILVIEWMODEL.this.f41428x.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                o0.S0(baseResponse.getResult());
                VIDEOPLAYDETAILVIEWMODEL.this.f41399i0.call();
            } else {
                VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
                VIDEOPLAYDETAILVIEWMODEL.this.f41428x.set(Boolean.TRUE);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ VideoBean f41445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f41446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f41447e;

        public g(String str, VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
            this.f41444b = str;
            this.f41445c = videoBean;
            this.f41446d = recommandVideosEntity;
            this.f41447e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            VIDEOPLAYDETAILVIEWMODEL.this.U0(this.f41444b, this.f41445c, this.f41446d, this.f41447e);
        }
    }

    public class h implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VideoBean f41449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f41450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f41451c;

        public class a extends x5.a<DownloadAddSuccessEntry> {
            public a() {
            }
        }

        public h(VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
            this.f41449a = videoBean;
            this.f41450b = recommandVideosEntity;
            this.f41451c = i10;
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
            o0.M0(o0.D() + 1);
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                String strString = response.body().string();
                Log.i("wangyi", "get成功：" + strString + "--");
                VIDEOPLAYDETAILVIEWMODEL.this.g0(this.f41449a, this.f41450b, (DownloadAddSuccessEntry) sa.k.c(strString, new a().getType()), this.f41451c);
                if (o0.h() == 1 && o0.D() > 0 && o0.f() == 0) {
                    o0.i0(1);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class i implements u<BaseResponse<RecommandVideosEntity>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f41454b;

        public i(int i10) {
            this.f41454b = i10;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
            VIDEOPLAYDETAILVIEWMODEL.this.f41428x.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RecommandVideosEntity> baseResponse) {
            if (baseResponse.getResult() != null) {
                ObservableField<Boolean> observableField = VIDEOPLAYDETAILVIEWMODEL.this.D;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                VIDEOPLAYDETAILVIEWMODEL.this.f41428x.set(bool);
                VIDEOPLAYDETAILVIEWMODEL.this.f41383a0.setValue(baseResponse.getResult());
                VIDEOPLAYDETAILVIEWMODEL.this.c1(this.f41454b, baseResponse.getResult().getVod_from_id());
                VIDEOPLAYDETAILVIEWMODEL.this.f41414q.set(baseResponse.getResult().getVod_name());
                VIDEOPLAYDETAILVIEWMODEL.this.f41418s.set(baseResponse.getResult().getVod_year());
                if (!em.o.b(baseResponse.getResult().getUpload_user_name())) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41410o.set(baseResponse.getResult().getUpload_user_name());
                }
                if (!em.o.b(baseResponse.getResult().getUpload_user_head_img())) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41412p.set(baseResponse.getResult().getUpload_user_head_img());
                }
                VIDEOPLAYDETAILVIEWMODEL.this.f41398i = baseResponse.getResult().getUpload_user_id();
                if (!VideoCollectionDao.getInstance().isExist(baseResponse.getResult().getId())) {
                    VIDEOPLAYDETAILVIEWMODEL.this.C.set(bool);
                    VIDEOPLAYDETAILVIEWMODEL.this.B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection));
                } else {
                    VIDEOPLAYDETAILVIEWMODEL.this.C.set(Boolean.TRUE);
                    VIDEOPLAYDETAILVIEWMODEL.this.B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection_select));
                }
                if (baseResponse.getResult().getAudio_type() == 1) {
                    VIDEOPLAYDETAILVIEWMODEL.this.B0.set(Boolean.TRUE);
                    VIDEOPLAYDETAILVIEWMODEL.this.C0.set(bool);
                } else {
                    VIDEOPLAYDETAILVIEWMODEL.this.B0.set(bool);
                    VIDEOPLAYDETAILVIEWMODEL.this.C0.set(Boolean.TRUE);
                }
                if (baseResponse.getResult().getAudio_type_option() != null && baseResponse.getResult().getAudio_type_option().size() > 1) {
                    ObservableField<Boolean> observableField2 = VIDEOPLAYDETAILVIEWMODEL.this.f41429x0;
                    Boolean bool2 = Boolean.TRUE;
                    observableField2.set(bool2);
                    VIDEOPLAYDETAILVIEWMODEL.this.f41431y0.set(bool2);
                    VIDEOPLAYDETAILVIEWMODEL.this.f41433z0.set(baseResponse.getResult().getAudio_type_option().get(0).getType_name());
                    VIDEOPLAYDETAILVIEWMODEL.this.A0.set(baseResponse.getResult().getAudio_type_option().get(1).getType_name());
                } else if (baseResponse.getResult().getAudio_type_option() != null && baseResponse.getResult().getAudio_type_option().size() == 1) {
                    if (baseResponse.getResult().getAudio_type_option().get(0).getType() == 1) {
                        VIDEOPLAYDETAILVIEWMODEL.this.f41433z0.set(baseResponse.getResult().getAudio_type_option().get(0).getType_name());
                        VIDEOPLAYDETAILVIEWMODEL.this.f41429x0.set(Boolean.TRUE);
                        VIDEOPLAYDETAILVIEWMODEL.this.f41431y0.set(bool);
                    } else if (baseResponse.getResult().getAudio_type_option().get(0).getType() == 2) {
                        VIDEOPLAYDETAILVIEWMODEL.this.A0.set(baseResponse.getResult().getAudio_type_option().get(0).getType_name());
                        VIDEOPLAYDETAILVIEWMODEL.this.f41429x0.set(bool);
                        VIDEOPLAYDETAILVIEWMODEL.this.f41431y0.set(Boolean.TRUE);
                    }
                }
                if (!em.o.b(baseResponse.getResult().getVod_douban_score())) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41420t.set(r.a().getResources().getString(R.string.str_score) + baseResponse.getResult().getVod_douban_score());
                }
                String vod_area = baseResponse.getResult().getVod_area();
                if (!em.o.b(baseResponse.getResult().getVod_area())) {
                    vod_area = vod_area + "  " + baseResponse.getResult().getVod_year();
                }
                if (!em.o.b(baseResponse.getResult().getVod_tag())) {
                    vod_area = vod_area + "  " + baseResponse.getResult().getVod_tag();
                }
                VIDEOPLAYDETAILVIEWMODEL.this.f41416r.set(vod_area);
                if (baseResponse.getResult().getType_pid() != 2 && baseResponse.getResult().getType_pid() != 4) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41425v0.set(bool);
                    return;
                }
                if (baseResponse.getResult().getSeries_info() != null && baseResponse.getResult().getSeries_info().size() > 0) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41423u0.set(Boolean.TRUE);
                    VIDEOPLAYDETAILVIEWMODEL.this.f41419s0.clear();
                    for (int i10 = 0; i10 < baseResponse.getResult().getSeries_info().size(); i10++) {
                        if (baseResponse.getResult().getSeries_info().get(i10).getDefault().booleanValue()) {
                            VIDEOPLAYDETAILVIEWMODEL.this.f41421t0.set(baseResponse.getResult().getSeries_info().get(i10).getSeries());
                        }
                        VIDEOPLAYDETAILVIEWMODEL.this.f41419s0.add(new a3(VIDEOPLAYDETAILVIEWMODEL.this, baseResponse.getResult().getSeries_info().get(i10)));
                    }
                } else {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41425v0.set(bool);
                    VIDEOPLAYDETAILVIEWMODEL.this.f41419s0.clear();
                }
                if (baseResponse.getResult().getVod_isend() == 1) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41422u.set(baseResponse.getResult().getVod_total() + r.a().getResources().getString(R.string.text_colections));
                } else {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41422u.set(r.a().getResources().getString(R.string.text_up_colections, baseResponse.getResult().getVod_serial()));
                }
                VIDEOPLAYDETAILVIEWMODEL.this.f41425v0.set(Boolean.TRUE);
                return;
            }
            VIDEOPLAYDETAILVIEWMODEL.this.D.set(Boolean.FALSE);
            VIDEOPLAYDETAILVIEWMODEL.this.f41428x.set(Boolean.TRUE);
        }
    }

    public class j implements u<BaseResponse<VideoShareDataEntry>> {
        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public j() {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<VideoShareDataEntry> baseResponse) {
            if (baseResponse.isOk() && baseResponse.getResult() != null) {
                VIDEOPLAYDETAILVIEWMODEL.this.f41387c0.setValue(baseResponse.getResult());
            }
        }
    }

    public class k implements u<BaseResponse<String>> {
        @Override // ii.u
        public void onError(Throwable th2) {
        }

        public k() {
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                p.c(baseResponse.getMessage());
            }
        }
    }

    public class l implements u<BaseResponse<VideoComment1Entry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41458b;

        public l(boolean z10) {
            this.f41458b = z10;
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.f41405l0.clear();
            VIDEOPLAYDETAILVIEWMODEL.this.K.set(Boolean.TRUE);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.b(bVar);
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<VideoComment1Entry> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f41458b) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41405l0.clear();
                }
                ObservableField<Boolean> observableField = VIDEOPLAYDETAILVIEWMODEL.this.K;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                VIDEOPLAYDETAILVIEWMODEL.this.f41396h = baseResponse.getResult().getTotal_discuss_num();
                if (baseResponse.getResult().getList() != null && baseResponse.getResult().getList().size() > 0) {
                    VIDEOPLAYDETAILVIEWMODEL.this.L.set(Boolean.TRUE);
                    VIDEOPLAYDETAILVIEWMODEL.this.f0(baseResponse.getResult().getList());
                    VIDEOPLAYDETAILVIEWMODEL.this.f41392f = baseResponse.getResult().getList().get(baseResponse.getResult().getList().size() - 1).getId();
                } else {
                    if (VIDEOPLAYDETAILVIEWMODEL.this.f41392f == 0) {
                        VIDEOPLAYDETAILVIEWMODEL.this.K.set(Boolean.TRUE);
                        VIDEOPLAYDETAILVIEWMODEL.this.L.set(bool);
                    }
                    VIDEOPLAYDETAILVIEWMODEL.this.M.call();
                }
                VIDEOPLAYDETAILVIEWMODEL.this.N.call();
            }
        }
    }

    public class m implements u<BaseResponse<String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f41460b;

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public m(y0 y0Var) {
            this.f41460b = y0Var;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() != null) {
                    if (VIDEOPLAYDETAILVIEWMODEL.this.f41405l0.size() > 1) {
                        VIDEOPLAYDETAILVIEWMODEL.this.f41405l0.remove(this.f41460b);
                        VIDEOPLAYDETAILVIEWMODEL.this.f41396h--;
                    } else {
                        VIDEOPLAYDETAILVIEWMODEL.this.P.call();
                    }
                    p.b(r.a().getResources().getString(R.string.str_success));
                    return;
                }
                return;
            }
            p.b(r.a().getResources().getString(R.string.str_fail));
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            p.b(r.a().getResources().getString(R.string.str_fail));
        }
    }

    public class n implements u<BaseResponse<String>> {
        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
        }

        public n() {
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<String> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() != null) {
                    VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel = VIDEOPLAYDETAILVIEWMODEL.this;
                    videoplaydetailviewmodel.f41405l0.get(videoplaydetailviewmodel.S.get().f73813d).f73862f.remove(VIDEOPLAYDETAILVIEWMODEL.this.S.get());
                    VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel2 = VIDEOPLAYDETAILVIEWMODEL.this;
                    if (videoplaydetailviewmodel2.f41405l0.get(videoplaydetailviewmodel2.S.get().f73813d).f73862f.size() == 0) {
                        VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel3 = VIDEOPLAYDETAILVIEWMODEL.this;
                        ObservableField<Boolean> observableField = videoplaydetailviewmodel3.f41405l0.get(videoplaydetailviewmodel3.S.get().f73813d).f73871o;
                        Boolean bool = Boolean.FALSE;
                        observableField.set(bool);
                        VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel4 = VIDEOPLAYDETAILVIEWMODEL.this;
                        videoplaydetailviewmodel4.f41405l0.get(videoplaydetailviewmodel4.S.get().f73813d).f73872p.set(bool);
                    }
                    p.b(r.a().getResources().getString(R.string.str_success));
                    return;
                }
                return;
            }
            p.b(r.a().getResources().getString(R.string.str_fail));
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            p.b(r.a().getResources().getString(R.string.str_fail));
        }
    }

    public class o implements u<BaseResponse<List<BarrageListEntry>>> {
        public o() {
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            VIDEOPLAYDETAILVIEWMODEL.this.f41389d0.setValue(new ArrayList());
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            VIDEOPLAYDETAILVIEWMODEL.this.f41390d1 = bVar;
        }

        @Override // ii.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<BarrageListEntry>> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() != null && baseResponse.getResult().size() >= 0) {
                    VIDEOPLAYDETAILVIEWMODEL.this.f41389d0.setValue(baseResponse.getResult());
                    return;
                }
                return;
            }
            VIDEOPLAYDETAILVIEWMODEL.this.f41389d0.setValue(new ArrayList());
        }
    }

    public static /* synthetic */ void i0(Throwable th2) throws Exception {
    }

    public void W0(int i10) {
        for (int i11 = 0; i11 < this.f41413p0.size(); i11++) {
            if (i10 == i11 && !this.f41413p0.get(i11).f73609c.get().booleanValue()) {
                this.A.set(Integer.valueOf(i10));
                this.f41413p0.get(i11).f73609c.set(Boolean.TRUE);
                this.F.setValue(Integer.valueOf(i10));
            } else if (i10 == i11) {
                return;
            } else {
                this.f41413p0.get(i11).f73609c.set(Boolean.FALSE);
            }
        }
    }

    public void X0(int i10) {
        for (int i11 = 0; i11 < this.f41409n0.size(); i11++) {
            if (i10 == i11 && !this.f41409n0.get(i11).f73587e.get().booleanValue()) {
                this.f41409n0.get(i11).f73587e.set(Boolean.TRUE);
                this.A.set(Integer.valueOf(i10));
                this.F.setValue(Integer.valueOf(i10));
            } else if (i10 == i11) {
                return;
            } else {
                this.f41409n0.get(i11).f73587e.set(Boolean.FALSE);
            }
        }
    }

    public void Y0(int i10, int i11) {
        int i12 = 0;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            if (this.f41409n0.size() > 0) {
                while (i12 < this.f41409n0.size()) {
                    if (i11 == i12) {
                        this.f41409n0.get(i12).f73587e.set(Boolean.TRUE);
                    } else {
                        this.f41409n0.get(i12).f73587e.set(Boolean.FALSE);
                    }
                    i12++;
                }
                this.f41385b0.setValue(Integer.valueOf(i11));
                return;
            }
            return;
        }
        if (i10 != 3 || this.f41413p0.size() <= 0) {
            return;
        }
        while (i12 < this.f41413p0.size()) {
            if (i11 == i12) {
                this.f41413p0.get(i12).f73609c.set(Boolean.TRUE);
            } else {
                this.f41413p0.get(i12).f73609c.set(Boolean.FALSE);
            }
            i12++;
        }
        this.f41385b0.setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        this.Y0.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        this.Y0.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        this.Z0.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0() {
        this.G.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0() {
        this.f41397h0.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0() {
        this.U.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0() {
        this.Z.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0() {
        this.V.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0() {
        this.W.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0() {
        this.X.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0() {
        if (this.f41431y0.get().booleanValue()) {
            this.D0.setValue(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0() {
        if (this.f41429x0.get().booleanValue()) {
            this.D0.setValue(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0() {
        this.O.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        this.Y.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0() {
        this.Q.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0() {
        this.T.call();
        O0(this.S.get().f73811b.getId(), this.S.get().f73812c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0() {
        this.V0.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0() {
        this.V0.postValue(Boolean.TRUE);
    }

    public void K0(int i10, int i11) {
        mi.b bVar = this.f41390d1;
        if (bVar != null && !bVar.isDisposed()) {
            this.f41390d1.dispose();
        }
        HashMap map = new HashMap();
        map.put("collection", Integer.valueOf(i11));
        map.put("vod_id", Integer.valueOf(i10));
        map.put("start_time", 0);
        map.put("end_time", 10000);
        ((n9.a) this.f64407b).I(map).e(new w9.l()).e(new w9.c()).b(new o());
    }

    public void L0(y0 y0Var, int i10) {
        HashMap map = new HashMap();
        map.put("discuss_id", Integer.valueOf(y0Var.f73859c.getId()));
        ((n9.a) this.f64407b).v(map).e(new w9.l()).e(new w9.c()).b(new m(y0Var));
    }

    public void M0(boolean z10, int i10) {
        if (z10) {
            this.f41392f = 0;
        }
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("last_discuss_id", Integer.valueOf(this.f41392f));
        ((n9.a) this.f64407b).B(map).e(new w9.l()).e(new w9.c()).b(new l(z10));
    }

    public void O0(int i10, int i11) {
        HashMap map = new HashMap();
        map.put("discuss_id", Integer.valueOf(i10));
        ((n9.a) this.f64407b).v(map).e(new w9.l()).e(new w9.c()).b(new n());
    }

    public void P0(int i10, String str) {
        HashMap map = new HashMap();
        map.put("videoId", Integer.valueOf(i10));
        map.put("suggestContent", str);
        ((n9.a) this.f64407b).W(map).e(new w9.l()).e(new w9.c()).b(new k());
    }

    public void Q0(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put("type_id", Integer.valueOf(i10));
        map.put("type", str);
        map.put("psize", 6);
        map.put("area", str2);
        map.put("is_random", 1);
        b(((n9.a) this.f64407b).m(map).e(new w9.l()).e(new w9.c()).l(new oi.g() { // from class: w9.g6
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f73633b.h0((BaseResponse) obj);
            }
        }, new oi.g() { // from class: w9.h6
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                VIDEOPLAYDETAILVIEWMODEL.i0((Throwable) obj);
            }
        }));
    }

    public void R0(List<VideoBean> list, int i10, String str) {
        this.A.set(Integer.valueOf(i10));
        this.f41413p0.clear();
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).position = i11;
            e3 e3Var = new e3(this, list.get(i11), i10, str);
            if (i10 == i11) {
                e3Var.f73609c.set(Boolean.TRUE);
            } else {
                e3Var.f73609c.set(Boolean.FALSE);
            }
            this.f41413p0.add(e3Var);
            this.f41385b0.setValue(Integer.valueOf(i10));
        }
    }

    public void S0(int i10, String str, String str2, int i11) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("cur_time", str);
        map.put("sign", str2);
        map.put(VideoDownloadEntity.AUDIO_TYPE, Integer.valueOf(i11));
        if (sa.e.j() == 12) {
            map.put("vi", sa.e.l());
        }
        ((n9.a) this.f64407b).i(map).k(new f0()).e(new w9.l()).e(new w9.c()).b(new i(i10));
    }

    public void T(String str, VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
        this.f41400j.postDelayed(new g(str, videoBean, recommandVideosEntity, i10), 0L);
    }

    public void T0(List<VideoBean> list, int i10) {
        this.A.set(Integer.valueOf(i10));
        this.f41409n0.clear();
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).position = i11;
            c3 c3Var = new c3(this, list.get(i11), i10);
            if (i10 == i11) {
                c3Var.f73587e.set(Boolean.TRUE);
            } else {
                c3Var.f73587e.set(Boolean.FALSE);
            }
            this.f41409n0.add(c3Var);
            this.f41385b0.setValue(Integer.valueOf(i10));
        }
    }

    public void U(int i10, String str, String str2, int i11, int i12, String str3) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i10));
        map.put("content", str2);
        map.put("tags", str);
        map.put("vod_id", Integer.valueOf(i11));
        map.put("collection", Integer.valueOf(i12));
        map.put(GAMConfig.KEY_SCORE, str3);
        ((n9.a) this.f64407b).t(map).e(new w9.l()).e(new w9.c()).b(new e(i10));
    }

    public void U0(String str, VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, int i10) {
        String str2 = str + "&type=2";
        Log.i("wangyi", "下载地址为：" + str2);
        x.a(str2, new h(videoBean, recommandVideosEntity, i10));
    }

    public void V0(int i10) {
        this.f41427w0.setValue(Integer.valueOf(i10));
    }

    public void Z0(int i10) {
        this.f41393f0.setValue(Integer.valueOf(i10));
    }

    public void a0(int i10, int i11, String str, long j10) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection", Integer.valueOf(i11));
        map.put("content", str);
        map.put("send_time", Integer.valueOf((int) (j10 / 1000)));
        ((n9.a) this.f64407b).w(map).e(new w9.l()).e(new w9.c()).b(new a(str));
    }

    public void a1(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_ids", Integer.valueOf(videoCollectionEntry.getId()));
        ((n9.a) this.f64407b).T(map).e(new w9.l()).e(new w9.c()).b(new d(videoCollectionEntry));
    }

    public SingleLiveEvent<Boolean> b0() {
        if (this.H == null) {
            this.H = new SingleLiveEvent<>();
        }
        return this.H;
    }

    public void b1(VideoCollectionEntry videoCollectionEntry, int i10) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(videoCollectionEntry.getId()));
        map.put(VideoCollectionEntry.TYPE_PID, Integer.valueOf(videoCollectionEntry.getType_pid()));
        map.put("type_id", Integer.valueOf(i10));
        ((n9.a) this.f64407b).f(map).e(new w9.l()).e(new w9.c()).b(new c(videoCollectionEntry));
    }

    public SingleLiveEvent<Boolean> c0() {
        if (this.J == null) {
            this.J = new SingleLiveEvent<>();
        }
        return this.J;
    }

    public void c1(int i10, String str) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("vod_from_id", str);
        ((n9.a) this.f64407b).L(map).e(new w9.l()).e(new w9.c()).b(new j());
    }

    public SingleLiveEvent<Boolean> d0() {
        if (this.I == null) {
            this.I = new SingleLiveEvent<>();
        }
        return this.I;
    }

    public void d1(int i10, int i11, int i12, int i13, int i14) {
        HashMap map = new HashMap();
        map.put("vod_id", Integer.valueOf(i10));
        map.put("collection_id", Integer.valueOf(i11));
        map.put("view_time", Integer.valueOf(i12));
        map.put("total_time", Integer.valueOf(i13));
        map.put("vod_time", Integer.valueOf(i14));
        ((n9.a) this.f64407b).u(map).e(new w9.l()).e(new w9.c()).b(new b());
    }

    public void e0() {
        HashMap map = new HashMap();
        map.put("conf_key", "p2p_config");
        i9.a.a().h(map).k(new f0()).e(new w9.l()).e(new w9.c()).b(new f());
    }

    public void f0(List<CommentListVideoEntry> list) {
        int size = this.f41405l0.size();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f41405l0.add(new y0(this, list.get(i10), i10 + size));
        }
    }

    public void g0(VideoBean videoBean, RecommandVideosEntity recommandVideosEntity, DownloadAddSuccessEntry downloadAddSuccessEntry, int i10) {
        VideoDownloadEntity videoDownloadEntity = new VideoDownloadEntity();
        videoDownloadEntity.setComplete_name(recommandVideosEntity.getVod_name() + Z7.f27998r + videoBean.getTitle());
        videoDownloadEntity.setId(recommandVideosEntity.getId());
        videoDownloadEntity.setCoverUrl(recommandVideosEntity.getVod_pic());
        videoDownloadEntity.setName(recommandVideosEntity.getVod_name());
        videoDownloadEntity.setLastName(videoBean.getTitle());
        videoDownloadEntity.setVideoType(recommandVideosEntity.getType_pid());
        videoDownloadEntity.setCollection(videoBean.getCollection());
        videoDownloadEntity.setAudio_type(recommandVideosEntity.getAudio_type());
        if (videoBean.is_p2p() == 1) {
            videoDownloadEntity.setUrl(videoBean.getVod_url());
        } else {
            videoDownloadEntity.setUrl(videoBean.getOrginal_url());
        }
        if (i10 < 0) {
            i10 = 0;
        }
        videoDownloadEntity.setVideo_position(i10);
        videoDownloadEntity.setComplete(0);
        videoDownloadEntity.setSize(0L);
        videoDownloadEntity.setStreamid(downloadAddSuccessEntry.getResource());
        videoDownloadEntity.setStatus(downloadAddSuccessEntry.getStatus());
        videoDownloadEntity.setOrginal_url(videoBean.getOrginal_url());
        VideoDownloadDao.getInstance().insertHistory(videoDownloadEntity);
    }

    public VIDEOPLAYDETAILVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41392f = 0;
        this.f41394g = 2;
        this.f41396h = 0;
        this.f41400j = new Handler();
        this.f41402k = new SingleLiveEvent<>();
        Boolean bool = Boolean.TRUE;
        this.f41404l = new ObservableField<>(bool);
        this.f41406m = new ObservableField<>(bool);
        this.f41408n = new SingleLiveEvent<>();
        this.f41410o = new ObservableField<>();
        this.f41412p = new ObservableField<>();
        this.f41414q = new ObservableField<>("");
        this.f41416r = new ObservableField<>("");
        this.f41418s = new ObservableField<>("");
        this.f41420t = new ObservableField<>("");
        this.f41422u = new ObservableField<>("");
        Boolean bool2 = Boolean.FALSE;
        this.f41424v = new ObservableField<>(bool2);
        this.f41426w = new ObservableField<>(bool2);
        this.f41428x = new ObservableField(bool2);
        this.f41430y = new ObservableField<>(bool2);
        this.f41432z = new ObservableField<>(bool2);
        this.A = new ObservableField<>(0);
        this.B = new ObservableField<>();
        this.C = new ObservableField<>(bool2);
        this.D = new ObservableField<>(bool);
        this.E = new SingleLiveEvent<>();
        this.F = new SingleLiveEvent<>();
        this.G = new SingleLiveEvent<>();
        this.K = new ObservableField<>(bool2);
        this.L = new ObservableField<>(bool2);
        this.M = new SingleLiveEvent<>();
        this.N = new SingleLiveEvent<>();
        this.O = new SingleLiveEvent<>();
        this.P = new SingleLiveEvent<>();
        this.Q = new SingleLiveEvent<>();
        this.R = new SingleLiveEvent<>();
        this.S = new ObservableField<>();
        this.T = new SingleLiveEvent<>();
        this.U = new SingleLiveEvent<>();
        this.V = new SingleLiveEvent<>();
        this.W = new SingleLiveEvent<>();
        this.X = new SingleLiveEvent<>();
        this.Y = new SingleLiveEvent<>();
        this.Z = new SingleLiveEvent<>();
        this.f41383a0 = new SingleLiveEvent<>();
        this.f41385b0 = new SingleLiveEvent<>();
        this.f41387c0 = new SingleLiveEvent<>();
        this.f41389d0 = new SingleLiveEvent<>();
        this.f41391e0 = new SingleLiveEvent<>();
        this.f41393f0 = new SingleLiveEvent<>();
        this.f41395g0 = new SingleLiveEvent<>();
        this.f41397h0 = new SingleLiveEvent<>();
        this.f41399i0 = new SingleLiveEvent<>();
        this.f41401j0 = new ObservableArrayList();
        this.f41403k0 = fm.c.d(new fm.d() { // from class: w9.n5
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_guss_video);
            }
        });
        this.f41405l0 = new ObservableArrayList();
        this.f41407m0 = fm.c.d(new fm.d() { // from class: w9.p5
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_commit_list);
            }
        });
        this.f41409n0 = new ObservableArrayList();
        this.f41411o0 = fm.c.d(new fm.d() { // from class: w9.x5
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_play_tv_set_num);
            }
        });
        this.f41413p0 = new ObservableArrayList();
        this.f41415q0 = fm.c.d(new fm.d() { // from class: w9.z5
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_play_variety_set_num);
            }
        });
        this.f41417r0 = fm.c.d(new fm.d() { // from class: w9.a6
            @Override // fm.d
            public final void a(fm.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_video_season_item);
            }
        });
        this.f41419s0 = new ObservableArrayList();
        this.f41421t0 = new ObservableField<>("");
        this.f41423u0 = new ObservableField<>(bool2);
        this.f41425v0 = new ObservableField<>(bool2);
        this.f41427w0 = new SingleLiveEvent<>();
        this.f41429x0 = new ObservableField<>(bool2);
        this.f41431y0 = new ObservableField<>(bool2);
        this.f41433z0 = new ObservableField<>("");
        this.A0 = new ObservableField<>("");
        this.B0 = new ObservableField<>(bool);
        this.C0 = new ObservableField<>(bool2);
        this.D0 = new SingleLiveEvent<>();
        this.E0 = new ul.b(new ul.a() { // from class: w9.b6
            @Override // ul.a
            public final void call() {
                this.f73569a.F0();
            }
        });
        this.F0 = new ul.b(new ul.a() { // from class: w9.c6
            @Override // ul.a
            public final void call() {
                this.f73592a.G0();
            }
        });
        this.G0 = new ul.b(new ul.a() { // from class: w9.d6
            @Override // ul.a
            public final void call() {
                this.f73604a.H0();
            }
        });
        this.H0 = new ul.b(new ul.a() { // from class: w9.e6
            @Override // ul.a
            public final void call() {
                this.f73612a.I0();
            }
        });
        this.I0 = new ul.b(new ul.a() { // from class: w9.f6
            @Override // ul.a
            public final void call() {
                this.f73627a.J0();
            }
        });
        this.J0 = new ul.b(new ul.a() { // from class: w9.y5
            @Override // ul.a
            public final void call() {
                this.f73899a.l0();
            }
        });
        this.K0 = new ul.b(new ul.a() { // from class: w9.i6
            @Override // ul.a
            public final void call() {
                this.f73647a.m0();
            }
        });
        this.L0 = new ul.b(new ul.a() { // from class: w9.j6
            @Override // ul.a
            public final void call() {
                this.f73656a.n0();
            }
        });
        this.M0 = new ul.b(new ul.a() { // from class: w9.k6
            @Override // ul.a
            public final void call() {
                this.f73677a.o0();
            }
        });
        this.N0 = new ul.b(new ul.a() { // from class: w9.l6
            @Override // ul.a
            public final void call() {
                this.f73686a.p0();
            }
        });
        this.O0 = new ul.b(new ul.a() { // from class: w9.m6
            @Override // ul.a
            public final void call() {
                this.f73704a.q0();
            }
        });
        this.P0 = new ul.b(new ul.a() { // from class: w9.n6
            @Override // ul.a
            public final void call() {
                this.f73709a.r0();
            }
        });
        this.Q0 = new ul.b(new ul.a() { // from class: w9.o6
            @Override // ul.a
            public final void call() {
                this.f73724a.s0();
            }
        });
        this.R0 = new ul.b(new ul.a() { // from class: w9.p6
            @Override // ul.a
            public final void call() {
                this.f73749a.t0();
            }
        });
        this.S0 = new ul.b(new ul.a() { // from class: w9.o5
            @Override // ul.a
            public final void call() {
                this.f73723a.u0();
            }
        });
        this.T0 = new ul.b(new ul.a() { // from class: w9.q5
            @Override // ul.a
            public final void call() {
                this.f73762a.w0();
            }
        });
        this.U0 = new ul.b(new ul.a() { // from class: w9.r5
            @Override // ul.a
            public final void call() {
                this.f73769a.x0();
            }
        });
        this.V0 = new SingleLiveEvent<>();
        this.W0 = new ul.b(new ul.a() { // from class: w9.s5
            @Override // ul.a
            public final void call() {
                this.f73784a.y0();
            }
        });
        this.X0 = new ul.b(new ul.a() { // from class: w9.t5
            @Override // ul.a
            public final void call() {
                this.f73809a.z0();
            }
        });
        this.Y0 = new SingleLiveEvent<>();
        this.Z0 = new SingleLiveEvent<>();
        this.f41384a1 = new ul.b(new ul.a() { // from class: w9.u5
            @Override // ul.a
            public final void call() {
                this.f73822a.A0();
            }
        });
        this.f41386b1 = new ul.b(new ul.a() { // from class: w9.v5
            @Override // ul.a
            public final void call() {
                this.f73833a.B0();
            }
        });
        this.f41388c1 = new ul.b(new ul.a() { // from class: w9.w5
            @Override // ul.a
            public final void call() {
                this.f73848a.C0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0() {
        if (!yl.b.a(getApplication())) {
            p.b(r.a().getResources().getString(R.string.text_toast_nonet));
        } else if (!sa.e.q()) {
            this.f41428x.set(Boolean.FALSE);
            this.D.set(Boolean.TRUE);
            this.E.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0() {
        c0().setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        d0().setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        b0().setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(BaseResponse baseResponse) throws Exception {
        if (baseResponse.isOk()) {
            this.f41401j0.clear();
            if (baseResponse.getResult() != null && ((List) baseResponse.getResult()).size() > 0) {
                this.f41424v.set(Boolean.TRUE);
                Iterator it = ((List) baseResponse.getResult()).iterator();
                while (it.hasNext()) {
                    this.f41401j0.add(new s1(this, (RecommandVideosEntity) it.next()));
                }
                return;
            }
            this.f41424v.set(Boolean.FALSE);
        }
    }

    public void N0(y0 y0Var) {
        p.b(r.a().getResources().getString(R.string.str_success));
    }
}
