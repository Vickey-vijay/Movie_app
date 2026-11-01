package com.fyber.inneractive.sdk.click;

import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes2.dex */
public enum q {
    FAILED(C3426d4.i.f28566t),
    OPEN_GOOGLE_STORE(C3426d4.i.U),
    OPENED_IN_INTERNAL_BROWSER("internal browser"),
    OPENED_IN_EXTERNAL_BROWSER("external browser"),
    INTERNAL_REDIRECT("internal redirect"),
    OPEN_IN_EXTERNAL_APPLICATION("external app"),
    DEEP_LINK("deep link"),
    OPENED_USING_CHROME_NAVIGATE("chrome navigate"),
    OPEN_INTERNAL_STORE("internal store");

    public String simpleName;

    q(String str) {
        this.simpleName = str;
    }
}
