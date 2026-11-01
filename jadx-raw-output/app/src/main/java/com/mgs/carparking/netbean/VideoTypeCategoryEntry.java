package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: VideoTypeCategoryEntry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoTypeCategoryEntry {
    private boolean isSelector;
    private List<String> tagList;
    private String typeName;
    public int videoType;

    public final List<String> getTagList() {
        return this.tagList;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }

    public final void setTagList(List<String> list) {
        this.tagList = list;
    }

    public final void setTypeName(String str) {
        this.typeName = str;
    }
}
