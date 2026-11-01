package com.mgs.carparking.netbean;

import java.util.List;
import t5.c;

/* JADX INFO: compiled from: UserDeviceEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserDeviceEntity {
    private SysConf sys_conf;
    private UserInfoEntry user_info;

    /* JADX INFO: compiled from: UserDeviceEntity.kt */
    public final class AppConf {
        private int nsl;

        public AppConf() {
        }

        public final int getNsl() {
            return this.nsl;
        }

        public final void setNsl(int i10) {
            this.nsl = i10;
        }
    }

    /* JADX INFO: compiled from: UserDeviceEntity.kt */
    public final class SysConf {
        private int ad_download_num;
        private int ad_view_time;
        private List<ApiconfEntry> api_conf;
        private String api_url;
        private String api_url2;
        private AppConf app_conf;
        private String customer_service_url;
        private String ex_tab_name;
        private String external_h5_url;
        private String feedback_tags;
        private String hide_ad;
        private String ios_p_card_list;
        private int is_projection;
        private int max_view_num;

        @c("app_language_options")
        private String netCineVarApp_language_options;

        @c("shortplay_ad_freq")
        private int netCineVarShort_play_ad_freq;
        private String privacy_url;
        private String share_content;
        private String share_pic_url;
        private String share_qrcode_url;
        private int show_ad_time;
        private int show_open_screen_ad_time;
        private int today_view_ad;
        private String user_h5_url;
        private String vod_feedback_tags;
        private String website;

        public SysConf() {
        }

        public final int getAd_download_num() {
            return this.ad_download_num;
        }

        public final int getAd_view_time() {
            return this.ad_view_time;
        }

        public final List<ApiconfEntry> getApi_conf() {
            return this.api_conf;
        }

        public final String getApi_url() {
            return this.api_url;
        }

        public final String getApi_url2() {
            return this.api_url2;
        }

        public final AppConf getApp_conf() {
            return this.app_conf;
        }

        public final String getCustomer_service_url() {
            return this.customer_service_url;
        }

        public final String getEx_tab_name() {
            return this.ex_tab_name;
        }

        public final String getExternal_h5_url() {
            return this.external_h5_url;
        }

        public final String getFeedback_tags() {
            return this.feedback_tags;
        }

        public final String getHide_ad() {
            return this.hide_ad;
        }

        public final String getIos_p_card_list() {
            return this.ios_p_card_list;
        }

        public final int getMax_view_num() {
            return this.max_view_num;
        }

        public final String getNetCineVarApp_language_options() {
            return this.netCineVarApp_language_options;
        }

        public final int getNetCineVarShort_play_ad_freq() {
            return this.netCineVarShort_play_ad_freq;
        }

        public final String getPrivacy_url() {
            return this.privacy_url;
        }

        public final String getShare_content() {
            return this.share_content;
        }

        public final String getShare_pic_url() {
            return this.share_pic_url;
        }

        public final String getShare_qrcode_url() {
            return this.share_qrcode_url;
        }

        public final int getShow_ad_time() {
            return this.show_ad_time;
        }

        public final int getShow_open_screen_ad_time() {
            return this.show_open_screen_ad_time;
        }

        public final int getToday_view_ad() {
            return this.today_view_ad;
        }

        public final String getUser_h5_url() {
            return this.user_h5_url;
        }

        public final String getVod_feedback_tags() {
            return this.vod_feedback_tags;
        }

        public final String getWebsite() {
            return this.website;
        }

        public final int is_projection() {
            return this.is_projection;
        }

        public final void setAd_download_num(int i10) {
            this.ad_download_num = i10;
        }

        public final void setAd_view_time(int i10) {
            this.ad_view_time = i10;
        }

        public final void setApi_conf(List<ApiconfEntry> list) {
            this.api_conf = list;
        }

        public final void setApi_url(String str) {
            this.api_url = str;
        }

        public final void setApi_url2(String str) {
            this.api_url2 = str;
        }

        public final void setApp_conf(AppConf appConf) {
            this.app_conf = appConf;
        }

        public final void setCustomer_service_url(String str) {
            this.customer_service_url = str;
        }

        public final void setEx_tab_name(String str) {
            this.ex_tab_name = str;
        }

        public final void setExternal_h5_url(String str) {
            this.external_h5_url = str;
        }

        public final void setFeedback_tags(String str) {
            this.feedback_tags = str;
        }

        public final void setHide_ad(String str) {
            this.hide_ad = str;
        }

        public final void setIos_p_card_list(String str) {
            this.ios_p_card_list = str;
        }

        public final void setMax_view_num(int i10) {
            this.max_view_num = i10;
        }

        public final void setNetCineVarApp_language_options(String str) {
            this.netCineVarApp_language_options = str;
        }

        public final void setNetCineVarShort_play_ad_freq(int i10) {
            this.netCineVarShort_play_ad_freq = i10;
        }

        public final void setPrivacy_url(String str) {
            this.privacy_url = str;
        }

        public final void setShare_content(String str) {
            this.share_content = str;
        }

        public final void setShare_pic_url(String str) {
            this.share_pic_url = str;
        }

        public final void setShare_qrcode_url(String str) {
            this.share_qrcode_url = str;
        }

        public final void setShow_ad_time(int i10) {
            this.show_ad_time = i10;
        }

        public final void setShow_open_screen_ad_time(int i10) {
            this.show_open_screen_ad_time = i10;
        }

        public final void setToday_view_ad(int i10) {
            this.today_view_ad = i10;
        }

        public final void setUser_h5_url(String str) {
            this.user_h5_url = str;
        }

        public final void setVod_feedback_tags(String str) {
            this.vod_feedback_tags = str;
        }

        public final void setWebsite(String str) {
            this.website = str;
        }

        public final void set_projection(int i10) {
            this.is_projection = i10;
        }
    }

    public final SysConf getSys_conf() {
        return this.sys_conf;
    }

    public final UserInfoEntry getUser_info() {
        return this.user_info;
    }

    public final void setSys_conf(SysConf sysConf) {
        this.sys_conf = sysConf;
    }

    public final void setUser_info(UserInfoEntry userInfoEntry) {
        this.user_info = userInfoEntry;
    }
}
