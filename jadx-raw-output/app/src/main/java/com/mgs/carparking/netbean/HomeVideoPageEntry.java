package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: HomeVideoPageEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HomeVideoPageEntry {
    private boolean isHasNextPage;
    private List<RecommandVideosEntity> list;
    private int pageNum;
    private int total;

    public final List<RecommandVideosEntity> getList() {
        return this.list;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean isHasNextPage() {
        return this.isHasNextPage;
    }

    public final void setHasNextPage(boolean z10) {
        this.isHasNextPage = z10;
    }

    public final void setList(List<RecommandVideosEntity> list) {
        this.list = list;
    }

    public final void setPageNum(int i10) {
        this.pageNum = i10;
    }

    public final void setTotal(int i10) {
        this.total = i10;
    }
}
