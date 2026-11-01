package p9;

import com.google.gson.Gson;
import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.AdSysConfEntry;
import com.mgs.carparking.netbean.BarrageListEntry;
import com.mgs.carparking.netbean.ChannnelFilterEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.ExtensionRecordEntry;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.mgs.carparking.netbean.FeedbackRecordEntry;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.HomeTitleEntry;
import com.mgs.carparking.netbean.HomeVideoPageEntry;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.netbean.LoginUserEntity;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.netbean.OrderListEntry;
import com.mgs.carparking.netbean.RankTopicEntry;
import com.mgs.carparking.netbean.RankVideoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.RegisterEntity;
import com.mgs.carparking.netbean.SearchExtendEntry;
import com.mgs.carparking.netbean.ShortVideoSysConfEntry;
import com.mgs.carparking.netbean.TKBean;
import com.mgs.carparking.netbean.UploadFileEntry;
import com.mgs.carparking.netbean.UserDeviceEntity;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import com.mgs.carparking.netbean.VideoComment1Entry;
import com.mgs.carparking.netbean.VideoMoreEntry;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import ii.t;
import java.util.List;
import java.util.Map;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: HttpDataSourceImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements o9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f66071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static MediaType f66072c = MediaType.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f66073a;

    public static b X(a aVar) {
        if (f66071b == null) {
            synchronized (b.class) {
                if (f66071b == null) {
                    f66071b = new b(aVar);
                }
            }
        }
        return f66071b;
    }

    @Override // o9.a
    public t<BaseResponse<RegisterEntity>> A(Map<String, Object> map) {
        return this.f66073a.A(map);
    }

    @Override // o9.a
    public t<BaseResponse<VideoComment1Entry>> B(Map<String, Object> map) {
        return this.f66073a.B(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> C(Map<String, Object> map) {
        return this.f66073a.C(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<TKBean>>> D(Map<String, Object> map) {
        return this.f66073a.D(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<VideoCollectionBeanEntry>>> E(Map<String, Object> map) {
        return this.f66073a.E(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<HotNewSearchEntry>>> F() {
        return this.f66073a.F();
    }

    @Override // o9.a
    public t<BaseResponse<UserDeviceEntity>> G(Map<String, Object> map) {
        return this.f66073a.G(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> H(Map<String, Object> map) {
        return this.f66073a.H(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<BarrageListEntry>>> I(Map<String, Object> map) {
        return this.f66073a.I(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<VideoCollectionEntry>>> J(Map<String, Object> map) {
        return this.f66073a.J(map);
    }

    @Override // o9.a
    public t<BaseResponse<RankVideoEntry>> K(Map<String, Object> map) {
        return this.f66073a.K(map);
    }

    @Override // o9.a
    public t<BaseResponse<VideoShareDataEntry>> L(Map<String, Object> map) {
        return this.f66073a.L(map);
    }

    @Override // o9.a
    public t<BaseResponse<ExtensionShareEntry>> M() {
        return this.f66073a.M();
    }

    @Override // o9.a
    public t<BaseResponse<List<OrderListEntry>>> N() {
        return this.f66073a.N();
    }

    @Override // o9.a
    public t<BaseResponse<AdSysConfEntry>> O(Map<String, Object> map) {
        return this.f66073a.O(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> P(Map<String, Object> map) {
        return this.f66073a.P(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<FeedbackRecordEntry>>> Q(Map<String, Object> map) {
        return this.f66073a.Q(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<ShortVideoSysConfEntry>>> R(Map<String, Object> map) {
        return this.f66073a.R(map);
    }

    @Override // o9.a
    public t<BaseResponse<MineUserInfo>> S(Map<String, Object> map) {
        return this.f66073a.S(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> T(Map<String, Object> map) {
        return this.f66073a.H(map);
    }

    @Override // o9.a
    public t<BaseResponse<HomeVideoPageEntry>> U(Map<String, Object> map) {
        return this.f66073a.U(RequestBody.create(f66072c, new Gson().toJson(map)));
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> V(Map<String, Object> map) {
        return this.f66073a.V(RequestBody.create(f66072c, new Gson().toJson(map)));
    }

    @Override // o9.a
    public t<BaseResponse<String>> W(Map<String, Object> map) {
        return this.f66073a.T(RequestBody.create(f66072c, new Gson().toJson(map)));
    }

    @Override // o9.a
    public t<BaseResponse<VideoMoreEntry>> a(Map<String, Object> map) {
        return this.f66073a.a(map);
    }

    @Override // o9.a
    public t<BaseResponse<TKBean>> b(Map<String, Object> map) {
        return this.f66073a.b(map);
    }

    @Override // o9.a
    public t<BaseResponse<MineUserInfo>> c(Map<String, Object> map) {
        return this.f66073a.c(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<HomeTitleEntry>>> d(Map<String, Object> map) {
        return this.f66073a.d(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<SpecialCollectionEntry>>> e(Map<String, Object> map) {
        return this.f66073a.e(map);
    }

    @Override // o9.a
    public t<BaseResponse<CollectionVideoEntry>> f(Map<String, Object> map) {
        return this.f66073a.f(map);
    }

    @Override // o9.a
    public t<BaseResponse<RankTopicEntry>> g(Map<String, Object> map) {
        return this.f66073a.g(map);
    }

    @Override // o9.a
    public t<BaseResponse<AdInfoEntry>> getAdInfo() {
        return this.f66073a.getAdInfo();
    }

    @Override // o9.a
    public t<BaseResponse<String>> h(Map<String, Object> map) {
        return this.f66073a.h(map);
    }

    @Override // o9.a
    public t<BaseResponse<RecommandVideosEntity>> i(Map<String, Object> map) {
        return this.f66073a.i(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> j(Map<String, Object> map) {
        return this.f66073a.j(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<HomeMultipleEntry>>> k(Map<String, Object> map) {
        return this.f66073a.k(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> l(Map<String, Object> map) {
        return this.f66073a.l(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> m(Map<String, Object> map) {
        return this.f66073a.m(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<ChannnelFilterEntry>>> n() {
        return this.f66073a.n();
    }

    @Override // o9.a
    public t<BaseResponse<List<SearchExtendEntry>>> o(Map<String, Object> map) {
        return this.f66073a.o(map);
    }

    @Override // o9.a
    public t<BaseResponse<RankVideoEntry>> p(Map<String, Object> map) {
        return this.f66073a.p(map);
    }

    @Override // o9.a
    public t<BaseResponse<ExtensionRecordEntry>> q() {
        return this.f66073a.q();
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> r(Map<String, Object> map) {
        return this.f66073a.r(map);
    }

    @Override // o9.a
    public t<BaseResponse<LoginUserEntity>> s(Map<String, Object> map) {
        return this.f66073a.s(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> t(Map<String, Object> map) {
        return this.f66073a.t(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> u(Map<String, Object> map) {
        return this.f66073a.u(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> v(Map<String, Object> map) {
        return this.f66073a.v(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> w(Map<String, Object> map) {
        return this.f66073a.w(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> x(Map<String, Object> map) {
        return this.f66073a.x(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> y(Map<String, Object> map) {
        return this.f66073a.y(map);
    }

    @Override // o9.a
    public t<BaseResponse<UploadFileEntry>> z(MultipartBody.Part part) {
        return this.f66073a.z(part);
    }

    public b(a aVar) {
        this.f66073a = aVar;
    }
}
