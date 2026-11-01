package me.jessyan.retrofiturlmanager;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class InvalidUrlException extends RuntimeException {
    public InvalidUrlException(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("You've configured an invalid url : ");
        sb2.append(TextUtils.isEmpty(str) ? "EMPTY_OR_NULL_URL" : str);
        super(sb2.toString());
    }
}
