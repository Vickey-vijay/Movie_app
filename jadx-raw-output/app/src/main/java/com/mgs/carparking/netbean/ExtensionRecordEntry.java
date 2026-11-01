package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: ExtensionRecordEntry.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ExtensionRecordEntry {
    private List<InvitedList> invited_list;
    private int invited_total_gold_coin;
    private int invited_user_count;

    /* JADX INFO: compiled from: ExtensionRecordEntry.kt */
    public final class InvitedList {
        private String create_at;
        private String head_img;
        private String nickname;
        private int user_id;

        public InvitedList() {
        }

        public final String getCreate_at() {
            return this.create_at;
        }

        public final String getHead_img() {
            return this.head_img;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public final int getUser_id() {
            return this.user_id;
        }

        public final void setCreate_at(String str) {
            this.create_at = str;
        }

        public final void setHead_img(String str) {
            this.head_img = str;
        }

        public final void setNickname(String str) {
            this.nickname = str;
        }

        public final void setUser_id(int i10) {
            this.user_id = i10;
        }
    }

    public final List<InvitedList> getInvited_list() {
        return this.invited_list;
    }

    public final int getInvited_total_gold_coin() {
        return this.invited_total_gold_coin;
    }

    public final int getInvited_user_count() {
        return this.invited_user_count;
    }

    public final void setInvited_list(List<InvitedList> list) {
        this.invited_list = list;
    }

    public final void setInvited_total_gold_coin(int i10) {
        this.invited_total_gold_coin = i10;
    }

    public final void setInvited_user_count(int i10) {
        this.invited_user_count = i10;
    }
}
