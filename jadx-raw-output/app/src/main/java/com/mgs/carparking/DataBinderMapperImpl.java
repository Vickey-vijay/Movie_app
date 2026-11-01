package com.mgs.carparking;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fvvcl.flickverse.R;
import com.ironsource.Y5;
import com.mgs.carparking.databinding.ActionbarBackBindingImpl;
import com.mgs.carparking.databinding.ActivityDownloadBindingImpl;
import com.mgs.carparking.databinding.ActivityDownloadCompleteSecondBindingImpl;
import com.mgs.carparking.databinding.ActivityDownloadVideoBindingImpl;
import com.mgs.carparking.databinding.ActivityDownloadVideoPlayBindingImpl;
import com.mgs.carparking.databinding.ActivityEditMineBindingImpl;
import com.mgs.carparking.databinding.ActivityExtensionRecordBindingImpl;
import com.mgs.carparking.databinding.ActivityExtensionShareBindingImpl;
import com.mgs.carparking.databinding.ActivityFeedbackBindingImpl;
import com.mgs.carparking.databinding.ActivityFeedbackRecordBindingImpl;
import com.mgs.carparking.databinding.ActivityHistoryBindingImpl;
import com.mgs.carparking.databinding.ActivityLoginBindingImpl;
import com.mgs.carparking.databinding.ActivityMainBindingImpl;
import com.mgs.carparking.databinding.ActivityOrderListBindingImpl;
import com.mgs.carparking.databinding.ActivityRegisterBindingImpl;
import com.mgs.carparking.databinding.ActivitySearchVideoBindingImpl;
import com.mgs.carparking.databinding.ActivitySettingBindingImpl;
import com.mgs.carparking.databinding.ActivityShortTkBindingImpl;
import com.mgs.carparking.databinding.ActivitySpecialDetailNewBindingImpl;
import com.mgs.carparking.databinding.ActivityVideoPlayDetailBindingImpl;
import com.mgs.carparking.databinding.DialogClingOpenFloatBindingImpl;
import com.mgs.carparking.databinding.DialogSearchCacheClearBindingImpl;
import com.mgs.carparking.databinding.DialogSearchHistoryClearBindingImpl;
import com.mgs.carparking.databinding.DialogSettingLogoutBindingImpl;
import com.mgs.carparking.databinding.DialogVideoDeleteBindingImpl;
import com.mgs.carparking.databinding.FragmentCategoryBindingImpl;
import com.mgs.carparking.databinding.FragmentChannelBindingImpl;
import com.mgs.carparking.databinding.FragmentChannelLookBindingImpl;
import com.mgs.carparking.databinding.FragmentDownloadCompleteBindingImpl;
import com.mgs.carparking.databinding.FragmentHomeBindingImpl;
import com.mgs.carparking.databinding.FragmentHomeContentListBindingImpl;
import com.mgs.carparking.databinding.FragmentHomeContentMultipleListBindingImpl;
import com.mgs.carparking.databinding.FragmentHomeContentSearchListBindingImpl;
import com.mgs.carparking.databinding.FragmentHomeRecommendMultipleListBindingImpl;
import com.mgs.carparking.databinding.FragmentMineBindingImpl;
import com.mgs.carparking.databinding.FragmentRankContentListBindingImpl;
import com.mgs.carparking.databinding.FragmentRankNewBindingImpl;
import com.mgs.carparking.databinding.FragmentSpielBindingImpl;
import com.mgs.carparking.databinding.FragmentTKBindingImpl;
import com.mgs.carparking.databinding.ItemChannnelFilterBindingImpl;
import com.mgs.carparking.databinding.ItemChannnelFilterCommonBindingImpl;
import com.mgs.carparking.databinding.ItemChannnelSearchResultBindingImpl;
import com.mgs.carparking.databinding.ItemCommentVideoSecondItemBindingImpl;
import com.mgs.carparking.databinding.ItemDownloadCompleteSecondBindingImpl;
import com.mgs.carparking.databinding.ItemDownnloadCompleteVideoBindingImpl;
import com.mgs.carparking.databinding.ItemDownnloadingVideoBindingImpl;
import com.mgs.carparking.databinding.ItemExtensionRecordBindingImpl;
import com.mgs.carparking.databinding.ItemFeedbackRecordBindingImpl;
import com.mgs.carparking.databinding.ItemFeedbackRecordFirstBindingImpl;
import com.mgs.carparking.databinding.ItemFeedbackTypeNewBindingImpl;
import com.mgs.carparking.databinding.ItemGussVideoBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentListBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleCategoryBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleCategoryListBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleGalleryBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleHotBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleListItemCategoryBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleListItemCategoryListBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleListItemHotBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleListItemNewBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleListItemSpecialListBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleNewBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleNoTitleBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleSlideBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentMultipleSpecialListBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentSearchComicBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentSearchMovieBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentSearchRecommendListBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentSearchTvBindingImpl;
import com.mgs.carparking.databinding.ItemHomeContentSearchVarietyBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleAdsBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleCategoryBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleGusslikeBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleGusslikeHorizationBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleGusslikeTitleBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleHotBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemCategoryBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemHotBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemMultipleBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemNewBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemNoTitleBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleListItemSpecialListBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleMultipleBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleNewBindingImpl;
import com.mgs.carparking.databinding.ItemHomeRecommendMultipleSlideBindingImpl;
import com.mgs.carparking.databinding.ItemHomeSearchHotSearchBindingImpl;
import com.mgs.carparking.databinding.ItemLookChannnelFilterBindingImpl;
import com.mgs.carparking.databinding.ItemLookChannnelFilterCommonBindingImpl;
import com.mgs.carparking.databinding.ItemLookChannnelSearchResultBindingImpl;
import com.mgs.carparking.databinding.ItemMineHistoryBindingImpl;
import com.mgs.carparking.databinding.ItemOrderListBindingImpl;
import com.mgs.carparking.databinding.ItemPopLandTvSetNumBindingImpl;
import com.mgs.carparking.databinding.ItemPopTvSetNumBindingImpl;
import com.mgs.carparking.databinding.ItemPopTvSetNumDownloadBindingImpl;
import com.mgs.carparking.databinding.ItemRankContentMultipleNextBindingImpl;
import com.mgs.carparking.databinding.ItemRecommendMultipleSpecialListBindingImpl;
import com.mgs.carparking.databinding.ItemSearchExtendListBindingImpl;
import com.mgs.carparking.databinding.ItemSearchTvSetNumBindingImpl;
import com.mgs.carparking.databinding.ItemSpecialDetailNewItemResultBindingImpl;
import com.mgs.carparking.databinding.ItemSpecialDetailResultBindingImpl;
import com.mgs.carparking.databinding.ItemVideoCommitListBindingImpl;
import com.mgs.carparking.databinding.ItemVideoMoreListBindingImpl;
import com.mgs.carparking.databinding.ItemVideoPlayTvSetNumBindingImpl;
import com.mgs.carparking.databinding.ItemVideoPlayVarietySetNumBindingImpl;
import com.mgs.carparking.databinding.ItemVideoSearchAdsBindingImpl;
import com.mgs.carparking.databinding.ItemVideoSeasonItemBindingImpl;
import com.mgs.carparking.databinding.PopLayoutVideoCommentItemBindingImpl;
import com.mgs.carparking.databinding.PopLayoutVideoSeasonItemBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f39663a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f39664a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(8);
            f39664a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "currPosition");
            sparseArray.put(2, Y5.c.f27928b);
            sparseArray.put(3, "mAdapter");
            sparseArray.put(4, "progress");
            sparseArray.put(5, "status");
            sparseArray.put(6, "toolbarViewModel");
            sparseArray.put(7, "viewModel");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f39665a;

        static {
            HashMap<String, Integer> map = new HashMap<>(109);
            f39665a = map;
            map.put("layout/actionbar_back_0", Integer.valueOf(R.layout.actionbar_back));
            map.put("layout/activity_download_0", Integer.valueOf(R.layout.activity_download));
            map.put("layout/activity_download_complete_second_0", Integer.valueOf(R.layout.activity_download_complete_second));
            map.put("layout/activity_download_video_0", Integer.valueOf(R.layout.activity_download_video));
            map.put("layout/activity_download_video_play_0", Integer.valueOf(R.layout.activity_download_video_play));
            map.put("layout/activity_edit_mine_0", Integer.valueOf(R.layout.activity_edit_mine));
            map.put("layout/activity_extension_record_0", Integer.valueOf(R.layout.activity_extension_record));
            map.put("layout/activity_extension_share_0", Integer.valueOf(R.layout.activity_extension_share));
            map.put("layout/activity_feedback_0", Integer.valueOf(R.layout.activity_feedback));
            map.put("layout/activity_feedback_record_0", Integer.valueOf(R.layout.activity_feedback_record));
            map.put("layout/activity_history_0", Integer.valueOf(R.layout.activity_history));
            map.put("layout/activity_login_0", Integer.valueOf(R.layout.activity_login));
            map.put("layout/activity_main_0", Integer.valueOf(R.layout.activity_main));
            map.put("layout/activity_order_list_0", Integer.valueOf(R.layout.activity_order_list));
            map.put("layout/activity_register_0", Integer.valueOf(R.layout.activity_register));
            map.put("layout/activity_search_video_0", Integer.valueOf(R.layout.activity_search_video));
            map.put("layout/activity_setting_0", Integer.valueOf(R.layout.activity_setting));
            map.put("layout/activity_short_tk_0", Integer.valueOf(R.layout.activity_short_tk));
            map.put("layout/activity_special_detail_new_0", Integer.valueOf(R.layout.activity_special_detail_new));
            map.put("layout/activity_video_play_detail_0", Integer.valueOf(R.layout.activity_video_play_detail));
            map.put("layout/dialog_cling_open_float_0", Integer.valueOf(R.layout.dialog_cling_open_float));
            map.put("layout/dialog_search_cache_clear_0", Integer.valueOf(R.layout.dialog_search_cache_clear));
            map.put("layout/dialog_search_history_clear_0", Integer.valueOf(R.layout.dialog_search_history_clear));
            map.put("layout/dialog_setting_logout_0", Integer.valueOf(R.layout.dialog_setting_logout));
            map.put("layout/dialog_video_delete_0", Integer.valueOf(R.layout.dialog_video_delete));
            map.put("layout/fragment_category_0", Integer.valueOf(R.layout.fragment_category));
            map.put("layout/fragment_channel_0", Integer.valueOf(R.layout.fragment_channel));
            map.put("layout/fragment_channel_look_0", Integer.valueOf(R.layout.fragment_channel_look));
            map.put("layout/fragment_download_complete_0", Integer.valueOf(R.layout.fragment_download_complete));
            map.put("layout/fragment_home_0", Integer.valueOf(R.layout.fragment_home));
            map.put("layout/fragment_home_content_list_0", Integer.valueOf(R.layout.fragment_home_content_list));
            map.put("layout/fragment_home_content_multiple_list_0", Integer.valueOf(R.layout.fragment_home_content_multiple_list));
            map.put("layout/fragment_home_content_search_list_0", Integer.valueOf(R.layout.fragment_home_content_search_list));
            map.put("layout/fragment_home_recommend_multiple_list_0", Integer.valueOf(R.layout.fragment_home_recommend_multiple_list));
            map.put("layout/fragment_mine_0", Integer.valueOf(R.layout.fragment_mine));
            map.put("layout/fragment_rank_content_list_0", Integer.valueOf(R.layout.fragment_rank_content_list));
            map.put("layout/fragment_rank_new_0", Integer.valueOf(R.layout.fragment_rank_new));
            map.put("layout/fragment_spiel_0", Integer.valueOf(R.layout.fragment_spiel));
            map.put("layout/fragment_t_k_0", Integer.valueOf(R.layout.fragment_t_k));
            map.put("layout/item_channnel_filter_0", Integer.valueOf(R.layout.item_channnel_filter));
            map.put("layout/item_channnel_filter_common_0", Integer.valueOf(R.layout.item_channnel_filter_common));
            map.put("layout/item_channnel_search_result_0", Integer.valueOf(R.layout.item_channnel_search_result));
            map.put("layout/item_comment_video_second_item_0", Integer.valueOf(R.layout.item_comment_video_second_item));
            map.put("layout/item_download_complete_second_0", Integer.valueOf(R.layout.item_download_complete_second));
            map.put("layout/item_downnload_complete_video_0", Integer.valueOf(R.layout.item_downnload_complete_video));
            map.put("layout/item_downnloading_video_0", Integer.valueOf(R.layout.item_downnloading_video));
            map.put("layout/item_extension_record_0", Integer.valueOf(R.layout.item_extension_record));
            map.put("layout/item_feedback_record_0", Integer.valueOf(R.layout.item_feedback_record));
            map.put("layout/item_feedback_record_first_0", Integer.valueOf(R.layout.item_feedback_record_first));
            map.put("layout/item_feedback_type_new_0", Integer.valueOf(R.layout.item_feedback_type_new));
            map.put("layout/item_guss_video_0", Integer.valueOf(R.layout.item_guss_video));
            map.put("layout/item_home_content_list_0", Integer.valueOf(R.layout.item_home_content_list));
            map.put("layout/item_home_content_multiple_category_0", Integer.valueOf(R.layout.item_home_content_multiple_category));
            map.put("layout/item_home_content_multiple_category_list_0", Integer.valueOf(R.layout.item_home_content_multiple_category_list));
            map.put("layout/item_home_content_multiple_gallery_0", Integer.valueOf(R.layout.item_home_content_multiple_gallery));
            map.put("layout/item_home_content_multiple_hot_0", Integer.valueOf(R.layout.item_home_content_multiple_hot));
            map.put("layout/item_home_content_multiple_list_item_category_0", Integer.valueOf(R.layout.item_home_content_multiple_list_item_category));
            map.put("layout/item_home_content_multiple_list_item_category_list_0", Integer.valueOf(R.layout.item_home_content_multiple_list_item_category_list));
            map.put("layout/item_home_content_multiple_list_item_hot_0", Integer.valueOf(R.layout.item_home_content_multiple_list_item_hot));
            map.put("layout/item_home_content_multiple_list_item_new_0", Integer.valueOf(R.layout.item_home_content_multiple_list_item_new));
            map.put("layout/item_home_content_multiple_list_item_special_list_0", Integer.valueOf(R.layout.item_home_content_multiple_list_item_special_list));
            map.put("layout/item_home_content_multiple_new_0", Integer.valueOf(R.layout.item_home_content_multiple_new));
            map.put("layout/item_home_content_multiple_no_title_0", Integer.valueOf(R.layout.item_home_content_multiple_no_title));
            map.put("layout/item_home_content_multiple_slide_0", Integer.valueOf(R.layout.item_home_content_multiple_slide));
            map.put("layout/item_home_content_multiple_special_list_0", Integer.valueOf(R.layout.item_home_content_multiple_special_list));
            map.put("layout/item_home_content_search_comic_0", Integer.valueOf(R.layout.item_home_content_search_comic));
            map.put("layout/item_home_content_search_movie_0", Integer.valueOf(R.layout.item_home_content_search_movie));
            map.put("layout/item_home_content_search_recommend_list_0", Integer.valueOf(R.layout.item_home_content_search_recommend_list));
            map.put("layout/item_home_content_search_tv_0", Integer.valueOf(R.layout.item_home_content_search_tv));
            map.put("layout/item_home_content_search_variety_0", Integer.valueOf(R.layout.item_home_content_search_variety));
            map.put("layout/item_home_recommend_multiple_ads_0", Integer.valueOf(R.layout.item_home_recommend_multiple_ads));
            map.put("layout/item_home_recommend_multiple_category_0", Integer.valueOf(R.layout.item_home_recommend_multiple_category));
            map.put("layout/item_home_recommend_multiple_gusslike_0", Integer.valueOf(R.layout.item_home_recommend_multiple_gusslike));
            map.put("layout/item_home_recommend_multiple_gusslike_horization_0", Integer.valueOf(R.layout.item_home_recommend_multiple_gusslike_horization));
            map.put("layout/item_home_recommend_multiple_gusslike_title_0", Integer.valueOf(R.layout.item_home_recommend_multiple_gusslike_title));
            map.put("layout/item_home_recommend_multiple_hot_0", Integer.valueOf(R.layout.item_home_recommend_multiple_hot));
            map.put("layout/item_home_recommend_multiple_list_item_category_0", Integer.valueOf(R.layout.item_home_recommend_multiple_list_item_category));
            map.put("layout/item_home_recommend_multiple_list_item_gusslike_horization_0", Integer.valueOf(R.layout.item_home_recommend_multiple_list_item_gusslike_horization));
            map.put("layout/item_home_recommend_multiple_list_item_hot_0", Integer.valueOf(R.layout.item_home_recommend_multiple_list_item_hot));
            map.put("layout/item_home_recommend_multiple_list_item_multiple_0", Integer.valueOf(R.layout.item_home_recommend_multiple_list_item_multiple));
            map.put("layout/item_home_recommend_multiple_list_item_new_0", Integer.valueOf(R.layout.item_home_recommend_multiple_list_item_new));
            map.put("layout/item_home_recommend_multiple_list_item_no_title_0", Integer.valueOf(R.layout.item_home_recommend_multiple_list_item_no_title));
            map.put("layout/item_home_recommend_multiple_list_item_special_list_0", Integer.valueOf(R.layout.item_home_recommend_multiple_list_item_special_list));
            map.put("layout/item_home_recommend_multiple_multiple_0", Integer.valueOf(R.layout.item_home_recommend_multiple_multiple));
            map.put("layout/item_home_recommend_multiple_new_0", Integer.valueOf(R.layout.item_home_recommend_multiple_new));
            map.put("layout/item_home_recommend_multiple_slide_0", Integer.valueOf(R.layout.item_home_recommend_multiple_slide));
            map.put("layout/item_home_search_hot_search_0", Integer.valueOf(R.layout.item_home_search_hot_search));
            map.put("layout/item_look_channnel_filter_0", Integer.valueOf(R.layout.item_look_channnel_filter));
            map.put("layout/item_look_channnel_filter_common_0", Integer.valueOf(R.layout.item_look_channnel_filter_common));
            map.put("layout/item_look_channnel_search_result_0", Integer.valueOf(R.layout.item_look_channnel_search_result));
            map.put("layout/item_mine_history_0", Integer.valueOf(R.layout.item_mine_history));
            map.put("layout/item_order_list_0", Integer.valueOf(R.layout.item_order_list));
            map.put("layout/item_pop_land_tv_set_num_0", Integer.valueOf(R.layout.item_pop_land_tv_set_num));
            map.put("layout/item_pop_tv_set_num_0", Integer.valueOf(R.layout.item_pop_tv_set_num));
            map.put("layout/item_pop_tv_set_num_download_0", Integer.valueOf(R.layout.item_pop_tv_set_num_download));
            map.put("layout/item_rank_content_multiple_next_0", Integer.valueOf(R.layout.item_rank_content_multiple_next));
            map.put("layout/item_recommend_multiple_special_list_0", Integer.valueOf(R.layout.item_recommend_multiple_special_list));
            map.put("layout/item_search_extend_list_0", Integer.valueOf(R.layout.item_search_extend_list));
            map.put("layout/item_search_tv_set_num_0", Integer.valueOf(R.layout.item_search_tv_set_num));
            map.put("layout/item_special_detail_new_item_result_0", Integer.valueOf(R.layout.item_special_detail_new_item_result));
            map.put("layout/item_special_detail_result_0", Integer.valueOf(R.layout.item_special_detail_result));
            map.put("layout/item_video_commit_list_0", Integer.valueOf(R.layout.item_video_commit_list));
            map.put("layout/item_video_more_list_0", Integer.valueOf(R.layout.item_video_more_list));
            map.put("layout/item_video_play_tv_set_num_0", Integer.valueOf(R.layout.item_video_play_tv_set_num));
            map.put("layout/item_video_play_variety_set_num_0", Integer.valueOf(R.layout.item_video_play_variety_set_num));
            map.put("layout/item_video_search_ads_0", Integer.valueOf(R.layout.item_video_search_ads));
            map.put("layout/item_video_season_item_0", Integer.valueOf(R.layout.item_video_season_item));
            map.put("layout/pop_layout_video_comment_item_0", Integer.valueOf(R.layout.pop_layout_video_comment_item));
            map.put("layout/pop_layout_video_season_item_0", Integer.valueOf(R.layout.pop_layout_video_season_item));
        }
    }

    public final ViewDataBinding a(DataBindingComponent dataBindingComponent, View view, int i10, Object obj) {
        switch (i10) {
            case 1:
                if ("layout/actionbar_back_0".equals(obj)) {
                    return new ActionbarBackBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for actionbar_back is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_download_0".equals(obj)) {
                    return new ActivityDownloadBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_download is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_download_complete_second_0".equals(obj)) {
                    return new ActivityDownloadCompleteSecondBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_download_complete_second is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_download_video_0".equals(obj)) {
                    return new ActivityDownloadVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_download_video is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_download_video_play_0".equals(obj)) {
                    return new ActivityDownloadVideoPlayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_download_video_play is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_edit_mine_0".equals(obj)) {
                    return new ActivityEditMineBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_mine is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_extension_record_0".equals(obj)) {
                    return new ActivityExtensionRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_extension_record is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_extension_share_0".equals(obj)) {
                    return new ActivityExtensionShareBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_extension_share is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_feedback_0".equals(obj)) {
                    return new ActivityFeedbackBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_feedback is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_feedback_record_0".equals(obj)) {
                    return new ActivityFeedbackRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_feedback_record is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_history_0".equals(obj)) {
                    return new ActivityHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_history is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_login_0".equals(obj)) {
                    return new ActivityLoginBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_main_0".equals(obj)) {
                    return new ActivityMainBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_order_list_0".equals(obj)) {
                    return new ActivityOrderListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_order_list is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_register_0".equals(obj)) {
                    return new ActivityRegisterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_register is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_search_video_0".equals(obj)) {
                    return new ActivitySearchVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_search_video is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_setting_0".equals(obj)) {
                    return new ActivitySettingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_short_tk_0".equals(obj)) {
                    return new ActivityShortTkBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_short_tk is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_special_detail_new_0".equals(obj)) {
                    return new ActivitySpecialDetailNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_special_detail_new is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_video_play_detail_0".equals(obj)) {
                    return new ActivityVideoPlayDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_video_play_detail is invalid. Received: " + obj);
            case 21:
                if ("layout/dialog_cling_open_float_0".equals(obj)) {
                    return new DialogClingOpenFloatBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_cling_open_float is invalid. Received: " + obj);
            case 22:
                if ("layout/dialog_search_cache_clear_0".equals(obj)) {
                    return new DialogSearchCacheClearBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_search_cache_clear is invalid. Received: " + obj);
            case 23:
                if ("layout/dialog_search_history_clear_0".equals(obj)) {
                    return new DialogSearchHistoryClearBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_search_history_clear is invalid. Received: " + obj);
            case 24:
                if ("layout/dialog_setting_logout_0".equals(obj)) {
                    return new DialogSettingLogoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_setting_logout is invalid. Received: " + obj);
            case 25:
                if ("layout/dialog_video_delete_0".equals(obj)) {
                    return new DialogVideoDeleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_video_delete is invalid. Received: " + obj);
            case 26:
                if ("layout/fragment_category_0".equals(obj)) {
                    return new FragmentCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_category is invalid. Received: " + obj);
            case 27:
                if ("layout/fragment_channel_0".equals(obj)) {
                    return new FragmentChannelBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_channel is invalid. Received: " + obj);
            case 28:
                if ("layout/fragment_channel_look_0".equals(obj)) {
                    return new FragmentChannelLookBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_channel_look is invalid. Received: " + obj);
            case 29:
                if ("layout/fragment_download_complete_0".equals(obj)) {
                    return new FragmentDownloadCompleteBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_download_complete is invalid. Received: " + obj);
            case 30:
                if ("layout/fragment_home_0".equals(obj)) {
                    return new FragmentHomeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_home_content_list_0".equals(obj)) {
                    return new FragmentHomeContentListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_content_list is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_home_content_multiple_list_0".equals(obj)) {
                    return new FragmentHomeContentMultipleListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_content_multiple_list is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_home_content_search_list_0".equals(obj)) {
                    return new FragmentHomeContentSearchListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_content_search_list is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_home_recommend_multiple_list_0".equals(obj)) {
                    return new FragmentHomeRecommendMultipleListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_recommend_multiple_list is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_mine_0".equals(obj)) {
                    return new FragmentMineBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_mine is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_rank_content_list_0".equals(obj)) {
                    return new FragmentRankContentListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rank_content_list is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_rank_new_0".equals(obj)) {
                    return new FragmentRankNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rank_new is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_spiel_0".equals(obj)) {
                    return new FragmentSpielBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_spiel is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_t_k_0".equals(obj)) {
                    return new FragmentTKBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_t_k is invalid. Received: " + obj);
            case 40:
                if ("layout/item_channnel_filter_0".equals(obj)) {
                    return new ItemChannnelFilterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_channnel_filter is invalid. Received: " + obj);
            case 41:
                if ("layout/item_channnel_filter_common_0".equals(obj)) {
                    return new ItemChannnelFilterCommonBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_channnel_filter_common is invalid. Received: " + obj);
            case 42:
                if ("layout/item_channnel_search_result_0".equals(obj)) {
                    return new ItemChannnelSearchResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_channnel_search_result is invalid. Received: " + obj);
            case 43:
                if ("layout/item_comment_video_second_item_0".equals(obj)) {
                    return new ItemCommentVideoSecondItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_comment_video_second_item is invalid. Received: " + obj);
            case 44:
                if ("layout/item_download_complete_second_0".equals(obj)) {
                    return new ItemDownloadCompleteSecondBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_download_complete_second is invalid. Received: " + obj);
            case 45:
                if ("layout/item_downnload_complete_video_0".equals(obj)) {
                    return new ItemDownnloadCompleteVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_downnload_complete_video is invalid. Received: " + obj);
            case 46:
                if ("layout/item_downnloading_video_0".equals(obj)) {
                    return new ItemDownnloadingVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_downnloading_video is invalid. Received: " + obj);
            case 47:
                if ("layout/item_extension_record_0".equals(obj)) {
                    return new ItemExtensionRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_extension_record is invalid. Received: " + obj);
            case 48:
                if ("layout/item_feedback_record_0".equals(obj)) {
                    return new ItemFeedbackRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_feedback_record is invalid. Received: " + obj);
            case 49:
                if ("layout/item_feedback_record_first_0".equals(obj)) {
                    return new ItemFeedbackRecordFirstBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_feedback_record_first is invalid. Received: " + obj);
            case 50:
                if ("layout/item_feedback_type_new_0".equals(obj)) {
                    return new ItemFeedbackTypeNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_feedback_type_new is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i10, Object obj) {
        switch (i10) {
            case 51:
                if ("layout/item_guss_video_0".equals(obj)) {
                    return new ItemGussVideoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_guss_video is invalid. Received: " + obj);
            case 52:
                if ("layout/item_home_content_list_0".equals(obj)) {
                    return new ItemHomeContentListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_list is invalid. Received: " + obj);
            case 53:
                if ("layout/item_home_content_multiple_category_0".equals(obj)) {
                    return new ItemHomeContentMultipleCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_category is invalid. Received: " + obj);
            case 54:
                if ("layout/item_home_content_multiple_category_list_0".equals(obj)) {
                    return new ItemHomeContentMultipleCategoryListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_category_list is invalid. Received: " + obj);
            case 55:
                if ("layout/item_home_content_multiple_gallery_0".equals(obj)) {
                    return new ItemHomeContentMultipleGalleryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_gallery is invalid. Received: " + obj);
            case 56:
                if ("layout/item_home_content_multiple_hot_0".equals(obj)) {
                    return new ItemHomeContentMultipleHotBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_hot is invalid. Received: " + obj);
            case 57:
                if ("layout/item_home_content_multiple_list_item_category_0".equals(obj)) {
                    return new ItemHomeContentMultipleListItemCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_list_item_category is invalid. Received: " + obj);
            case 58:
                if ("layout/item_home_content_multiple_list_item_category_list_0".equals(obj)) {
                    return new ItemHomeContentMultipleListItemCategoryListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_list_item_category_list is invalid. Received: " + obj);
            case 59:
                if ("layout/item_home_content_multiple_list_item_hot_0".equals(obj)) {
                    return new ItemHomeContentMultipleListItemHotBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_list_item_hot is invalid. Received: " + obj);
            case 60:
                if ("layout/item_home_content_multiple_list_item_new_0".equals(obj)) {
                    return new ItemHomeContentMultipleListItemNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_list_item_new is invalid. Received: " + obj);
            case 61:
                if ("layout/item_home_content_multiple_list_item_special_list_0".equals(obj)) {
                    return new ItemHomeContentMultipleListItemSpecialListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_list_item_special_list is invalid. Received: " + obj);
            case 62:
                if ("layout/item_home_content_multiple_new_0".equals(obj)) {
                    return new ItemHomeContentMultipleNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_new is invalid. Received: " + obj);
            case 63:
                if ("layout/item_home_content_multiple_no_title_0".equals(obj)) {
                    return new ItemHomeContentMultipleNoTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_no_title is invalid. Received: " + obj);
            case 64:
                if ("layout/item_home_content_multiple_slide_0".equals(obj)) {
                    return new ItemHomeContentMultipleSlideBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_slide is invalid. Received: " + obj);
            case 65:
                if ("layout/item_home_content_multiple_special_list_0".equals(obj)) {
                    return new ItemHomeContentMultipleSpecialListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_multiple_special_list is invalid. Received: " + obj);
            case 66:
                if ("layout/item_home_content_search_comic_0".equals(obj)) {
                    return new ItemHomeContentSearchComicBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_search_comic is invalid. Received: " + obj);
            case 67:
                if ("layout/item_home_content_search_movie_0".equals(obj)) {
                    return new ItemHomeContentSearchMovieBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_search_movie is invalid. Received: " + obj);
            case 68:
                if ("layout/item_home_content_search_recommend_list_0".equals(obj)) {
                    return new ItemHomeContentSearchRecommendListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_search_recommend_list is invalid. Received: " + obj);
            case 69:
                if ("layout/item_home_content_search_tv_0".equals(obj)) {
                    return new ItemHomeContentSearchTvBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_search_tv is invalid. Received: " + obj);
            case 70:
                if ("layout/item_home_content_search_variety_0".equals(obj)) {
                    return new ItemHomeContentSearchVarietyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_content_search_variety is invalid. Received: " + obj);
            case 71:
                if ("layout/item_home_recommend_multiple_ads_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleAdsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_ads is invalid. Received: " + obj);
            case 72:
                if ("layout/item_home_recommend_multiple_category_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_category is invalid. Received: " + obj);
            case 73:
                if ("layout/item_home_recommend_multiple_gusslike_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleGusslikeBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_gusslike is invalid. Received: " + obj);
            case 74:
                if ("layout/item_home_recommend_multiple_gusslike_horization_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleGusslikeHorizationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_gusslike_horization is invalid. Received: " + obj);
            case 75:
                if ("layout/item_home_recommend_multiple_gusslike_title_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleGusslikeTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_gusslike_title is invalid. Received: " + obj);
            case 76:
                if ("layout/item_home_recommend_multiple_hot_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleHotBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_hot is invalid. Received: " + obj);
            case 77:
                if ("layout/item_home_recommend_multiple_list_item_category_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleListItemCategoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_list_item_category is invalid. Received: " + obj);
            case 78:
                if ("layout/item_home_recommend_multiple_list_item_gusslike_horization_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleListItemGusslikeHorizationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_list_item_gusslike_horization is invalid. Received: " + obj);
            case 79:
                if ("layout/item_home_recommend_multiple_list_item_hot_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleListItemHotBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_list_item_hot is invalid. Received: " + obj);
            case 80:
                if ("layout/item_home_recommend_multiple_list_item_multiple_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleListItemMultipleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_list_item_multiple is invalid. Received: " + obj);
            case 81:
                if ("layout/item_home_recommend_multiple_list_item_new_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleListItemNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_list_item_new is invalid. Received: " + obj);
            case 82:
                if ("layout/item_home_recommend_multiple_list_item_no_title_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleListItemNoTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_list_item_no_title is invalid. Received: " + obj);
            case 83:
                if ("layout/item_home_recommend_multiple_list_item_special_list_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleListItemSpecialListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_list_item_special_list is invalid. Received: " + obj);
            case 84:
                if ("layout/item_home_recommend_multiple_multiple_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleMultipleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_multiple is invalid. Received: " + obj);
            case 85:
                if ("layout/item_home_recommend_multiple_new_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_new is invalid. Received: " + obj);
            case 86:
                if ("layout/item_home_recommend_multiple_slide_0".equals(obj)) {
                    return new ItemHomeRecommendMultipleSlideBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_recommend_multiple_slide is invalid. Received: " + obj);
            case 87:
                if ("layout/item_home_search_hot_search_0".equals(obj)) {
                    return new ItemHomeSearchHotSearchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_home_search_hot_search is invalid. Received: " + obj);
            case 88:
                if ("layout/item_look_channnel_filter_0".equals(obj)) {
                    return new ItemLookChannnelFilterBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_look_channnel_filter is invalid. Received: " + obj);
            case 89:
                if ("layout/item_look_channnel_filter_common_0".equals(obj)) {
                    return new ItemLookChannnelFilterCommonBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_look_channnel_filter_common is invalid. Received: " + obj);
            case 90:
                if ("layout/item_look_channnel_search_result_0".equals(obj)) {
                    return new ItemLookChannnelSearchResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_look_channnel_search_result is invalid. Received: " + obj);
            case 91:
                if ("layout/item_mine_history_0".equals(obj)) {
                    return new ItemMineHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_mine_history is invalid. Received: " + obj);
            case 92:
                if ("layout/item_order_list_0".equals(obj)) {
                    return new ItemOrderListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_order_list is invalid. Received: " + obj);
            case 93:
                if ("layout/item_pop_land_tv_set_num_0".equals(obj)) {
                    return new ItemPopLandTvSetNumBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pop_land_tv_set_num is invalid. Received: " + obj);
            case 94:
                if ("layout/item_pop_tv_set_num_0".equals(obj)) {
                    return new ItemPopTvSetNumBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pop_tv_set_num is invalid. Received: " + obj);
            case 95:
                if ("layout/item_pop_tv_set_num_download_0".equals(obj)) {
                    return new ItemPopTvSetNumDownloadBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pop_tv_set_num_download is invalid. Received: " + obj);
            case 96:
                if ("layout/item_rank_content_multiple_next_0".equals(obj)) {
                    return new ItemRankContentMultipleNextBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_rank_content_multiple_next is invalid. Received: " + obj);
            case 97:
                if ("layout/item_recommend_multiple_special_list_0".equals(obj)) {
                    return new ItemRecommendMultipleSpecialListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recommend_multiple_special_list is invalid. Received: " + obj);
            case 98:
                if ("layout/item_search_extend_list_0".equals(obj)) {
                    return new ItemSearchExtendListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_search_extend_list is invalid. Received: " + obj);
            case 99:
                if ("layout/item_search_tv_set_num_0".equals(obj)) {
                    return new ItemSearchTvSetNumBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_search_tv_set_num is invalid. Received: " + obj);
            case 100:
                if ("layout/item_special_detail_new_item_result_0".equals(obj)) {
                    return new ItemSpecialDetailNewItemResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_special_detail_new_item_result is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i10) {
        int i11 = f39663a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i12 = (i11 - 1) / 50;
        if (i12 == 0) {
            return a(dataBindingComponent, view, i11, tag);
        }
        if (i12 == 1) {
            return b(dataBindingComponent, view, i11, tag);
        }
        if (i12 != 2) {
            return null;
        }
        return c(dataBindingComponent, view, i11, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f39665a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(109);
        f39663a = sparseIntArray;
        sparseIntArray.put(R.layout.actionbar_back, 1);
        sparseIntArray.put(R.layout.activity_download, 2);
        sparseIntArray.put(R.layout.activity_download_complete_second, 3);
        sparseIntArray.put(R.layout.activity_download_video, 4);
        sparseIntArray.put(R.layout.activity_download_video_play, 5);
        sparseIntArray.put(R.layout.activity_edit_mine, 6);
        sparseIntArray.put(R.layout.activity_extension_record, 7);
        sparseIntArray.put(R.layout.activity_extension_share, 8);
        sparseIntArray.put(R.layout.activity_feedback, 9);
        sparseIntArray.put(R.layout.activity_feedback_record, 10);
        sparseIntArray.put(R.layout.activity_history, 11);
        sparseIntArray.put(R.layout.activity_login, 12);
        sparseIntArray.put(R.layout.activity_main, 13);
        sparseIntArray.put(R.layout.activity_order_list, 14);
        sparseIntArray.put(R.layout.activity_register, 15);
        sparseIntArray.put(R.layout.activity_search_video, 16);
        sparseIntArray.put(R.layout.activity_setting, 17);
        sparseIntArray.put(R.layout.activity_short_tk, 18);
        sparseIntArray.put(R.layout.activity_special_detail_new, 19);
        sparseIntArray.put(R.layout.activity_video_play_detail, 20);
        sparseIntArray.put(R.layout.dialog_cling_open_float, 21);
        sparseIntArray.put(R.layout.dialog_search_cache_clear, 22);
        sparseIntArray.put(R.layout.dialog_search_history_clear, 23);
        sparseIntArray.put(R.layout.dialog_setting_logout, 24);
        sparseIntArray.put(R.layout.dialog_video_delete, 25);
        sparseIntArray.put(R.layout.fragment_category, 26);
        sparseIntArray.put(R.layout.fragment_channel, 27);
        sparseIntArray.put(R.layout.fragment_channel_look, 28);
        sparseIntArray.put(R.layout.fragment_download_complete, 29);
        sparseIntArray.put(R.layout.fragment_home, 30);
        sparseIntArray.put(R.layout.fragment_home_content_list, 31);
        sparseIntArray.put(R.layout.fragment_home_content_multiple_list, 32);
        sparseIntArray.put(R.layout.fragment_home_content_search_list, 33);
        sparseIntArray.put(R.layout.fragment_home_recommend_multiple_list, 34);
        sparseIntArray.put(R.layout.fragment_mine, 35);
        sparseIntArray.put(R.layout.fragment_rank_content_list, 36);
        sparseIntArray.put(R.layout.fragment_rank_new, 37);
        sparseIntArray.put(R.layout.fragment_spiel, 38);
        sparseIntArray.put(R.layout.fragment_t_k, 39);
        sparseIntArray.put(R.layout.item_channnel_filter, 40);
        sparseIntArray.put(R.layout.item_channnel_filter_common, 41);
        sparseIntArray.put(R.layout.item_channnel_search_result, 42);
        sparseIntArray.put(R.layout.item_comment_video_second_item, 43);
        sparseIntArray.put(R.layout.item_download_complete_second, 44);
        sparseIntArray.put(R.layout.item_downnload_complete_video, 45);
        sparseIntArray.put(R.layout.item_downnloading_video, 46);
        sparseIntArray.put(R.layout.item_extension_record, 47);
        sparseIntArray.put(R.layout.item_feedback_record, 48);
        sparseIntArray.put(R.layout.item_feedback_record_first, 49);
        sparseIntArray.put(R.layout.item_feedback_type_new, 50);
        sparseIntArray.put(R.layout.item_guss_video, 51);
        sparseIntArray.put(R.layout.item_home_content_list, 52);
        sparseIntArray.put(R.layout.item_home_content_multiple_category, 53);
        sparseIntArray.put(R.layout.item_home_content_multiple_category_list, 54);
        sparseIntArray.put(R.layout.item_home_content_multiple_gallery, 55);
        sparseIntArray.put(R.layout.item_home_content_multiple_hot, 56);
        sparseIntArray.put(R.layout.item_home_content_multiple_list_item_category, 57);
        sparseIntArray.put(R.layout.item_home_content_multiple_list_item_category_list, 58);
        sparseIntArray.put(R.layout.item_home_content_multiple_list_item_hot, 59);
        sparseIntArray.put(R.layout.item_home_content_multiple_list_item_new, 60);
        sparseIntArray.put(R.layout.item_home_content_multiple_list_item_special_list, 61);
        sparseIntArray.put(R.layout.item_home_content_multiple_new, 62);
        sparseIntArray.put(R.layout.item_home_content_multiple_no_title, 63);
        sparseIntArray.put(R.layout.item_home_content_multiple_slide, 64);
        sparseIntArray.put(R.layout.item_home_content_multiple_special_list, 65);
        sparseIntArray.put(R.layout.item_home_content_search_comic, 66);
        sparseIntArray.put(R.layout.item_home_content_search_movie, 67);
        sparseIntArray.put(R.layout.item_home_content_search_recommend_list, 68);
        sparseIntArray.put(R.layout.item_home_content_search_tv, 69);
        sparseIntArray.put(R.layout.item_home_content_search_variety, 70);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_ads, 71);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_category, 72);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_gusslike, 73);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_gusslike_horization, 74);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_gusslike_title, 75);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_hot, 76);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_list_item_category, 77);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_list_item_gusslike_horization, 78);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_list_item_hot, 79);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_list_item_multiple, 80);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_list_item_new, 81);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_list_item_no_title, 82);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_list_item_special_list, 83);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_multiple, 84);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_new, 85);
        sparseIntArray.put(R.layout.item_home_recommend_multiple_slide, 86);
        sparseIntArray.put(R.layout.item_home_search_hot_search, 87);
        sparseIntArray.put(R.layout.item_look_channnel_filter, 88);
        sparseIntArray.put(R.layout.item_look_channnel_filter_common, 89);
        sparseIntArray.put(R.layout.item_look_channnel_search_result, 90);
        sparseIntArray.put(R.layout.item_mine_history, 91);
        sparseIntArray.put(R.layout.item_order_list, 92);
        sparseIntArray.put(R.layout.item_pop_land_tv_set_num, 93);
        sparseIntArray.put(R.layout.item_pop_tv_set_num, 94);
        sparseIntArray.put(R.layout.item_pop_tv_set_num_download, 95);
        sparseIntArray.put(R.layout.item_rank_content_multiple_next, 96);
        sparseIntArray.put(R.layout.item_recommend_multiple_special_list, 97);
        sparseIntArray.put(R.layout.item_search_extend_list, 98);
        sparseIntArray.put(R.layout.item_search_tv_set_num, 99);
        sparseIntArray.put(R.layout.item_special_detail_new_item_result, 100);
        sparseIntArray.put(R.layout.item_special_detail_result, 101);
        sparseIntArray.put(R.layout.item_video_commit_list, 102);
        sparseIntArray.put(R.layout.item_video_more_list, 103);
        sparseIntArray.put(R.layout.item_video_play_tv_set_num, 104);
        sparseIntArray.put(R.layout.item_video_play_variety_set_num, 105);
        sparseIntArray.put(R.layout.item_video_search_ads, 106);
        sparseIntArray.put(R.layout.item_video_season_item, 107);
        sparseIntArray.put(R.layout.pop_layout_video_comment_item, 108);
        sparseIntArray.put(R.layout.pop_layout_video_season_item, 109);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new me.goldze.mvvmhabit.DataBinderMapperImpl());
        arrayList.add(new me.tatarka.bindingcollectionadapter2.DataBinderMapperImpl());
        arrayList.add(new me.tatarka.bindingcollectionadapter2.recyclerview.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i10) {
        return a.f39664a.get(i10);
    }

    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View view, int i10, Object obj) {
        switch (i10) {
            case 101:
                if ("layout/item_special_detail_result_0".equals(obj)) {
                    return new ItemSpecialDetailResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_special_detail_result is invalid. Received: " + obj);
            case 102:
                if ("layout/item_video_commit_list_0".equals(obj)) {
                    return new ItemVideoCommitListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_video_commit_list is invalid. Received: " + obj);
            case 103:
                if ("layout/item_video_more_list_0".equals(obj)) {
                    return new ItemVideoMoreListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_video_more_list is invalid. Received: " + obj);
            case 104:
                if ("layout/item_video_play_tv_set_num_0".equals(obj)) {
                    return new ItemVideoPlayTvSetNumBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_video_play_tv_set_num is invalid. Received: " + obj);
            case 105:
                if ("layout/item_video_play_variety_set_num_0".equals(obj)) {
                    return new ItemVideoPlayVarietySetNumBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_video_play_variety_set_num is invalid. Received: " + obj);
            case 106:
                if ("layout/item_video_search_ads_0".equals(obj)) {
                    return new ItemVideoSearchAdsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_video_search_ads is invalid. Received: " + obj);
            case 107:
                if ("layout/item_video_season_item_0".equals(obj)) {
                    return new ItemVideoSeasonItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_video_season_item is invalid. Received: " + obj);
            case 108:
                if ("layout/pop_layout_video_comment_item_0".equals(obj)) {
                    return new PopLayoutVideoCommentItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pop_layout_video_comment_item is invalid. Received: " + obj);
            case 109:
                if ("layout/pop_layout_video_season_item_0".equals(obj)) {
                    return new PopLayoutVideoSeasonItemBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pop_layout_video_season_item is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f39663a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
