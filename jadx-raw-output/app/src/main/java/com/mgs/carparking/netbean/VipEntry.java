package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: VipEntry.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class VipEntry {
    private int payment_guild_enable;
    private String payment_guild_url;
    private List<VipListItemEntry> payment_list;

    public final int getPayment_guild_enable() {
        return this.payment_guild_enable;
    }

    public final String getPayment_guild_url() {
        return this.payment_guild_url;
    }

    public final List<VipListItemEntry> getPayment_list() {
        return this.payment_list;
    }

    public final void setPayment_guild_enable(int i10) {
        this.payment_guild_enable = i10;
    }

    public final void setPayment_guild_url(String str) {
        this.payment_guild_url = str;
    }

    public final void setPayment_list(List<VipListItemEntry> list) {
        this.payment_list = list;
    }
}
