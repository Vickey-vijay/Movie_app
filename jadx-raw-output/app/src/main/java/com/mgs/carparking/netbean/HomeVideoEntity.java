package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: HomeVideoEntity.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class HomeVideoEntity {
    private List<RecommandVideosEntity> hotVideos;
    private List<RecommandVideosEntity> recommandVideos;

    public final List<RecommandVideosEntity> getHotVideos() {
        return this.hotVideos;
    }

    public final List<RecommandVideosEntity> getRecommandVideos() {
        return this.recommandVideos;
    }

    public final void setHotVideos(List<RecommandVideosEntity> list) {
        this.hotVideos = list;
    }

    public final void setRecommandVideos(List<RecommandVideosEntity> list) {
        this.recommandVideos = list;
    }
}
