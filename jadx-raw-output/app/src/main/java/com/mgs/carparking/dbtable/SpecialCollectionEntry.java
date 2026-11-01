package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import ck.i;
import zl.b;
import zl.f;

/* JADX INFO: compiled from: SpecialCollectionEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
@f(name = SpecialCollectionEntry.TABLE_NAME)
public final class SpecialCollectionEntry extends BaseObservable {
    public static final String CONTENT = "content";
    public static final Companion Companion = new Companion(null);
    public static final String ICON = "icon";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String TABLE_NAME = "special_collection";
    public static final String USER_NUM = "user_num";

    @b(name = "content")
    private String content;

    @b(name = "icon")
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f41047id;

    @b(name = "name")
    private String name;

    @b(name = USER_NUM)
    private int user_num;

    /* JADX INFO: compiled from: SpecialCollectionEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final String getContent() {
        return this.content;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f41047id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getUser_num() {
        return this.user_num;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f41047id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUser_num(int i10) {
        this.user_num = i10;
    }

    public String toString() {
        return "SpecialCollectionEntry{id=" + this.f41047id + ", name='" + this.name + "', icon='" + this.icon + "', user_num=" + this.user_num + ", content='" + this.content + "'}";
    }
}
