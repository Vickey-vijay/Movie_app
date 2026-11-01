package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: ExtensionShareEntry.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ExtensionShareEntry {
    private String app_share_url;
    private String invited_by;
    private List<InvitedConf> invited_conf;
    private int invited_count;
    private String invited_qrcode;
    private float invited_reward;
    private String share_pic_url;
    private String wx_app_url;

    /* JADX INFO: compiled from: ExtensionShareEntry.kt */
    public final class InvitedConf {
        private int download_count;
        private float invited_reward_vip;
        private int invited_user;

        public InvitedConf() {
        }

        public final int getDownload_count() {
            return this.download_count;
        }

        public final float getInvited_reward_vip() {
            return this.invited_reward_vip;
        }

        public final int getInvited_user() {
            return this.invited_user;
        }

        public final void setDownload_count(int i10) {
            this.download_count = i10;
        }

        public final void setInvited_reward_vip(float f10) {
            this.invited_reward_vip = f10;
        }

        public final void setInvited_user(int i10) {
            this.invited_user = i10;
        }
    }

    public final String getApp_share_url() {
        return this.app_share_url;
    }

    public final String getInvited_by() {
        return this.invited_by;
    }

    public final List<InvitedConf> getInvited_conf() {
        return this.invited_conf;
    }

    public final int getInvited_count() {
        return this.invited_count;
    }

    public final String getInvited_qrcode() {
        return this.invited_qrcode;
    }

    public final float getInvited_reward() {
        return this.invited_reward;
    }

    public final String getShare_pic_url() {
        return this.share_pic_url;
    }

    public final String getWx_app_url() {
        return this.wx_app_url;
    }

    public final void setApp_share_url(String str) {
        this.app_share_url = str;
    }

    public final void setInvited_by(String str) {
        this.invited_by = str;
    }

    public final void setInvited_conf(List<InvitedConf> list) {
        this.invited_conf = list;
    }

    public final void setInvited_count(int i10) {
        this.invited_count = i10;
    }

    public final void setInvited_qrcode(String str) {
        this.invited_qrcode = str;
    }

    public final void setInvited_reward(float f10) {
        this.invited_reward = f10;
    }

    public final void setShare_pic_url(String str) {
        this.share_pic_url = str;
    }

    public final void setWx_app_url(String str) {
        this.wx_app_url = str;
    }
}
