package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes10.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
