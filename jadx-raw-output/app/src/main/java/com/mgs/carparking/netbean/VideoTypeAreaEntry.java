package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: VideoTypeAreaEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class VideoTypeAreaEntry {
    private List<String> areaList;
    private boolean isSelector;
    private String typeName;
    private int videoType;

    public final List<String> getAreaList() {
        return this.areaList;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setAreaList(List<String> list) {
        this.areaList = list;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }

    public final void setTypeName(String str) {
        this.typeName = str;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }
}
