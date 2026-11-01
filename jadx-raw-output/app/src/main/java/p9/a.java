package p9;

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
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: compiled from: BrowserApiService.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a {
    @FormUrlEncoded
    @POST("/api/public/register")
    t<BaseResponse<RegisterEntity>> A(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/discuss/get_list_new")
    t<BaseResponse<VideoComment1Entry>> B(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/search/screen")
    t<BaseResponse<List<RecommandVideosEntity>>> C(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/short_play/list")
    t<BaseResponse<List<TKBean>>> D(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/get_list")
    t<BaseResponse<List<VideoCollectionBeanEntry>>> E(@FieldMap Map<String, Object> map);

    @POST("/api/search/hot_search")
    t<BaseResponse<List<HotNewSearchEntry>>> F();

    @FormUrlEncoded
    @POST("/api/public/init")
    t<BaseResponse<UserDeviceEntity>> G(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/remove")
    t<BaseResponse<String>> H(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/barrage/get_list")
    t<BaseResponse<List<BarrageListEntry>>> I(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/get_list")
    t<BaseResponse<List<VideoCollectionEntry>>> J(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/topic/vod_list")
    t<BaseResponse<RankVideoEntry>> K(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/invited/vod_share")
    t<BaseResponse<VideoShareDataEntry>> L(@FieldMap Map<String, Object> map);

    @POST("/api/invited/my_spread")
    t<BaseResponse<ExtensionShareEntry>> M();

    @POST("/api/order/get_list")
    t<BaseResponse<List<OrderListEntry>>> N();

    @FormUrlEncoded
    @POST("/api/public/get_sys_conf")
    t<BaseResponse<AdSysConfEntry>> O(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/down")
    t<BaseResponse<String>> P(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/feedback_list")
    t<BaseResponse<List<FeedbackRecordEntry>>> Q(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/public/get_sys_conf")
    t<BaseResponse<List<ShortVideoSysConfEntry>>> R(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/update")
    t<BaseResponse<MineUserInfo>> S(@FieldMap Map<String, Object> map);

    @POST("/sunshine/user/insertSuggest")
    t<BaseResponse<String>> T(@Body RequestBody requestBody);

    @POST("/sunshine/video/showHomePageVideosForPage")
    t<BaseResponse<HomeVideoPageEntry>> U(@Body RequestBody requestBody);

    @POST("/sunshine/video/getSlideVideos")
    t<BaseResponse<List<RecommandVideosEntity>>> V(@Body RequestBody requestBody);

    @FormUrlEncoded
    @POST("/api/topic/vod_list")
    t<BaseResponse<VideoMoreEntry>> a(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/vod/info_new")
    t<BaseResponse<TKBean>> b(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/info")
    t<BaseResponse<MineUserInfo>> c(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/channel/get_list")
    t<BaseResponse<List<HomeTitleEntry>>> d(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/get_list")
    t<BaseResponse<List<SpecialCollectionEntry>>> e(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/add")
    t<BaseResponse<CollectionVideoEntry>> f(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/topic/list")
    t<BaseResponse<RankTopicEntry>> g(@FieldMap Map<String, Object> map);

    @POST("/api/ad/get_list")
    t<BaseResponse<AdInfoEntry>> getAdInfo();

    @FormUrlEncoded
    @POST("/api/public/get_sys_conf")
    t<BaseResponse<String>> h(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/vod/info_new")
    t<BaseResponse<RecommandVideosEntity>> i(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/log/ad")
    t<BaseResponse<String>> j(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/channel/get_info")
    t<BaseResponse<List<HomeMultipleEntry>>> k(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/search/result")
    t<BaseResponse<List<RecommandVideosEntity>>> l(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/search/screen")
    t<BaseResponse<List<RecommandVideosEntity>>> m(@FieldMap Map<String, Object> map);

    @POST("/api/type/get_list")
    t<BaseResponse<List<ChannnelFilterEntry>>> n();

    @FormUrlEncoded
    @POST("/api/search/suggest")
    t<BaseResponse<List<SearchExtendEntry>>> o(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/topic/vod_list")
    t<BaseResponse<RankVideoEntry>> p(@FieldMap Map<String, Object> map);

    @POST("/api/user/my_invited")
    t<BaseResponse<ExtensionRecordEntry>> q();

    @FormUrlEncoded
    @POST("/api/search/recommend")
    t<BaseResponse<List<RecommandVideosEntity>>> r(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/public/login")
    t<BaseResponse<LoginUserEntity>> s(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/public/feedback")
    t<BaseResponse<String>> t(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_history/add")
    t<BaseResponse<String>> u(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/discuss/remove")
    t<BaseResponse<String>> v(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/barrage/add")
    t<BaseResponse<String>> w(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/topic/change")
    t<BaseResponse<List<RecommandVideosEntity>>> x(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/data/action")
    t<BaseResponse<String>> y(@FieldMap Map<String, Object> map);

    @POST("/api/public/upload_file")
    @Multipart
    t<BaseResponse<UploadFileEntry>> z(@Part MultipartBody.Part part);
}
