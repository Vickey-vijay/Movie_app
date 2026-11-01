package com.fyber.inneractive.sdk.mraid;

import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: loaded from: classes10.dex */
public enum k {
    CLOSE("close"),
    EXPAND("expand"),
    USECUSTOMCLOSE("usecustomclose"),
    OPEN("open"),
    RESIZE("resize"),
    GET_RESIZE_PROPERTIES("getResizeProperties"),
    SET_RESIZE_PROPERTIES("setResizeProperties"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    PLAY_VIDEO("playVideo"),
    STORE_PICTURE("storePicture"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    CREATE_CALENDAR_EVENT("createCalendarEvent"),
    UNSPECIFIED("");

    private String mCommand;

    public static k a(String str) {
        for (k kVar : values()) {
            if (kVar.mCommand.equals(str)) {
                return kVar;
            }
        }
        return UNSPECIFIED;
    }

    k(String str) {
        this.mCommand = str;
    }

    public final String a() {
        return this.mCommand;
    }
}
