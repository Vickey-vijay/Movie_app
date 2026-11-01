package o9;

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
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.Part;

/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a {
    t<BaseResponse<RegisterEntity>> A(@FieldMap Map<String, Object> map);

    t<BaseResponse<VideoComment1Entry>> B(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> C(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<TKBean>>> D(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<VideoCollectionBeanEntry>>> E(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<HotNewSearchEntry>>> F();

    t<BaseResponse<UserDeviceEntity>> G(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> H(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<BarrageListEntry>>> I(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<VideoCollectionEntry>>> J(@FieldMap Map<String, Object> map);

    t<BaseResponse<RankVideoEntry>> K(@FieldMap Map<String, Object> map);

    t<BaseResponse<VideoShareDataEntry>> L(@FieldMap Map<String, Object> map);

    t<BaseResponse<ExtensionShareEntry>> M();

    t<BaseResponse<List<OrderListEntry>>> N();

    t<BaseResponse<AdSysConfEntry>> O(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> P(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<FeedbackRecordEntry>>> Q(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<ShortVideoSysConfEntry>>> R(@FieldMap Map<String, Object> map);

    t<BaseResponse<MineUserInfo>> S(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> T(@Body Map<String, Object> map);

    t<BaseResponse<HomeVideoPageEntry>> U(@Body Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> V(@Body Map<String, Object> map);

    t<BaseResponse<String>> W(@Body Map<String, Object> map);

    t<BaseResponse<VideoMoreEntry>> a(@FieldMap Map<String, Object> map);

    t<BaseResponse<TKBean>> b(@FieldMap Map<String, Object> map);

    t<BaseResponse<MineUserInfo>> c(@Body Map<String, Object> map);

    t<BaseResponse<List<HomeTitleEntry>>> d(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<SpecialCollectionEntry>>> e(@FieldMap Map<String, Object> map);

    t<BaseResponse<CollectionVideoEntry>> f(@FieldMap Map<String, Object> map);

    t<BaseResponse<RankTopicEntry>> g(@FieldMap Map<String, Object> map);

    t<BaseResponse<AdInfoEntry>> getAdInfo();

    t<BaseResponse<String>> h(@FieldMap Map<String, Object> map);

    t<BaseResponse<RecommandVideosEntity>> i(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> j(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<HomeMultipleEntry>>> k(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> l(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> m(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<ChannnelFilterEntry>>> n();

    t<BaseResponse<List<SearchExtendEntry>>> o(@FieldMap Map<String, Object> map);

    t<BaseResponse<RankVideoEntry>> p(@FieldMap Map<String, Object> map);

    t<BaseResponse<ExtensionRecordEntry>> q();

    t<BaseResponse<List<RecommandVideosEntity>>> r(@FieldMap Map<String, Object> map);

    t<BaseResponse<LoginUserEntity>> s(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> t(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> u(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> v(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> w(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> x(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> y(@FieldMap Map<String, Object> map);

    t<BaseResponse<UploadFileEntry>> z(@Part MultipartBody.Part part);
}
