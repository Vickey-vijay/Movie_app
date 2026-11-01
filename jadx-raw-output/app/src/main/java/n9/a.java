package n9;

import androidx.annotation.NonNull;
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
import okhttp3.MultipartBody;

/* JADX INFO: compiled from: AppRepository.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends yl.a implements o9.a, o9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f64707c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9.a f64708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o9.b f64709b;

    public static a Y(o9.a aVar, o9.b bVar) {
        if (f64707c == null) {
            synchronized (a.class) {
                if (f64707c == null) {
                    f64707c = new a(aVar, bVar);
                }
            }
        }
        return f64707c;
    }

    @Override // o9.a
    public t<BaseResponse<RegisterEntity>> A(Map<String, Object> map) {
        return this.f64708a.A(map);
    }

    @Override // o9.a
    public t<BaseResponse<VideoComment1Entry>> B(Map<String, Object> map) {
        return this.f64708a.B(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> C(Map<String, Object> map) {
        return this.f64708a.C(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<TKBean>>> D(Map<String, Object> map) {
        return this.f64708a.D(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<VideoCollectionBeanEntry>>> E(Map<String, Object> map) {
        return this.f64708a.E(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<HotNewSearchEntry>>> F() {
        return this.f64708a.F();
    }

    @Override // o9.a
    public t<BaseResponse<UserDeviceEntity>> G(Map<String, Object> map) {
        return this.f64708a.G(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> H(Map<String, Object> map) {
        return this.f64708a.H(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<BarrageListEntry>>> I(Map<String, Object> map) {
        return this.f64708a.I(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<VideoCollectionEntry>>> J(Map<String, Object> map) {
        return this.f64708a.J(map);
    }

    @Override // o9.a
    public t<BaseResponse<RankVideoEntry>> K(Map<String, Object> map) {
        return this.f64708a.K(map);
    }

    @Override // o9.a
    public t<BaseResponse<VideoShareDataEntry>> L(Map<String, Object> map) {
        return this.f64708a.L(map);
    }

    @Override // o9.a
    public t<BaseResponse<ExtensionShareEntry>> M() {
        return this.f64708a.M();
    }

    @Override // o9.a
    public t<BaseResponse<List<OrderListEntry>>> N() {
        return this.f64708a.N();
    }

    @Override // o9.a
    public t<BaseResponse<AdSysConfEntry>> O(Map<String, Object> map) {
        return this.f64708a.O(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> P(Map<String, Object> map) {
        return this.f64708a.P(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<FeedbackRecordEntry>>> Q(Map<String, Object> map) {
        return this.f64708a.Q(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<ShortVideoSysConfEntry>>> R(Map<String, Object> map) {
        return this.f64708a.R(map);
    }

    @Override // o9.a
    public t<BaseResponse<MineUserInfo>> S(Map<String, Object> map) {
        return this.f64708a.S(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> T(Map<String, Object> map) {
        return this.f64708a.T(map);
    }

    @Override // o9.a
    public t<BaseResponse<HomeVideoPageEntry>> U(Map<String, Object> map) {
        return this.f64708a.U(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> V(Map<String, Object> map) {
        return this.f64708a.V(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> W(Map<String, Object> map) {
        return this.f64708a.W(map);
    }

    @Override // o9.a
    public t<BaseResponse<VideoMoreEntry>> a(Map<String, Object> map) {
        return this.f64708a.a(map);
    }

    @Override // o9.a
    public t<BaseResponse<TKBean>> b(Map<String, Object> map) {
        return this.f64708a.b(map);
    }

    @Override // o9.a
    public t<BaseResponse<MineUserInfo>> c(Map<String, Object> map) {
        return this.f64708a.c(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<HomeTitleEntry>>> d(Map<String, Object> map) {
        return this.f64708a.d(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<SpecialCollectionEntry>>> e(Map<String, Object> map) {
        return this.f64708a.e(map);
    }

    @Override // o9.a
    public t<BaseResponse<CollectionVideoEntry>> f(Map<String, Object> map) {
        return this.f64708a.f(map);
    }

    @Override // o9.a
    public t<BaseResponse<RankTopicEntry>> g(Map<String, Object> map) {
        return this.f64708a.g(map);
    }

    @Override // o9.a
    public t<BaseResponse<AdInfoEntry>> getAdInfo() {
        return this.f64708a.getAdInfo();
    }

    @Override // o9.a
    public t<BaseResponse<String>> h(Map<String, Object> map) {
        return this.f64708a.h(map);
    }

    @Override // o9.a
    public t<BaseResponse<RecommandVideosEntity>> i(Map<String, Object> map) {
        return this.f64708a.i(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> j(Map<String, Object> map) {
        return this.f64708a.j(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<HomeMultipleEntry>>> k(Map<String, Object> map) {
        return this.f64708a.k(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> l(Map<String, Object> map) {
        return this.f64708a.l(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> m(Map<String, Object> map) {
        return this.f64708a.m(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<ChannnelFilterEntry>>> n() {
        return this.f64708a.n();
    }

    @Override // o9.a
    public t<BaseResponse<List<SearchExtendEntry>>> o(Map<String, Object> map) {
        return this.f64708a.o(map);
    }

    @Override // o9.a
    public t<BaseResponse<RankVideoEntry>> p(Map<String, Object> map) {
        return this.f64708a.p(map);
    }

    @Override // o9.a
    public t<BaseResponse<ExtensionRecordEntry>> q() {
        return this.f64708a.q();
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> r(Map<String, Object> map) {
        return this.f64708a.r(map);
    }

    @Override // o9.a
    public t<BaseResponse<LoginUserEntity>> s(Map<String, Object> map) {
        return this.f64708a.s(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> t(Map<String, Object> map) {
        return this.f64708a.t(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> u(Map<String, Object> map) {
        return this.f64708a.u(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> v(Map<String, Object> map) {
        return this.f64708a.v(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> w(Map<String, Object> map) {
        return this.f64708a.w(map);
    }

    @Override // o9.a
    public t<BaseResponse<List<RecommandVideosEntity>>> x(Map<String, Object> map) {
        return this.f64708a.x(map);
    }

    @Override // o9.a
    public t<BaseResponse<String>> y(Map<String, Object> map) {
        return this.f64708a.y(map);
    }

    @Override // o9.a
    public t<BaseResponse<UploadFileEntry>> z(MultipartBody.Part part) {
        return this.f64708a.z(part);
    }

    public a(@NonNull o9.a aVar, @NonNull o9.b bVar) {
        this.f64708a = aVar;
        this.f64709b = bVar;
    }
}
