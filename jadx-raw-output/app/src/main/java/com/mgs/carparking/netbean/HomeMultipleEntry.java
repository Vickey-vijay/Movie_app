package com.mgs.carparking.netbean;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: HomeMultipleEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class HomeMultipleEntry implements Serializable {
    private List<BlockListEntry> block_list;
    private int is_change;
    private int is_more;
    private int is_title;
    private int jump_channel_id;
    private int module_id;
    private String module_name;
    private int type;

    public final List<BlockListEntry> getBlock_list() {
        return this.block_list;
    }

    public final int getJump_channel_id() {
        return this.jump_channel_id;
    }

    public final int getModule_id() {
        return this.module_id;
    }

    public final String getModule_name() {
        return this.module_name;
    }

    public final int getType() {
        return this.type;
    }

    public final int is_change() {
        return this.is_change;
    }

    public final int is_more() {
        return this.is_more;
    }

    public final int is_title() {
        return this.is_title;
    }

    public final void setBlock_list(List<BlockListEntry> list) {
        this.block_list = list;
    }

    public final void setJump_channel_id(int i10) {
        this.jump_channel_id = i10;
    }

    public final void setModule_id(int i10) {
        this.module_id = i10;
    }

    public final void setModule_name(String str) {
        this.module_name = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    public final void set_change(int i10) {
        this.is_change = i10;
    }

    public final void set_more(int i10) {
        this.is_more = i10;
    }

    public final void set_title(int i10) {
        this.is_title = i10;
    }
}
